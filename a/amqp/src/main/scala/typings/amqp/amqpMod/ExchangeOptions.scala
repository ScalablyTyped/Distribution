package typings.amqp.amqpMod

import org.scalablytyped.runtime.StringDictionary
import typings.amqp.amqpStrings.direct
import typings.amqp.amqpStrings.fanout
import typings.amqp.amqpStrings.topic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExchangeOptions extends js.Object {
  /**
    * a map of additional arguments to pass in when creating an exchange
    */
  var arguments: js.UndefOr[StringDictionary[js.Any]] = js.undefined
  /**
    * Default: true
    *
    * If set, the exchange is deleted when there are no longer queues bound to it
    */
  var autoDelete: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * If set, the exchange will be in confirm mode, and you will get a 'ack'|'error' event emitted on a publish,
    * or the callback on the publish will be called
    */
  var confirm: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: true
    *
    * If set when creating a new exchange, the exchange will be marked as durable.
    *
    * Durable exchanges remain active when a server restarts.
    *
    * Non-durable exchanges (transient exchanges) are purged if/when a server restarts
    */
  var durable: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * If set, the exchange will not be declared,
    * this will allow the exchange to be deleted if you dont know its previous options
    */
  var noDeclare: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: false
    *
    * f set, the server will not create the exchange. The client can use this to check whether an exchange exists without modifying the server state
    */
  var passive: js.UndefOr[Boolean] = js.undefined
  /**
    * Default: 'topic'
    */
  var `type`: js.UndefOr[direct | fanout | topic] = js.undefined
}

object ExchangeOptions {
  @scala.inline
  def apply(
    arguments: StringDictionary[js.Any] = null,
    autoDelete: js.UndefOr[Boolean] = js.undefined,
    confirm: js.UndefOr[Boolean] = js.undefined,
    durable: js.UndefOr[Boolean] = js.undefined,
    noDeclare: js.UndefOr[Boolean] = js.undefined,
    passive: js.UndefOr[Boolean] = js.undefined,
    `type`: direct | fanout | topic = null
  ): ExchangeOptions = {
    val __obj = js.Dynamic.literal()
    if (arguments != null) __obj.updateDynamic("arguments")(arguments)
    if (!js.isUndefined(autoDelete)) __obj.updateDynamic("autoDelete")(autoDelete)
    if (!js.isUndefined(confirm)) __obj.updateDynamic("confirm")(confirm)
    if (!js.isUndefined(durable)) __obj.updateDynamic("durable")(durable)
    if (!js.isUndefined(noDeclare)) __obj.updateDynamic("noDeclare")(noDeclare)
    if (!js.isUndefined(passive)) __obj.updateDynamic("passive")(passive)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExchangeOptions]
  }
}

