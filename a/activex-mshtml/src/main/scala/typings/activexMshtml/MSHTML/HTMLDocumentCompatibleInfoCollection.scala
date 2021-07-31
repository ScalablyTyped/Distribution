package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLDocumentCompatibleInfoCollection extends StObject {
  
  @JSName("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection
  
  val constructor: js.Any
}
object HTMLDocumentCompatibleInfoCollection {
  
  @scala.inline
  def apply(
    MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey: HTMLDocumentCompatibleInfoCollection,
    constructor: js.Any
  ): HTMLDocumentCompatibleInfoCollection = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfoCollection_typekey")(MSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfoCollection]
  }
  
  @scala.inline
  implicit class HTMLDocumentCompatibleInfoCollectionMutableBuilder[Self <: HTMLDocumentCompatibleInfoCollection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotHTMLDocumentCompatibleInfoCollection_typekey(value: HTMLDocumentCompatibleInfoCollection): Self = StObject.set(x, "MSHTML.HTMLDocumentCompatibleInfoCollection_typekey", value.asInstanceOf[js.Any])
  }
}
