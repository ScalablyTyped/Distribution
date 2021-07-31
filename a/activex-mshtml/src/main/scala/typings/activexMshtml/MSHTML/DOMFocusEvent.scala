package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMFocusEvent extends StObject {
  
  @JSName("MSHTML.DOMFocusEvent_typekey")
  var MSHTMLDotDOMFocusEvent_typekey: DOMFocusEvent
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val detail: Double
  
  val eventPhase: Double
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initFocusEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    view: IHTMLWindow2,
    detail: Double,
    relatedTargetArg: IEventTarget
  ): Unit
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit
  
  val isTrusted: Boolean
  
  def preventDefault(): Unit
  
  val relatedTarget: IEventTarget
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
  
  def view(pvarIndex: js.Any): js.Any
  @JSName("view")
  val view_Original: IHTMLWindow2
}
object DOMFocusEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMFocusEvent_typekey: DOMFocusEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initFocusEvent: (String, Boolean, Boolean, IHTMLWindow2, Double, IEventTarget) => Unit,
    initUIEvent: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    relatedTarget: IEventTarget,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String,
    view: IHTMLWindow2
  ): DOMFocusEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initFocusEvent = js.Any.fromFunction6(initFocusEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), relatedTarget = relatedTarget.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMFocusEvent_typekey")(MSHTMLDotDOMFocusEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMFocusEvent]
  }
  
  @scala.inline
  implicit class DOMFocusEventMutableBuilder[Self <: DOMFocusEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: Double): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitFocusEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double, IEventTarget) => Unit): Self = StObject.set(x, "initFocusEvent", js.Any.fromFunction6(value))
    
    @scala.inline
    def setInitUIEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMFocusEvent_typekey(value: DOMFocusEvent): Self = StObject.set(x, "MSHTML.DOMFocusEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRelatedTarget(value: IEventTarget): Self = StObject.set(x, "relatedTarget", value.asInstanceOf[js.Any])
    
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
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setView(value: IHTMLWindow2): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
  }
}
