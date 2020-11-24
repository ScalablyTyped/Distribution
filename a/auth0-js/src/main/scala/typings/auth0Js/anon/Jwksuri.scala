package typings.auth0Js.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Jwksuri extends js.Object {
  
  var __jwks_uri: js.UndefOr[String] = js.native
  
  var __tenant: js.UndefOr[String] = js.native
  
  var __token_issuer: js.UndefOr[String] = js.native
}
object Jwksuri {
  
  @scala.inline
  def apply(): Jwksuri = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Jwksuri]
  }
  
  @scala.inline
  implicit class JwksuriOps[Self <: Jwksuri] (val x: Self) extends AnyVal {
    
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
    def set__jwks_uri(value: String): Self = this.set("__jwks_uri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__jwks_uri: Self = this.set("__jwks_uri", js.undefined)
    
    @scala.inline
    def set__tenant(value: String): Self = this.set("__tenant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__tenant: Self = this.set("__tenant", js.undefined)
    
    @scala.inline
    def set__token_issuer(value: String): Self = this.set("__token_issuer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__token_issuer: Self = this.set("__token_issuer", js.undefined)
  }
}
