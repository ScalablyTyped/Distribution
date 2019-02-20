package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This is the listener interface for receiving "approveDelete" and "deleted" events posted by a database form.
  *
  * "approveDelete" may be used to abort a deletion of the current data record.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.form.XConfirmDeleteListener} .
  * @deprecated Deprecated
  */
trait XDeleteListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when the current record of the database form will be deleted. */
  def approveDelete(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Boolean
  /** is invoked when a database form has finished the delete processing and the data has been successfully deleted from the datasource. */
  def deleted(aEvent: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject): scala.Unit
}

