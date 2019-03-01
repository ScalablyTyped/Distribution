package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.documentNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies an event binding for a document or a document content
  * @see Events
  * @see XEventsSupplier
  */
trait EventDescriptor extends js.Object {
  /**
    * specifies the type of the event handler
    *
    * Usually this is one of the following: "None""StarBasic""JavaScript""Presentation" This list is extensible.
    */
  var EventType: java.lang.String
  /** specifies the script source code */
  var Script: java.lang.String
}

object EventDescriptor {
  @scala.inline
  def apply(EventType: java.lang.String, Script: java.lang.String): EventDescriptor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("EventType")(EventType)
    __obj.updateDynamic("Script")(Script)
    __obj.asInstanceOf[EventDescriptor]
  }
}

