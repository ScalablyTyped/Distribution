package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteUsagePlanRequest extends js.Object {
  /**
    * [Required] The Id of the to-be-deleted usage plan.
    */
  var usagePlanId: String
}

object DeleteUsagePlanRequest {
  @scala.inline
  def apply(usagePlanId: String): DeleteUsagePlanRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId)
  
    __obj.asInstanceOf[DeleteUsagePlanRequest]
  }
}

