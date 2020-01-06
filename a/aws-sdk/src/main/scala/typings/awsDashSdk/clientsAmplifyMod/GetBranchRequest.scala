package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for the branch. 
    */
  var branchName: BranchName = js.native
}

object GetBranchRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): GetBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetBranchRequest]
  }
}

