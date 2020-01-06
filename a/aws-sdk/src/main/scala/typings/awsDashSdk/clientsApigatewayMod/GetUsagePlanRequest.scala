package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsagePlanRequest extends js.Object {
  /**
    * [Required] The identifier of the UsagePlan resource to be retrieved.
    */
  var usagePlanId: String = js.native
}

object GetUsagePlanRequest {
  @scala.inline
  def apply(usagePlanId: String): GetUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetUsagePlanRequest]
  }
}

