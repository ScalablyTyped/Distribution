package typings.activexMshtml.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHTMLEventObj extends js.Object {
  
  @JSName("MSHTML.IHTMLEventObj_typekey")
  var MSHTMLDotIHTMLEventObj_typekey: IHTMLEventObj = js.native
  
  val altKey: Boolean = js.native
  
  val button: Double = js.native
  
  var cancelBubble: Boolean = js.native
  
  val clientX: Double = js.native
  
  val clientY: Double = js.native
  
  val ctrlKey: Boolean = js.native
  
  val fromElement: IHTMLElement = js.native
  
  var keyCode: Double = js.native
  
  val offsetX: Double = js.native
  
  val offsetY: Double = js.native
  
  val qualifier: String = js.native
  
  val reason: Double = js.native
  
  var returnValue: js.Any = js.native
  
  val screenX: Double = js.native
  
  val screenY: Double = js.native
  
  val shiftKey: Boolean = js.native
  
  val srcElement: IHTMLElement = js.native
  
  val srcFilter: js.Any = js.native
  
  val toElement: IHTMLElement = js.native
  
  val `type`: String = js.native
  
  val x: Double = js.native
  
  val y: Double = js.native
}
object IHTMLEventObj {
  
  @scala.inline
  def apply(
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
    returnValue: js.Any,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    srcFilter: js.Any,
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
  
  @scala.inline
  implicit class IHTMLEventObjOps[Self <: IHTMLEventObj] (val x: Self) extends AnyVal {
    
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
    def setMSHTMLDotIHTMLEventObj_typekey(value: IHTMLEventObj): Self = this.set("MSHTML.IHTMLEventObj_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAltKey(value: Boolean): Self = this.set("altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = this.set("button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = this.set("cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = this.set("clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = this.set("clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = this.set("ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromElement(value: IHTMLElement): Self = this.set("fromElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyCode(value: Double): Self = this.set("keyCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = this.set("offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = this.set("offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQualifier(value: String): Self = this.set("qualifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Double): Self = this.set("reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReturnValue(value: js.Any): Self = this.set("returnValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenX(value: Double): Self = this.set("screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = this.set("screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = this.set("shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = this.set("srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcFilter(value: js.Any): Self = this.set("srcFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToElement(value: IHTMLElement): Self = this.set("toElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
}
