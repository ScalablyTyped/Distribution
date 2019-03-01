package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This event is a wrapper for an original event in a forwarding event.
  *
  * Usually the original event is the first argument in the array of arguments.
  */
trait AllEventObject
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** The arguments of the original method. */
  var Arguments: activexDashInteropLib.SafeArray[_]
  /**
    * A helper value for the implementation that can be used arbitrarily.
    *
    * This field reflects the third parameter of the method {@link XAllListenerAdapterService.createAllListerAdapter()} .
    */
  var Helper: js.Any
  /** contains the type of the original listener. */
  var ListenerType: activexDashLibreofficeLib.`type`
  /** The original method name on which the event was fired. */
  var MethodName: java.lang.String
}

object AllEventObject {
  @scala.inline
  def apply(
    Arguments: activexDashInteropLib.SafeArray[_],
    Helper: js.Any,
    ListenerType: activexDashLibreofficeLib.`type`,
    MethodName: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): AllEventObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Arguments")(Arguments)
    __obj.updateDynamic("Helper")(Helper)
    __obj.updateDynamic("ListenerType")(ListenerType)
    __obj.updateDynamic("MethodName")(MethodName)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[AllEventObject]
  }
}

