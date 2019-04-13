package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCommentInput extends js.Object {
  /**
    * The system-generated ID of the comment you want to update. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId
  /**
    * The updated content with which you want to replace the existing content of the comment.
    */
  var content: Content
}

object UpdateCommentInput {
  @scala.inline
  def apply(commentId: CommentId, content: Content): UpdateCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId, content = content)
  
    __obj.asInstanceOf[UpdateCommentInput]
  }
}

