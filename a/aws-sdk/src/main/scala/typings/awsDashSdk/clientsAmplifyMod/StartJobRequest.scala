package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartJobRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name for the branch, for the Job. 
    */
  var branchName: BranchName
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: js.UndefOr[CommitMessage] = js.undefined
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: js.UndefOr[CommitTime] = js.undefined
  /**
    *  Unique Id for an existing job. Required for "RETRY" JobType. 
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  /**
    *  Descriptive reason for starting this job. 
    */
  var jobReason: js.UndefOr[JobReason] = js.undefined
  /**
    *  Type for the Job. Available JobTypes are: \n "RELEASE": Start a new job with the latest change from the specified branch. Only available for apps that have connected to a repository. "RETRY": Retry an existing job. JobId is required for this type of job. 
    */
  var jobType: JobType
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
    val __obj = js.Dynamic.literal(appId = appId, branchName = branchName, jobType = jobType.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    if (commitMessage != null) __obj.updateDynamic("commitMessage")(commitMessage)
    if (commitTime != null) __obj.updateDynamic("commitTime")(commitTime)
    if (jobId != null) __obj.updateDynamic("jobId")(jobId)
    if (jobReason != null) __obj.updateDynamic("jobReason")(jobReason)
    __obj.asInstanceOf[StartJobRequest]
  }
}

