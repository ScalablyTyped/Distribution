package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This is the listener interface for receiving "approveDelete" and "deleted" events posted by a database form.
  *
  * "approveDelete" may be used to abort a deletion of the current data record.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.form.XConfirmDeleteListener} .
  * @deprecated Deprecated
  */
trait XDeleteListener
  extends StObject
     with XEventListener {
  
  /** is invoked when the current record of the database form will be deleted. */
  def approveDelete(aEvent: EventObject): Boolean
  
  /** is invoked when a database form has finished the delete processing and the data has been successfully deleted from the datasource. */
  def deleted(aEvent: EventObject): Unit
}
object XDeleteListener {
  
  inline def apply(
    acquire: () => Unit,
    approveDelete: EventObject => Boolean,
    deleted: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDeleteListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveDelete = js.Any.fromFunction1(approveDelete), deleted = js.Any.fromFunction1(deleted), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDeleteListener]
  }
  
  extension [Self <: XDeleteListener](x: Self) {
    
    inline def setApproveDelete(value: EventObject => Boolean): Self = StObject.set(x, "approveDelete", js.Any.fromFunction1(value))
    
    inline def setDeleted(value: EventObject => Unit): Self = StObject.set(x, "deleted", js.Any.fromFunction1(value))
  }
}
