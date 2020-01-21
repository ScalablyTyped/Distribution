package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteUsagePlanRequest extends js.Object {
  /**
    * [Required] The Id of the to-be-deleted usage plan.
    */
  var usagePlanId: String = js.native
}

object DeleteUsagePlanRequest {
  @scala.inline
  def apply(usagePlanId: String): DeleteUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteUsagePlanRequest]
  }
}

