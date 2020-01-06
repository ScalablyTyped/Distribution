package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostCommentReplyOutput extends js.Object {
  /**
    * Information about the reply to a comment.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object PostCommentReplyOutput {
  @scala.inline
  def apply(comment: Comment = null): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
}

