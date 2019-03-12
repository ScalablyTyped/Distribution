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
  var DataBarEntries: stdLib.SafeArray[XDataBarEntry]
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
    DataBarEntries: stdLib.SafeArray[XDataBarEntry],
    MaximumLength: scala.Double,
    MinimumLength: scala.Double,
    NegativeColor: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.Color,
    ShowValue: scala.Boolean,
    Type: scala.Double,
    UseGradient: scala.Boolean,
    UseNegativeColor: scala.Boolean,
    acquire: () => scala.Unit,
    getType: () => scala.Double,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit
  ): DataBar = {
    val __obj = js.Dynamic.literal(AxisColor = AxisColor, AxisPosition = AxisPosition, Color = Color, DataBarEntries = DataBarEntries, MaximumLength = MaximumLength, MinimumLength = MinimumLength, NegativeColor = NegativeColor, ShowValue = ShowValue, Type = Type, UseGradient = UseGradient, UseNegativeColor = UseNegativeColor, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DataBar]
  }
}

