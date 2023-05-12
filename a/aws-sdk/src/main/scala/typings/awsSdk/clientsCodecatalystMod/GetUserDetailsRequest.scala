package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserDetailsRequest extends StObject {
  
  /**
    * The system-generated unique ID of the user. 
    */
  var id: js.UndefOr[GetUserDetailsRequestIdString] = js.undefined
  
  /**
    * The name of the user as displayed in Amazon CodeCatalyst.
    */
  var userName: js.UndefOr[GetUserDetailsRequestUserNameString] = js.undefined
}
object GetUserDetailsRequest {
  
  inline def apply(): GetUserDetailsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDetailsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserDetailsRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: GetUserDetailsRequestIdString): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setUserName(value: GetUserDetailsRequestUserNameString): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
  }
}
