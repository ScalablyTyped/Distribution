package typings.activexLibreoffice.com_.sun.star.xml.dom.events

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XDocumentEvent extends XInterface {
  
  def createEvent(eventType: String): XEvent = js.native
}
object XDocumentEvent {
  
  @scala.inline
  def apply(
    acquire: () => Unit,
    createEvent: String => XEvent,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDocumentEvent = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createEvent = js.Any.fromFunction1(createEvent), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XDocumentEvent]
  }
  
  @scala.inline
  implicit class XDocumentEventOps[Self <: XDocumentEvent] (val x: Self) extends AnyVal {
    
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
    def setCreateEvent(value: String => XEvent): Self = this.set("createEvent", js.Any.fromFunction1(value))
  }
}
