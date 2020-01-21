package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchResult extends js.Object {
  /**
    *  Branch structure for an Amplify App. 
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

