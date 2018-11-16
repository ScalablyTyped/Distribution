package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ConnectionOptions extends js.Object {
  var authMechanism: js.UndefOr[java.lang.String] = js.undefined
  var clientProperties: js.UndefOr[amqpLib.Anon_Capabilities] = js.undefined
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var defaultExchangeName: js.UndefOr[java.lang.String] = js.undefined
  var heartbeat: js.UndefOr[scala.Double] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var login: js.UndefOr[java.lang.String] = js.undefined
  var noDelay: js.UndefOr[scala.Boolean] = js.undefined
  var password: js.UndefOr[java.lang.String] = js.undefined
  /** Default: 'node-{NODE_VERSION}' */
  var platform: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  /** Default: 'node-amqp' */
  var product: js.UndefOr[java.lang.String] = js.undefined
  /** Default: true */
  var reconnect: js.UndefOr[scala.Boolean] = js.undefined
  /** Default: 'linear' */
  var reconnectBackoffStrategy: js.UndefOr[java.lang.String] = js.undefined
  /** Default: 1000 */
  var reconnectBackoffTime: js.UndefOr[scala.Double] = js.undefined
  /** Default: 120000 */
  var reconnectExponentialLimit: js.UndefOr[scala.Double] = js.undefined
  var ssl: js.UndefOr[amqpLib.Anon_Enabled] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Default: node-amqp/package.json version */
  var version: js.UndefOr[java.lang.String] = js.undefined
  var vhost: js.UndefOr[java.lang.String] = js.undefined
}

