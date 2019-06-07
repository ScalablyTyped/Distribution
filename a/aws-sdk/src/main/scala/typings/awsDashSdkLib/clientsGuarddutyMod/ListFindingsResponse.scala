package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFindingsResponse extends js.Object {
  /**
    * The IDs of the findings you are listing.
    */
  var FindingIds: awsDashSdkLib.clientsGuarddutyMod.FindingIds
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListFindingsResponse {
  @scala.inline
  def apply(FindingIds: FindingIds, NextToken: String = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal(FindingIds = FindingIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

