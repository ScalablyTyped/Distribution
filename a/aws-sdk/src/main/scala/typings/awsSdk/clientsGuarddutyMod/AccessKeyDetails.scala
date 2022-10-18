package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AccessKeyDetails extends StObject {
  
  /**
    * The access key ID of the user.
    */
  var AccessKeyId: js.UndefOr[String] = js.undefined
  
  /**
    * The principal ID of the user.
    */
  var PrincipalId: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the user.
    */
  var UserName: js.UndefOr[String] = js.undefined
  
  /**
    * The type of the user.
    */
  var UserType: js.UndefOr[String] = js.undefined
}
object AccessKeyDetails {
  
  inline def apply(): AccessKeyDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AccessKeyDetails]
  }
  
  extension [Self <: AccessKeyDetails](x: Self) {
    
    inline def setAccessKeyId(value: String): Self = StObject.set(x, "AccessKeyId", value.asInstanceOf[js.Any])
    
    inline def setAccessKeyIdUndefined: Self = StObject.set(x, "AccessKeyId", js.undefined)
    
    inline def setPrincipalId(value: String): Self = StObject.set(x, "PrincipalId", value.asInstanceOf[js.Any])
    
    inline def setPrincipalIdUndefined: Self = StObject.set(x, "PrincipalId", js.undefined)
    
    inline def setUserName(value: String): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setUserType(value: String): Self = StObject.set(x, "UserType", value.asInstanceOf[js.Any])
    
    inline def setUserTypeUndefined: Self = StObject.set(x, "UserType", js.undefined)
  }
}
