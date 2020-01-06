package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateBranchResult extends js.Object {
  /**
    *  Branch structure for an Amplify App. 
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

