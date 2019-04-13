package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsagePlanKeysRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * A query parameter specifying the name of the to-be-returned usage plan keys.
    */
  var nameQuery: js.UndefOr[String] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String
}

object GetUsagePlanKeysRequest {
  @scala.inline
  def apply(
    usagePlanId: String,
    limit: js.UndefOr[NullableInteger] = js.undefined,
    nameQuery: String = null,
    position: String = null
  ): GetUsagePlanKeysRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId)
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit)
    if (nameQuery != null) __obj.updateDynamic("nameQuery")(nameQuery)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetUsagePlanKeysRequest]
  }
}

