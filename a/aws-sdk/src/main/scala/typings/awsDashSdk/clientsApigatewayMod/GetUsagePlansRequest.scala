package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUsagePlansRequest extends js.Object {
  /**
    * The identifier of the API key associated with the usage plans.
    */
  var keyId: js.UndefOr[String] = js.undefined
  /**
    * The maximum number of returned results per page. The default value is 25 and the maximum value is 500.
    */
  var limit: js.UndefOr[NullableInteger] = js.undefined
  /**
    * The current pagination position in the paged result set.
    */
  var position: js.UndefOr[String] = js.undefined
}

object GetUsagePlansRequest {
  @scala.inline
  def apply(keyId: String = null, limit: Int | scala.Double = null, position: String = null): GetUsagePlansRequest = {
    val __obj = js.Dynamic.literal()
    if (keyId != null) __obj.updateDynamic("keyId")(keyId)
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[GetUsagePlansRequest]
  }
}

