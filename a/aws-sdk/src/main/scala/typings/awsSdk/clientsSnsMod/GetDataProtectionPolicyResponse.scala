package typings.awsSdk.clientsSnsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDataProtectionPolicyResponse extends StObject {
  
  /**
    * Retrieves the DataProtectionPolicy in JSON string format.
    */
  var DataProtectionPolicy: js.UndefOr[attributeValue] = js.undefined
}
object GetDataProtectionPolicyResponse {
  
  inline def apply(): GetDataProtectionPolicyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDataProtectionPolicyResponse]
  }
  
  extension [Self <: GetDataProtectionPolicyResponse](x: Self) {
    
    inline def setDataProtectionPolicy(value: attributeValue): Self = StObject.set(x, "DataProtectionPolicy", value.asInstanceOf[js.Any])
    
    inline def setDataProtectionPolicyUndefined: Self = StObject.set(x, "DataProtectionPolicy", js.undefined)
  }
}
