package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * thrown when reverting to re-applying an undoable action fails.
  * @see XUndoAction.undo
  * @see XUndoManager.undo
  * @since OOo 3.4
  */
@js.native
trait UndoFailedException extends Exception {
  
  /** describes the reason why the operation failed. Usually, this member will carry an exception. */
  var Reason: js.Any = js.native
}
object UndoFailedException {
  
  @scala.inline
  def apply(Context: XInterface, Message: String, Reason: js.Any): UndoFailedException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoFailedException]
  }
  
  @scala.inline
  implicit class UndoFailedExceptionMutableBuilder[Self <: UndoFailedException] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: js.Any): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
