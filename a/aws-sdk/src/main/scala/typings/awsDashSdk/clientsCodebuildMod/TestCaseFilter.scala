package typings.awsDashSdk.clientsCodebuildMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestCaseFilter extends js.Object {
  /**
    *  The status used to filter test cases. Valid statuses are SUCCEEDED, FAILED, ERROR, SKIPPED, and UNKNOWN. A TestCaseFilter can have one status. 
    */
  var status: js.UndefOr[String] = js.native
}

object TestCaseFilter {
  @scala.inline
  def apply(status: String = null): TestCaseFilter = {
    val __obj = js.Dynamic.literal()
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestCaseFilter]
  }
}

