package typings
package awsDashSdkLib.clientsCodecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateCommentOutput extends js.Object {
  /**
    * Information about the updated comment.
    */
  var comment: js.UndefOr[Comment] = js.undefined
}

object UpdateCommentOutput {
  @scala.inline
  def apply(comment: Comment = null): UpdateCommentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment)
    __obj.asInstanceOf[UpdateCommentOutput]
  }
}

