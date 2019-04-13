package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUsagePlanKeyRequest extends js.Object {
  /**
    * [Required] The Id of the UsagePlanKey resource to be deleted.
    */
  var keyId: String
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-deleted UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String
}

object DeleteUsagePlanKeyRequest {
  @scala.inline
  def apply(keyId: String, usagePlanId: String): DeleteUsagePlanKeyRequest = {
    val __obj = js.Dynamic.literal(keyId = keyId, usagePlanId = usagePlanId)
  
    __obj.asInstanceOf[DeleteUsagePlanKeyRequest]
  }
}

