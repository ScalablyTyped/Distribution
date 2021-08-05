package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLDocumentCompatibleInfo extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLDocumentCompatibleInfo_typekey")
  var MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo
  
  val constructor: js.Any
}
object HTMLDocumentCompatibleInfo {
  
  inline def apply(MSHTMLDotHTMLDocumentCompatibleInfo_typekey: HTMLDocumentCompatibleInfo, constructor: js.Any): HTMLDocumentCompatibleInfo = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDocumentCompatibleInfo_typekey")(MSHTMLDotHTMLDocumentCompatibleInfo_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDocumentCompatibleInfo]
  }
  
  extension [Self <: HTMLDocumentCompatibleInfo](x: Self) {
    
    inline def setConstructor(value: js.Any): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLDocumentCompatibleInfo_typekey(value: HTMLDocumentCompatibleInfo): Self = StObject.set(x, "MSHTML.HTMLDocumentCompatibleInfo_typekey", value.asInstanceOf[js.Any])
  }
}
