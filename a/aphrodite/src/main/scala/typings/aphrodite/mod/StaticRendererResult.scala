package typings.aphrodite.mod

import typings.aphrodite.anon.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticRendererResult extends js.Object {
  var css: Content = js.native
  var html: String = js.native
}

object StaticRendererResult {
  @scala.inline
  def apply(css: Content, html: String): StaticRendererResult = {
    val __obj = js.Dynamic.literal(css = css.asInstanceOf[js.Any], html = html.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticRendererResult]
  }
  @scala.inline
  implicit class StaticRendererResultOps[Self <: StaticRendererResult] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCss(value: Content): Self = this.set("css", value.asInstanceOf[js.Any])
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
  }
  
}

