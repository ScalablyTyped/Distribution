package typings
package awsDashSdkLib.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFindingsResponse extends js.Object {
  /**
    * A list of ARNs that specifies the findings returned by the action.
    */
  var findingArns: ListReturnedArnList
  /**
    *  When a response is generated, if there is more data to be listed, this parameter is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListFindingsResponse {
  @scala.inline
  def apply(findingArns: ListReturnedArnList, nextToken: PaginationToken = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(findingArns = findingArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

