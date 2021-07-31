package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPersonalPINResponse extends StObject {
  
  /**
    * The user details and new personal meeting PIN.
    */
  var User: js.UndefOr[typings.awsSdk.chimeMod.User] = js.undefined
}
object ResetPersonalPINResponse {
  
  @scala.inline
  def apply(): ResetPersonalPINResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPersonalPINResponse]
  }
  
  @scala.inline
  implicit class ResetPersonalPINResponseMutableBuilder[Self <: ResetPersonalPINResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
