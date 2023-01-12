package typings.awsSdk.clientsCloudwatcheventsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionBasicAuthRequestParameters extends StObject {
  
  /**
    * The password associated with the user name to use for Basic authorization.
    */
  var Password: js.UndefOr[AuthHeaderParameters] = js.undefined
  
  /**
    * The user name to use for Basic authorization.
    */
  var Username: js.UndefOr[AuthHeaderParameters] = js.undefined
}
object UpdateConnectionBasicAuthRequestParameters {
  
  inline def apply(): UpdateConnectionBasicAuthRequestParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateConnectionBasicAuthRequestParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateConnectionBasicAuthRequestParameters] (val x: Self) extends AnyVal {
    
    inline def setPassword(value: AuthHeaderParameters): Self = StObject.set(x, "Password", value.asInstanceOf[js.Any])
    
    inline def setPasswordUndefined: Self = StObject.set(x, "Password", js.undefined)
    
    inline def setUsername(value: AuthHeaderParameters): Self = StObject.set(x, "Username", value.asInstanceOf[js.Any])
    
    inline def setUsernameUndefined: Self = StObject.set(x, "Username", js.undefined)
  }
}
