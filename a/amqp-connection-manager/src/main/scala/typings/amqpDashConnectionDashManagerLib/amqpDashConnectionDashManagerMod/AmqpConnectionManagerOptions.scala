package typings
package amqpDashConnectionDashManagerLib.amqpDashConnectionDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait AmqpConnectionManagerOptions extends js.Object {
  /**
  	 * TLS options
  	 */
  var connectionOptions: js.UndefOr[nodeLib.tlsMod.SecureContextOptions] = js.undefined
  /**
  	 * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
  	 * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
  	 * return a Promise. Note that if this is supplied, then urls is ignored.
  	 */
  var findServers: js.UndefOr[
    (js.Function1[
      /* callback */ js.Function1[/* urls */ java.lang.String | js.Array[java.lang.String], scala.Unit], 
      scala.Unit
    ]) | (js.Function0[stdLib.Promise[java.lang.String | js.Array[java.lang.String]]])
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

