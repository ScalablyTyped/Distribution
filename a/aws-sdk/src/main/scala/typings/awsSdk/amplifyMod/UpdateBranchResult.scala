package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBranchResult extends js.Object {
  /**
    *  The branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch = js.native
}

object UpdateBranchResult {
  @scala.inline
  def apply(branch: Branch): UpdateBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateBranchResult]
  }
}

