package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateUsagePlanKeyRequest extends js.Object {
  /**
    * [Required] The identifier of a UsagePlanKey resource for a plan customer.
    */
  var keyId: String = js.native
  /**
    * [Required] The type of a UsagePlanKey resource for a plan customer.
    */
  var keyType: String = js.native
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-created UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String = js.native
}

object CreateUsagePlanKeyRequest {
  @scala.inline
  def apply(keyId: String, keyType: String, usagePlanId: String): CreateUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId.asInstanceOf[js.Any], keyType = keyType.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateUsagePlanKeyRequest]
  }
}

