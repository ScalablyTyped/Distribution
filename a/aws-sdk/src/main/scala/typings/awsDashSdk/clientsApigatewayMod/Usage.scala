package typings.awsDashSdk.clientsApigatewayMod

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
  def apply(
    endDate: String = null,
    items: MapOfKeyUsages = null,
    position: String = null,
    startDate: String = null,
    usagePlanId: String = null
  ): Usage = {
    val __obj = js.Dynamic.literal()
    if (endDate != null) __obj.updateDynamic("endDate")(endDate.asInstanceOf[js.Any])
    if (items != null) __obj.updateDynamic("items")(items.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (startDate != null) __obj.updateDynamic("startDate")(startDate.asInstanceOf[js.Any])
    if (usagePlanId != null) __obj.updateDynamic("usagePlanId")(usagePlanId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Usage]
  }
}

