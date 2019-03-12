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
    addVBAScriptListener: XVBAScriptListener => scala.Unit,
    broadcastVBAScriptEvent: (scala.Double, java.lang.String) => scala.Unit,
    removeVBAScriptListener: XVBAScriptListener => scala.Unit
  ): XVBACompatibility = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName, RunningVBAScripts = RunningVBAScripts, VBACompatibilityMode = VBACompatibilityMode, addVBAScriptListener = js.Any.fromFunction1(addVBAScriptListener), broadcastVBAScriptEvent = js.Any.fromFunction2(broadcastVBAScriptEvent), removeVBAScriptListener = js.Any.fromFunction1(removeVBAScriptListener))
  
    __obj.asInstanceOf[XVBACompatibility]
  }
}

