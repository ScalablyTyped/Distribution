package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobSummary extends js.Object {
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: CommitId = js.native
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: CommitMessage = js.native
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: CommitTime = js.native
  /**
    *  End date / time for the Job. 
    */
  var endTime: js.UndefOr[EndTime] = js.native
  /**
    *  Arn for the Job. 
    */
  var jobArn: JobArn = js.native
  /**
    *  Unique Id for the Job. 
    */
  var jobId: JobId = js.native
  /**
    *  Type for the Job. \n "RELEASE": Manually released from source by using StartJob API. "RETRY": Manually retried by using StartJob API. "WEB_HOOK": Automatically triggered by WebHooks. 
    */
  var jobType: JobType = js.native
  /**
    *  Start date / time for the Job. 
    */
  var startTime: StartTime = js.native
  /**
    *  Status for the Job. 
    */
  var status: JobStatus = js.native
}

object JobSummary {
  @scala.inline
  def apply(
    commitId: CommitId,
    commitMessage: CommitMessage,
    commitTime: CommitTime,
    jobArn: JobArn,
    jobId: JobId,
    jobType: JobType,
    startTime: StartTime,
    status: JobStatus,
    endTime: EndTime = null
  ): JobSummary = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
}

