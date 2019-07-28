package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBlueprintsRequest extends js.Object {
  /**
    * A Boolean value indicating whether to include inactive results in your request.
    */
  var includeInactive: js.UndefOr[Boolean] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get blueprints request.
    */
  var pageToken: js.UndefOr[String] = js.undefined
}

object GetBlueprintsRequest {
  @scala.inline
  def apply(includeInactive: js.UndefOr[Boolean] = js.undefined, pageToken: String = null): GetBlueprintsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetBlueprintsRequest]
  }
}

