package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetUserDetailsResponse extends StObject {
  
  /**
    * The friendly name displayed for the user in Amazon CodeCatalyst.
    */
  var displayName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address provided by the user when they signed up.
    */
  var primaryEmail: js.UndefOr[EmailAddress] = js.undefined
  
  /**
    * The system-generated unique ID of the user.
    */
  var userId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user as displayed in Amazon CodeCatalyst.
    */
  var userName: js.UndefOr[String] = js.undefined
  
  /**
    * 
    */
  var version: js.UndefOr[String] = js.undefined
}
object GetUserDetailsResponse {
  
  inline def apply(): GetUserDetailsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetUserDetailsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetUserDetailsResponse] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setPrimaryEmail(value: EmailAddress): Self = StObject.set(x, "primaryEmail", value.asInstanceOf[js.Any])
    
    inline def setPrimaryEmailUndefined: Self = StObject.set(x, "primaryEmail", js.undefined)
    
    inline def setUserId(value: String): Self = StObject.set(x, "userId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "userId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "userName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "userName", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
  }
}
