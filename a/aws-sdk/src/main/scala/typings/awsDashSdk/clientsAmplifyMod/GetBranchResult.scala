package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchResult extends js.Object {
  var branch: Branch = js.native
}

object GetBranchResult {
  @scala.inline
  def apply(branch: Branch): GetBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBranchResult]
  }
}

