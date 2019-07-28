package typings.activexDashLibreoffice.comNs.sunNs.starNs.frameNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.URL
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control event send by extended user interface controls.
  * @since OOo 2.0.3
  */
trait ControlEvent extends js.Object {
  /** specifies the event which has occurred. */
  var Event: String
  /** specifies a sequence of named values which are used as additional values for the event. The number and types of named values depend on the event. */
  var aInformation: SafeArray[NamedValue]
  /** fully parsed URL describing the control that sends this notification. */
  var aURL: URL
}

object ControlEvent {
  @scala.inline
  def apply(Event: String, aInformation: SafeArray[NamedValue], aURL: URL): ControlEvent = {
    val __obj = js.Dynamic.literal(Event = Event, aInformation = aInformation, aURL = aURL)
  
    __obj.asInstanceOf[ControlEvent]
  }
}

