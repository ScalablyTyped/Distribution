package typings.`3box`.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignJWT extends js.Object {
  
  def signJWT(claim: String): String = js.native
}
object SignJWT {
  
  @scala.inline
  def apply(signJWT: String => String): SignJWT = {
    val __obj = js.Dynamic.literal(signJWT = js.Any.fromFunction1(signJWT))
    __obj.asInstanceOf[SignJWT]
  }
  
  @scala.inline
  implicit class SignJWTOps[Self <: SignJWT] (val x: Self) extends AnyVal {
    
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
    def setSignJWT(value: String => String): Self = this.set("signJWT", js.Any.fromFunction1(value))
  }
}
