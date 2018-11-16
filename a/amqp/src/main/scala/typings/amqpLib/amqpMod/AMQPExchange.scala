package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AMQPExchange
  extends nodeLib.eventsMod.EventEmitter {
  def bind(sourceExchange: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def bind(sourceExchange: java.lang.String, routingKey: java.lang.String, callback: Callback[scala.Unit]): scala.Unit = js.native
  def bind_headers(exchange: java.lang.String, routing: java.lang.String): scala.Unit = js.native
  def bind_headers(exchange: java.lang.String, routing: java.lang.String, callback: Callback[scala.Unit]): scala.Unit = js.native
  /**
     * ifUnused default: true
     *
     * Deletes an exchange.
     *
     * If the optional boolean second argument is set, the server will only delete the exchange if it has no queue bindings.
     *
     * If the exchange has queue bindings the server does not delete it but raises a channel exception instead
     */
  def destroy(ifUnused: scala.Boolean): scala.Unit = js.native
  @JSName("on")
  def on_ack(event: amqpLib.amqpLibStrings.ack, callback: Callback[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: amqpLib.amqpLibStrings.error, callback: Callback[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exchangeBindOk(event: amqpLib.amqpLibStrings.exchangeBindOk, callback: Callback[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_exchangeUnbindOk(event: amqpLib.amqpLibStrings.exchangeUnbindOk, callback: Callback[scala.Unit]): this.type = js.native
  @JSName("on")
  def on_open(event: amqpLib.amqpLibStrings.open, callback: Callback[scala.Unit]): this.type = js.native
  def publish(
    routingKey: java.lang.String,
    message: js.Object,
    callback: js.Function2[
      /* err */ js.UndefOr[scala.Boolean], 
      /* msg */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def publish(routingKey: java.lang.String, message: js.Object, options: ExchangePublishOptions): scala.Unit = js.native
  def publish(
    routingKey: java.lang.String,
    message: js.Object,
    options: ExchangePublishOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[scala.Boolean], 
      /* msg */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def publish(
    routingKey: java.lang.String,
    message: nodeLib.Buffer,
    callback: js.Function2[
      /* err */ js.UndefOr[scala.Boolean], 
      /* msg */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def publish(routingKey: java.lang.String, message: nodeLib.Buffer, options: ExchangePublishOptions): scala.Unit = js.native
  def publish(
    routingKey: java.lang.String,
    message: nodeLib.Buffer,
    options: ExchangePublishOptions,
    callback: js.Function2[
      /* err */ js.UndefOr[scala.Boolean], 
      /* msg */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]
  ): scala.Unit = js.native
  def unbind(sourceExchange: java.lang.String, routingKey: java.lang.String): scala.Unit = js.native
  def unbind(sourceExchange: java.lang.String, routingKey: java.lang.String, callback: Callback[scala.Unit]): scala.Unit = js.native
}

