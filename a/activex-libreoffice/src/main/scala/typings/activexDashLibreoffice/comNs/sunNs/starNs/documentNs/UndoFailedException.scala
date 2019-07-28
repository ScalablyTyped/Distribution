package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.Exception
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * thrown when reverting to re-applying an undoable action fails.
  * @see XUndoAction.undo
  * @see XUndoManager.undo
  * @since OOo 3.4
  */
trait UndoFailedException extends Exception {
  /** describes the reason why the operation failed. Usually, this member will carry an exception. */
  var Reason: js.Any
}

object UndoFailedException {
  @scala.inline
  def apply(Context: XInterface, Message: String, Reason: js.Any): UndoFailedException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Reason = Reason)
  
    __obj.asInstanceOf[UndoFailedException]
  }
}

