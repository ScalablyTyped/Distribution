package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameContainer
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Gives access to an event container represented by an XNameContainer containing {@link ScriptEventDescriptor} instances. */
trait XScriptEventsSupplier extends XInterface {
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  val Events: XNameContainer
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  def getEvents(): XNameContainer
}

object XScriptEventsSupplier {
  @scala.inline
  def apply(
    Events: XNameContainer,
    acquire: () => Unit,
    getEvents: () => XNameContainer,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XScriptEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events, acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XScriptEventsSupplier]
  }
}

