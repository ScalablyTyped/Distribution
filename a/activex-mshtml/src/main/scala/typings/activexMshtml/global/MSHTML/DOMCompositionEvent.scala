package typings.activexMshtml.global.MSHTML

import typings.activexMshtml.MSHTML.IHTMLWindow2
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.DOMCompositionEvent")
@js.native
class DOMCompositionEvent protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.DOMCompositionEvent {
  
  /* CompleteClass */
  @JSName("MSHTML.DOMCompositionEvent_typekey")
  var MSHTMLDotDOMCompositionEvent_typekey: typings.activexMshtml.MSHTML.DOMCompositionEvent = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val data: String = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val detail: Double = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initCompositionEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    viewArg: IHTMLWindow2,
    data: String,
    locale: String
  ): Unit = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override def initUIEvent(eventType: String, canBubble: Boolean, cancelable: Boolean, view: IHTMLWindow2, detail: Double): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
  /* CompleteClass */
  override val locale: String = js.native
  
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  
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
  override val `type`: String = js.native
  
  /* CompleteClass */
  override def view(pvarIndex: js.Any): js.Any = js.native
  /* CompleteClass */
  @JSName("view")
  override val view_Original: IHTMLWindow2 = js.native
}
