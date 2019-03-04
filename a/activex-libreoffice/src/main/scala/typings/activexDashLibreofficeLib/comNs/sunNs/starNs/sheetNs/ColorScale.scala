package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColorScale extends XConditionEntry {
  var ColorScaleEntries: activexDashInteropLib.SafeArray[XColorScaleEntry]
}

object ColorScale {
  @scala.inline
  def apply(
    ColorScaleEntries: activexDashInteropLib.SafeArray[XColorScaleEntry],
    Type: scala.Double,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): ColorScale = {
    val __obj = js.Dynamic.literal(ColorScaleEntries = ColorScaleEntries, Type = Type, acquire = acquire, getType = getType, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[ColorScale]
  }
}

