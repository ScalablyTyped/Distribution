package typings.awsDashSdk.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetCommentOutput extends js.Object {
  /**
    * The contents of the comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}

object GetCommentOutput {
  @scala.inline
  def apply(comment: Comment = null): GetCommentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[GetCommentOutput]
  }
}

