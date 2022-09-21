package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.uno.Exception
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * thrown when reverting to re-applying an undoable action fails.
  * @see XUndoAction.undo
  * @see XUndoManager.undo
  * @since OOo 3.4
  */
trait UndoFailedException
  extends StObject
     with Exception {
  
  /** describes the reason why the operation failed. Usually, this member will carry an exception. */
  var Reason: Any
}
object UndoFailedException {
  
  inline def apply(Context: XInterface, Message: String, Reason: Any): UndoFailedException = {
    val __obj = js.Dynamic.literal(Context = Context.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[UndoFailedException]
  }
  
  extension [Self <: UndoFailedException](x: Self) {
    
    inline def setReason(value: Any): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
