package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DOMMSAnimationEvent extends StObject {
  
  @JSName("MSHTML.DOMMSAnimationEvent_typekey")
  var MSHTMLDotDOMMSAnimationEvent_typekey: DOMMSAnimationEvent
  
  val animationName: String
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val elapsedTime: Double
  
  val eventPhase: Double
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initMSAnimationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    animationName: String,
    elapsedTime: Double
  ): Unit
  
  val isTrusted: Boolean
  
  def preventDefault(): Unit
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
}
object DOMMSAnimationEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotDOMMSAnimationEvent_typekey: DOMMSAnimationEvent,
    animationName: String,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    elapsedTime: Double,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initMSAnimationEvent: (String, Boolean, Boolean, String, Double) => Unit,
    isTrusted: Boolean,
    preventDefault: () => Unit,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String
  ): DOMMSAnimationEvent = {
    val __obj = js.Dynamic.literal(animationName = animationName.asInstanceOf[js.Any], bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], elapsedTime = elapsedTime.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initMSAnimationEvent = js.Any.fromFunction5(initMSAnimationEvent), isTrusted = isTrusted.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.DOMMSAnimationEvent_typekey")(MSHTMLDotDOMMSAnimationEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DOMMSAnimationEvent]
  }
  
  @scala.inline
  implicit class DOMMSAnimationEventMutableBuilder[Self <: DOMMSAnimationEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationName(value: String): Self = StObject.set(x, "animationName", value.asInstanceOf[js.Any])
    
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
    def setElapsedTime(value: Double): Self = StObject.set(x, "elapsedTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitEvent(value: (String, Boolean, Boolean) => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction3(value))
    
    @scala.inline
    def setInitMSAnimationEvent(value: (String, Boolean, Boolean, String, Double) => Unit): Self = StObject.set(x, "initMSAnimationEvent", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotDOMMSAnimationEvent_typekey(value: DOMMSAnimationEvent): Self = StObject.set(x, "MSHTML.DOMMSAnimationEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
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
