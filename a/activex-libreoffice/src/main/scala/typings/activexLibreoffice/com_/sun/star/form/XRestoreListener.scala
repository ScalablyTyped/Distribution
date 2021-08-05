package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * receives notifications about data being restored.
  *
  * Such a notification is typically sent when the user cancels updating the current record of a database form without saving the data. After restoring,
  * the user operates on the original data.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm} and
  * {@link com.sun.star.sdb.RowSet} services
  * @deprecated Deprecated
  */
trait XRestoreListener
  extends StObject
     with XEventListener {
  
  /** is invoked when a modified record has been restored */
  def restored(aEvent: EventObject): Unit
}
object XRestoreListener {
  
  inline def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    restored: EventObject => Unit
  ): XRestoreListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), restored = js.Any.fromFunction1(restored))
    __obj.asInstanceOf[XRestoreListener]
  }
  
  extension [Self <: XRestoreListener](x: Self) {
    
    inline def setRestored(value: EventObject => Unit): Self = StObject.set(x, "restored", js.Any.fromFunction1(value))
  }
}
