package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBar extends XConditionEntry {
  var AxisColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  /** See {@link com.sun.star.sheet.DataBarAxis} for possible values */
  var AxisPosition: scala.Double
  var Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var DataBarEntries: activexDashInteropLib.SafeArray[XDataBarEntry]
  /**
    * Maximum databar length in percent of cell width.
    *
    * Allowed values are (0, 1000) but larger than MinimumLength.
    */
  var MaximumLength: scala.Double
  /**
    * Minimum databar length in percent of cell width.
    *
    * Allowed values are [0, 100) but smaller than MaximumLength.
    */
  var MinimumLength: scala.Double
  var NegativeColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color
  var ShowValue: scala.Boolean
  var UseGradient: scala.Boolean
  var UseNegativeColor: scala.Boolean
}

object DataBar {
  @scala.inline
  def apply(
    AxisColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    AxisPosition: scala.Double,
    Color: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    DataBarEntries: activexDashInteropLib.SafeArray[XDataBarEntry],
    MaximumLength: scala.Double,
    MinimumLength: scala.Double,
    NegativeColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ShowValue: scala.Boolean,
    Type: scala.Double,
    UseGradient: scala.Boolean,
    UseNegativeColor: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    getType: js.Function0[scala.Double],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): DataBar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("AxisColor")(AxisColor)
    __obj.updateDynamic("AxisPosition")(AxisPosition)
    __obj.updateDynamic("Color")(Color)
    __obj.updateDynamic("DataBarEntries")(DataBarEntries)
    __obj.updateDynamic("MaximumLength")(MaximumLength)
    __obj.updateDynamic("MinimumLength")(MinimumLength)
    __obj.updateDynamic("NegativeColor")(NegativeColor)
    __obj.updateDynamic("ShowValue")(ShowValue)
    __obj.updateDynamic("Type")(Type)
    __obj.updateDynamic("UseGradient")(UseGradient)
    __obj.updateDynamic("UseNegativeColor")(UseNegativeColor)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getType")(getType)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[DataBar]
  }
}

