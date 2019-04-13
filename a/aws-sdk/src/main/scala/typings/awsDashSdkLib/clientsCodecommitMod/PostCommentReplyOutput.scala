package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostCommentReplyOutput extends js.Object {
  /**
    * Information about the reply to a comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}

object PostCommentReplyOutput {
  @scala.inline
  def apply(comment: Comment = null): PostCommentReplyOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[PostCommentReplyOutput]
  }
}

