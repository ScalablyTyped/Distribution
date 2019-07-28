package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is not to be used anymore
  * @deprecated Deprecated
  */
trait XDatabaseAccessListener extends XEventListener {
  def approveConnectionClosing(event: EventObject): Boolean
  def connectionChanged(event: EventObject): Unit
  def connectionClosing(event: EventObject): Unit
}

object XDatabaseAccessListener {
  @scala.inline
  def apply(
    acquire: () => Unit,
    approveConnectionClosing: EventObject => Boolean,
    connectionChanged: EventObject => Unit,
    connectionClosing: EventObject => Unit,
    disposing: EventObject => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDatabaseAccessListener = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), approveConnectionClosing = js.Any.fromFunction1(approveConnectionClosing), connectionChanged = js.Any.fromFunction1(connectionChanged), connectionClosing = js.Any.fromFunction1(connectionClosing), disposing = js.Any.fromFunction1(disposing), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDatabaseAccessListener]
  }
}

