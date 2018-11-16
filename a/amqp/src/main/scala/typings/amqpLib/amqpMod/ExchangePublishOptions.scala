package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ExchangePublishOptions extends js.Object {
  /**
     * Default: null
     *
     * Creating application id
     */
  var appId: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: null
     */
  var contentEncoding: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: 'application/octet-stream'
     */
  var contentType: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Application correlation identifier
     */
  var correlationId: js.UndefOr[java.lang.String] = js.undefined
  /**
     * 1: Non-persistent
     * 2: Persistent
     */
  var deliveryMode: js.UndefOr[amqpLib.amqpLibNumbers.`1` | amqpLib.amqpLibNumbers.`2`] = js.undefined
  /**
     * Default: null
     *
     * Message expiration specification -- ISO date string?
     */
  var expiration: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: {}
     *
     * Arbitrary application-specific message headers
     */
  var headers: js.UndefOr[js.Any] = js.undefined
  /**
     * Default: false
     *
     * This flag tells the server how to react if the message cannot be routed to a queue consumer immediately.
     *
     * If this flag is set, the server will return an undeliverable message with a Return method.
     *
     * If this flag is false, the server will queue the message, but with no guarantee that it will ever be consumed
     */
  var immediate: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: false
     *
     * This flag tells the server how to react if the message cannot be routed to a queue.
     *
     * If this flag is set, the server will return an unroutable message with a Return method.
     *
     * If this flag is false, the server silently drops the message
     */
  var mandatory: js.UndefOr[scala.Boolean] = js.undefined
  /**
     * Default: null
     *
     * Application message identifier
     */
  var messageId: js.UndefOr[java.lang.String] = js.undefined
  var priority: js.UndefOr[
    amqpLib.amqpLibNumbers.`0` | amqpLib.amqpLibNumbers.`1` | amqpLib.amqpLibNumbers.`2` | amqpLib.amqpLibNumbers.`3` | amqpLib.amqpLibNumbers.`4` | amqpLib.amqpLibNumbers.`5` | amqpLib.amqpLibNumbers.`6` | amqpLib.amqpLibNumbers.`7` | amqpLib.amqpLibNumbers.`8` | amqpLib.amqpLibNumbers.`9`
  ] = js.undefined
  /**
     * Usually used to name a reply queue for a request message
     */
  var replyTo: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: null
     *
     * Message timestamp
     *
     * ISO date string?
     */
  var timestamp: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: null
     *
     * Message type name
     */
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  /**
     * Default: null
     *
     * Creating user id
     */
  var userId: js.UndefOr[java.lang.String] = js.undefined
}

