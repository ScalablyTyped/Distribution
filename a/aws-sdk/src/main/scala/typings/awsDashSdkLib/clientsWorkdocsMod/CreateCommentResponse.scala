package typings
package awsDashSdkLib.clientsWorkdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCommentResponse extends js.Object {
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[Comment] = js.undefined
}

object CreateCommentResponse {
  @scala.inline
  def apply(Comment: Comment = null): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment)
    __obj.asInstanceOf[CreateCommentResponse]
  }
}

