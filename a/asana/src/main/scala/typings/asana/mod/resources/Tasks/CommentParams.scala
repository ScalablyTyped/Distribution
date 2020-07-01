package typings.asana.mod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentParams extends js.Object {
  var html_text: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object CommentParams {
  @scala.inline
  def apply(html_text: String = null, text: String = null): CommentParams = {
    val __obj = js.Dynamic.literal()
    if (html_text != null) __obj.updateDynamic("html_text")(html_text.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommentParams]
  }
}

