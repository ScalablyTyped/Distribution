package typings.activexFaxcomexlib.global.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessageIterator")
@js.native
class FaxIncomingMessageIterator protected ()
  extends typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessageIterator {
  /** End of archive marker */
  /* CompleteClass */
  override val AtEOF: Boolean = js.native
  /* CompleteClass */
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  override var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: typings.activexFaxcomexlib.FAXCOMEXLib.FaxIncomingMessageIterator = js.native
  /** The current message */
  /* CompleteClass */
  override val Message: typings.activexFaxcomexlib.FAXCOMEXLib.IFaxIncomingMessage = js.native
  /** Size of the prefetch buffer */
  /* CompleteClass */
  override var PrefetchSize: Double = js.native
  /** Move to the first message in the archive */
  /* CompleteClass */
  override def MoveFirst(): Unit = js.native
  /** Move to the next message in the archive */
  /* CompleteClass */
  override def MoveNext(): Unit = js.native
}

