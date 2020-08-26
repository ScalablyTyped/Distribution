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
  @scala.inline
  implicit class StopJobRequestOps[Self <: StopJobRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAppId(value: AppId): Self = this.set("appId", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
  }
  
}

