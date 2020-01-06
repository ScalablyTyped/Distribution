package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAttachedPoliciesRequest extends js.Object {
  /**
    * The token to retrieve the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The maximum number of results to be returned per request.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * When true, recursively list attached policies.
    */
  var recursive: js.UndefOr[Recursive] = js.native
  /**
    * The group or principal for which the policies will be listed.
    */
  var target: PolicyTarget = js.native
}

object ListAttachedPoliciesRequest {
  @scala.inline
  def apply(
    target: PolicyTarget,
    marker: Marker = null,
    pageSize: Int | Double = null,
    recursive: js.UndefOr[scala.Boolean] = js.undefined
  ): ListAttachedPoliciesRequest = {
    val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAttachedPoliciesRequest]
  }
}

