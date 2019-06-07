package typings
package awsDashSdkLib.clientsGuarddutyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetFindingsResponse extends js.Object {
  /**
    * A list of findings.
    */
  var Findings: awsDashSdkLib.clientsGuarddutyMod.Findings
}

object GetFindingsResponse {
  @scala.inline
  def apply(Findings: Findings): GetFindingsResponse = {
    val __obj = js.Dynamic.literal(Findings = Findings)
  
    __obj.asInstanceOf[GetFindingsResponse]
  }
}

