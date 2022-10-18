package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentReactionsInput extends StObject {
  
  /**
    * The ID of the comment for which you want to get reactions information.
    */
  var commentId: CommentId
  
  /**
    * A non-zero, non-negative integer used to limit the number of returned results. The default is the same as the allowed maximum, 1,000.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  
  /**
    * An enumeration token that, when provided in a request, returns the next batch of the results. 
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * Optional. The Amazon Resource Name (ARN) of the user or identity for which you want to get reaction information.
    */
  var reactionUserArn: js.UndefOr[Arn] = js.undefined
}
object GetCommentReactionsInput {
  
  inline def apply(commentId: CommentId): GetCommentReactionsInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentReactionsInput]
  }
  
  extension [Self <: GetCommentReactionsInput](x: Self) {
    
    inline def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "maxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "maxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setReactionUserArn(value: Arn): Self = StObject.set(x, "reactionUserArn", value.asInstanceOf[js.Any])
    
    inline def setReactionUserArnUndefined: Self = StObject.set(x, "reactionUserArn", js.undefined)
  }
}
