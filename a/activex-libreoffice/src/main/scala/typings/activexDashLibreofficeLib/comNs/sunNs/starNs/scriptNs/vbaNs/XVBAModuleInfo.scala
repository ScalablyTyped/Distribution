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

object XVBAModuleInfo {
  @scala.inline
  def apply(
    getModuleInfo: js.Function1[java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo],
    hasModuleInfo: js.Function1[java.lang.String, scala.Boolean],
    insertModuleInfo: js.Function2[
      java.lang.String, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo, 
      scala.Unit
    ],
    removeModuleInfo: js.Function1[java.lang.String, scala.Unit]
  ): XVBAModuleInfo = {
    val __obj = js.Dynamic.literal(getModuleInfo = getModuleInfo, hasModuleInfo = hasModuleInfo, insertModuleInfo = insertModuleInfo, removeModuleInfo = removeModuleInfo)
  
    __obj.asInstanceOf[XVBAModuleInfo]
  }
}

