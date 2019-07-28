package typings.activexDashLibreoffice.comNs.sunNs.starNs.scriptNs

import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  var ModuleObject: XInterface
  var ModuleType: Double
}

object ModuleInfo {
  @scala.inline
  def apply(ModuleObject: XInterface, ModuleType: Double): ModuleInfo = {
    val __obj = js.Dynamic.literal(ModuleObject = ModuleObject, ModuleType = ModuleType)
  
    __obj.asInstanceOf[ModuleInfo]
  }
}

