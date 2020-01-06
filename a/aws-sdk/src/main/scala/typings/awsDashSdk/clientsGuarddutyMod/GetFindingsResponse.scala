package typings.awsDashSdk.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFindingsResponse extends js.Object {
  /**
    * A list of findings.
    */
  var Findings: typings.awsDashSdk.clientsGuarddutyMod.Findings = js.native
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: Findings): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

