package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsageRequest extends js.Object {
  /**
    * [Required] The ending date (e.g., 2016-12-31) of the usage data.
    */
  var endDate: String = js.native
  /**
    * The Id of the API key associated with the resultant usage data.
    */
  var keyId: js.UndefOr[String] = js.native
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * [Required] The starting date (e.g., 2016-01-01) of the usage data.
    */
  var startDate: String = js.native
  /**
    * [Required] The Id of the usage plan associated with the usage data.
    */
  var usagePlanId: String = js.native
}

object GetUsageRequest {
  @scala.inline
  def apply(
    endDate: String,
    startDate: String,
    usagePlanId: String,
    keyId: String = null,
    limit: js.UndefOr[NullableInteger] = js.undefined,
    position: String = null
  ): GetUsageRequest = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    if (keyId != null) __obj.updateDynamic("keyId")(keyId.asInstanceOf[js.Any])
    if (!js.isUndefined(limit)) __obj.updateDynamic("limit")(limit.get.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageRequest]
  }
}

