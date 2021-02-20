package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ThreadDialogProcParam extends StObject {
  
  @JSName("MSHTML.ThreadDialogProcParam_typekey")
  var MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam = js.native
  
  val document: js.Any = js.native
  
  val moniker: js.Any = js.native
  
  val optionString: js.Any = js.native
  
  val parameters: js.Any = js.native
}
object ThreadDialogProcParam {
  
  @scala.inline
  def apply(
    MSHTMLDotThreadDialogProcParam_typekey: ThreadDialogProcParam,
    document: js.Any,
    moniker: js.Any,
    optionString: js.Any,
    parameters: js.Any
  ): ThreadDialogProcParam = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], moniker = moniker.asInstanceOf[js.Any], optionString = optionString.asInstanceOf[js.Any], parameters = parameters.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.ThreadDialogProcParam_typekey")(MSHTMLDotThreadDialogProcParam_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThreadDialogProcParam]
  }
  
  @scala.inline
  implicit class ThreadDialogProcParamMutableBuilder[Self <: ThreadDialogProcParam] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDocument(value: js.Any): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotThreadDialogProcParam_typekey(value: ThreadDialogProcParam): Self = StObject.set(x, "MSHTML.ThreadDialogProcParam_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoniker(value: js.Any): Self = StObject.set(x, "moniker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOptionString(value: js.Any): Self = StObject.set(x, "optionString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParameters(value: js.Any): Self = StObject.set(x, "parameters", value.asInstanceOf[js.Any])
  }
}
