package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserPoolAddOnsType extends StObject {
  
  /**
    * The advanced security mode.
    */
  var AdvancedSecurityMode: AdvancedSecurityModeType
}
object UserPoolAddOnsType {
  
  inline def apply(AdvancedSecurityMode: AdvancedSecurityModeType): UserPoolAddOnsType = {
    val __obj = js.Dynamic.literal(AdvancedSecurityMode = AdvancedSecurityMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserPoolAddOnsType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserPoolAddOnsType] (val x: Self) extends AnyVal {
    
    inline def setAdvancedSecurityMode(value: AdvancedSecurityModeType): Self = StObject.set(x, "AdvancedSecurityMode", value.asInstanceOf[js.Any])
  }
}
