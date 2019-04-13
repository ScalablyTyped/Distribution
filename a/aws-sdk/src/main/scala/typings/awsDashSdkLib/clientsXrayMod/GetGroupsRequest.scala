package typings
package awsDashSdkLib.clientsXrayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetGroupsRequest extends js.Object {
  /**
    * Pagination token. Not used.
    */
  var NextToken: js.UndefOr[GetGroupsNextToken] = js.undefined
}

object GetGroupsRequest {
  @scala.inline
  def apply(NextToken: GetGroupsNextToken = null): GetGroupsRequest = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetGroupsRequest]
  }
}

