package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * makes it possible to register listeners, which are called whenever a document or document content event occurs
  *
  * Such events will be broadcasted by a {@link XEventBroadcaster} .
  * @deprecated Deprecated
  * @see XDocumentEventListener
  */
trait XEventListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is called whenever a document event (see {@link EventObject} ) occurs
    * @param Event specifies the event type
    */
  def notifyEvent(Event: EventObject): scala.Unit
}

