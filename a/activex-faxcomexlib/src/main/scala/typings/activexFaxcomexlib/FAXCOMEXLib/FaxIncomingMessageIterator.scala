package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
trait FaxIncomingMessageIterator extends js.Object {
  /** End of archive marker */
  val AtEOF: Boolean
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator
  /** The current message */
  val Message: IFaxIncomingMessage
  /** Size of the prefetch buffer */
  var PrefetchSize: Double
  /** Move to the first message in the archive */
  def MoveFirst(): Unit
  /** Move to the next message in the archive */
  def MoveNext(): Unit
}

object FaxIncomingMessageIterator {
  @scala.inline
  def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator,
    Message: IFaxIncomingMessage,
    MoveFirst: () => Unit,
    MoveNext: () => Unit,
    PrefetchSize: Double
  ): FaxIncomingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = js.Any.fromFunction0(MoveFirst), MoveNext = js.Any.fromFunction0(MoveNext), PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")(FAXCOMEXLibDotFaxIncomingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxIncomingMessageIterator]
  }
}

