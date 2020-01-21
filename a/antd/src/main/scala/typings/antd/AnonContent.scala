package typings.antd

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonContent extends js.Object {
  var content: ReactNode
  var ellipsis: Boolean
  var text: String
}

object AnonContent {
  @scala.inline
  def apply(ellipsis: Boolean, text: String, content: ReactNode = null): AnonContent = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonContent]
  }
}

