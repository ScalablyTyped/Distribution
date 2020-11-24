package typings.amqp.mod

import typings.node.eventsMod.EventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AMQPQueue extends EventEmitter {
  
  def bind(exchangeName: String, routingKey: String): Unit = js.native
  def bind(exchangeName: String, routingKey: String, callback: Callback[AMQPQueue]): Unit = js.native
  def bind(routingKey: String): Unit = js.native
  def bind(routingKey: String, callback: Callback[AMQPQueue]): Unit = js.native
  
  def bind_headers(exchangeName: String, routingKey: String): Unit = js.native
  def bind_headers(routingKey: String): Unit = js.native
  
  def destroy(): Unit = js.native
  def destroy(options: DestroyOptions): Unit = js.native
  
  def shift(reject: Boolean): Unit = js.native
  def shift(reject: Boolean, requeue: Boolean): Unit = js.native
  
  def subscribe(callback: SubscribeCallback): Unit = js.native
  def subscribe(options: SubscribeOptions, callback: SubscribeCallback): Unit = js.native
  
  def unbind(exchangeName: String, routingKey: String): Unit = js.native
  def unbind(routingKey: String): Unit = js.native
  
  def unbind_headers(exchangeName: String, routingKey: String): Unit = js.native
  def unbind_headers(routingKey: String): Unit = js.native
  
  def unsubscribe(consumerTag: String): Unit = js.native
}
