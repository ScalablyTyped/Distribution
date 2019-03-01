package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Allows to register for title changed events. */
trait XTitleChangeBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Add a listener */
  def addTitleChangeListener(xListener: XTitleChangeListener): scala.Unit
  /** Remove a listener */
  def removeTitleChangeListener(xListener: XTitleChangeListener): scala.Unit
}

object XTitleChangeBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addTitleChangeListener: js.Function1[XTitleChangeListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeTitleChangeListener: js.Function1[XTitleChangeListener, scala.Unit]
  ): XTitleChangeBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addTitleChangeListener")(addTitleChangeListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeTitleChangeListener")(removeTitleChangeListener)
    __obj.asInstanceOf[XTitleChangeBroadcaster]
  }
}

