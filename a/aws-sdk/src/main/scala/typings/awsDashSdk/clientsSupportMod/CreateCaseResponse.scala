package typings.awsDashSdk.clientsSupportMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCaseResponse extends js.Object {
  /**
    * The AWS Support case ID requested or returned in the call. The case ID is an alphanumeric string formatted as shown in this example: case-12345678910-2013-c4c1d2bf33c5cf47 
    */
  var caseId: js.UndefOr[CaseId] = js.undefined
}

object CreateCaseResponse {
  @scala.inline
  def apply(caseId: CaseId = null): CreateCaseResponse = {
    val __obj = js.Dynamic.literal()
    if (caseId != null) __obj.updateDynamic("caseId")(caseId)
    __obj.asInstanceOf[CreateCaseResponse]
  }
}

