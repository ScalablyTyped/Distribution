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
  def apply(endDate: String, startDate: String, usagePlanId: String): GetUsageRequest = {
    val __obj = js.Dynamic.literal(endDate = endDate.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any], usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsageRequest]
  }
  @scala.inline
  implicit class GetUsageRequestOps[Self <: GetUsageRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setEndDate(value: String): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsagePlanId(value: String): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyId(value: String): Self = this.set("keyId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyId: Self = this.set("keyId", js.undefined)
    @scala.inline
    def setLimit(value: NullableInteger): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

