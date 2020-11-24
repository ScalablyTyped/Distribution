package typings.achingbrainElectronFetch.mod

import typings.electron.mod.Session_
import typings.node.httpsMod.Agent
import typings.std.AbortSignal
import typings.std.RequestRedirect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInit extends js.Object {
  
  var agent: js.UndefOr[Agent] = js.native
  
  var body: js.UndefOr[BodyInit] = js.native
  
  ////////////////////////////////////////////////////////////////////////////
  // The following properties are electron-fetch extensions
  // (/!\ only works when running on Node.js) maximum redirect count. 0 to not follow redirect
  var follow: js.UndefOr[Double] = js.native
  
  var headers: js.UndefOr[HeadersInit] = js.native
  
  // These properties are part of the Fetch Standard
  var method: js.UndefOr[String] = js.native
  
  // When running on Electron behind an authenticated HTTP proxy, password to use to authenticate
  var password: js.UndefOr[String] = js.native
  
  // (/!\ only works when running on Node.js) set to `manual` to extract redirect headers, `error` to reject redirect
  var redirect: js.UndefOr[RequestRedirect] = js.native
  
  var session: js.UndefOr[Session_] = js.native
  
  var signal: js.UndefOr[AbortSignal] = js.native
  
  // maximum response body size in bytes. 0 to disable
  var size: js.UndefOr[Double] = js.native
  
  // req/res timeout in ms, it resets on redirect. 0 to disable (OS limit applies)
  var timeout: js.UndefOr[Double] = js.native
  
  var useElectronNet: js.UndefOr[Boolean] = js.native
  
  var useSessionCookies: js.UndefOr[Boolean] = js.native
  
  // When running on Electron behind an authenticated HTTP proxy, username to use to authenticate
  var user: js.UndefOr[String] = js.native
}
object RequestInit {
  
  @scala.inline
  def apply(): RequestInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestInit]
  }
  
  @scala.inline
  implicit class RequestInitOps[Self <: RequestInit] (val x: Self) extends AnyVal {
    
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
    def setAgent(value: Agent): Self = this.set("agent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAgent: Self = this.set("agent", js.undefined)
    
    @scala.inline
    def setBody(value: BodyInit): Self = this.set("body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBody: Self = this.set("body", js.undefined)
    
    @scala.inline
    def setBodyNull: Self = this.set("body", null)
    
    @scala.inline
    def setFollow(value: Double): Self = this.set("follow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFollow: Self = this.set("follow", js.undefined)
    
    @scala.inline
    def setHeadersVarargs(value: js.Array[String]*): Self = this.set("headers", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: HeadersInit): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePassword: Self = this.set("password", js.undefined)
    
    @scala.inline
    def setRedirect(value: RequestRedirect): Self = this.set("redirect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirect: Self = this.set("redirect", js.undefined)
    
    @scala.inline
    def setSession(value: Session_): Self = this.set("session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSession: Self = this.set("session", js.undefined)
    
    @scala.inline
    def setSignal(value: AbortSignal): Self = this.set("signal", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSignal: Self = this.set("signal", js.undefined)
    
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUseElectronNet(value: Boolean): Self = this.set("useElectronNet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseElectronNet: Self = this.set("useElectronNet", js.undefined)
    
    @scala.inline
    def setUseSessionCookies(value: Boolean): Self = this.set("useSessionCookies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseSessionCookies: Self = this.set("useSessionCookies", js.undefined)
    
    @scala.inline
    def setUser(value: String): Self = this.set("user", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUser: Self = this.set("user", js.undefined)
  }
}
