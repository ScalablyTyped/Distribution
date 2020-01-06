package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUsagePlanKeyRequest extends js.Object {
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
}

