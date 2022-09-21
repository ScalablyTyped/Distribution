package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartJobRequest extends StObject {
  
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId
  
  /**
    *  The branch name for the job. 
    */
  var branchName: BranchName
  
  /**
    *  The commit ID from a third-party repository provider for the job. 
    */
  var commitId: js.UndefOr[CommitId] = js.undefined
  
  /**
    *  The commit message from a third-party repository provider for the job. 
    */
  var commitMessage: js.UndefOr[CommitMessage] = js.undefined
  
  /**
    *  The commit date and time for the job. 
    */
  var commitTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    *  The unique ID for an existing job. This is required if the value of jobType is RETRY. 
    */
  var jobId: js.UndefOr[JobId] = js.undefined
  
  /**
    *  A descriptive reason for starting this job. 
    */
  var jobReason: js.UndefOr[JobReason] = js.undefined
  
  /**
    *  Describes the type for the job. The job type RELEASE starts a new job with the latest change from the specified branch. This value is available only for apps that are connected to a repository. The job type RETRY retries an existing job. If the job type value is RETRY, the jobId is also required. 
    */
  var jobType: JobType
}
object StartJobRequest {
  
  inline def apply(appId: AppId, branchName: BranchName, jobType: JobType): StartJobRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], branchName = branchName.asInstanceOf[js.Any], jobType = jobType.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartJobRequest]
  }
  
  extension [Self <: StartJobRequest](x: Self) {
    
    inline def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    inline def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    inline def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    inline def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    inline def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    inline def setCommitTime(value: js.Date): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    inline def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    inline def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    inline def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    inline def setJobReason(value: JobReason): Self = StObject.set(x, "jobReason", value.asInstanceOf[js.Any])
    
    inline def setJobReasonUndefined: Self = StObject.set(x, "jobReason", js.undefined)
    
    inline def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
  }
}
