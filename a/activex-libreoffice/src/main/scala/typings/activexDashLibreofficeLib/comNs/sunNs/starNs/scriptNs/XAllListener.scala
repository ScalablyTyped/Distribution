package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a listener combining all methods of a listener interface in a single generic call.
  *
  * Without any output parameters, it is possible to adapt any interface if the {@link XAllListenerAdapterService} can generate an adapter.
  */
trait XAllListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * gets called when a "vetoable event" occurs at the object.
    *
    * That happens when the listener method raises an exception, or has a return value declared.
    */
  def approveFiring(aEvent: AllEventObject): js.Any
  /** gets called when an event occurs at the object. */
  def firing(iaEvent: AllEventObject): scala.Unit
}

object XAllListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveFiring: js.Function1[AllEventObject, js.Any],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    firing: js.Function1[AllEventObject, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAllListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("approveFiring")(approveFiring)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("firing")(firing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAllListener]
  }
}

