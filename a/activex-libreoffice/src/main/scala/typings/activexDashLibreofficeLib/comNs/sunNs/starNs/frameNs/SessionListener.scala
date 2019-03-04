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
    acquire: js.Function0[scala.Unit],
    approveInteraction: js.Function1[scala.Boolean, scala.Unit],
    createWithOnQuitFlag: js.Function1[scala.Boolean, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    doQuit: js.Function0[scala.Unit],
    doRestore: js.Function0[scala.Boolean],
    doSave: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    shutdownCanceled: js.Function0[scala.Unit]
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, approveInteraction = approveInteraction, createWithOnQuitFlag = createWithOnQuitFlag, disposing = disposing, doQuit = doQuit, doRestore = doRestore, doSave = doSave, queryInterface = queryInterface, release = release, shutdownCanceled = shutdownCanceled)
  
    __obj.asInstanceOf[SessionListener]
  }
}

