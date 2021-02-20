package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdb.RowChangeEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to register a component for confirming deletions of rows in a {@link com.sun.star.form.component.DataForm} .
  * @see XConfirmDeleteBroadcaster
  */
@js.native
trait XConfirmDeleteListener extends XEventListener {
  
  /**
    * is invoked when the current record of a database form will be deleted.
    * @param aEvent A descriptor specifying the deletion request.
    * @returns `TRUE` when the row can be deleted, otherwise `FALSE` .
    */
  def confirmDelete(aEvent: RowChangeEvent): Boolean = js.native
}
object XConfirmDeleteListener {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    confirmDelete: RowChangeEvent => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XConfirmDeleteListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), confirmDelete = js.Any.fromFunction1(confirmDelete), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XConfirmDeleteListener]
  }
  
  @scala.inline
  implicit class XConfirmDeleteListenerMutableBuilder[Self <: XConfirmDeleteListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirmDelete(value: RowChangeEvent => Boolean): Self = StObject.set(x, "confirmDelete", js.Any.fromFunction1(value))
  }
}
