package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLDocument extends StObject {
  
  @JSName("MSHTML.IHTMLDocument_typekey")
  var MSHTMLDotIHTMLDocument_typekey: IHTMLDocument = js.native
  
  val Script: js.Any = js.native
}
object IHTMLDocument {
  
  @scala.inline
  def apply(MSHTMLDotIHTMLDocument_typekey: IHTMLDocument, Script: js.Any): IHTMLDocument = {
    val __obj = js.Dynamic.literal(Script = Script.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLDocument_typekey")(MSHTMLDotIHTMLDocument_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLDocument]
  }
  
  @scala.inline
  implicit class IHTMLDocumentMutableBuilder[Self <: IHTMLDocument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMSHTMLDotIHTMLDocument_typekey(value: IHTMLDocument): Self = StObject.set(x, "MSHTML.IHTMLDocument_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScript(value: js.Any): Self = StObject.set(x, "Script", value.asInstanceOf[js.Any])
  }
}
