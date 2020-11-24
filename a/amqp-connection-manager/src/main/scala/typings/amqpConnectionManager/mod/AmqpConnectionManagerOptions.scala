package typings.amqpConnectionManager.mod

import typings.amqpConnectionManager.anon.ConnectionOptionsnoDelayb
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AmqpConnectionManagerOptions extends js.Object {
  
  /**
    * TLS options
    *
    * These are passed through directly to amqplib (http://www.squaremobius.net/amqp.node/channel_api.html#connect),
    * which in turn passes them through to tls.connect (https://nodejs.org/api/tls.html#tls_tls_connect_options_callback)
    */
  var connectionOptions: js.UndefOr[ConnectionOptionsnoDelayb] = js.native
  
  /**
    * is a function which returns one or more servers to connect to. This should return either a single URL or an array of URLs.
    * This is handy when you're using a service discovery mechanism such as Consul or etcd. Instead of taking a callback, this can also
    * return a Promise. Note that if this is supplied, then urls is ignored.
    */
  var findServers: js.UndefOr[
    (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
  ] = js.native
  
  /**
    * Interval to send heartbeats to broker. Defaults to 5 seconds.
    */
  var heartbeatIntervalInSeconds: js.UndefOr[Double] = js.native
  
  /**
    * The time to wait before trying to reconnect. If not specified, defaults to heartbeatIntervalInSeconds
    */
  var reconnectTimeInSeconds: js.UndefOr[Double] = js.native
}
object AmqpConnectionManagerOptions {
  
  @scala.inline
  def apply(): AmqpConnectionManagerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AmqpConnectionManagerOptions]
  }
  
  @scala.inline
  implicit class AmqpConnectionManagerOptionsOps[Self <: AmqpConnectionManagerOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setConnectionOptions(value: ConnectionOptionsnoDelayb): Self = this.set("connectionOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionOptions: Self = this.set("connectionOptions", js.undefined)
    
    @scala.inline
    def setFindServersFunction1(value: /* callback */ js.Function1[/* urls */ String | js.Array[String], Unit] => Unit): Self = this.set("findServers", js.Any.fromFunction1(value))
    
    @scala.inline
    def setFindServersFunction0(value: () => js.Promise[String | js.Array[String]]): Self = this.set("findServers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setFindServers(
      value: (js.Function1[/* callback */ js.Function1[/* urls */ String | js.Array[String], Unit], Unit]) | (js.Function0[js.Promise[String | js.Array[String]]])
    ): Self = this.set("findServers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFindServers: Self = this.set("findServers", js.undefined)
    
    @scala.inline
    def setHeartbeatIntervalInSeconds(value: Double): Self = this.set("heartbeatIntervalInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeatIntervalInSeconds: Self = this.set("heartbeatIntervalInSeconds", js.undefined)
    
    @scala.inline
    def setReconnectTimeInSeconds(value: Double): Self = this.set("reconnectTimeInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectTimeInSeconds: Self = this.set("reconnectTimeInSeconds", js.undefined)
  }
}
