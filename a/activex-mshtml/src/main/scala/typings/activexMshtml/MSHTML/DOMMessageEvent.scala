package typings.activexMshtml.MSHTML

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DOMMessageEvent extends StObject {
  
  @JSName("MSHTML.DOMMessageEvent_typekey")
  var MSHTMLDotDOMMessageEvent_typekey: DOMMessageEvent = js.native
  
  val bubbles: Boolean = js.native
  
  var cancelBubble: Boolean = js.native
  
  val cancelable: Boolean = js.native
  
  val currentTarget: IEventTarget = js.native
  
  val data: String = js.native
  
  val defaultPrevented: Boolean = js.native
  
  val eventPhase: Double = js.native
  
  def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  
  def initMessageEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    data: String,
    origin: String,
    lastEventId: String,
    source: IHTMLWindow2
  ): Unit = js.native
  
  val isTrusted: Boolean = js.native
  
  val origin: String = js.native
  
  def preventDefault(): Unit = js.native
  
  def source(pvarIndex: js.Any): js.Any = js.native
  @JSName("source")
  val source_Original: IHTMLWindow2 = js.native
  
  val srcElement: IHTMLElement = js.native
  
  def stopImmediatePropagation(): Unit = js.native
  
  def stopPropagation(): Unit = js.native
  
  val target: IEventTarget = js.native
  
  val timeStamp: Double = js.native
  
  val `type`: String = js.native
}
