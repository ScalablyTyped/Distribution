package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetJobRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName = js.native
  /**
    *  Unique Id for the Job. 
    */
  var jobId: JobId = js.native
}

object GetJobRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobId: JobId): GetJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

