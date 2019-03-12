package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This was created from its sole place of use, so it might be incomplete.
  * @since LibreOffice 4.1
  */
trait SessionListener extends XSessionManagerListener2 {
  def createWithOnQuitFlag(AllowUserInteractionOnQuit: scala.Boolean): scala.Unit
}

object SessionListener {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    approveInteraction: scala.Boolean => scala.Unit,
    createWithOnQuitFlag: scala.Boolean => scala.Unit,
    disposing: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject => scala.Unit,
    doQuit: () => scala.Unit,
    doRestore: () => scala.Boolean,
    doSave: (scala.Boolean, scala.Boolean) => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    shutdownCanceled: () => scala.Unit
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), createWithOnQuitFlag = js.Any.fromFunction1(createWithOnQuitFlag), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
  
    __obj.asInstanceOf[SessionListener]
  }
}

