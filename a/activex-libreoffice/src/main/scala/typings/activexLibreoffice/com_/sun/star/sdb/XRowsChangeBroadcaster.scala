package typings.activexLibreoffice.com_.sun.star.sdb

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * broadcasts changes in the `RowSet` supplied by a component
  * @see XRowSetSupplier
  * @see XRowsChangeListener
  * @since OOo 3.3
  */
trait XRowsChangeBroadcaster extends StObject {
  
  /** adds a listener to be notified when the `RowSet` supplied by the component changes. */
  def addRowsChangeListener(listener: XRowsChangeListener): Unit
  
  /** removes a previously added listener. */
  def removeRowsChangeListener(listener: XRowsChangeListener): Unit
}
object XRowsChangeBroadcaster {
  
  inline def apply(
    addRowsChangeListener: XRowsChangeListener => Unit,
    removeRowsChangeListener: XRowsChangeListener => Unit
  ): XRowsChangeBroadcaster = {
    val __obj = js.Dynamic.literal(addRowsChangeListener = js.Any.fromFunction1(addRowsChangeListener), removeRowsChangeListener = js.Any.fromFunction1(removeRowsChangeListener))
    __obj.asInstanceOf[XRowsChangeBroadcaster]
  }
  
  extension [Self <: XRowsChangeBroadcaster](x: Self) {
    
    inline def setAddRowsChangeListener(value: XRowsChangeListener => Unit): Self = StObject.set(x, "addRowsChangeListener", js.Any.fromFunction1(value))
    
    inline def setRemoveRowsChangeListener(value: XRowsChangeListener => Unit): Self = StObject.set(x, "removeRowsChangeListener", js.Any.fromFunction1(value))
  }
}
