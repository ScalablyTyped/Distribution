package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** registers item listeners at controls like the com::sun::star::awt::Roadmap */
trait XItemEventBroadcaster
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** registers a listener for item events. */
  def addItemListener(l: XItemListener): scala.Unit
  /** unregisters a listener for item events. */
  def removeItemListener(l: XItemListener): scala.Unit
}

object XItemEventBroadcaster {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    addItemListener: js.Function1[XItemListener, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeItemListener: js.Function1[XItemListener, scala.Unit]
  ): XItemEventBroadcaster = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("addItemListener")(addItemListener)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("removeItemListener")(removeItemListener)
    __obj.asInstanceOf[XItemEventBroadcaster]
  }
}

