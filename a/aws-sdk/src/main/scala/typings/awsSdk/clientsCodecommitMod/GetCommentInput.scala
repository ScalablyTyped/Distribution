package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentInput extends StObject {
  
  /**
    * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId
}
object GetCommentInput {
  
  inline def apply(commentId: CommentId): GetCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentInput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetCommentInput] (val x: Self) extends AnyVal {
    
    inline def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
  }
}
