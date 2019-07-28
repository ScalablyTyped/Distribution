package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This was created from its sole place of use, so it might be incomplete.
  * @since LibreOffice 4.1
  */
trait SessionListener extends XSessionManagerListener2 {
  def createWithOnQuitFlag(AllowUserInteractionOnQuit: Boolean): Unit
}

object SessionListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveInteraction: Boolean => Unit,
    createWithOnQuitFlag: Boolean => Unit,
    disposing: EventObject => Unit,
    doQuit: () => Unit,
    doRestore: () => Boolean,
    doSave: (Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    shutdownCanceled: () => Unit
  ): SessionListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), createWithOnQuitFlag = js.Any.fromFunction1(createWithOnQuitFlag), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
  
    __obj.asInstanceOf[SessionListener]
  }
}

