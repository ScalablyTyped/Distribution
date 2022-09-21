package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IHTMLEventObj extends StObject {
  
  /* private */ @JSName("MSHTML.IHTMLEventObj_typekey")
  var MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj
  
  val altKey: Boolean
  
  val button: Double
  
  var cancelBubble: Boolean
  
  val clientX: Double
  
  val clientY: Double
  
  val ctrlKey: Boolean
  
  val fromElement: IHTMLElement
  
  var keyCode: Double
  
  val offsetX: Double
  
  val offsetY: Double
  
  val qualifier: String
  
  val reason: Double
  
  var returnValue: Any
  
  val screenX: Double
  
  val screenY: Double
  
  val shiftKey: Boolean
  
  val srcElement: IHTMLElement
  
  val srcFilter: Any
  
  val toElement: IHTMLElement
  
  val `type`: String
  
  val x: Double
  
  val y: Double
}
object IHTMLEventObj {
  
  inline def apply(
    MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj,
    altKey: Boolean,
    button: Double,
    cancelBubble: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    fromElement: IHTMLElement,
    keyCode: Double,
    offsetX: Double,
    offsetY: Double,
    qualifier: String,
    reason: Double,
    returnValue: Any,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    srcFilter: Any,
    toElement: IHTMLElement,
    `type`: String,
    x: Double,
    y: Double
  ): IHTMLEventObj = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], keyCode = keyCode.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], qualifier = qualifier.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], returnValue = returnValue.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], srcFilter = srcFilter.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.IHTMLEventObj_typekey")(MSHTMLDotIHTMLEventObj_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHTMLEventObj]
  }
  
  extension [Self <: IHTMLEventObj](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    inline def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setFromElement(value: IHTMLElement): Self = StObject.set(x, "fromElement", value.asInstanceOf[js.Any])
    
    inline def setKeyCode(value: Double): Self = StObject.set(x, "keyCode", value.asInstanceOf[js.Any])
    
    inline def setMSHTMLDotIHTMLEventObj_typekey(value: IHTMLEventObj): Self = StObject.set(x, "MSHTML.IHTMLEventObj_typekey", value.asInstanceOf[js.Any])
    
    inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    inline def setQualifier(value: String): Self = StObject.set(x, "qualifier", value.asInstanceOf[js.Any])
    
    inline def setReason(value: Double): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReturnValue(value: Any): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
    
    inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    inline def setSrcFilter(value: Any): Self = StObject.set(x, "srcFilter", value.asInstanceOf[js.Any])
    
    inline def setToElement(value: IHTMLElement): Self = StObject.set(x, "toElement", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
