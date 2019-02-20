package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides the possibility of receiving database error events.
  *
  * Please do **not** use anymore, this interface is superseded by {@link com.sun.star.sdb.XSQLErrorBroadcaster} .
  * @deprecated Deprecated
  */
trait XErrorBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to be notified of errors. */
  def addErrorListener(aListener: XErrorListener): scala.Unit
  /** removes the specified listener. */
  def removeErrorListener(aListener: XErrorListener): scala.Unit
}

