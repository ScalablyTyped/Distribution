package typings
package amqpLib.amqpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var authMechanism: js.UndefOr[java.lang.String] = js.undefined
  var clientProperties: js.UndefOr[amqpLib.Anon_ApplicationName] = js.undefined
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
  var ssl: js.UndefOr[amqpLib.Anon_CaFile] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** Default: node-amqp/package.json version */
  var version: js.UndefOr[java.lang.String] = js.undefined
  var vhost: js.UndefOr[java.lang.String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    authMechanism: java.lang.String = null,
    clientProperties: amqpLib.Anon_ApplicationName = null,
    connectionTimeout: scala.Int | scala.Double = null,
    defaultExchangeName: java.lang.String = null,
    heartbeat: scala.Int | scala.Double = null,
    host: java.lang.String = null,
    login: java.lang.String = null,
    noDelay: js.UndefOr[scala.Boolean] = js.undefined,
    password: java.lang.String = null,
    platform: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    product: java.lang.String = null,
    reconnect: js.UndefOr[scala.Boolean] = js.undefined,
    reconnectBackoffStrategy: java.lang.String = null,
    reconnectBackoffTime: scala.Int | scala.Double = null,
    reconnectExponentialLimit: scala.Int | scala.Double = null,
    ssl: amqpLib.Anon_CaFile = null,
    url: java.lang.String = null,
    version: java.lang.String = null,
    vhost: java.lang.String = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (authMechanism != null) __obj.updateDynamic("authMechanism")(authMechanism)
    if (clientProperties != null) __obj.updateDynamic("clientProperties")(clientProperties)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (defaultExchangeName != null) __obj.updateDynamic("defaultExchangeName")(defaultExchangeName)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host)
    if (login != null) __obj.updateDynamic("login")(login)
    if (!js.isUndefined(noDelay)) __obj.updateDynamic("noDelay")(noDelay)
    if (password != null) __obj.updateDynamic("password")(password)
    if (platform != null) __obj.updateDynamic("platform")(platform)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (product != null) __obj.updateDynamic("product")(product)
    if (!js.isUndefined(reconnect)) __obj.updateDynamic("reconnect")(reconnect)
    if (reconnectBackoffStrategy != null) __obj.updateDynamic("reconnectBackoffStrategy")(reconnectBackoffStrategy)
    if (reconnectBackoffTime != null) __obj.updateDynamic("reconnectBackoffTime")(reconnectBackoffTime.asInstanceOf[js.Any])
    if (reconnectExponentialLimit != null) __obj.updateDynamic("reconnectExponentialLimit")(reconnectExponentialLimit.asInstanceOf[js.Any])
    if (ssl != null) __obj.updateDynamic("ssl")(ssl)
    if (url != null) __obj.updateDynamic("url")(url)
    if (version != null) __obj.updateDynamic("version")(version)
    if (vhost != null) __obj.updateDynamic("vhost")(vhost)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

