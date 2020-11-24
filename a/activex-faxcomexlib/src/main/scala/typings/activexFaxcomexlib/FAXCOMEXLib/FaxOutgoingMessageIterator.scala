package typings.activexFaxcomexlib.FAXCOMEXLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxOutgoingMessageIterator Class */
@js.native
trait FaxOutgoingMessageIterator extends js.Object {
  
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  
  @JSName("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxOutgoingMessageIterator_typekey: FaxOutgoingMessageIterator = js.native
  
  /** Current message */
  val Message: IFaxOutgoingMessage = js.native
  
  /** Move to the first message */
  def MoveFirst(): Unit = js.native
  
  /** Move to the next message */
  def MoveNext(): Unit = js.native
  
  /** Size of prefetch buffer */
  var PrefetchSize: Double = js.native
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
  
  @scala.inline
  implicit class FaxOutgoingMessageIteratorOps[Self <: FaxOutgoingMessageIterator] (val x: Self) extends AnyVal {
    
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
    def setFAXCOMEXLibDotFaxOutgoingMessageIterator_typekey(value: FaxOutgoingMessageIterator): Self = this.set("FAXCOMEXLib.FaxOutgoingMessageIterator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: IFaxOutgoingMessage): Self = this.set("Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = this.set("MoveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Unit): Self = this.set("MoveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefetchSize(value: Double): Self = this.set("PrefetchSize", value.asInstanceOf[js.Any])
  }
}
