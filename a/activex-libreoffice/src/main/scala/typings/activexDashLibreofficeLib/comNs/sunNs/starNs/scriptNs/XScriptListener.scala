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

