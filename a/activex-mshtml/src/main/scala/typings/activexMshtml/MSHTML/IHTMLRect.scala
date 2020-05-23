package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHTMLRect extends js.Object {
  @JSName("MSHTML.IHTMLRect_typekey")
  var MSHTMLDotIHTMLRect_typekey: IHTMLRect
  var bottom: Double
  var left: Double
  var right: Double
  var top: Double
}

object IHTMLRect {
  @scala.inline
  def apply(MSHTMLDotIHTMLRect_typekey: IHTMLRect, bottom: Double, left: Double, right: Double, top: Double): IHTMLRect = {
    val __obj = js.Dynamic.literal(bottom = bottom.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLRect_typekey")(MSHTMLDotIHTMLRect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLRect]
  }
}

