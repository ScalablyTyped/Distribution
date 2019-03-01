package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.officeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @since LibreOffice 4.2 */
trait Quickstart
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XFastPropertySet {
  /** The first two parameters are ignored */
  def createAndSetVeto(p1: scala.Boolean, p2: scala.Boolean, DisableVeto: scala.Boolean): scala.Unit
  def createAutoStart(bQuickstart: scala.Boolean, bAutostart: scala.Boolean): scala.Unit
  def createDefault(): scala.Unit
  def createStart(bQuickstart: scala.Boolean): scala.Unit
}

object Quickstart {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    createAndSetVeto: js.Function3[scala.Boolean, scala.Boolean, scala.Boolean, scala.Unit],
    createAutoStart: js.Function2[scala.Boolean, scala.Boolean, scala.Unit],
    createDefault: js.Function0[scala.Unit],
    createStart: js.Function1[scala.Boolean, scala.Unit],
    getFastPropertyValue: js.Function1[scala.Double, js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFastPropertyValue: js.Function2[scala.Double, js.Any, scala.Unit]
  ): Quickstart = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("createAndSetVeto")(createAndSetVeto)
    __obj.updateDynamic("createAutoStart")(createAutoStart)
    __obj.updateDynamic("createDefault")(createDefault)
    __obj.updateDynamic("createStart")(createStart)
    __obj.updateDynamic("getFastPropertyValue")(getFastPropertyValue)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setFastPropertyValue")(setFastPropertyValue)
    __obj.asInstanceOf[Quickstart]
  }
}

