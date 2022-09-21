package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * is implemented by components which want to be notified when the `RowSet` supplied by a {@link XRowSetSupplier} changes.
  * @see XRowSetChangeBroadcaster
  * @see XRowSetSupplier
  * @since OOo 3.2
  */
trait XRowSetChangeListener
  extends StObject
     with XEventListener {
  
  /** notifies the listener that the `RowSet` associated with a {@link XRowSetSupplier} has changed. */
  def onRowSetChanged(iEvent: EventObject): Unit
}
object XRowSetChangeListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    onRowSetChanged: EventObject => Unit,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XRowSetChangeListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), onRowSetChanged = js.Any.fromFunction1(onRowSetChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRowSetChangeListener]
  }
  
  extension [Self <: XRowSetChangeListener](x: Self) {
    
    inline def setOnRowSetChanged(value: EventObject => Unit): Self = StObject.set(x, "onRowSetChanged", js.Any.fromFunction1(value))
  }
}
