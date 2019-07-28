package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs.vbaNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBAScriptListener extends XEventListener {
  def notifyVBAScriptEvent(Event: VBAScriptEvent): Unit
}

object XVBAScriptListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyVBAScriptEvent: VBAScriptEvent => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XVBAScriptListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyVBAScriptEvent = js.Any.fromFunction1(notifyVBAScriptEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XVBAScriptListener]
  }
}

