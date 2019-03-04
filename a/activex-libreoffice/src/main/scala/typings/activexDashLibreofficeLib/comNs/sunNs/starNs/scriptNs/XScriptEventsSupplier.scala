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
    acquire: js.Function0[scala.Unit],
    getEvents: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameContainer],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events, acquire = acquire, getEvents = getEvents, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XScriptEventsSupplier]
  }
}

