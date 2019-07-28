package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteCommentContentOutput extends js.Object {
  /**
    * Information about the comment you just deleted.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}

object DeleteCommentContentOutput {
  @scala.inline
  def apply(comment: Comment = null): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
}

