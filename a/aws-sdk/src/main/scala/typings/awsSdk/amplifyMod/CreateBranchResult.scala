package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchResult extends js.Object {
  /**
    *  Describes the branch for an Amplify app, which maps to a third-party repository branch. 
    */
  var branch: Branch = js.native
}

object CreateBranchResult {
  @scala.inline
  def apply(branch: Branch): CreateBranchResult = {
    val __obj = js.Dynamic.literal(branch = branch.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchResult]
  }
}

