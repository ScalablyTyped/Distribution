package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AMQPQueue
  extends nodeLib.eventsMod.EventEmitter {
  def bind(exchangeName: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def bind(exchangeName: java.lang.String, routingKey: java.lang.String, callback: Callback[AMQPQueue]): scala.Unit = js.native
  def bind(routingKey: java.lang.String): scala.Unit = js.native
  def bind(routingKey: java.lang.String, callback: Callback[AMQPQueue]): scala.Unit = js.native
  def bind_headers(exchangeName: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def bind_headers(routingKey: java.lang.String): scala.Unit = js.native
  def destroy(): scala.Unit = js.native
  def destroy(options: DestroyOptions): scala.Unit = js.native
  def shift(reject: scala.Boolean): scala.Unit = js.native
  def shift(reject: scala.Boolean, requeue: scala.Boolean): scala.Unit = js.native
  def subscribe(callback: SubscribeCallback): scala.Unit = js.native
  def subscribe(options: SubscribeOptions, callback: SubscribeCallback): scala.Unit = js.native
  def unbind(exchangeName: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def unbind(routingKey: java.lang.String): scala.Unit = js.native
  def unbind_headers(exchangeName: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def unbind_headers(routingKey: java.lang.String): scala.Unit = js.native
  def unsubscribe(consumerTag: java.lang.String): scala.Unit = js.native
}

