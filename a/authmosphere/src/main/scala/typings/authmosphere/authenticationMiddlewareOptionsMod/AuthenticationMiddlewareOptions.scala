package typings.authmosphere.authenticationMiddlewareOptionsMod

import typings.authmosphere.getTokenInfoMod.GetTokenInfo
import typings.authmosphere.loggerMod.Logger
import typings.authmosphere.tokenMod.Token
import typings.express.mod.NextFunction
import typings.express.mod.Request_
import typings.express.mod.Response_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthenticationMiddlewareOptions extends js.Object {
  
  var getTokenInfo: js.UndefOr[GetTokenInfo[Record[String, _]]] = js.native
  
  var logger: js.UndefOr[Logger] = js.native
  
  var onNotAuthenticatedHandler: js.UndefOr[
    typings.authmosphere.authenticationMiddlewareOptionsMod.onNotAuthenticatedHandler
  ] = js.native
  
  var publicEndpoints: js.UndefOr[js.Array[String]] = js.native
  
  var tokenInfoEndpoint: String = js.native
}
object AuthenticationMiddlewareOptions {
  
  @scala.inline
  def apply(tokenInfoEndpoint: String): AuthenticationMiddlewareOptions = {
    val __obj = js.Dynamic.literal(tokenInfoEndpoint = tokenInfoEndpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthenticationMiddlewareOptions]
  }
  
  @scala.inline
  implicit class AuthenticationMiddlewareOptionsOps[Self <: AuthenticationMiddlewareOptions] (val x: Self) extends AnyVal {
    
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
    def setTokenInfoEndpoint(value: String): Self = this.set("tokenInfoEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTokenInfo(
      value: (/* tokenInfoUrl */ String, /* accessToken */ String, /* logger */ js.UndefOr[Logger]) => js.Promise[Token[Record[String, _]]]
    ): Self = this.set("getTokenInfo", js.Any.fromFunction3(value))
    
    @scala.inline
    def deleteGetTokenInfo: Self = this.set("getTokenInfo", js.undefined)
    
    @scala.inline
    def setLogger(value: Logger): Self = this.set("logger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    
    @scala.inline
    def setOnNotAuthenticatedHandler(
      value: (/* request */ Request_[ParamsDictionary, js.Any, js.Any, Query], /* resonse */ Response_[js.Any], /* next */ NextFunction, /* logger */ Logger) => Unit
    ): Self = this.set("onNotAuthenticatedHandler", js.Any.fromFunction4(value))
    
    @scala.inline
    def deleteOnNotAuthenticatedHandler: Self = this.set("onNotAuthenticatedHandler", js.undefined)
    
    @scala.inline
    def setPublicEndpointsVarargs(value: String*): Self = this.set("publicEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setPublicEndpoints(value: js.Array[String]): Self = this.set("publicEndpoints", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePublicEndpoints: Self = this.set("publicEndpoints", js.undefined)
  }
}
