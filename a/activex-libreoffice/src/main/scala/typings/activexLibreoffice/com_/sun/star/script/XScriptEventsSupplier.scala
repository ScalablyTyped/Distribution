package typings.activexLibreoffice.com_.sun.star.script

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameContainer
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Gives access to an event container represented by an XNameContainer containing {@link ScriptEventDescriptor} instances. */
@js.native
trait XScriptEventsSupplier extends XInterface {
  
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  val Events: XNameContainer = js.native
  
  /** Returns an XNameContainer containing instances of {@link ScriptEventDescriptor} */
  def getEvents(): XNameContainer = js.native
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
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XScriptEventsSupplier]
  }
  
  @scala.inline
  implicit class XScriptEventsSupplierMutableBuilder[Self <: XScriptEventsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEvents(value: XNameContainer): Self = StObject.set(x, "Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEvents(value: () => XNameContainer): Self = StObject.set(x, "getEvents", js.Any.fromFunction0(value))
  }
}
