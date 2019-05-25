package typings
package amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerMod

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
  var connectionOptions: js.UndefOr[nodeLib.tlsMod.ConnectionOptions] = js.undefined
  /**
  	 * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
  	 * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
  	 * return a Promise. Note that if this is supplied, then urls is ignored.
  	 */
  var findServers: js.UndefOr[
    (js.Function1[
      /* callback */ js.Function1[/* urls */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | (js.Function0[js.Promise[java.lang.String | js.Array[java.lang.String]]])
  ] = js.undefined
  /**
  	 * Interval to send heartbeats to broker. Defaults to 5 seconds.
  	 */
  var heartbeatIntervalInSeconds: js.UndefOr[scala.Double] = js.undefined
  /**
  	 * The time to wait before trying to reconnect. If not specified, defaults to heartbeatIntervalInSeconds
  	 */
  var reconnectTimeInSeconds: js.UndefOr[scala.Double] = js.undefined
}

object AmqpConnectionManagerOptions {
  @scala.inline
  def apply(
    connectionOptions: nodeLib.tlsMod.ConnectionOptions = null,
    findServers: (js.Function1[
      /* callback */ js.Function1[/* urls */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | (js.Function0[js.Promise[java.lang.String | js.Array[java.lang.String]]]) = null,
    heartbeatIntervalInSeconds: scala.Int | scala.Double = null,
    reconnectTimeInSeconds: scala.Int | scala.Double = null
  ): AmqpConnectionManagerOptions = {
    val __obj = js.Dynamic.literal()
    if (connectionOptions != null) __obj.updateDynamic("connectionOptions")(connectionOptions)
    if (findServers != null) __obj.updateDynamic("findServers")(findServers.asInstanceOf[js.Any])
    if (heartbeatIntervalInSeconds != null) __obj.updateDynamic("heartbeatIntervalInSeconds")(heartbeatIntervalInSeconds.asInstanceOf[js.Any])
    if (reconnectTimeInSeconds != null) __obj.updateDynamic("reconnectTimeInSeconds")(reconnectTimeInSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmqpConnectionManagerOptions]
  }
}

