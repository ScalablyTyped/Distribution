package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingResponse extends js.Object {
  /**
    * A finding object that contains finding details.
    */
  var finding: js.UndefOr[Finding] = js.native
}

object GetFindingResponse {
  @scala.inline
  def apply(finding: Finding = null): GetFindingResponse = {
    val __obj = js.Dynamic.literal()
    if (finding != null) __obj.updateDynamic("finding")(finding.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFindingResponse]
  }
}

