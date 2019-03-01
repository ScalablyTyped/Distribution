package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides methods to handle a volatile function result.
  * @see com.sun.star.sheet.VolatileResult
  * @see com.sun.star.sheet.ResultEvent
  */
trait XVolatileResult
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** adds a listener to be notified when a new value is available. */
  def addResultListener(aListener: XResultListener): scala.Unit
  /** removes the specified listener. */
  def removeResultListener(aListener: XResultListener): scala.Unit
}

object XVolatileResult {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addResultListener: js.Function1[XResultListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeResultListener: js.Function1[XResultListener, scala.Unit]
  ): XVolatileResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addResultListener")(addResultListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeResultListener")(removeResultListener)
    __obj.asInstanceOf[XVolatileResult]
  }
}

