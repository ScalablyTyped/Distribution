package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Usage extends js.Object {
  /**
    * The ending date of the usage data.
    */
  var endDate: js.UndefOr[String] = js.native
  /**
    * The usage data, as daily logs of used and remaining quotas, over the specified time interval indexed over the API keys in a usage plan. For example, {..., "values" : { "{api_key}" : [ [0, 100], [10, 90], [100, 10]]}, where {api_key} stands for an API key value and the daily log entry is of the format [used quota, remaining quota].
    */
  var items: js.UndefOr[MapOfKeyUsages] = js.native
  var position: js.UndefOr[String] = js.native
  /**
    * The starting date of the usage data.
    */
  var startDate: js.UndefOr[String] = js.native
  /**
    * The plan Id associated with this usage data.
    */
  var usagePlanId: js.UndefOr[String] = js.native
}

object Usage {
  @scala.inline
  def apply(): Usage = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Usage]
  }
  @scala.inline
  implicit class UsageOps[Self <: Usage] (val x: Self) extends AnyVal {
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
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setItems(value: MapOfKeyUsages): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePosition: Self = this.set("position", js.undefined)
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    @scala.inline
    def setUsagePlanId(value: String): Self = this.set("usagePlanId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUsagePlanId: Self = this.set("usagePlanId", js.undefined)
  }
  
}

