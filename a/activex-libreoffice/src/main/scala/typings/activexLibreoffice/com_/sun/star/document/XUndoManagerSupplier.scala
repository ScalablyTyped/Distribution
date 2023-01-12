package typings.activexLibreoffice.com_.sun.star.document

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides access to an {@link XUndoManager} .
  * @since OOo 3.4
  */
trait XUndoManagerSupplier extends StObject {
  
  /** returns the Undo manager associated with the component. */
  val UndoManager: XUndoManager
  
  /** returns the Undo manager associated with the component. */
  def getUndoManager(): XUndoManager
}
object XUndoManagerSupplier {
  
  inline def apply(UndoManager: XUndoManager, getUndoManager: () => XUndoManager): XUndoManagerSupplier = {
    val __obj = js.Dynamic.literal(UndoManager = UndoManager.asInstanceOf[js.Any], getUndoManager = js.Any.fromFunction0(getUndoManager))
    __obj.asInstanceOf[XUndoManagerSupplier]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: XUndoManagerSupplier] (val x: Self) extends AnyVal {
    
    inline def setGetUndoManager(value: () => XUndoManager): Self = StObject.set(x, "getUndoManager", js.Any.fromFunction0(value))
    
    inline def setUndoManager(value: XUndoManager): Self = StObject.set(x, "UndoManager", value.asInstanceOf[js.Any])
  }
}
