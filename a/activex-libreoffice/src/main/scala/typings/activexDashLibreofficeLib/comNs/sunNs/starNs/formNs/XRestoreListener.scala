package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a modified record has been restored */
  def restored(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

