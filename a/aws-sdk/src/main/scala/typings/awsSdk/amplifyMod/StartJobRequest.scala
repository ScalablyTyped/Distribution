package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The branch name for the job. 
    */
  var branchName: BranchName = js.native
  /**
    *  The commit ID from a third-party repository provider for the job. 
    */
  var commitId: js.UndefOr[CommitId] = js.native
  /**
    *  The commit message from a third-party repository provider for the job. 
    */
  var commitMessage: js.UndefOr[CommitMessage] = js.native
  /**
    *  The commit date and time for the job. 
    */
  var commitTime: js.UndefOr[CommitTime] = js.native
  /**
    *  The unique ID for an existing job. This is required if the value of jobType is RETRY. 
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    *  A descriptive reason for starting this job. 
    */
  var jobReason: js.UndefOr[JobReason] = js.native
  /**
    *  Describes the type for the job. The job type RELEASE starts a new job with the latest change from the specified branch. This value is available only for apps that are connected to a repository. The job type RETRY retries an existing job. If the job type value is RETRY, the jobId is also required. 
    */
  var jobType: JobType = js.native
}

object StartJobRequest {
  @scala.inline
  def apply(appId: AppId, branchName: BranchName, jobType: JobType): StartJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
  @scala.inline
  implicit class StartJobRequestOps[Self <: StartJobRequest] (val x: Self) extends AnyVal {
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
    def setJobType(value: JobType): Self = this.set("jobType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitId(value: CommitId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
    @scala.inline
    def setCommitMessage(value: CommitMessage): Self = this.set("commitMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitMessage: Self = this.set("commitMessage", js.undefined)
    @scala.inline
    def setCommitTime(value: CommitTime): Self = this.set("commitTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitTime: Self = this.set("commitTime", js.undefined)
    @scala.inline
    def setJobId(value: JobId): Self = this.set("jobId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobId: Self = this.set("jobId", js.undefined)
    @scala.inline
    def setJobReason(value: JobReason): Self = this.set("jobReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJobReason: Self = this.set("jobReason", js.undefined)
  }
  
}

