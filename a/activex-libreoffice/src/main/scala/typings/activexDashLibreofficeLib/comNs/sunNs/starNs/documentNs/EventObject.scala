package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

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
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /**
    * specifies the name of the occurred event
    *
    * For a list of possible event names see {@link Events} .
    */
  var EventName: java.lang.String
}

object EventObject {
  @scala.inline
  def apply(EventName: java.lang.String, Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface): EventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventName")(EventName)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[EventObject]
  }
}

