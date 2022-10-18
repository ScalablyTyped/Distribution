package typings.awsSdk.clientsCodegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutRecommendationFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: Arn
  
  /**
    * List for storing reactions. Reactions are utf-8 text code for emojis. If you send an empty list it clears all your feedback.
    */
  var Reactions: typings.awsSdk.clientsCodegurureviewerMod.Reactions
  
  /**
    * The recommendation ID that can be used to track the provided recommendations and then to collect the feedback.
    */
  var RecommendationId: typings.awsSdk.clientsCodegurureviewerMod.RecommendationId
}
object PutRecommendationFeedbackRequest {
  
  inline def apply(CodeReviewArn: Arn, Reactions: Reactions, RecommendationId: RecommendationId): PutRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any], Reactions = Reactions.asInstanceOf[js.Any], RecommendationId = RecommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecommendationFeedbackRequest]
  }
  
  extension [Self <: PutRecommendationFeedbackRequest](x: Self) {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setReactions(value: Reactions): Self = StObject.set(x, "Reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "Reactions", js.Array(value*))
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
  }
}
