package typings.activexLibreoffice.com_.sun.star.sdb

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** is used for approving the moving and changing of row set actions. */
@js.native
trait XRowSetApproveListener extends XEventListener {
  
  /**
    * is called before a row set's cursor is moved.
    * @param event the event which happened
    * @returns `TRUE` when moving is allowed, otherwise `FALSE`
    */
  def approveCursorMove(event: EventObject): Boolean = js.native
  
  /**
    * is called before a row is inserted, updated, or deleted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowChange(event: RowChangeEvent): Boolean = js.native
  
  /**
    * is called before a row set is changed, or in other words before a row set is reexecuted.
    * @param event the event which happened
    * @returns `TRUE` when changing is allowed, otherwise `FALSE`
    */
  def approveRowSetChange(event: EventObject): Boolean = js.native
}
object XRowSetApproveListener {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class XRowSetApproveListenerOps[Self <: XRowSetApproveListener] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setApproveCursorMove(value: EventObject => Boolean): Self = this.set("approveCursorMove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApproveRowChange(value: RowChangeEvent => Boolean): Self = this.set("approveRowChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def setApproveRowSetChange(value: EventObject => Boolean): Self = this.set("approveRowSetChange", js.Any.fromFunction1(value))
  }
}
