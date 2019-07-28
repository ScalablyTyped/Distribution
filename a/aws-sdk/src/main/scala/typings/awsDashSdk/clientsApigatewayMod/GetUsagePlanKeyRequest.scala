package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsagePlanKeyRequest extends js.Object {
  /**
    * [Required] The key Id of the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var keyId: String
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String
}

object GetUsagePlanKeyRequest {
  @scala.inline
  def apply(keyId: String, usagePlanId: String): GetUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId, usagePlanId = usagePlanId)
  
    __obj.asInstanceOf[GetUsagePlanKeyRequest]
  }
}

