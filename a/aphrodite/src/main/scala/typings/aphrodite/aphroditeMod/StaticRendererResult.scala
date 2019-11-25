package typings.aphrodite.aphroditeMod

import typings.aphrodite.Anon_Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRendererResult extends js.Object {
  var css: Anon_Content
  var html: String
}

object StaticRendererResult {
  @scala.inline
  def apply(css: Anon_Content, html: String): StaticRendererResult = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticRendererResult]
  }
}

