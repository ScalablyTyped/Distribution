package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * used to be notified when errors in a database form happen.
  *
  * Each time an exception is triggered by a database form, the error event is posted to the error listeners. This event may be used to configure the
  * error handling of a database form.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorListener} .
  * @deprecated Deprecated
  */
trait XErrorListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** is invoked when a database action performed by a database form raises an exception. */
  def errorOccured(aEvent: ErrorEvent): scala.Unit
}

