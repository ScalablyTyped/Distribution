package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the name of the event.
    *
    * It's the responsibility of the component supporting the {@link XDocumentEventBroadcaster} interface to specify which events it supports.
    */
  var EventName: java.lang.String
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
  var ViewController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController2
}

object DocumentEvent {
  @scala.inline
  def apply(
    EventName: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    Supplement: js.Any,
    ViewController: activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs.XController2
  ): DocumentEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventName")(EventName)
    __obj.updateDynamic("Source")(Source)
    __obj.updateDynamic("Supplement")(Supplement)
    __obj.updateDynamic("ViewController")(ViewController)
    __obj.asInstanceOf[DocumentEvent]
  }
}

