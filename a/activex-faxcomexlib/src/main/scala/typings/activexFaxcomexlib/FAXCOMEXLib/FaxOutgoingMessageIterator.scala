package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxOutgoingMessageIterator Class */
trait FaxOutgoingMessageIterator extends js.Object {
  /** End of archive marker */
  val AtEOF: Boolean
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator
  /** Current message */
  val Message: IFaxOutgoingMessage
  /** Size of prefetch buffer */
  var PrefetchSize: Double
  /** Move to the first message */
  def MoveFirst(): Unit
  /** Move to the next message */
  def MoveNext(): Unit
}

object FaxOutgoingMessageIterator {
  @scala.inline
  def apply(
    AtEOF: Boolean,
    FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator,
    Message: IFaxOutgoingMessage,
    MoveFirst: () => Unit,
    MoveNext: () => Unit,
    PrefetchSize: Double
  ): FaxOutgoingMessageIterator = {
    val __obj = js.Dynamic.literal(AtEOF = AtEOF.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], MoveFirst = js.Any.fromFunction0(MoveFirst), MoveNext = js.Any.fromFunction0(MoveNext), PrefetchSize = PrefetchSize.asInstanceOf[js.Any])
    __obj.updateDynamic("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")(FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[FaxOutgoingMessageIterator]
  }
}

