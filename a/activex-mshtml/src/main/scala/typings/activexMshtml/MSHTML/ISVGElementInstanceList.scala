package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISVGElementInstanceList extends js.Object {
  @JSName("MSHTML.ISVGElementInstanceList_typekey")
  var MSHTMLDotISVGElementInstanceList_typekey: ISVGElementInstanceList = js.native
  val length: Double = js.native
  def item(index: Double): ISVGElementInstance = js.native
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
  @scala.inline
  implicit class ISVGElementInstanceListOps[Self <: ISVGElementInstanceList] (val x: Self) extends AnyVal {
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
    def setMSHTMLDotISVGElementInstanceList_typekey(value: ISVGElementInstanceList): Self = this.set("MSHTML.ISVGElementInstanceList_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: Double => ISVGElementInstance): Self = this.set("item", js.Any.fromFunction1(value))
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
  
}

