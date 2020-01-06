package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListDetectorsResponse extends js.Object {
  /**
    * A list of detector Ids.
    */
  var DetectorIds: typings.awsDashSdk.clientsGuarddutyMod.DetectorIds = js.native
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListDetectorsResponse {
  @scala.inline
  def apply(DetectorIds: DetectorIds, NextToken: String = null): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal(DetectorIds = DetectorIds.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDetectorsResponse]
  }
}

