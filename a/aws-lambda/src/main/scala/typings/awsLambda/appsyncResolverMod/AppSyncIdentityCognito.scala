package typings.awsLambda.appsyncResolverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AppSyncIdentityCognito extends js.Object {
  
  var claims: js.Any = js.native
  
  var defaultAuthStrategy: String = js.native
  
  var issuer: String = js.native
  
  var sourceIp: js.Array[String] = js.native
  
  var sub: String = js.native
  
  var username: String = js.native
}
object AppSyncIdentityCognito {
  
  @scala.inline
  def apply(
    claims: js.Any,
    defaultAuthStrategy: String,
    issuer: String,
    sourceIp: js.Array[String],
    sub: String,
    username: String
  ): AppSyncIdentityCognito = {
    val __obj = js.Dynamic.literal(claims = claims.asInstanceOf[js.Any], defaultAuthStrategy = defaultAuthStrategy.asInstanceOf[js.Any], issuer = issuer.asInstanceOf[js.Any], sourceIp = sourceIp.asInstanceOf[js.Any], sub = sub.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[AppSyncIdentityCognito]
  }
  
  @scala.inline
  implicit class AppSyncIdentityCognitoOps[Self <: AppSyncIdentityCognito] (val x: Self) extends AnyVal {
    
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
    def setClaims(value: js.Any): Self = this.set("claims", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultAuthStrategy(value: String): Self = this.set("defaultAuthStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceIpVarargs(value: String*): Self = this.set("sourceIp", js.Array(value :_*))
    
    @scala.inline
    def setSourceIp(value: js.Array[String]): Self = this.set("sourceIp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSub(value: String): Self = this.set("sub", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
  }
}
