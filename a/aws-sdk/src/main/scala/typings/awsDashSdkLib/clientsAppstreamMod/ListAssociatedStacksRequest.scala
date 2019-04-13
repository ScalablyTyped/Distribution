package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAssociatedStacksRequest extends js.Object {
  /**
    * The name of the fleet.
    */
  var FleetName: String
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListAssociatedStacksRequest {
  @scala.inline
  def apply(FleetName: String, NextToken: String = null): ListAssociatedStacksRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListAssociatedStacksRequest]
  }
}

