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
  def apply(
    appId: AppId,
    branchName: BranchName,
    jobType: JobType,
    commitId: CommitId = null,
    commitMessage: CommitMessage = null,
    commitTime: CommitTime = null,
    jobId: JobId = null,
    jobReason: JobReason = null
  ): StartJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage.asInstanceOf[js.Any])
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime.asInstanceOf[js.Any])
    if (jobId != null) __obj.updateDynamic("jobId")(jobId.asInstanceOf[js.Any])
    if (jobReason != null) __obj.updateDynamic("jobReason")(jobReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
}

