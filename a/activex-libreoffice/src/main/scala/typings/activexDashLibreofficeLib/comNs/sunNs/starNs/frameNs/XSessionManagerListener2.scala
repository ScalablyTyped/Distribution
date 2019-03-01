package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSessionManagerListener2 extends XSessionManagerListener {
  /**
    * doQuit gets called when the session manager has decided the application should quit. Under these circumstances bringing up further UI will usually be
    * impossible and must be avoided.
    */
  def doQuit(): scala.Unit
}

object XSessionManagerListener2 {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveInteraction: js.Function1[scala.Boolean, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    doQuit: js.Function0[scala.Unit],
    doRestore: js.Function0[scala.Boolean],
    doSave: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    shutdownCanceled: js.Function0[scala.Unit]
  ): XSessionManagerListener2 = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("approveInteraction")(approveInteraction)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("doQuit")(doQuit)
    __obj.updateDynamic("doRestore")(doRestore)
    __obj.updateDynamic("doSave")(doSave)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("shutdownCanceled")(shutdownCanceled)
    __obj.asInstanceOf[XSessionManagerListener2]
  }
}

