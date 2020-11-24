package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HTMLCSSMediaList extends js.Object {
  
  @JSName("MSHTML.HTMLCSSMediaList_typekey")
  var MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList = js.native
  
  def appendMedium(bstrMedium: String): Unit = js.native
  
  def deleteMedium(bstrMedium: String): Unit = js.native
  
  def item(index: Double): String = js.native
  
  val length: Double = js.native
  
  var mediaText: String = js.native
}
object HTMLCSSMediaList {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList,
    appendMedium: String => Unit,
    deleteMedium: String => Unit,
    item: Double => String,
    length: Double,
    mediaText: String
  ): HTMLCSSMediaList = {
    val __obj = js.Dynamic.literal(appendMedium = js.Any.fromFunction1(appendMedium), deleteMedium = js.Any.fromFunction1(deleteMedium), item = js.Any.fromFunction1(item), length = length.asInstanceOf[js.Any], mediaText = mediaText.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLCSSMediaList_typekey")(MSHTMLDotHTMLCSSMediaList_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLCSSMediaList]
  }
  
  @scala.inline
  implicit class HTMLCSSMediaListOps[Self <: HTMLCSSMediaList] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotHTMLCSSMediaList_typekey(value: HTMLCSSMediaList): Self = this.set("MSHTML.HTMLCSSMediaList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAppendMedium(value: String => Unit): Self = this.set("appendMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteMedium(value: String => Unit): Self = this.set("deleteMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => String): Self = this.set("item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = this.set("length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaText(value: String): Self = this.set("mediaText", value.asInstanceOf[js.Any])
  }
}
