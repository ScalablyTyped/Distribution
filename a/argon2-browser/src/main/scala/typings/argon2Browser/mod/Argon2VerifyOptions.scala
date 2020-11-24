package typings.argon2Browser.mod

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Argon2VerifyOptions extends js.Object {
  
  var encoded: String | Uint8Array = js.native
  
  var pass: String = js.native
  
  var `type`: js.UndefOr[ArgonType] = js.native
}
object Argon2VerifyOptions {
  
  @scala.inline
  def apply(encoded: String | Uint8Array, pass: String): Argon2VerifyOptions = {
    val __obj = js.Dynamic.literal(encoded = encoded.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Argon2VerifyOptions]
  }
  
  @scala.inline
  implicit class Argon2VerifyOptionsOps[Self <: Argon2VerifyOptions] (val x: Self) extends AnyVal {
    
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
    def setEncoded(value: String | Uint8Array): Self = this.set("encoded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String): Self = this.set("pass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: ArgonType): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
