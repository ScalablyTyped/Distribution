package typings.awsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoginId extends StObject {
  
  var LoginId: js.UndefOr[String] = js.native
}
object LoginId {
  
  @scala.inline
  def apply(): LoginId = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoginId]
  }
  
  @scala.inline
  implicit class LoginIdMutableBuilder[Self <: LoginId] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoginId(value: String): Self = StObject.set(x, "LoginId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoginIdUndefined: Self = StObject.set(x, "LoginId", js.undefined)
  }
}
