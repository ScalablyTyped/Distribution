package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetUsagePlanKeysRequest extends js.Object {
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.native
  /**
    * A query parameter specifying the name of the to-be-returned usage plan keys.
    */
  var nameQuery: js.UndefOr[String] = js.native
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.native
  /**
    * [Required] The Id of the UsagePlan resource representing the usage plan containing the to-be-retrieved UsagePlanKey resource representing a plan customer.
    */
  var usagePlanId: String = js.native
}

object GetUsagePlanKeysRequest {
  @scala.inline
  def apply(usagePlanId: String): GetUsagePlanKeysRequest = {
    val __obj = js.Dynamic.literal(usagePlanId = usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetUsagePlanKeysRequest]
  }
  @scala.inline
  implicit class GetUsagePlanKeysRequestOps[Self <: GetUsagePlanKeysRequest] (val x: Self) extends AnyVal {
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
    def setUsagePlanId(value: String): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimit(value: NullableInteger): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setNameQuery(value: String): Self = this.set("nameQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNameQuery: Self = this.set("nameQuery", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
  }
  
}

