package typings.activexLibreoffice.com_.sun.star.script.vba

import typings.activexLibreoffice.com_.sun.star.script.ModuleInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XVBAModuleInfo extends js.Object {
  def getModuleInfo(ModuleName: String): ModuleInfo
  def hasModuleInfo(ModuleName: String): Boolean
  def insertModuleInfo(ModuleName: String, ModuleInfo: ModuleInfo): Unit
  def removeModuleInfo(ModuleName: String): Unit
}

object XVBAModuleInfo {
  @scala.inline
  def apply(
    getModuleInfo: String => ModuleInfo,
    hasModuleInfo: String => Boolean,
    insertModuleInfo: (String, ModuleInfo) => Unit,
    removeModuleInfo: String => Unit
  ): XVBAModuleInfo = {
    val __obj = js.Dynamic.literal(getModuleInfo = js.Any.fromFunction1(getModuleInfo), hasModuleInfo = js.Any.fromFunction1(hasModuleInfo), insertModuleInfo = js.Any.fromFunction2(insertModuleInfo), removeModuleInfo = js.Any.fromFunction1(removeModuleInfo))
    __obj.asInstanceOf[XVBAModuleInfo]
  }
}

