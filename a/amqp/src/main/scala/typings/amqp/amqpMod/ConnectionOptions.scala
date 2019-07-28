package typings.amqp.amqpMod

import typings.amqp.Anon_ApplicationName
import typings.amqp.Anon_CaFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var authMechanism: js.UndefOr[String] = js.undefined
  var clientProperties: js.UndefOr[Anon_ApplicationName] = js.undefined
  var connectionTimeout: js.UndefOr[Double] = js.undefined
  var defaultExchangeName: js.UndefOr[String] = js.undefined
  var heartbeat: js.UndefOr[Double] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var login: js.UndefOr[String] = js.undefined
  var noDelay: js.UndefOr[Boolean] = js.undefined
  var password: js.UndefOr[String] = js.undefined
  /** Default: 'node-{NODE_VERSION}' */
  var platform: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  /** Default: 'node-amqp' */
  var product: js.UndefOr[String] = js.undefined
  /** Default: true */
  var reconnect: js.UndefOr[Boolean] = js.undefined
  /** Default: 'linear' */
  var reconnectBackoffStrategy: js.UndefOr[String] = js.undefined
  /** Default: 1000 */
  var reconnectBackoffTime: js.UndefOr[Double] = js.undefined
  /** Default: 120000 */
  var reconnectExponentialLimit: js.UndefOr[Double] = js.undefined
  var ssl: js.UndefOr[Anon_CaFile] = js.undefined
  var url: js.UndefOr[String] = js.undefined
  /** Default: node-amqp/package.json version */
  var version: js.UndefOr[String] = js.undefined
  var vhost: js.UndefOr[String] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    authMechanism: String = null,
    clientProperties: Anon_ApplicationName = null,
    connectionTimeout: Int | Double = null,
    defaultExchangeName: String = null,
    heartbeat: Int | Double = null,
    host: String = null,
    login: String = null,
    noDelay: js.UndefOr[Boolean] = js.undefined,
    password: String = null,
    platform: String = null,
    port: Int | Double = null,
    product: String = null,
    reconnect: js.UndefOr[Boolean] = js.undefined,
    reconnectBackoffStrategy: String = null,
    reconnectBackoffTime: Int | Double = null,
    reconnectExponentialLimit: Int | Double = null,
    ssl: Anon_CaFile = null,
    url: String = null,
    version: String = null,
    vhost: String = null
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

