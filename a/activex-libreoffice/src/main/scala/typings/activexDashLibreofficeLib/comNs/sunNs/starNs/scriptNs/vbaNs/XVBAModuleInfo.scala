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
    getModuleInfo: java.lang.String => activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo,
    hasModuleInfo: java.lang.String => scala.Boolean,
    insertModuleInfo: (java.lang.String, activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs.ModuleInfo) => scala.Unit,
    removeModuleInfo: java.lang.String => scala.Unit
  ): XVBAModuleInfo = {
    val __obj = js.Dynamic.literal(getModuleInfo = js.Any.fromFunction1(getModuleInfo), hasModuleInfo = js.Any.fromFunction1(hasModuleInfo), insertModuleInfo = js.Any.fromFunction2(insertModuleInfo), removeModuleInfo = js.Any.fromFunction1(removeModuleInfo))
  
    __obj.asInstanceOf[XVBAModuleInfo]
  }
}

