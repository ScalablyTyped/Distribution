package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AMQPClient
  extends nodeLib.netMod.Socket {
  def disconnect(): scala.Unit = js.native
  def exchange(): AMQPExchange = js.native
  def exchange(callback: Callback[scala.Unit]): AMQPExchange = js.native
  def exchange(exchangeName: java.lang.String): AMQPExchange = js.native
  def exchange(exchangeName: java.lang.String, callback: Callback[scala.Unit]): AMQPExchange = js.native
  def exchange(exchangeName: java.lang.String, options: ExchangeOptions): AMQPExchange = js.native
  def exchange(exchangeName: java.lang.String, options: ExchangeOptions, callback: Callback[scala.Unit]): AMQPExchange = js.native
  def publish(
    routingKey: java.lang.String,
    body: js.Any,
    options: js.Object,
    callback: js.Function2[
      /* err */ js.UndefOr[scala.Boolean], 
      /* msg */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def queue(queueName: java.lang.String): AMQPQueue = js.native
  def queue(queueName: java.lang.String, callback: Callback[QueueCallback]): AMQPQueue = js.native
  def queue(queueName: java.lang.String, options: QueueOptions): AMQPQueue = js.native
  def queue(queueName: java.lang.String, options: QueueOptions, callback: Callback[QueueCallback]): AMQPQueue = js.native
}

