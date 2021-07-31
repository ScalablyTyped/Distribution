package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to receive notifications about insertions into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} and {@link com.sun.star.sdb.XRowSetApproveListener} interfaces.
  * @deprecated Deprecated
  */
trait XInsertListener
  extends StObject
     with XEventListener {
  
  /** is invoked after a database form has inserted a record to a data source. */
  def inserted(aEvent: EventObject): Unit
  
  /** is invoked when a database form starts inserting a record. */
  def inserting(aEvent: EventObject): Unit
}
object XInsertListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    inserted: EventObject => Unit,
    inserting: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XInsertListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), inserted = js.Any.fromFunction1(inserted), inserting = js.Any.fromFunction1(inserting), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XInsertListener]
  }
  
  @scala.inline
  implicit class XInsertListenerMutableBuilder[Self <: XInsertListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInserted(value: EventObject => Unit): Self = StObject.set(x, "inserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInserting(value: EventObject => Unit): Self = StObject.set(x, "inserting", js.Any.fromFunction1(value))
  }
}
