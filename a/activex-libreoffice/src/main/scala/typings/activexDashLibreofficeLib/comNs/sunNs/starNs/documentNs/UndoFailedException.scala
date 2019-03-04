package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * thrown when reverting to re-applying an undoable action fails.
  * @see XUndoAction.undo
  * @see XUndoManager.undo
  * @since OOo 3.4
  */
trait UndoFailedException
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.Exception {
  /** describes the reason why the operation failed. Usually, this member will carry an exception. */
  var Reason: js.Any
}

object UndoFailedException {
  @scala.inline
  def apply(
    Context: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Message: java.lang.String,
    Reason: js.Any
  ): UndoFailedException = {
    val __obj = js.Dynamic.literal(Context = Context, Message = Message, Reason = Reason)
  
    __obj.asInstanceOf[UndoFailedException]
  }
}

