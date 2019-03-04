package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * allows to receive notifications about insertions into a database form.
  *
  * Please do **not** use anymore, this interface is deprecated, and superseded by functionality from the {@link com.sun.star.form.component.DataForm}
  * service, as well as the {@link com.sun.star.sdbc.XRowSetListener} and {@link com.sun.star.sdb.XRowSetApproveListener} interfaces.
  * @deprecated Deprecated
  */
trait XInsertListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked after a database form has inserted a record to a data source. */
  def inserted(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
  /** is invoked when a database form starts inserting a record. */
  def inserting(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

object XInsertListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    inserted: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    inserting: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XInsertListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disposing = disposing, inserted = inserted, inserting = inserting, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XInsertListener]
  }
}

