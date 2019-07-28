package typings.activexDashLibreoffice.comNs.sunNs.starNs.uiNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XContextChangeEventListener extends XEventListener {
  def notifyContextChangeEvent(event: ContextChangeEventObject): Unit
}

object XContextChangeEventListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    disposing: EventObject => Unit,
    notifyContextChangeEvent: ContextChangeEventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XContextChangeEventListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disposing = js.Any.fromFunction1(disposing), notifyContextChangeEvent = js.Any.fromFunction1(notifyContextChangeEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XContextChangeEventListener]
  }
}

