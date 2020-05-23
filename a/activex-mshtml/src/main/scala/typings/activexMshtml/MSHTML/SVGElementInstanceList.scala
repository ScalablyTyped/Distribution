package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGElementInstanceList extends js.Object {
  @JSName("MSHTML.SVGElementInstanceList_typekey")
  var MSHTMLDotSVGElementInstanceList_typekey: SVGElementInstanceList
  val length: Double
  def item(index: Double): ISVGElementInstance
}

object SVGElementInstanceList {
  @scala.inline
  def apply(
    MSHTMLDotSVGElementInstanceList_typekey: SVGElementInstanceList,
    item: Double => ISVGElementInstance,
    length: Double
  ): SVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGElementInstanceList_typekey")(MSHTMLDotSVGElementInstanceList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGElementInstanceList]
  }
}

