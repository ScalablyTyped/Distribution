package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SVGElementInstanceList extends js.Object {
  
  @JSName("MSHTML.SVGElementInstanceList_typekey")
  var MSHTMLDotSVGElementInstanceList_typekey: SVGElementInstanceList = js.native
  
  def item(index: Double): ISVGElementInstance = js.native
  
  val length: Double = js.native
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
  
  @scala.inline
  implicit class SVGElementInstanceListOps[Self <: SVGElementInstanceList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotSVGElementInstanceList_typekey(value: SVGElementInstanceList): Self = this.set("MSHTML.SVGElementInstanceList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItem(value: Double => ISVGElementInstance): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
  }
}
