package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SVGZoomEvent extends StObject {
  
  @JSName("MSHTML.SVGZoomEvent_typekey")
  var MSHTMLDotSVGZoomEvent_typekey: SVGZoomEvent
  
  val bubbles: Boolean
  
  var cancelBubble: Boolean
  
  val cancelable: Boolean
  
  val currentTarget: IEventTarget
  
  val defaultPrevented: Boolean
  
  val detail: Double
  
  val eventPhase: Double
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit
  
  def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit
  
  val isTrusted: Boolean
  
  val newScale: Double
  
  val newTranslate: SVGPoint
  
  def preventDefault(): Unit
  
  val previousScale: Double
  
  val previousTranslate: SVGPoint
  
  val srcElement: IHTMLElement
  
  def stopImmediatePropagation(): Unit
  
  def stopPropagation(): Unit
  
  val target: IEventTarget
  
  val timeStamp: Double
  
  val `type`: String
  
  def view(pvarIndex: js.Any): js.Any
  @JSName("view")
  val view_Original: IHTMLWindow2
  
  val zoomRectScreen: SVGRect
}
object SVGZoomEvent {
  
  @scala.inline
  def apply(
    MSHTMLDotSVGZoomEvent_typekey: SVGZoomEvent,
    bubbles: Boolean,
    cancelBubble: Boolean,
    cancelable: Boolean,
    currentTarget: IEventTarget,
    defaultPrevented: Boolean,
    detail: Double,
    eventPhase: Double,
    initEvent: (String, Boolean, Boolean) => Unit,
    initUIEvent: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit,
    isTrusted: Boolean,
    newScale: Double,
    newTranslate: SVGPoint,
    preventDefault: () => Unit,
    previousScale: Double,
    previousTranslate: SVGPoint,
    srcElement: IHTMLElement,
    stopImmediatePropagation: () => Unit,
    stopPropagation: () => Unit,
    target: IEventTarget,
    timeStamp: Double,
    `type`: String,
    view: IHTMLWindow2,
    zoomRectScreen: SVGRect
  ): SVGZoomEvent = {
    val __obj = js.Dynamic.literal(bubbles = bubbles.asInstanceOf[js.Any], cancelBubble = cancelBubble.asInstanceOf[js.Any], cancelable = cancelable.asInstanceOf[js.Any], currentTarget = currentTarget.asInstanceOf[js.Any], defaultPrevented = defaultPrevented.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], eventPhase = eventPhase.asInstanceOf[js.Any], initEvent = js.Any.fromFunction3(initEvent), initUIEvent = js.Any.fromFunction5(initUIEvent), isTrusted = isTrusted.asInstanceOf[js.Any], newScale = newScale.asInstanceOf[js.Any], newTranslate = newTranslate.asInstanceOf[js.Any], preventDefault = js.Any.fromFunction0(preventDefault), previousScale = previousScale.asInstanceOf[js.Any], previousTranslate = previousTranslate.asInstanceOf[js.Any], srcElement = srcElement.asInstanceOf[js.Any], stopImmediatePropagation = js.Any.fromFunction0(stopImmediatePropagation), stopPropagation = js.Any.fromFunction0(stopPropagation), target = target.asInstanceOf[js.Any], timeStamp = timeStamp.asInstanceOf[js.Any], view = view.asInstanceOf[js.Any], zoomRectScreen = zoomRectScreen.asInstanceOf[js.Any])
    __obj.updateDynamic("MSHTML.SVGZoomEvent_typekey")(MSHTMLDotSVGZoomEvent_typekey.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SVGZoomEvent]
  }
  
  @scala.inline
  implicit class SVGZoomEventMutableBuilder[Self <: SVGZoomEvent] (val x: Self) extends AnyVal {
    
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
    def setInitUIEvent(value: (String, Boolean, Boolean, IHTMLWindow2, Double) => Unit): Self = StObject.set(x, "initUIEvent", js.Any.fromFunction5(value))
    
    @scala.inline
    def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMSHTMLDotSVGZoomEvent_typekey(value: SVGZoomEvent): Self = StObject.set(x, "MSHTML.SVGZoomEvent_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewScale(value: Double): Self = StObject.set(x, "newScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNewTranslate(value: SVGPoint): Self = StObject.set(x, "newTranslate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPreviousScale(value: Double): Self = StObject.set(x, "previousScale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousTranslate(value: SVGPoint): Self = StObject.set(x, "previousTranslate", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setZoomRectScreen(value: SVGRect): Self = StObject.set(x, "zoomRectScreen", value.asInstanceOf[js.Any])
  }
}
