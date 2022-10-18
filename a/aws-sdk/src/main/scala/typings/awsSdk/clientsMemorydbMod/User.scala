package typings.awsSdk.clientsMemorydbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait User extends StObject {
  
  /**
    * The names of the Access Control Lists to which the user belongs
    */
  var ACLNames: js.UndefOr[ACLNameList] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the user. 
    */
  var ARN: js.UndefOr[String] = js.undefined
  
  /**
    * Access permissions string used for this user.
    */
  var AccessString: js.UndefOr[String] = js.undefined
  
  /**
    * Denotes whether the user requires a password to authenticate.
    */
  var Authentication: js.UndefOr[typings.awsSdk.clientsMemorydbMod.Authentication] = js.undefined
  
  /**
    * The minimum engine version supported for the user
    */
  var MinimumEngineVersion: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user
    */
  var Name: js.UndefOr[String] = js.undefined
  
  /**
    * Indicates the user status. Can be "active", "modifying" or "deleting".
    */
  var Status: js.UndefOr[String] = js.undefined
}
object User {
  
  inline def apply(): User = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[User]
  }
  
  extension [Self <: User](x: Self) {
    
    inline def setACLNames(value: ACLNameList): Self = StObject.set(x, "ACLNames", value.asInstanceOf[js.Any])
    
    inline def setACLNamesUndefined: Self = StObject.set(x, "ACLNames", js.undefined)
    
    inline def setACLNamesVarargs(value: ACLName*): Self = StObject.set(x, "ACLNames", js.Array(value*))
    
    inline def setARN(value: String): Self = StObject.set(x, "ARN", value.asInstanceOf[js.Any])
    
    inline def setARNUndefined: Self = StObject.set(x, "ARN", js.undefined)
    
    inline def setAccessString(value: String): Self = StObject.set(x, "AccessString", value.asInstanceOf[js.Any])
    
    inline def setAccessStringUndefined: Self = StObject.set(x, "AccessString", js.undefined)
    
    inline def setAuthentication(value: Authentication): Self = StObject.set(x, "Authentication", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationUndefined: Self = StObject.set(x, "Authentication", js.undefined)
    
    inline def setMinimumEngineVersion(value: String): Self = StObject.set(x, "MinimumEngineVersion", value.asInstanceOf[js.Any])
    
    inline def setMinimumEngineVersionUndefined: Self = StObject.set(x, "MinimumEngineVersion", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
