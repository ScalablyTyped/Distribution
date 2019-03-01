package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBACompatibility extends js.Object {
  var ProjectName: java.lang.String
  var RunningVBAScripts: scala.Double
  var VBACompatibilityMode: scala.Boolean
  def addVBAScriptListener(Listener: XVBAScriptListener): scala.Unit
  def broadcastVBAScriptEvent(Identifier: scala.Double, ModuleName: java.lang.String): scala.Unit
  def removeVBAScriptListener(Listener: XVBAScriptListener): scala.Unit
}

object XVBACompatibility {
  @scala.inline
  def apply(
    ProjectName: java.lang.String,
    RunningVBAScripts: scala.Double,
    VBACompatibilityMode: scala.Boolean,
    addVBAScriptListener: js.Function1[XVBAScriptListener, scala.Unit],
    broadcastVBAScriptEvent: js.Function2[scala.Double, java.lang.String, scala.Unit],
    removeVBAScriptListener: js.Function1[XVBAScriptListener, scala.Unit]
  ): XVBACompatibility = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ProjectName")(ProjectName)
    __obj.updateDynamic("RunningVBAScripts")(RunningVBAScripts)
    __obj.updateDynamic("VBACompatibilityMode")(VBACompatibilityMode)
    __obj.updateDynamic("addVBAScriptListener")(addVBAScriptListener)
    __obj.updateDynamic("broadcastVBAScriptEvent")(broadcastVBAScriptEvent)
    __obj.updateDynamic("removeVBAScriptListener")(removeVBAScriptListener)
    __obj.asInstanceOf[XVBACompatibility]
  }
}

