package typings.awsDashSdk.clientsInspectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListExclusionsResponse extends js.Object {
  /**
    * A list of exclusions' ARNs returned by the action.
    */
  var exclusionArns: ListReturnedArnList
  /**
    * When a response is generated, if there is more data to be listed, this parameters is present in the response and contains the value to use for the nextToken parameter in a subsequent pagination request. If there is no more data to be listed, this parameter is set to null.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
}

object ListExclusionsResponse {
  @scala.inline
  def apply(exclusionArns: ListReturnedArnList, nextToken: PaginationToken = null): ListExclusionsResponse = {
    val __obj = js.Dynamic.literal(exclusionArns = exclusionArns)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListExclusionsResponse]
  }
}

