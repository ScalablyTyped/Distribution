package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for approving the moving and changing of row set actions. */
trait XRowSetApproveListener
  extends StObject
     with XEventListener {
  
  /**
    * is called before a row set's cursor is moved.
    * @param event the event which happened
    * @returns `TRUE` when moving is allowed, otherwise `FALSE`
    */
  def approveCursorMove(event: EventObject): Boolean
  
  /**
    * is called before a row is inserted, updated, or deleted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowChange(event: RowChangeEvent): Boolean
  
  /**
    * is called before a row set is changed, or in other words before a row set is reexecuted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowSetChange(event: EventObject): Boolean
}
object XRowSetApproveListener {
  
  inline def apply(
    acquire: () => Unit,
    approveCursorMove: EventObject => Boolean,
    approveRowChange: RowChangeEvent => Boolean,
    approveRowSetChange: EventObject => Boolean,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XRowSetApproveListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveCursorMove = js.Any.fromFunction1(approveCursorMove), approveRowChange = js.Any.fromFunction1(approveRowChange), approveRowSetChange = js.Any.fromFunction1(approveRowSetChange), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XRowSetApproveListener]
  }
  
  extension [Self <: XRowSetApproveListener](x: Self) {
    
    inline def setApproveCursorMove(value: EventObject => Boolean): Self = StObject.set(x, "approveCursorMove", js.Any.fromFunction1(value))
    
    inline def setApproveRowChange(value: RowChangeEvent => Boolean): Self = StObject.set(x, "approveRowChange", js.Any.fromFunction1(value))
    
    inline def setApproveRowSetChange(value: EventObject => Boolean): Self = StObject.set(x, "approveRowSetChange", js.Any.fromFunction1(value))
  }
}
