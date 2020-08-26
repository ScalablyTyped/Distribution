package typings.activexLibreoffice.com_.sun.star.script.vba

import typings.activexLibreoffice.com_.sun.star.script.ModuleInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait XVBAModuleInfo extends js.Object {
  def getModuleInfo(ModuleName: String): ModuleInfo = js.native
  def hasModuleInfo(ModuleName: String): Boolean = js.native
  def insertModuleInfo(ModuleName: String, ModuleInfo: ModuleInfo): Unit = js.native
  def removeModuleInfo(ModuleName: String): Unit = js.native
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
  @scala.inline
  implicit class XVBAModuleInfoOps[Self <: XVBAModuleInfo] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetModuleInfo(value: String => ModuleInfo): Self = this.set("getModuleInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setHasModuleInfo(value: String => Boolean): Self = this.set("hasModuleInfo", js.Any.fromFunction1(value))
    @scala.inline
    def setInsertModuleInfo(value: (String, ModuleInfo) => Unit): Self = this.set("insertModuleInfo", js.Any.fromFunction2(value))
    @scala.inline
    def setRemoveModuleInfo(value: String => Unit): Self = this.set("removeModuleInfo", js.Any.fromFunction1(value))
  }
  
}

