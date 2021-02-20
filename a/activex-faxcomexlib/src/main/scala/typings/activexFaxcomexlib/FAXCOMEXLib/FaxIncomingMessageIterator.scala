package typings.activexFaxcomexlib.FAXCOMEXLib

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** FaxIncomingMessageIterator Class */
@js.native
trait FaxIncomingMessageIterator extends StObject {
  
  /** End of archive marker */
  val AtEOF: Boolean = js.native
  
  @JSName("FAXCOMEXLib.FaxIncomingMessageIterator_typekey")
  var FAXCOMEXLibDotFaxIncomingMessageIterator_typekey: FaxIncomingMessageIterator = js.native
  
  /** The current message */
  val Message: IFaxIncomingMessage = js.native
  
  /** Move to the first message in the archive */
  def MoveFirst(): Unit = js.native
  
  /** Move to the next message in the archive */
  def MoveNext(): Unit = js.native
  
  /** Size of the prefetch buffer */
  var PrefetchSize: Double = js.native
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
  implicit class FaxIncomingMessageIteratorMutableBuilder[Self <: FaxIncomingMessageIterator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAtEOF(value: Boolean): Self = StObject.set(x, "AtEOF", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFAXCOMEXLibDotFaxIncomingMessageIterator_typekey(value: FaxIncomingMessageIterator): Self = StObject.set(x, "FAXCOMEXLib.FaxIncomingMessageIterator_typekey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: IFaxIncomingMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMoveFirst(value: () => Unit): Self = StObject.set(x, "MoveFirst", js.Any.fromFunction0(value))
    
    @scala.inline
    def setMoveNext(value: () => Unit): Self = StObject.set(x, "MoveNext", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPrefetchSize(value: Double): Self = StObject.set(x, "PrefetchSize", value.asInstanceOf[js.Any])
  }
}
