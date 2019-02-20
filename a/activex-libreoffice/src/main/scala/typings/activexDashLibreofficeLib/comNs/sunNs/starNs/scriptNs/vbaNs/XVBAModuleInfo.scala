package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.vbaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBAModuleInfo extends js.Object {
  def getModuleInfo(ModuleName: java.lang.String): activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo
  def hasModuleInfo(ModuleName: java.lang.String): scala.Boolean
  def insertModuleInfo(
    ModuleName: java.lang.String,
    ModuleInfo: activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo
  ): scala.Unit
  def removeModuleInfo(ModuleName: java.lang.String): scala.Unit
}

