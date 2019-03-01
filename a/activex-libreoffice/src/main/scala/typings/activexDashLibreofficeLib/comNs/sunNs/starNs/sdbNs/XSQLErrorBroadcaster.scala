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

object XSQLErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addSQLErrorListener: js.Function1[XSQLErrorListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeSQLErrorListener: js.Function1[XSQLErrorListener, scala.Unit]
  ): XSQLErrorBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addSQLErrorListener")(addSQLErrorListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeSQLErrorListener")(removeSQLErrorListener)
    __obj.asInstanceOf[XSQLErrorBroadcaster]
  }
}

