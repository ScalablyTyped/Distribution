package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** interface for notifying potential listeners of {@link com.sun.star.sdbc.SQLException} s posted by any database object. */
trait XSQLErrorBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds the specified listener to receive the event "errorOccurred" */
  def addSQLErrorListener(Listener: XSQLErrorListener): scala.Unit
  /** removes the specified listener. */
  def removeSQLErrorListener(Listener: XSQLErrorListener): scala.Unit
}

