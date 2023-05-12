package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeModelCardResponse extends StObject {
  
  /**
    * The content of the model card.
    */
  var Content: ModelCardContent
  
  var CreatedBy: UserContext
  
  /**
    * The date and time the model card was created.
    */
  var CreationTime: js.Date
  
  var LastModifiedBy: js.UndefOr[UserContext] = js.undefined
  
  /**
    * The date and time the model card was last modified.
    */
  var LastModifiedTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the model card.
    */
  var ModelCardArn: typings.awsSdk.clientsSagemakerMod.ModelCardArn
  
  /**
    * The name of the model card.
    */
  var ModelCardName: EntityName
  
  /**
    * The processing status of model card deletion. The ModelCardProcessingStatus updates throughout the different deletion steps.    DeletePending: Model card deletion request received.    DeleteInProgress: Model card deletion is in progress.    ContentDeleted: Deleted model card content.    ExportJobsDeleted: Deleted all export jobs associated with the model card.    DeleteCompleted: Successfully deleted the model card.    DeleteFailed: The model card failed to delete.  
    */
  var ModelCardProcessingStatus: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ModelCardProcessingStatus] = js.undefined
  
  /**
    * The approval status of the model card within your organization. Different organizations might have different criteria for model card review and approval.    Draft: The model card is a work in progress.    PendingReview: The model card is pending review.    Approved: The model card is approved.    Archived: The model card is archived. No more updates should be made to the model card, but it can still be exported.  
    */
  var ModelCardStatus: typings.awsSdk.clientsSagemakerMod.ModelCardStatus
  
  /**
    * The version of the model card.
    */
  var ModelCardVersion: Integer
  
  /**
    * The security configuration used to protect model card content.
    */
  var SecurityConfig: js.UndefOr[ModelCardSecurityConfig] = js.undefined
}
object DescribeModelCardResponse {
  
  inline def apply(
    Content: ModelCardContent,
    CreatedBy: UserContext,
    CreationTime: js.Date,
    ModelCardArn: ModelCardArn,
    ModelCardName: EntityName,
    ModelCardStatus: ModelCardStatus,
    ModelCardVersion: Integer
  ): DescribeModelCardResponse = {
    val __obj = js.Dynamic.literal(Content = Content.asInstanceOf[js.Any], CreatedBy = CreatedBy.asInstanceOf[js.Any], CreationTime = CreationTime.asInstanceOf[js.Any], ModelCardArn = ModelCardArn.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], ModelCardStatus = ModelCardStatus.asInstanceOf[js.Any], ModelCardVersion = ModelCardVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeModelCardResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeModelCardResponse] (val x: Self) extends AnyVal {
    
    inline def setContent(value: ModelCardContent): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setCreatedBy(value: UserContext): Self = StObject.set(x, "CreatedBy", value.asInstanceOf[js.Any])
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedBy(value: UserContext): Self = StObject.set(x, "LastModifiedBy", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedByUndefined: Self = StObject.set(x, "LastModifiedBy", js.undefined)
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelCardArn(value: ModelCardArn): Self = StObject.set(x, "ModelCardArn", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardProcessingStatus(value: ModelCardProcessingStatus): Self = StObject.set(x, "ModelCardProcessingStatus", value.asInstanceOf[js.Any])
    
    inline def setModelCardProcessingStatusUndefined: Self = StObject.set(x, "ModelCardProcessingStatus", js.undefined)
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
    
    inline def setModelCardVersion(value: Integer): Self = StObject.set(x, "ModelCardVersion", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfig(value: ModelCardSecurityConfig): Self = StObject.set(x, "SecurityConfig", value.asInstanceOf[js.Any])
    
    inline def setSecurityConfigUndefined: Self = StObject.set(x, "SecurityConfig", js.undefined)
  }
}
