package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReviewerResponseSource extends StObject {
  
  /**
    * The comment entered by a reviewer as part of their document review response.
    */
  var Comment: js.UndefOr[DocumentReviewCommentList] = js.undefined
  
  /**
    * The date and time that a reviewer entered a response to a document review request.
    */
  var CreateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The current review status of a new custom SSM document created by a member of your organization, or of the latest version of an existing SSM document. Only one version of a document can be in the APPROVED state at a time. When a new version is approved, the status of the previous version changes to REJECTED. Only one version of a document can be in review, or PENDING, at a time.
    */
  var ReviewStatus: js.UndefOr[typings.awsSdk.clientsSsmMod.ReviewStatus] = js.undefined
  
  /**
    * The user in your organization assigned to review a document request.
    */
  var Reviewer: js.UndefOr[typings.awsSdk.clientsSsmMod.Reviewer] = js.undefined
  
  /**
    * The date and time that a reviewer last updated a response to a document review request.
    */
  var UpdatedTime: js.UndefOr[js.Date] = js.undefined
}
object DocumentReviewerResponseSource {
  
  inline def apply(): DocumentReviewerResponseSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReviewerResponseSource]
  }
  
  extension [Self <: DocumentReviewerResponseSource](x: Self) {
    
    inline def setComment(value: DocumentReviewCommentList): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCommentVarargs(value: DocumentReviewCommentSource*): Self = StObject.set(x, "Comment", js.Array(value*))
    
    inline def setCreateTime(value: js.Date): Self = StObject.set(x, "CreateTime", value.asInstanceOf[js.Any])
    
    inline def setCreateTimeUndefined: Self = StObject.set(x, "CreateTime", js.undefined)
    
    inline def setReviewStatus(value: ReviewStatus): Self = StObject.set(x, "ReviewStatus", value.asInstanceOf[js.Any])
    
    inline def setReviewStatusUndefined: Self = StObject.set(x, "ReviewStatus", js.undefined)
    
    inline def setReviewer(value: Reviewer): Self = StObject.set(x, "Reviewer", value.asInstanceOf[js.Any])
    
    inline def setReviewerUndefined: Self = StObject.set(x, "Reviewer", js.undefined)
    
    inline def setUpdatedTime(value: js.Date): Self = StObject.set(x, "UpdatedTime", value.asInstanceOf[js.Any])
    
    inline def setUpdatedTimeUndefined: Self = StObject.set(x, "UpdatedTime", js.undefined)
  }
}
