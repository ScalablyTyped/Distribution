package typings.activexFaxcomexlib.global.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxOutgoingMessageIterator")
@js.native
class FaxOutgoingMessageIterator protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingMessageIterator {
  /** End of archive marker */
  /* CompleteClass */
  override val AtEOF: Boolean = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  override var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxOutgoingMessageIterator = js.native
  /** Current message */
  /* CompleteClass */
  override val Message: typings.activexFaxcomexlib.FAXCOMEXLib.IFaxOutgoingMessage = js.native
  /** Size of prefetch buffer */
  /* CompleteClass */
  override var PrefetchSize: Double = js.native
  /** Move to the first message */
  /* CompleteClass */
  override def MoveFirst(): Unit = js.native
  /** Move to the next message */
  /* CompleteClass */
  override def MoveNext(): Unit = js.native
}

