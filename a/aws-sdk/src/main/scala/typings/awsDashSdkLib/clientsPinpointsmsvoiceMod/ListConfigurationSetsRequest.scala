package typings
package awsDashSdkLib.clientsPinpointsmsvoiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListConfigurationSetsRequest extends js.Object {
  /**
    * A token returned from a previous call to the API that indicates the position in the list of results.
    */
  var NextToken: js.UndefOr[__string] = js.undefined
  /**
    * Used to specify the number of items that should be returned in the response.
    */
  var PageSize: js.UndefOr[__string] = js.undefined
}

object ListConfigurationSetsRequest {
  @scala.inline
  def apply(NextToken: __string = null, PageSize: __string = null): ListConfigurationSetsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PageSize != null) __obj.updateDynamic("PageSize")(PageSize)
    __obj.asInstanceOf[ListConfigurationSetsRequest]
  }
}

