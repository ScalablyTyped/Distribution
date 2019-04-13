package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListDetectorsResponse extends js.Object {
  var DetectorIds: js.UndefOr[DetectorIds] = js.undefined
  var NextToken: js.UndefOr[NextToken] = js.undefined
}

object ListDetectorsResponse {
  @scala.inline
  def apply(DetectorIds: DetectorIds = null, NextToken: NextToken = null): ListDetectorsResponse = {
    val __obj = js.Dynamic.literal()
    if (DetectorIds != null) __obj.updateDynamic("DetectorIds")(DetectorIds)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListDetectorsResponse]
  }
}

