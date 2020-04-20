package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsagePlanKeyRequest extends js.Object {
  /**
    * [Required] The key Id of the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var keyId: String = js.native
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String = js.native
}

object GetUsagePlanKeyRequest {
  @scala.inline
  def apply(keyId: String, usagePlanId: String): GetUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsagePlanKeyRequest]
  }
}

