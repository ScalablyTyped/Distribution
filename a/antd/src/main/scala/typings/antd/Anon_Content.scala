package typings.antd

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Content extends js.Object {
  var content: ReactNode
  var ellipsis: Boolean
  var text: String
}

object Anon_Content {
  @scala.inline
  def apply(ellipsis: Boolean, text: String, content: ReactNode = null): Anon_Content = {
    val __obj = js.Dynamic.literal(ellipsis = ellipsis.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Content]
  }
}

