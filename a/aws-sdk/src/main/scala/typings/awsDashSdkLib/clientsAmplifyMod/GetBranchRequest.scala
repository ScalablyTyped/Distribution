package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBranchRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for the branch. 
    */
  var branchName: BranchName
}

object GetBranchRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName): GetBranchRequest = {
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName)
  
    __obj.asInstanceOf[GetBranchRequest]
  }
}

