package typings.amqp.amqpMod

import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AMQPClient extends Socket {
  def disconnect(): Unit = js.native
  def exchange(): AMQPExchange = js.native
  def exchange(callback: Callback[Unit]): AMQPExchange = js.native
  def exchange(exchangeName: String): AMQPExchange = js.native
  def exchange(exchangeName: String, callback: Callback[Unit]): AMQPExchange = js.native
  def exchange(exchangeName: String, options: ExchangeOptions): AMQPExchange = js.native
  def exchange(exchangeName: String, options: ExchangeOptions, callback: Callback[Unit]): AMQPExchange = js.native
  def publish(
    routingKey: String,
    body: js.Any,
    options: js.Object,
    callback: js.Function2[/* err */ js.UndefOr[Boolean], /* msg */ js.UndefOr[String], Unit]
  ): Unit = js.native
  def queue(queueName: String): AMQPQueue = js.native
  def queue(queueName: String, callback: Callback[QueueCallback]): AMQPQueue = js.native
  def queue(queueName: String, options: QueueOptions): AMQPQueue = js.native
  def queue(queueName: String, options: QueueOptions, callback: Callback[QueueCallback]): AMQPQueue = js.native
}

