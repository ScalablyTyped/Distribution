package typings.activedirectory2.mod

import typings.activedirectory2.anon.Ca
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LDAPjsReqProps extends js.Object {
  
  var connectionTimeout: js.UndefOr[Double] = js.native
  
  var idleTimeout: js.UndefOr[Double] = js.native
  
  var log: js.UndefOr[js.Any] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var strictDN: js.UndefOr[Boolean] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var tlsOptions: Ca = js.native
  
  var url: String = js.native
}
object LDAPjsReqProps {
  
  @scala.inline
  def apply(tlsOptions: Ca, url: String): LDAPjsReqProps = {
    val __obj = js.Dynamic.literal(tlsOptions = tlsOptions.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPjsReqProps]
  }
  
  @scala.inline
  implicit class LDAPjsReqPropsOps[Self <: LDAPjsReqProps] (val x: Self) extends AnyVal {
    
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
    def setTlsOptions(value: Ca): Self = this.set("tlsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    
    @scala.inline
    def setIdleTimeout(value: Double): Self = this.set("idleTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIdleTimeout: Self = this.set("idleTimeout", js.undefined)
    
    @scala.inline
    def setLog(value: js.Any): Self = this.set("log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLog: Self = this.set("log", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setStrictDN(value: Boolean): Self = this.set("strictDN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrictDN: Self = this.set("strictDN", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
}
