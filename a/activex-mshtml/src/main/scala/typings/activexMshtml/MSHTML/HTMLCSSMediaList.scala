package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLCSSMediaList extends StObject {
  
  @JSName("MSHTML.HTMLCSSMediaList_typekey")
  var MSHTMLDotHTMLCSSMediaList_typekey: HTMLCSSMediaList
  
  def appendMedium(bstrMedium: String): Unit
  
  def deleteMedium(bstrMedium: String): Unit
  
  def item(index: Double): String
  
  val length: Double
  
  var mediaText: String
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
  implicit class HTMLCSSMediaListMutableBuilder[Self <: HTMLCSSMediaList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAppendMedium(value: String => Unit): Self = StObject.set(x, "appendMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDeleteMedium(value: String => Unit): Self = StObject.set(x, "deleteMedium", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItem(value: Double => String): Self = StObject.set(x, "item", js.Any.fromFunction1(value))
    
    @scala.inline
    def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLCSSMediaList_typekey(value: HTMLCSSMediaList): Self = StObject.set(x, "MSHTML.HTMLCSSMediaList_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMediaText(value: String): Self = StObject.set(x, "mediaText", value.asInstanceOf[js.Any])
  }
}
