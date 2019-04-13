package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBundlesRequest extends js.Object {
  /**
    * A Boolean value that indicates whether to include inactive bundle results in your request.
    */
  var includeInactive: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A token used for advancing to the next page of results from your get bundles request.
    */
  var pageToken: js.UndefOr[java.lang.String] = js.undefined
}

object GetBundlesRequest {
  @scala.inline
  def apply(includeInactive: js.UndefOr[scala.Boolean] = js.undefined, pageToken: java.lang.String = null): GetBundlesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeInactive)) __obj.updateDynamic("includeInactive")(includeInactive)
    if (pageToken != null) __obj.updateDynamic("pageToken")(pageToken)
    __obj.asInstanceOf[GetBundlesRequest]
  }
}

