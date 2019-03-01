package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.scriptNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModuleInfo extends js.Object {
  var ModuleObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  var ModuleType: scala.Double
}

object ModuleInfo {
  @scala.inline
  def apply(
    ModuleObject: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    ModuleType: scala.Double
  ): ModuleInfo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ModuleObject")(ModuleObject)
    __obj.updateDynamic("ModuleType")(ModuleType)
    __obj.asInstanceOf[ModuleInfo]
  }
}

