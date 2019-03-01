package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.frameNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * describes a control event send by extended user interface controls.
  * @since OOo 2.0.3
  */
trait ControlEvent extends js.Object {
  /** specifies the event which has occurred. */
  var Event: java.lang.String
  /** specifies a sequence of named values which are used as additional values for the event. The number and types of named values depend on the event. */
  var aInformation: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  /** fully parsed URL describing the control that sends this notification. */
  var aURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
}

object ControlEvent {
  @scala.inline
  def apply(
    Event: java.lang.String,
    aInformation: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue],
    aURL: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.URL
  ): ControlEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Event")(Event)
    __obj.updateDynamic("aInformation")(aInformation)
    __obj.updateDynamic("aURL")(aURL)
    __obj.asInstanceOf[ControlEvent]
  }
}

