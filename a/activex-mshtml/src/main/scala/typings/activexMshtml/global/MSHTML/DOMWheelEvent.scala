package typings.activexMshtml.global.MSHTML

import typings.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMWheelEvent")
@js.native
/* private */ class DOMWheelEvent ()
  extends StObject
     with typings.activexMshtml.MSHTML.DOMWheelEvent {
  
  /* private */ /* CompleteClass */
  @JSName("MSHTML.DOMWheelEvent_typekey")
  var MSHTMLDotDOMWheelEvent_typekey: typings.activexMshtml.MSHTML.DOMWheelEvent = js.native
  
  /* CompleteClass */
  override val altKey: Boolean = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  override val button: Double = js.native
  
  /* CompleteClass */
  override val buttons: Double = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val clientX: Double = js.native
  
  /* CompleteClass */
  override val clientY: Double = js.native
  
  /* CompleteClass */
  override val ctrlKey: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val deltaMode: Double = js.native
  
  /* CompleteClass */
  override val deltaX: Double = js.native
  
  /* CompleteClass */
  override val deltaY: Double = js.native
  
  /* CompleteClass */
  override val deltaZ: Double = js.native
  
  /* CompleteClass */
  override val detail: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override val fromElement: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def getModifierState(keyArg: String): Boolean = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initMouseEvent(
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
    relatedTargetArg: typings.activexMshtml.MSHTML.IEventTarget
  ): Unit = js.native
  
  /* CompleteClass */
  override def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  /* CompleteClass */
  override def initWheelEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    detailArg: Double,
    screenXArg: Double,
    screenYArg: Double,
    clientXArg: Double,
    clientYArg: Double,
    buttonArg: Double,
    relatedTargetArg: typings.activexMshtml.MSHTML.IEventTarget,
    modifiersListArg: String,
    deltaX: Double,
    deltaY: Double,
    deltaZ: Double,
    deltaMode: Double
  ): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val layerX: Double = js.native
  
  /* CompleteClass */
  override val layerY: Double = js.native
  
  /* CompleteClass */
  override val metaKey: Boolean = js.native
  
  /* CompleteClass */
  override val offsetX: Double = js.native
  
  /* CompleteClass */
  override val offsetY: Double = js.native
  
  /* CompleteClass */
  override val pageX: Double = js.native
  
  /* CompleteClass */
  override val pageY: Double = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
  /* CompleteClass */
  override val relatedTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val screenX: Double = js.native
  
  /* CompleteClass */
  override val screenY: Double = js.native
  
  /* CompleteClass */
  override val shiftKey: Boolean = js.native
  
  /* CompleteClass */
  override val srcElement: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
  
  /* CompleteClass */
  override val target: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val timeStamp: Double = js.native
  
  /* CompleteClass */
  override val toElement: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  
  /* CompleteClass */
  override val `type`: String = js.native
  
  /* CompleteClass */
  override def view(pvarIndex: js.Any): js.Any = js.native
  /* CompleteClass */
  @JSName("view")
  override val view_Original: IHTMLWindow2 = js.native
  
  /* CompleteClass */
  override val which: Double = js.native
  
  /* CompleteClass */
  override val x: Double = js.native
  
  /* CompleteClass */
  override val y: Double = js.native
}
