package typings.activexLibreoffice.com_.sun.star.document

import typings.activexLibreoffice.com_.sun.star.frame.XController2
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes an event happening in an {@link OfficeDocument}
  *
  * The {@link com.sun.star.lang.EventObject.Source} member of the base type refers to the document which broadcasts the event.
  *
  * This type is the successor of the {@link EventObject} type, which should not be used anymore.
  * @see XDocumentEventBroadcaster
  * @since OOo 3.1
  */
@js.native
trait DocumentEvent
  extends typings.activexLibreoffice.com_.sun.star.lang.EventObject {
  /**
    * specifies the name of the event.
    *
    * It's the responsibility of the component supporting the {@link XDocumentEventBroadcaster} interface to specify which events it supports.
    */
  var EventName: String = js.native
  /**
    * contains supplemental information about the event which is being notified
    *
    * The semantics of this additional information needs to be specified by the broadcaster of the event.
    */
  var Supplement: js.Any = js.native
  /**
    * denotes the view respectively controller which the event applies to.
    *
    * Might be `NULL` if the event is not related to a concrete view of the document.
    */
  var ViewController: XController2 = js.native
}

object DocumentEvent {
  @scala.inline
  def apply(EventName: String, Source: XInterface, Supplement: js.Any, ViewController: XController2): DocumentEvent = {
    val __obj = js.Dynamic.literal(EventName = EventName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Supplement = Supplement.asInstanceOf[js.Any], ViewController = ViewController.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentEvent]
  }
  @scala.inline
  implicit class DocumentEventOps[Self <: DocumentEvent] (val x: Self) extends AnyVal {
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
    def setEventName(value: String): Self = this.set("EventName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSupplement(value: js.Any): Self = this.set("Supplement", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewController(value: XController2): Self = this.set("ViewController", value.asInstanceOf[js.Any])
  }
  
}

