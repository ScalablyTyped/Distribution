package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMDragEvent extends StObject {
  
  @JSName("MSHTML.DOMDragEvent_typekey")
  var MSHTMLDotDOMDragEvent_typekey: DOMDragEvent
  
  val altKey: Boolean
  
  val bubbles: Boolean
  
  val button: Double
  
  val buttons: Double
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val clientX: Double
  
  val clientY: Double
  
  val ctrlKey: Boolean
  
  val currentTarget: IEventTarget
  
  val dataTransfer: IHTMLDataTransfer
  
  val defaultPrevented: Boolean
  
  val detail: Double
  
  val eventPhase: Double
  
  val fromElement: IHTMLElement
  
  def getModifierState(keyArg: String): Boolean
  
  def initDragEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: IEventTarget,
    dataTransferArg: IHTMLDataTransfer
  ): Unit
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initMouseEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    ctrlKeyArg: Boolean,
    altKeyArg: Boolean,
    shiftKeyArg: Boolean,
    metaKeyArg: Boolean,
    buttonArg: Double,
    relatedTargetArg: IEventTarget
  ): Unit
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit
  
  val isTrusted: Boolean
  
  val layerX: Double
  
  val layerY: Double
  
  val metaKey: Boolean
  
  val offsetX: Double
  
  val offsetY: Double
  
  val pageX: Double
  
  val pageY: Double
  
  def preventDefault(): Unit
  
  val relatedTarget: IEventTarget
  
  val screenX: Double
  
  val screenY: Double
  
  val shiftKey: Boolean
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val toElement: IHTMLElement
  
  val `type`: String
  
  def view(pvarIndex: js.Any): js.Any
  @JSName("view")
  val view_Original: IHTMLWindow2
  
  val which: Double
  
  val x: Double
  
  val y: Double
}
object DOMDragEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMDragEvent_typekey: DOMDragEvent,
    altKey: Boolean,
    bubbles: Boolean,
    button: Double,
    buttons: Double,
    cancelBubble: Boolean,
    cancelable: Boolean,
    clientX: Double,
    clientY: Double,
    ctrlKey: Boolean,
    currentTarget: IEventTarget,
    dataTransfer: IHTMLDataTransfer,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    fromElement: IHTMLElement,
    getModifierState: String => Boolean,
    initDragEvent: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget, IHTMLDataTransfer) => Unit,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMouseEvent: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget) => Unit,
    initUIEvent: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit,
    isTrusted: Boolean,
    layerX: Double,
    layerY: Double,
    metaKey: Boolean,
    offsetX: Double,
    offsetY: Double,
    pageX: Double,
    pageY: Double,
    preventDefault: () => Unit,
    relatedTarget: IEventTarget,
    screenX: Double,
    screenY: Double,
    shiftKey: Boolean,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    toElement: IHTMLElement,
    `type`: String,
    view: IHTMLWindow2,
    which: Double,
    x: Double,
    y: Double
  ): DOMDragEvent = {
    val __obj = js.Dynamic.literal(altKey = altKey.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], button = button.asInstanceOf[js.Any], buttons = buttons.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], ctrlKey = ctrlKey.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], dataTransfer = dataTransfer.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], fromElement = fromElement.asInstanceOf[js.Any], getModifierState = js.Any.fromFunction1(getModifierState), initDragEvent = js.Any.fromFunction16(initDragEvent), initEvent = js.Any.fromFunction3(initEvent), initMouseEvent = js.Any.fromFunction15(initMouseEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], layerX = layerX.asInstanceOf[js.Any], layerY = layerY.asInstanceOf[js.Any], metaKey = metaKey.asInstanceOf[js.Any], offsetX = offsetX.asInstanceOf[js.Any], offsetY = offsetY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any], shiftKey = shiftKey.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], toElement = toElement.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMDragEvent_typekey")(MSHTMLDotDOMDragEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMDragEvent]
  }
  
  @scala.inline
  implicit class DOMDragEventMutableBuilder[Self <: DOMDragEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButton(value: Double): Self = StObject.set(x, "button", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setButtons(value: Double): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTransfer(value: IHTMLDataTransfer): Self = StObject.set(x, "dataTransfer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromElement(value: IHTMLElement): Self = StObject.set(x, "fromElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetModifierState(value: String => Boolean): Self = StObject.set(x, "getModifierState", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInitDragEvent(
      value: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget, IHTMLDataTransfer) => Unit
    ): Self = StObject.set(x, "initDragEvent", js.Any.fromFunction16(value))
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitMouseEvent(
      value: (String, Boolean, Boolean, IHTMLWindow2, Double, Double, Double, Double, Double, Boolean, Boolean, Boolean, Boolean, Double, IEventTarget) => Unit
    ): Self = StObject.set(x, "initMouseEvent", js.Any.fromFunction15(value))
    
    @scala.inline
    def setInitUIEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerX(value: Double): Self = StObject.set(x, "layerX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLayerY(value: Double): Self = StObject.set(x, "layerY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMDragEvent_typekey(value: DOMDragEvent): Self = StObject.set(x, "MSHTML.DOMDragEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelatedTarget(value: IEventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSrcElement(value: IHTMLElement): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTarget(value: IEventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToElement(value: IHTMLElement): Self = StObject.set(x, "toElement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IHTMLWindow2): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhich(value: Double): Self = StObject.set(x, "which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
  }
}
