package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** FaxIncomingMessageIterator Class */
@js.native
trait FaxIncomingMessageIterator extends js.Object {
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
  @scala.inline
  implicit class FaxIncomingMessageIteratorOps[Self <: FaxIncomingMessageIterator] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAtEOF(value: Boolean): Self = this.set("AtEOF", value.asInstanceOf[js.Any])
    @scala.inline
    def setFAXCOMEXLibDotFaxIncomingMessageIterator_typekey(value: FaxIncomingMessageIterator): Self = this.set("FAXCOMEXLib.FaxIncomingMessageIterator_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setMessage(value: IFaxIncomingMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = this.set("MoveFirst", js.Any.fromFunction0(value))
    @scala.inline
    def setMoveNext(value: () => Unit): Self = this.set("MoveNext", js.Any.fromFunction0(value))
    @scala.inline
    def setPrefetchSize(value: Double): Self = this.set("PrefetchSize", value.asInstanceOf[js.Any])
  }
  
}

