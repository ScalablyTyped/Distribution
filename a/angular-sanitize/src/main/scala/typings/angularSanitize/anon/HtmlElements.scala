package typings.angularSanitize.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HtmlElements extends js.Object {
  var htmlElements: js.UndefOr[js.Array[String]] = js.native
  var htmlVoidElements: js.UndefOr[js.Array[String]] = js.native
  var svgElements: js.UndefOr[js.Array[String]] = js.native
}

object HtmlElements {
  @scala.inline
  def apply(): HtmlElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HtmlElements]
  }
  @scala.inline
  implicit class HtmlElementsOps[Self <: HtmlElements] (val x: Self) extends AnyVal {
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
    def setHtmlElementsVarargs(value: String*): Self = this.set("htmlElements", js.Array(value :_*))
    @scala.inline
    def setHtmlElements(value: js.Array[String]): Self = this.set("htmlElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlElements: Self = this.set("htmlElements", js.undefined)
    @scala.inline
    def setHtmlVoidElementsVarargs(value: String*): Self = this.set("htmlVoidElements", js.Array(value :_*))
    @scala.inline
    def setHtmlVoidElements(value: js.Array[String]): Self = this.set("htmlVoidElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtmlVoidElements: Self = this.set("htmlVoidElements", js.undefined)
    @scala.inline
    def setSvgElementsVarargs(value: String*): Self = this.set("svgElements", js.Array(value :_*))
    @scala.inline
    def setSvgElements(value: js.Array[String]): Self = this.set("svgElements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSvgElements: Self = this.set("svgElements", js.undefined)
  }
  
}

