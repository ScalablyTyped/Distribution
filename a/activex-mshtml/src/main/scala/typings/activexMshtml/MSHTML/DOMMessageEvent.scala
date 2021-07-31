package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMMessageEvent extends StObject {
  
  @JSName("MSHTML.DOMMessageEvent_typekey")
  var MSHTMLDotDOMMessageEvent_typekey: DOMMessageEvent
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val currentTarget: IEventTarget
  
  val data: String
  
  val defaultPrevented: Boolean
  
  val eventPhase: Double
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initMessageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    data: String,
    origin: String,
    lastEventId: String,
    source: IHTMLWindow2
  ): Unit
  
  val isTrusted: Boolean
  
  val origin: String
  
  def preventDefault(): Unit
  
  def source(pvarIndex: js.Any): js.Any
  @JSName("source")
  val source_Original: IHTMLWindow2
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
}
object DOMMessageEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMMessageEvent_typekey: DOMMessageEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    data: String,
    defaultPrevented: Boolean,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMessageEvent: (String, Boolean, Boolean, String, String, String, IHTMLWindow2) => Unit,
    isTrusted: Boolean,
    origin: String,
    preventDefault: () => Unit,
    source: IHTMLWindow2,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMessageEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMessageEvent = js.Any.fromFunction7(initMessageEvent), isTrusted = isTrusted.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), source = source.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMessageEvent_typekey")(MSHTMLDotDOMMessageEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMessageEvent]
  }
  
  @scala.inline
  implicit class DOMMessageEventMutableBuilder[Self <: DOMMessageEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTarget(value: IEventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitMessageEvent(value: (String, Boolean, Boolean, String, String, String, IHTMLWindow2) => Unit): Self = StObject.set(x, "initMessageEvent", js.Any.fromFunction7(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMMessageEvent_typekey(value: DOMMessageEvent): Self = StObject.set(x, "MSHTML.DOMMessageEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSource(value: IHTMLWindow2): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
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
  }
}
