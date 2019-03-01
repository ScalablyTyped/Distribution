package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.accessibilityNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait XAccessibleGetAccFlowTo
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  def getAccFlowTo(aXShape: js.Any, nType: scala.Double): activexDashInteropLib.SafeArray[_]
}

object XAccessibleGetAccFlowTo {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    getAccFlowTo: js.Function2[js.Any, scala.Double, activexDashInteropLib.SafeArray[_]],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAccessibleGetAccFlowTo = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getAccFlowTo")(getAccFlowTo)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XAccessibleGetAccFlowTo]
  }
}

