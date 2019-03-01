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

object XErrorBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addErrorListener: js.Function1[XErrorListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeErrorListener: js.Function1[XErrorListener, scala.Unit]
  ): XErrorBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addErrorListener")(addErrorListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeErrorListener")(removeErrorListener)
    __obj.asInstanceOf[XErrorBroadcaster]
  }
}

