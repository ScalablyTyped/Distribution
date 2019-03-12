package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to an event container represented by an XNameContainer containing {@link ScriptEventDescriptor} instances. */
trait XScriptEventsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  val Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  def getEvents(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer
}

object XScriptEventsSupplier {
  @scala.inline
  def apply(
    Events: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    acquire: () => scala.Unit,
    getEvents: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): XScriptEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events, acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptEventsSupplier]
  }
}

