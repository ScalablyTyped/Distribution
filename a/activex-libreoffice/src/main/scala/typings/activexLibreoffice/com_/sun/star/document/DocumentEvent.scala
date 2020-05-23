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
trait DocumentEvent
  extends typings.activexLibreoffice.com_.sun.star.lang.EventObject {
  /**
    * specifies the name of the event.
    *
    * It's the responsibility of the component supporting the {@link XDocumentEventBroadcaster} interface to specify which events it supports.
    */
  var EventName: String
  /**
    * contains supplemental information about the event which is being notified
    *
    * The semantics of this additional information needs to be specified by the broadcaster of the event.
    */
  var Supplement: js.Any
  /**
    * denotes the view respectively controller which the event applies to.
    *
    * Might be `NULL` if the event is not related to a concrete view of the document.
    */
  var ViewController: XController2
}

object DocumentEvent {
  @scala.inline
  def apply(EventName: String, Source: XInterface, Supplement: js.Any, ViewController: XController2): DocumentEvent = {
    val __obj = js.Dynamic.literal(EventName = EventName.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any], Supplement = Supplement.asInstanceOf[js.Any], ViewController = ViewController.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentEvent]
  }
}

