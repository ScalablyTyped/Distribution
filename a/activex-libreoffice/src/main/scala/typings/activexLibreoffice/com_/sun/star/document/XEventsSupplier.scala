package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XNameReplace
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** gives access to a list of URLs bound to events of this object */
@js.native
trait XEventsSupplier extends XInterface {
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  val Events: XNameReplace = js.native
  
  /**
    * offers a list of event handlers which are be bound to events of this object
    * @returns an {@link Events} description object
    */
  def getEvents(): XNameReplace = js.native
}
object XEventsSupplier {
  
  @scala.inline
  def apply(
    Events: XNameReplace,
    acquire: () => Unit,
    getEvents: () => XNameReplace,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XEventsSupplier = {
    val __obj = js.Dynamic.literal(Events = Events.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getEvents = js.Any.fromFunction0(getEvents), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XEventsSupplier]
  }
  
  @scala.inline
  implicit class XEventsSupplierOps[Self <: XEventsSupplier] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setEvents(value: XNameReplace): Self = this.set("Events", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetEvents(value: () => XNameReplace): Self = this.set("getEvents", js.Any.fromFunction0(value))
  }
}
