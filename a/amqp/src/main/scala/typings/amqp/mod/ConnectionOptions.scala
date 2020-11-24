package typings.amqp.mod

import typings.amqp.anon.ApplicationName
import typings.amqp.anon.CaFile
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConnectionOptions extends js.Object {
  
  var authMechanism: js.UndefOr[String] = js.native
  
  var clientProperties: js.UndefOr[ApplicationName] = js.native
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var defaultExchangeName: js.UndefOr[String] = js.native
  
  var heartbeat: js.UndefOr[Double] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  var login: js.UndefOr[String] = js.native
  
  var noDelay: js.UndefOr[Boolean] = js.native
  
  var password: js.UndefOr[String] = js.native
  
  /** Default: 'node-{NODE_VERSION}' */
  var platform: js.UndefOr[String] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  /** Default: 'node-amqp' */
  var product: js.UndefOr[String] = js.native
  
  /** Default: true */
  var reconnect: js.UndefOr[Boolean] = js.native
  
  /** Default: 'linear' */
  var reconnectBackoffStrategy: js.UndefOr[String] = js.native
  
  /** Default: 1000 */
  var reconnectBackoffTime: js.UndefOr[Double] = js.native
  
  /** Default: 120000 */
  var reconnectExponentialLimit: js.UndefOr[Double] = js.native
  
  var ssl: js.UndefOr[CaFile] = js.native
  
  var url: js.UndefOr[String] = js.native
  
  /** Default: node-amqp/package.json version */
  var version: js.UndefOr[String] = js.native
  
  var vhost: js.UndefOr[String] = js.native
}
object ConnectionOptions {
  
  @scala.inline
  def apply(): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectionOptions]
  }
  
  @scala.inline
  implicit class ConnectionOptionsOps[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthMechanism(value: String): Self = this.set("authMechanism", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthMechanism: Self = this.set("authMechanism", js.undefined)
    
    @scala.inline
    def setClientProperties(value: ApplicationName): Self = this.set("clientProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientProperties: Self = this.set("clientProperties", js.undefined)
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setDefaultExchangeName(value: String): Self = this.set("defaultExchangeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExchangeName: Self = this.set("defaultExchangeName", js.undefined)
    
    @scala.inline
    def setHeartbeat(value: Double): Self = this.set("heartbeat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeartbeat: Self = this.set("heartbeat", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setLogin(value: String): Self = this.set("login", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogin: Self = this.set("login", js.undefined)
    
    @scala.inline
    def setNoDelay(value: Boolean): Self = this.set("noDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNoDelay: Self = this.set("noDelay", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePlatform: Self = this.set("platform", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProduct(value: String): Self = this.set("product", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProduct: Self = this.set("product", js.undefined)
    
    @scala.inline
    def setReconnect(value: Boolean): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    
    @scala.inline
    def setReconnectBackoffStrategy(value: String): Self = this.set("reconnectBackoffStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectBackoffStrategy: Self = this.set("reconnectBackoffStrategy", js.undefined)
    
    @scala.inline
    def setReconnectBackoffTime(value: Double): Self = this.set("reconnectBackoffTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectBackoffTime: Self = this.set("reconnectBackoffTime", js.undefined)
    
    @scala.inline
    def setReconnectExponentialLimit(value: Double): Self = this.set("reconnectExponentialLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReconnectExponentialLimit: Self = this.set("reconnectExponentialLimit", js.undefined)
    
    @scala.inline
    def setSsl(value: CaFile): Self = this.set("ssl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSsl: Self = this.set("ssl", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setVhost(value: String): Self = this.set("vhost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVhost: Self = this.set("vhost", js.undefined)
  }
}
