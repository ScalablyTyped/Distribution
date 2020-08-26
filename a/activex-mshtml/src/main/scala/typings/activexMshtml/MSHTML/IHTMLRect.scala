package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IHTMLRect extends js.Object {
  @JSName("MSHTML.IHTMLRect_typekey")
  var MSHTMLDotIHTMLRect_typekey: IHTMLRect = js.native
  var bottom: Double = js.native
  var left: Double = js.native
  var right: Double = js.native
  var top: Double = js.native
}

object IHTMLRect {
  @scala.inline
  def apply(MSHTMLDotIHTMLRect_typekey: IHTMLRect, bottom: Double, left: Double, right: Double, top: Double): IHTMLRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRect_typekey")(MSHTMLDotIHTMLRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRect]
  }
  @scala.inline
  implicit class IHTMLRectOps[Self <: IHTMLRect] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotIHTMLRect_typekey(value: IHTMLRect): Self = this.set("MSHTML.IHTMLRect_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setBottom(value: Double): Self = this.set("bottom", value.asInstanceOf[js.Any])
    @scala.inline
    def setLeft(value: Double): Self = this.set("left", value.asInstanceOf[js.Any])
    @scala.inline
    def setRight(value: Double): Self = this.set("right", value.asInstanceOf[js.Any])
    @scala.inline
    def setTop(value: Double): Self = this.set("top", value.asInstanceOf[js.Any])
  }
  
}

