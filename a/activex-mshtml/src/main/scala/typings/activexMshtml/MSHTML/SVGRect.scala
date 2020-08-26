package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGRect extends js.Object {
  @JSName("MSHTML.SVGRect_typekey")
  var MSHTMLDotSVGRect_typekey: SVGRect = js.native
  var height: Double = js.native
  var width: Double = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object SVGRect {
  @scala.inline
  def apply(MSHTMLDotSVGRect_typekey: SVGRect, height: Double, width: Double, x: Double, y: Double): SVGRect = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGRect_typekey")(MSHTMLDotSVGRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGRect]
  }
  @scala.inline
  implicit class SVGRectOps[Self <: SVGRect] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotSVGRect_typekey(value: SVGRect): Self = this.set("MSHTML.SVGRect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

