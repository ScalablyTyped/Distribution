package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopJobRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name for the branch, for the job. 
    */
  var branchName: BranchName = js.native
  /**
    *  The unique id for the job. 
    */
  var jobId: JobId = js.native
}

object StopJobRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobId: JobId): StopJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopJobRequest]
  }
}

