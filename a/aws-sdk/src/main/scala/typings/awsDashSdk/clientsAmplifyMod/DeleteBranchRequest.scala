package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteBranchRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for the branch. 
    */
  var branchName: BranchName
}

object DeleteBranchRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): DeleteBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName)
  
    __obj.asInstanceOf[DeleteBranchRequest]
  }
}

