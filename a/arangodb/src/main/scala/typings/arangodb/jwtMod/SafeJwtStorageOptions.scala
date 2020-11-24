package typings.arangodb.jwtMod

import typings.arangodb.ArangoDB.JwtAlgorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SafeJwtStorageOptions extends js.Object {
  
  var algorithm: js.UndefOr[JwtAlgorithm] = js.native
  
  var maxExp: js.UndefOr[Double] = js.native
  
  var secret: String = js.native
  
  var ttl: js.UndefOr[Double] = js.native
  
  var verify: js.UndefOr[Boolean] = js.native
}
object SafeJwtStorageOptions {
  
  @scala.inline
  def apply(secret: String): SafeJwtStorageOptions = {
    val __obj = js.Dynamic.literal(secret = secret.asInstanceOf[js.Any])
    __obj.asInstanceOf[SafeJwtStorageOptions]
  }
  
  @scala.inline
  implicit class SafeJwtStorageOptionsOps[Self <: SafeJwtStorageOptions] (val x: Self) extends AnyVal {
    
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
    def setSecret(value: String): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlgorithm(value: JwtAlgorithm): Self = this.set("algorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlgorithm: Self = this.set("algorithm", js.undefined)
    
    @scala.inline
    def setMaxExp(value: Double): Self = this.set("maxExp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxExp: Self = this.set("maxExp", js.undefined)
    
    @scala.inline
    def setTtl(value: Double): Self = this.set("ttl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTtl: Self = this.set("ttl", js.undefined)
    
    @scala.inline
    def setVerify(value: Boolean): Self = this.set("verify", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVerify: Self = this.set("verify", js.undefined)
  }
}
