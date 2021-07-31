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
  
  @scala.inline
  def apply(UndoManager: XUndoManager, getUndoManager: () => XUndoManager): XUndoManagerSupplier = {
    val __obj = js.Dynamic.literal(UndoManager = UndoManager.asInstanceOf[js.Any], getUndoManager = js.Any.fromFunction0(getUndoManager))
    __obj.asInstanceOf[XUndoManagerSupplier]
  }
  
  @scala.inline
  implicit class XUndoManagerSupplierMutableBuilder[Self <: XUndoManagerSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetUndoManager(value: () => XUndoManager): Self = StObject.set(x, "getUndoManager", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUndoManager(value: XUndoManager): Self = StObject.set(x, "UndoManager", value.asInstanceOf[js.Any])
  }
}
