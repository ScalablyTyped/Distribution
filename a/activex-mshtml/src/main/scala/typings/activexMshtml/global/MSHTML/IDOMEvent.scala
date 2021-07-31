package typings.activexMshtml.global.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("MSHTML.IDOMEvent")
@js.native
class IDOMEvent protected ()
  extends StObject
     with typings.activexMshtml.MSHTML.IDOMEvent {
  
  /* CompleteClass */
  @JSName("MSHTML.IDOMEvent_typekey")
  var MSHTMLDotIDOMEvent_typekey: typings.activexMshtml.MSHTML.IDOMEvent = js.native
  
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  
  /* CompleteClass */
  var cancelBubble: Boolean = js.native
  
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  
  /* CompleteClass */
  override val currentTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  
  /* CompleteClass */
  override val eventPhase: Double = js.native
  
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  
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
}
