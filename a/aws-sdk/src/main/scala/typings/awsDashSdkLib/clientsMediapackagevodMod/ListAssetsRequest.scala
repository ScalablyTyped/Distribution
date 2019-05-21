package typings
package awsDashSdkLib.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssetsRequest extends js.Object {
  /**
    * Upper bound on number of records to return.
    */
  var MaxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A token used to resume pagination from the end of a previous request.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Returns Assets associated with the specified PackagingGroup.
    */
  var PackagingGroupId: js.UndefOr[__string] = js.undefined
}

object ListAssetsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: __string = null,
    PackagingGroupId: __string = null
  ): ListAssetsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PackagingGroupId != null) __obj.updateDynamic("PackagingGroupId")(PackagingGroupId)
    __obj.asInstanceOf[ListAssetsRequest]
  }
}

