package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HTMLDialog extends StObject {
  
  /* private */ @JSName("MSHTML.HTMLDialog_typekey")
  var MSHTMLDotHTMLDialog_typekey: HTMLDialog
  
  def close(): Unit
  
  val dialogArguments: js.Any
  
  var dialogHeight: js.Any
  
  var dialogLeft: js.Any
  
  var dialogTop: js.Any
  
  var dialogWidth: js.Any
  
  val menuArguments: js.Any
  
  var returnValue: js.Any
}
object HTMLDialog {
  
  inline def apply(
    MSHTMLDotHTMLDialog_typekey: HTMLDialog,
    close: () => Unit,
    dialogArguments: js.Any,
    dialogHeight: js.Any,
    dialogLeft: js.Any,
    dialogTop: js.Any,
    dialogWidth: js.Any,
    menuArguments: js.Any,
    returnValue: js.Any
  ): HTMLDialog = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), dialogArguments = dialogArguments.asInstanceOf[js.Any], dialogHeight = dialogHeight.asInstanceOf[js.Any], dialogLeft = dialogLeft.asInstanceOf[js.Any], dialogTop = dialogTop.asInstanceOf[js.Any], dialogWidth = dialogWidth.asInstanceOf[js.Any], menuArguments = menuArguments.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.HTMLDialog_typekey")(MSHTMLDotHTMLDialog_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[HTMLDialog]
  }
  
  extension [Self <: HTMLDialog](x: Self) {
    
    inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
    
    inline def setDialogArguments(value: js.Any): Self = StObject.set(x, "dialogArguments", value.asInstanceOf[js.Any])
    
    inline def setDialogHeight(value: js.Any): Self = StObject.set(x, "dialogHeight", value.asInstanceOf[js.Any])
    
    inline def setDialogLeft(value: js.Any): Self = StObject.set(x, "dialogLeft", value.asInstanceOf[js.Any])
    
    inline def setDialogTop(value: js.Any): Self = StObject.set(x, "dialogTop", value.asInstanceOf[js.Any])
    
    inline def setDialogWidth(value: js.Any): Self = StObject.set(x, "dialogWidth", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotHTMLDialog_typekey(value: HTMLDialog): Self = StObject.set(x, "MSHTML.HTMLDialog_typekey", value.asInstanceOf[js.Any])
    
    inline def setMenuArguments(value: js.Any): Self = StObject.set(x, "menuArguments", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: js.Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
  }
}
