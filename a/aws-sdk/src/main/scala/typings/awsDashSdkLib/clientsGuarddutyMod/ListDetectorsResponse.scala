package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorsResponse extends js.Object {
  /**
    * A list of detector Ids.
    */
  var DetectorIds: awsDashSdkLib.clientsGuarddutyMod.DetectorIds
  /**
    * Pagination parameter to be used on the next list operation to retrieve more items.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListDetectorsResponse {
  @scala.inline
  def apply(DetectorIds: DetectorIds, NextToken: String = null): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal(DetectorIds = DetectorIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDetectorsResponse]
  }
}

