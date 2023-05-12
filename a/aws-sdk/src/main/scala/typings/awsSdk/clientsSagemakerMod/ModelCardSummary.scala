package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModelCardSummary extends StObject {
  
  /**
    * The date and time that the model card was created.
    */
  var CreationTime: js.Date
  
  /**
    * The date and time that the model card was last modified.
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
    * The approval status of the model card within your organization. Different organizations might have different criteria for model card review and approval.    Draft: The model card is a work in progress.    PendingReview: The model card is pending review.    Approved: The model card is approved.    Archived: The model card is archived. No more updates should be made to the model card, but it can still be exported.  
    */
  var ModelCardStatus: typings.awsSdk.clientsSagemakerMod.ModelCardStatus
}
object ModelCardSummary {
  
  inline def apply(
    CreationTime: js.Date,
    ModelCardArn: ModelCardArn,
    ModelCardName: EntityName,
    ModelCardStatus: ModelCardStatus
  ): ModelCardSummary = {
    val __obj = js.Dynamic.literal(CreationTime = CreationTime.asInstanceOf[js.Any], ModelCardArn = ModelCardArn.asInstanceOf[js.Any], ModelCardName = ModelCardName.asInstanceOf[js.Any], ModelCardStatus = ModelCardStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModelCardSummary]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ModelCardSummary] (val x: Self) extends AnyVal {
    
    inline def setCreationTime(value: js.Date): Self = StObject.set(x, "CreationTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTime(value: js.Date): Self = StObject.set(x, "LastModifiedTime", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedTimeUndefined: Self = StObject.set(x, "LastModifiedTime", js.undefined)
    
    inline def setModelCardArn(value: ModelCardArn): Self = StObject.set(x, "ModelCardArn", value.asInstanceOf[js.Any])
    
    inline def setModelCardName(value: EntityName): Self = StObject.set(x, "ModelCardName", value.asInstanceOf[js.Any])
    
    inline def setModelCardStatus(value: ModelCardStatus): Self = StObject.set(x, "ModelCardStatus", value.asInstanceOf[js.Any])
  }
}
