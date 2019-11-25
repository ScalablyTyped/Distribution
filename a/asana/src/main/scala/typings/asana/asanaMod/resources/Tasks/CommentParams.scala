package typings.asana.asanaMod.resources.Tasks

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommentParams extends js.Object {
  var text: String
}

object CommentParams {
  @scala.inline
  def apply(text: String): CommentParams = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CommentParams]
  }
}

