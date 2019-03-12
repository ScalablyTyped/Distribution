package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** gives access to a list of URLs bound to events of this object */
trait XEventsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  val Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  def getEvents(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace
}

object XEventsSupplier {
  @scala.inline
  def apply(
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    acquire: () => scala.Unit,
    getEvents: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameReplace,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events, acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XEventsSupplier]
  }
}

