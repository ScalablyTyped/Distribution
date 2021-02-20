package typings.awsSdk.apigatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeleteUsagePlanKeyRequest extends StObject {
  
  /**
    * [Required] The Id of the UsagePlanKey resource to be deleted.
    */
  var keyId: String = js.native
  
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-deleted UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String = js.native
}
object DeleteUsagePlanKeyRequest {
  
  @scala.inline
  def apply(keyId: String, usagePlanId: String): DeleteUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteUsagePlanKeyRequest]
  }
  
  @scala.inline
  implicit class DeleteUsagePlanKeyRequestMutableBuilder[Self <: DeleteUsagePlanKeyRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setKeyId(value: String): Self = StObject.set(x, "keyId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUsagePlanId(value: String): Self = StObject.set(x, "usagePlanId", value.asInstanceOf[js.Any])
  }
}
