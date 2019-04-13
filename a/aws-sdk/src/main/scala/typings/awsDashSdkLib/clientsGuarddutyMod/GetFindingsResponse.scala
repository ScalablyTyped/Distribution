package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsResponse extends js.Object {
  var Findings: js.UndefOr[Findings] = js.undefined
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: Findings = null): GetFindingsResponse = {
    val __obj = js.Dynamic.literal()
    if (Findings != null) __obj.updateDynamic("Findings")(Findings)
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

