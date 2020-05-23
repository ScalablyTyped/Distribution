package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISVGElementInstanceList extends js.Object {
  @JSName("MSHTML.ISVGElementInstanceList_typekey")
  var MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList
  val length: Double
  def item(index: Double): ISVGElementInstance
}

object ISVGElementInstanceList {
  @scala.inline
  def apply(
    MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList,
    item: Double => ISVGElementInstance,
    length: Double
  ): ISVGElementInstanceList = {
    val __obj = js.Dynamic.literal(item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ISVGElementInstanceList_typekey")(MSHTMLDotISVGElementInstanceList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISVGElementInstanceList]
  }
}

