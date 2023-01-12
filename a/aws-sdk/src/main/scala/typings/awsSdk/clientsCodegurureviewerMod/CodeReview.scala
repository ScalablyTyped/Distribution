package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CodeReview extends StObject {
  
  /**
    * The types of analysis performed during a repository analysis or a pull request review. You can specify either Security, CodeQuality, or both.
    */
  var AnalysisTypes: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.AnalysisTypes] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the RepositoryAssociation that contains the reviewed source code. You can retrieve associated repository ARNs by calling ListRepositoryAssociations.
    */
  var AssociationArn: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.AssociationArn] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The state of the aws-codeguru-reviewer.yml configuration file that allows the configuration of the CodeGuru Reviewer analysis. The file either exists, doesn't exist, or exists with errors at the root directory of your repository.
    */
  var ConfigFileState: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ConfigFileState] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the code review was created.
    */
  var CreatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The time, in milliseconds since the epoch, when the code review was last updated.
    */
  var LastUpdatedTimeStamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The statistics from the code review.
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Metrics] = js.undefined
  
  /**
    * The name of the code review.
    */
  var Name: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Name] = js.undefined
  
  /**
    * The owner of the repository. For an Amazon Web Services CodeCommit repository, this is the Amazon Web Services account ID of the account that owns the repository. For a GitHub, GitHub Enterprise Server, or Bitbucket repository, this is the username for the account that owns the repository. For an S3 repository, it can be the username or Amazon Web Services account ID.
    */
  var Owner: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Owner] = js.undefined
  
  /**
    * The type of repository that contains the reviewed code (for example, GitHub or Bitbucket).
    */
  var ProviderType: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.ProviderType] = js.undefined
  
  /**
    * The pull request ID for the code review.
    */
  var PullRequestId: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.PullRequestId] = js.undefined
  
  /**
    * The name of the repository.
    */
  var RepositoryName: js.UndefOr[Name] = js.undefined
  
  /**
    * The type of the source code for the code review.
    */
  var SourceCodeType: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.SourceCodeType] = js.undefined
  
  /**
    * The valid code review states are:    Completed: The code review is complete.    Pending: The code review started and has not completed or failed.    Failed: The code review failed.    Deleting: The code review is being deleted.  
    */
  var State: js.UndefOr[JobState] = js.undefined
  
  /**
    * The reason for the state of the code review.
    */
  var StateReason: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.StateReason] = js.undefined
  
  /**
    * The type of code review.
    */
  var Type: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.Type] = js.undefined
}
object CodeReview {
  
  inline def apply(): CodeReview = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CodeReview]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CodeReview] (val x: Self) extends AnyVal {
    
    inline def setAnalysisTypes(value: AnalysisTypes): Self = StObject.set(x, "AnalysisTypes", value.asInstanceOf[js.Any])
    
    inline def setAnalysisTypesUndefined: Self = StObject.set(x, "AnalysisTypes", js.undefined)
    
    inline def setAnalysisTypesVarargs(value: AnalysisType*): Self = StObject.set(x, "AnalysisTypes", js.Array(value*))
    
    inline def setAssociationArn(value: AssociationArn): Self = StObject.set(x, "AssociationArn", value.asInstanceOf[js.Any])
    
    inline def setAssociationArnUndefined: Self = StObject.set(x, "AssociationArn", js.undefined)
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewArnUndefined: Self = StObject.set(x, "CodeReviewArn", js.undefined)
    
    inline def setConfigFileState(value: ConfigFileState): Self = StObject.set(x, "ConfigFileState", value.asInstanceOf[js.Any])
    
    inline def setConfigFileStateUndefined: Self = StObject.set(x, "ConfigFileState", js.undefined)
    
    inline def setCreatedTimeStamp(value: js.Date): Self = StObject.set(x, "CreatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setCreatedTimeStampUndefined: Self = StObject.set(x, "CreatedTimeStamp", js.undefined)
    
    inline def setLastUpdatedTimeStamp(value: js.Date): Self = StObject.set(x, "LastUpdatedTimeStamp", value.asInstanceOf[js.Any])
    
    inline def setLastUpdatedTimeStampUndefined: Self = StObject.set(x, "LastUpdatedTimeStamp", js.undefined)
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setName(value: Name): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOwner(value: Owner): Self = StObject.set(x, "Owner", value.asInstanceOf[js.Any])
    
    inline def setOwnerUndefined: Self = StObject.set(x, "Owner", js.undefined)
    
    inline def setProviderType(value: ProviderType): Self = StObject.set(x, "ProviderType", value.asInstanceOf[js.Any])
    
    inline def setProviderTypeUndefined: Self = StObject.set(x, "ProviderType", js.undefined)
    
    inline def setPullRequestId(value: PullRequestId): Self = StObject.set(x, "PullRequestId", value.asInstanceOf[js.Any])
    
    inline def setPullRequestIdUndefined: Self = StObject.set(x, "PullRequestId", js.undefined)
    
    inline def setRepositoryName(value: Name): Self = StObject.set(x, "RepositoryName", value.asInstanceOf[js.Any])
    
    inline def setRepositoryNameUndefined: Self = StObject.set(x, "RepositoryName", js.undefined)
    
    inline def setSourceCodeType(value: SourceCodeType): Self = StObject.set(x, "SourceCodeType", value.asInstanceOf[js.Any])
    
    inline def setSourceCodeTypeUndefined: Self = StObject.set(x, "SourceCodeType", js.undefined)
    
    inline def setState(value: JobState): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    
    inline def setStateReason(value: StateReason): Self = StObject.set(x, "StateReason", value.asInstanceOf[js.Any])
    
    inline def setStateReasonUndefined: Self = StObject.set(x, "StateReason", js.undefined)
    
    inline def setStateUndefined: Self = StObject.set(x, "State", js.undefined)
    
    inline def setType(value: Type): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
