package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartJobRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId = js.native
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName = js.native
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: js.UndefOr[CommitId] = js.native
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: js.UndefOr[CommitMessage] = js.native
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: js.UndefOr[CommitTime] = js.native
  /**
    *  Unique Id for an existing job. Required for "RETRY" JobType. 
    */
  var jobId: js.UndefOr[JobId] = js.native
  /**
    *  Descriptive reason for starting this job. 
    */
  var jobReason: js.UndefOr[JobReason] = js.native
  /**
    *  Type for the Job. Available JobTypes are: \n "RELEASE": Start a new job with the latest change from the specified branch. Only available for apps that have connected to a repository. "RETRY": Retry an existing job. JobId is required for this type of job. 
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

