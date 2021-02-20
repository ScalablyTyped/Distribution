package typings.auth0Js.mod

import org.scalablytyped.runtime.StObject
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
  implicit class PasswordlessStartAuthParamsMutableBuilder[Self <: PasswordlessStartAuthParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setResponseMode(value: String): Self = StObject.set(x, "responseMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResponseModeUndefined: Self = StObject.set(x, "responseMode", js.undefined)
  }
}
