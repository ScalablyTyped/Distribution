package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFindingsResponse extends js.Object {
  var FindingIds: js.UndefOr[FindingIds] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListFindingsResponse {
  @scala.inline
  def apply(FindingIds: FindingIds = null, NextToken: NextToken = null): ListFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (FindingIds != null) __obj.updateDynamic("FindingIds")(FindingIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFindingsResponse]
  }
}

