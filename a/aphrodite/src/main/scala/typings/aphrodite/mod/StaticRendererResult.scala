package typings.aphrodite.mod

import typings.aphrodite.AnonContent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StaticRendererResult extends js.Object {
  var css: AnonContent
  var html: String
}

object StaticRendererResult {
  @scala.inline
  def apply(css: AnonContent, html: String): StaticRendererResult = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[StaticRendererResult]
  }
}

