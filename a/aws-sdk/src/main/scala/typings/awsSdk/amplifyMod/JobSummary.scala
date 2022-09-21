package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait JobSummary extends StObject {
  
  /**
    *  The commit ID from a third-party repository provider for the job. 
    */
  var commitId: CommitId
  
  /**
    *  The commit message from a third-party repository provider for the job. 
    */
  var commitMessage: CommitMessage
  
  /**
    *  The commit date and time for the job. 
    */
  var commitTime: js.Date
  
  /**
    *  The end date and time for the job. 
    */
  var endTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The Amazon Resource Name (ARN) for the job. 
    */
  var jobArn: JobArn
  
  /**
    *  The unique ID for the job. 
    */
  var jobId: JobId
  
  /**
    *  The type for the job. If the value is RELEASE, the job was manually released from its source by using the StartJob API. If the value is RETRY, the job was manually retried using the StartJob API. If the value is WEB_HOOK, the job was automatically triggered by webhooks. 
    */
  var jobType: JobType
  
  /**
    *  The start date and time for the job. 
    */
  var startTime: js.Date
  
  /**
    *  The current status for the job. 
    */
  var status: JobStatus
}
object JobSummary {
  
  inline def apply(
    commitId: CommitId,
    commitMessage: CommitMessage,
    commitTime: js.Date,
    jobArn: JobArn,
    jobId: JobId,
    jobType: JobType,
    startTime: js.Date,
    status: JobStatus
  ): JobSummary = {
    val __obj = js.Dynamic.literal(commitId = commitId.asInstanceOf[js.Any], commitMessage = commitMessage.asInstanceOf[js.Any], commitTime = commitTime.asInstanceOf[js.Any], jobArn = jobArn.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobSummary]
  }
  
  extension [Self <: JobSummary](x: Self) {
    
    inline def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitTime(value: js.Date): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setEndTime(value: js.Date): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    inline def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    inline def setJobArn(value: JobArn): Self = StObject.set(x, "jobArn", value.asInstanceOf[js.Any])
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
    
    inline def setStartTime(value: js.Date): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: JobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
