package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeRecommendationFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: Arn
  
  /**
    * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
    */
  var RecommendationId: typings.awsSdk.clientsCodegurureviewerMod.RecommendationId
  
  /**
    * Optional parameter to describe the feedback for a given user. If this is not supplied, it defaults to the user making the request.  The UserId is an IAM principal that can be specified as an Amazon Web Services account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the Amazon Web Services Identity and Access Management User Guide.
    */
  var UserId: js.UndefOr[typings.awsSdk.clientsCodegurureviewerMod.UserId] = js.undefined
}
object DescribeRecommendationFeedbackRequest {
  
  inline def apply(CodeReviewArn: Arn, RecommendationId: RecommendationId): DescribeRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeRecommendationFeedbackRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeRecommendationFeedbackRequest] (val x: Self) extends AnyVal {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
