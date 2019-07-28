package typings.activexDashLibreoffice.comNs.sunNs.starNs.documentNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is thrown on document and document content events
  * @deprecated Deprecated
  * @see XEventListener
  * @see XEventBroadcaster
  * @see DocumentEvent
  */
trait EventObject
  extends typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the name of the occurred event
    *
    * For a list of possible event names see {@link Events} .
    */
  var EventName: String
}

object EventObject {
  @scala.inline
  def apply(EventName: String, Source: XInterface): EventObject = {
    val __obj = js.Dynamic.literal(EventName = EventName, Source = Source)
  
    __obj.asInstanceOf[EventObject]
  }
}

