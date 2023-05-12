package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RdsLoginAttemptAction extends StObject {
  
  /**
    * Indicates the login attributes used in the login attempt.
    */
  var LoginAttributes: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.LoginAttributes] = js.undefined
  
  var RemoteIpDetails: js.UndefOr[typings.awsSdk.clientsGuarddutyMod.RemoteIpDetails] = js.undefined
}
object RdsLoginAttemptAction {
  
  inline def apply(): RdsLoginAttemptAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RdsLoginAttemptAction]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RdsLoginAttemptAction] (val x: Self) extends AnyVal {
    
    inline def setLoginAttributes(value: LoginAttributes): Self = StObject.set(x, "LoginAttributes", value.asInstanceOf[js.Any])
    
    inline def setLoginAttributesUndefined: Self = StObject.set(x, "LoginAttributes", js.undefined)
    
    inline def setLoginAttributesVarargs(value: LoginAttribute*): Self = StObject.set(x, "LoginAttributes", js.Array(value*))
    
    inline def setRemoteIpDetails(value: RemoteIpDetails): Self = StObject.set(x, "RemoteIpDetails", value.asInstanceOf[js.Any])
    
    inline def setRemoteIpDetailsUndefined: Self = StObject.set(x, "RemoteIpDetails", js.undefined)
  }
}
