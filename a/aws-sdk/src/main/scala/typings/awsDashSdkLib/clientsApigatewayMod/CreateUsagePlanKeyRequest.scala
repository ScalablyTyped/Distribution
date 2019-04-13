package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateUsagePlanKeyRequest extends js.Object {
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
  @scala.inline
  def apply(keyId: String, keyType: String, usagePlanId: String): CreateUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId, keyType = keyType, usagePlanId = usagePlanId)
  
    __obj.asInstanceOf[CreateUsagePlanKeyRequest]
  }
}

