package typings.autobahn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAuthCra extends js.Object {
  
  def derive_key(secret: String, salt: String, iterations: Double, keylen: Double): String = js.native
  
  def sign(key: String, challenge: String): String = js.native
}
object IAuthCra {
  
  @scala.inline
  def apply(derive_key: (String, String, Double, Double) => String, sign: (String, String) => String): IAuthCra = {
    val __obj = js.Dynamic.literal(derive_key = js.Any.fromFunction4(derive_key), sign = js.Any.fromFunction2(sign))
    __obj.asInstanceOf[IAuthCra]
  }
  
  @scala.inline
  implicit class IAuthCraOps[Self <: IAuthCra] (val x: Self) extends AnyVal {
    
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
    def setDerive_key(value: (String, String, Double, Double) => String): Self = this.set("derive_key", js.Any.fromFunction4(value))
    
    @scala.inline
    def setSign(value: (String, String) => String): Self = this.set("sign", js.Any.fromFunction2(value))
  }
}
