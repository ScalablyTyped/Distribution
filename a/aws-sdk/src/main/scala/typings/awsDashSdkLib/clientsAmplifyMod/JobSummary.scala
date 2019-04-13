package typings
package awsDashSdkLib.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobSummary extends js.Object {
  /**
    *  Commit Id from 3rd party repository provider for the Job. 
    */
  var commitId: CommitId
  /**
    *  Commit message from 3rd party repository provider for the Job. 
    */
  var commitMessage: CommitMessage
  /**
    *  Commit date / time for the Job. 
    */
  var commitTime: CommitTime
  /**
    *  End date / time for the Job. 
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  /**
    *  Arn for the Job. 
    */
  var jobArn: JobArn
  /**
    *  Unique Id for the Job. 
    */
  var jobId: JobId
  /**
    *  Type for the Job. 
    */
  var jobType: JobType
  /**
    *  Start date / time for the Job. 
    */
  var startTime: StartTime
  /**
    *  Status for the Job. 
    */
  var status: JobStatus
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
    val __obj = js.Dynamic.literal(commitId = commitId, commitMessage = commitMessage, commitTime = commitTime, jobArn = jobArn, jobId = jobId, jobType = jobType.asInstanceOf[js.Any], startTime = startTime, status = status.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    __obj.asInstanceOf[JobSummary]
  }
}

