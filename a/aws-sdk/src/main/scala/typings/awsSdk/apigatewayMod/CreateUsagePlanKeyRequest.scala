package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateUsagePlanKeyRequest extends StObject {
  
  /**
    * [Required] The identifier of a UsagePlanKey resource for a plan customer.
    */
  var keyId: String
  
  /**
    * [Required] The type of a UsagePlanKey resource for a plan customer.
    */
  var keyType: String
  
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-created UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String
}
object CreateUsagePlanKeyRequest {
  
  inline def apply(keyId: String, keyType: String, usagePlanId: String): CreateUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanKeyRequest]
  }
  
  extension [Self <: CreateUsagePlanKeyRequest](x: Self) {
    
    inline def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    inline def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
    
    inline def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
