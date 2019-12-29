package typings.activexDashFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
@JSGlobal("FAXCOMEXLib.FaxIncomingMessageIterator")
@js.native
class FaxIncomingMessageIterator protected () extends js.Object {
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator = js.native
  /** The current message */
  val Message: IFaxIncomingMessage = js.native
  /** Size of the prefetch buffer */
  var PrefetchSize: Double = js.native
  /** Move to the first message in the archive */
  def MoveFirst(): Unit = js.native
  /** Move to the next message in the archive */
  def MoveNext(): Unit = js.native
}

