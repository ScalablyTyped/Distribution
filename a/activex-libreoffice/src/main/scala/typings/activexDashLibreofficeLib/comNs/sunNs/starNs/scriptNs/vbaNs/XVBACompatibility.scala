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

