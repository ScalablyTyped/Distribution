package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThreadDialogProcParam extends StObject {
  
  /* private */ @JSName("MSHTML.ThreadDialogProcParam_typekey")
  var MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam
  
  val document: Any
  
  val moniker: Any
  
  val optionString: Any
  
  val parameters: Any
}
object ThreadDialogProcParam {
  
  inline def apply(
    MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam,
    document: Any,
    moniker: Any,
    optionString: Any,
    parameters: Any
  ): ThreadDialogProcParam = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], optionString = optionString.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ThreadDialogProcParam_typekey")(MSHTMLDotThreadDialogProcParam_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDialogProcParam]
  }
  
  extension [Self <: ThreadDialogProcParam](x: Self) {
    
    inline def setDocument(value: Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotThreadDialogProcParam_typekey(value: ThreadDialogProcParam): Self = StObject.set(x, "MSHTML.ThreadDialogProcParam_typekey", value.asInstanceOf[js.Any])
    
    inline def setMoniker(value: Any): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
    
    inline def setOptionString(value: Any): Self = StObject.set(x, "optionString", value.asInstanceOf[js.Any])
    
    inline def setParameters(value: Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
