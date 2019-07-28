package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XSessionManagerListener2 extends XSessionManagerListener {
  /**
    * doQuit gets called when the session manager has decided the application should quit. Under these circumstances bringing up further UI will usually be
    * impossible and must be avoided.
    */
  def doQuit(): Unit
}

object XSessionManagerListener2 {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveInteraction: Boolean => Unit,
    disposing: EventObject => Unit,
    doQuit: () => Unit,
    doRestore: () => Boolean,
    doSave: (Boolean, Boolean) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    shutdownCanceled: () => Unit
  ): XSessionManagerListener2 = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveInteraction = js.Any.fromFunction1(approveInteraction), disposing = js.Any.fromFunction1(disposing), doQuit = js.Any.fromFunction0(doQuit), doRestore = js.Any.fromFunction0(doRestore), doSave = js.Any.fromFunction2(doSave), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), shutdownCanceled = js.Any.fromFunction0(shutdownCanceled))
  
    __obj.asInstanceOf[XSessionManagerListener2]
  }
}

