package typings.auth0Js.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PasswordlessStartAuthParams extends BaseAuthOptions {
  
  var responseMode: js.UndefOr[String] = js.native
}
object PasswordlessStartAuthParams {
  
  @scala.inline
  def apply(): PasswordlessStartAuthParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PasswordlessStartAuthParams]
  }
  
  @scala.inline
  implicit class PasswordlessStartAuthParamsOps[Self <: PasswordlessStartAuthParams] (val x: Self) extends AnyVal {
    
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
    def setResponseMode(value: String): Self = this.set("responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResponseMode: Self = this.set("responseMode", js.undefined)
  }
}
