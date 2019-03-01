package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeOptions extends js.Object {
  /**
    * Default: false
    *
    * Make it so that the AMQP server only delivers single messages at a time.
    * When you want the next message, call queue.shift()
    *
    * When false, you will receive messages as fast as they are emitted
    */
  var ack: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var deliveryKeyInPayload: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: false
    *
    * If set to true, only one subscriber is allowed at a time
    */
  var exclusive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Default: 1
    *
    * Will only send you N messages before you 'ack'.
    *
    * Setting to zero will widen that window to 'unlimited'. If this is set, queue.shift() should not be used
    */
  var prefetchCount: js.UndefOr[scala.Double] = js.undefined
  /**
    * Default: undefined
    *
    * Will inject the routingKey into the payload received
    */
  var routingKeyInPayload: js.UndefOr[scala.Boolean] = js.undefined
}

object SubscribeOptions {
  @scala.inline
  def apply(
    ack: js.UndefOr[scala.Boolean] = js.undefined,
    deliveryKeyInPayload: js.UndefOr[scala.Boolean] = js.undefined,
    exclusive: js.UndefOr[scala.Boolean] = js.undefined,
    prefetchCount: scala.Int | scala.Double = null,
    routingKeyInPayload: js.UndefOr[scala.Boolean] = js.undefined
  ): SubscribeOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ack)) __obj.updateDynamic("ack")(ack)
    if (!js.isUndefined(deliveryKeyInPayload)) __obj.updateDynamic("deliveryKeyInPayload")(deliveryKeyInPayload)
    if (!js.isUndefined(exclusive)) __obj.updateDynamic("exclusive")(exclusive)
    if (prefetchCount != null) __obj.updateDynamic("prefetchCount")(prefetchCount.asInstanceOf[js.Any])
    if (!js.isUndefined(routingKeyInPayload)) __obj.updateDynamic("routingKeyInPayload")(routingKeyInPayload)
    __obj.asInstanceOf[SubscribeOptions]
  }
}

