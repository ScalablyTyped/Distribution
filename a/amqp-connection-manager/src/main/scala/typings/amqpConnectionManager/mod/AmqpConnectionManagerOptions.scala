package typings.amqpConnectionManager.mod

import typings.amqpConnectionManager.anon.ConnectionOptionsnoDelayb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmqpConnectionManagerOptions extends js.Object {
  /**
    * TLS options
    *
    * These are passed through directly to amqplib (http://www.squaremobius.net/amqp.node/channel_api.html#connect),
    * which in turn passes them through to tls.connect (https://nodejs.org/api/tls.html#tls_tls_connect_options_callback)
    */
  var connectionOptions: js.UndefOr[ConnectionOptionsnoDelayb] = js.undefined
  /**
    * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
    * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
    * return a Promise. Note that if this is supplied, then urls is ignored.
    */
  var findServers: js.UndefOr[
    (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
  ] = js.undefined
  /**
    * Interval to send heartbeats to broker. Defaults to 5 seconds.
    */
  var heartbeatIntervalInSeconds: js.UndefOr[Double] = js.undefined
  /**
    * The time to wait before trying to reconnect. If not specified, defaults to heartbeatIntervalInSeconds
    */
  var reconnectTimeInSeconds: js.UndefOr[Double] = js.undefined
}

object AmqpConnectionManagerOptions {
  @scala.inline
  def apply(
    connectionOptions: ConnectionOptionsnoDelayb = null,
    findServers: (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]]) = null,
    heartbeatIntervalInSeconds: js.UndefOr[Double] = js.undefined,
    reconnectTimeInSeconds: js.UndefOr[Double] = js.undefined
  ): AmqpConnectionManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionOptions != null) __obj.updateDynamic("connectionOptions")(connectionOptions.asInstanceOf[js.Any])
    if (findServers != null) __obj.updateDynamic("findServers")(findServers.asInstanceOf[js.Any])
    if (!js.isUndefined(heartbeatIntervalInSeconds)) __obj.updateDynamic("heartbeatIntervalInSeconds")(heartbeatIntervalInSeconds.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectTimeInSeconds)) __obj.updateDynamic("reconnectTimeInSeconds")(reconnectTimeInSeconds.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmqpConnectionManagerOptions]
  }
}

