package typings.activexMshtml.global.MSHTML

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MSHTML.DOMMutationEvent")
@js.native
class DOMMutationEvent protected ()
  extends typings.activexMshtml.MSHTML.DOMMutationEvent {
  /* CompleteClass */
  @JSName("MSHTML.DOMMutationEvent_typekey")
  override var MSHTMLDotDOMMutationEvent_typekey: typings.activexMshtml.MSHTML.DOMMutationEvent = js.native
  /* CompleteClass */
  override val attrChange: Double = js.native
  /* CompleteClass */
  override val attrName: String = js.native
  /* CompleteClass */
  override val bubbles: Boolean = js.native
  /* CompleteClass */
  override var cancelBubble: Boolean = js.native
  /* CompleteClass */
  override val cancelable: Boolean = js.native
  /* CompleteClass */
  override val currentTarget: typings.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val defaultPrevented: Boolean = js.native
  /* CompleteClass */
  override val eventPhase: Double = js.native
  /* CompleteClass */
  override val isTrusted: Boolean = js.native
  /* CompleteClass */
  override val newValue: String = js.native
  /* CompleteClass */
  override val prevValue: String = js.native
  /* CompleteClass */
  override val relatedNode: js.Any = js.native
  /* CompleteClass */
  override val srcElement: typings.activexMshtml.MSHTML.IHTMLElement = js.native
  /* CompleteClass */
  override val target: typings.activexMshtml.MSHTML.IEventTarget = js.native
  /* CompleteClass */
  override val timeStamp: Double = js.native
  /* CompleteClass */
  override val `type`: String = js.native
  /* CompleteClass */
  override def initEvent(eventType: String, canBubble: Boolean, cancelable: Boolean): Unit = js.native
  /* CompleteClass */
  override def initMutationEvent(
    eventType: String,
    canBubble: Boolean,
    cancelable: Boolean,
    relatedNodeArg: js.Any,
    prevValueArg: String,
    newValueArg: String,
    attrNameArg: String,
    attrChangeArg: Double
  ): Unit = js.native
  /* CompleteClass */
  override def preventDefault(): Unit = js.native
  /* CompleteClass */
  override def stopImmediatePropagation(): Unit = js.native
  /* CompleteClass */
  override def stopPropagation(): Unit = js.native
}

