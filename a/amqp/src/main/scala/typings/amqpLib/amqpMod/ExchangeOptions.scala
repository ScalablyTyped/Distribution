package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExchangeOptions extends js.Object {
  /**
     * a map of additional arguments to pass in when creating an exchange
     */
  var arguments: js.UndefOr[org.scalablytyped.runtime.StringDictionary[js.Any]] = js.undefined
  /**
     * Default: true
     *
     * If set, the exchange is deleted when there are no longer queues bound to it
     */
  var autoDelete: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: false
     *
     * If set, the exchange will be in confirm mode, and you will get a 'ack'|'error' event emitted on a publish,
     * or the callback on the publish will be called
     */
  var confirm: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: true
     *
     * If set when creating a new exchange, the exchange will be marked as durable.
     *
     * Durable exchanges remain active when a server restarts.
     *
     * Non-durable exchanges (transient exchanges) are purged if/when a server restarts
     */
  var durable: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: false
     *
     * If set, the exchange will not be declared,
     * this will allow the exchange to be deleted if you dont know its previous options
     */
  var noDeclare: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: false
     *
     * f set, the server will not create the exchange. The client can use this to check whether an exchange exists without modifying the server state
     */
  var passive: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: 'topic'
     */
  var `type`: js.UndefOr[
    amqpLib.amqpLibStrings.direct | amqpLib.amqpLibStrings.fanout | amqpLib.amqpLibStrings.topic
  ] = js.undefined
}

