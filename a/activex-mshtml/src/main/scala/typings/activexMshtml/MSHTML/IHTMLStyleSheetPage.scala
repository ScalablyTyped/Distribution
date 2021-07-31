package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLStyleSheetPage extends StObject {
  
  @JSName("MSHTML.IHTMLStyleSheetPage_typekey")
  var MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage
  
  val pseudoClass: String
  
  val selector: String
}
object IHTMLStyleSheetPage {
  
  @scala.inline
  def apply(MSHTMLDotIHTMLStyleSheetPage_typekey: IHTMLStyleSheetPage, pseudoClass: String, selector: String): IHTMLStyleSheetPage = {
    val __obj = js.Dynamic.literal(pseudoClass = pseudoClass.asInstanceOf[js.Any], selector = selector.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLStyleSheetPage_typekey")(MSHTMLDotIHTMLStyleSheetPage_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLStyleSheetPage]
  }
  
  @scala.inline
  implicit class IHTMLStyleSheetPageMutableBuilder[Self <: IHTMLStyleSheetPage] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLStyleSheetPage_typekey(value: IHTMLStyleSheetPage): Self = StObject.set(x, "MSHTML.IHTMLStyleSheetPage_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPseudoClass(value: String): Self = StObject.set(x, "pseudoClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
  }
}
