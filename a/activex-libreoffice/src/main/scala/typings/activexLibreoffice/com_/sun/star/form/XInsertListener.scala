package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * allows to receive notifications about insertions into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} and {@link com.sun.star.sdb.XRowSetApproveListener} interfaces.
  * @deprecated Deprecated
  */
@js.native
trait XInsertListener extends XEventListener {
  
  /** is invoked after a database form has inserted a record to a data source. */
  def inserted(aEvent: EventObject): Unit = js.native
  
  /** is invoked when a database form starts inserting a record. */
  def inserting(aEvent: EventObject): Unit = js.native
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
  implicit class XInsertListenerOps[Self <: XInsertListener] (val x: Self) extends AnyVal {
    
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
    def setInserted(value: EventObject => Unit): Self = this.set("inserted", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInserting(value: EventObject => Unit): Self = this.set("inserting", js.Any.fromFunction1(value))
  }
}
