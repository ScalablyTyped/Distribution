package typings.angularCore.mod

import typings.angularCore.angularCoreStrings.comment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait COMMENT_MARKER extends js.Object {
  var marker: comment
}

object COMMENT_MARKER {
  @scala.inline
  def apply(marker: comment): COMMENT_MARKER = {
    val __obj = js.Dynamic.literal(marker = marker.asInstanceOf[js.Any])
    __obj.asInstanceOf[COMMENT_MARKER]
  }
}

