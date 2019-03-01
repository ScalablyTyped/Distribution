package typings
package aphroditeLib.aphroditeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRendererResult extends js.Object {
  var css: aphroditeLib.Anon_Content
  var html: java.lang.String
}

object StaticRendererResult {
  @scala.inline
  def apply(css: aphroditeLib.Anon_Content, html: java.lang.String): StaticRendererResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("css")(css)
    __obj.updateDynamic("html")(html)
    __obj.asInstanceOf[StaticRendererResult]
  }
}

