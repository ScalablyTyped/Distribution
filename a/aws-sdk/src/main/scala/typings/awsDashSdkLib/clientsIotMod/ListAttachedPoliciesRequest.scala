package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttachedPoliciesRequest extends js.Object {
  /**
    * The token to retrieve the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.undefined
  /**
    * The maximum number of results to be returned per request.
    */
  var pageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * When true, recursively list attached policies.
    */
  var recursive: js.UndefOr[Recursive] = js.undefined
  /**
    * The group for which the policies will be listed.
    */
  var target: PolicyTarget
}

object ListAttachedPoliciesRequest {
  @scala.inline
  def apply(
    target: PolicyTarget,
    marker: Marker = null,
    pageSize: js.UndefOr[PageSize] = js.undefined,
    recursive: js.UndefOr[Recursive] = js.undefined
  ): ListAttachedPoliciesRequest = {
    val __obj = js.Dynamic.literal(target = target)
    if (marker != null) __obj.updateDynamic("marker")(marker)
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize)
    if (!js.isUndefined(recursive)) __obj.updateDynamic("recursive")(recursive)
    __obj.asInstanceOf[ListAttachedPoliciesRequest]
  }
}

