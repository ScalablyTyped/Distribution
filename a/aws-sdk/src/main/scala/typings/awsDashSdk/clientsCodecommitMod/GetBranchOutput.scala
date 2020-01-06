package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchOutput extends js.Object {
  /**
    * The name of the branch.
    */
  var branch: js.UndefOr[BranchInfo] = js.native
}

object GetBranchOutput {
  @scala.inline
  def apply(branch: BranchInfo = null): GetBranchOutput = {
    val __obj = js.Dynamic.literal()
    if (branch != null) __obj.updateDynamic("branch")(branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBranchOutput]
  }
}

