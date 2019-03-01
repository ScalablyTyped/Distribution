package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** makes it possible to receive ScriptEvents. */
trait XScriptListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /** gets called when a "vetoable event" occurs at the object. */
  def approveFiring(aEvent: ScriptEvent): js.Any
  /**
    * gets called when an event takes place. For that a {@link ScriptEventDescriptor} is registered at and attached to an object by an {@link
    * XEventAttacherManager} .
    */
  def firing(aEvent: ScriptEvent): scala.Unit
}

object XScriptListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    approveFiring: js.Function1[ScriptEvent, js.Any],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    firing: js.Function1[ScriptEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XScriptListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("approveFiring")(approveFiring)
    __obj.updateDynamic("disposing")(disposing)
    __obj.updateDynamic("firing")(firing)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XScriptListener]
  }
}

