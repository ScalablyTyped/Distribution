package typings.awsSdk.clientsChimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResetPersonalPINResponse extends StObject {
  
  /**
    * The user details and new personal meeting PIN.
    */
  var User: js.UndefOr[typings.awsSdk.clientsChimeMod.User] = js.undefined
}
object ResetPersonalPINResponse {
  
  inline def apply(): ResetPersonalPINResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResetPersonalPINResponse]
  }
  
  extension [Self <: ResetPersonalPINResponse](x: Self) {
    
    inline def setUser(value: User): Self = StObject.set(x, "User", value.asInstanceOf[js.Any])
    
    inline def setUserUndefined: Self = StObject.set(x, "User", js.undefined)
  }
}
