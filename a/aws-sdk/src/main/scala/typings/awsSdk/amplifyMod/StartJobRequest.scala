package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartJobRequest extends StObject {
  
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
  implicit class StartJobRequestMutableBuilder[Self <: StartJobRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppId(value: AppId): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBranchName(value: BranchName): Self = StObject.set(x, "branchName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitId(value: CommitId): Self = StObject.set(x, "commitId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitIdUndefined: Self = StObject.set(x, "commitId", js.undefined)
    
    @scala.inline
    def setCommitMessage(value: CommitMessage): Self = StObject.set(x, "commitMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitMessageUndefined: Self = StObject.set(x, "commitMessage", js.undefined)
    
    @scala.inline
    def setCommitTime(value: CommitTime): Self = StObject.set(x, "commitTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommitTimeUndefined: Self = StObject.set(x, "commitTime", js.undefined)
    
    @scala.inline
    def setJobId(value: JobId): Self = StObject.set(x, "jobId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobIdUndefined: Self = StObject.set(x, "jobId", js.undefined)
    
    @scala.inline
    def setJobReason(value: JobReason): Self = StObject.set(x, "jobReason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJobReasonUndefined: Self = StObject.set(x, "jobReason", js.undefined)
    
    @scala.inline
    def setJobType(value: JobType): Self = StObject.set(x, "jobType", value.asInstanceOf[js.Any])
  }
}
