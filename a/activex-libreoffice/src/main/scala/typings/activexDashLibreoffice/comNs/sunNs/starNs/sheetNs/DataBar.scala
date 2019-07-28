package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBar extends XConditionEntry {
  var AxisColor: Color
  /** See {@link com.sun.star.sheet.DataBarAxis} for possible values */
  var AxisPosition: Double
  var Color: typings.activexDashLibreoffice.comNs.sunNs.starNs.utilNs.Color
  var DataBarEntries: SafeArray[XDataBarEntry]
  /**
    * Maximum databar length in percent of cell width.
    *
    * Allowed values are (0, 1000) but larger than MinimumLength.
    */
  var MaximumLength: Double
  /**
    * Minimum databar length in percent of cell width.
    *
    * Allowed values are [0, 100) but smaller than MaximumLength.
    */
  var MinimumLength: Double
  var NegativeColor: Color
  var ShowValue: Boolean
  var UseGradient: Boolean
  var UseNegativeColor: Boolean
}

object DataBar {
  @scala.inline
  def apply(
    AxisColor: Color,
    AxisPosition: Double,
    Color: Color,
    DataBarEntries: SafeArray[XDataBarEntry],
    MaximumLength: Double,
    MinimumLength: Double,
    NegativeColor: Color,
    ShowValue: Boolean,
    Type: Double,
    UseGradient: Boolean,
    UseNegativeColor: Boolean,
    acquire: () => Unit,
    getType: () => Double,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): DataBar = {
    val __obj = js.Dynamic.literal(AxisColor = AxisColor, AxisPosition = AxisPosition, Color = Color, DataBarEntries = DataBarEntries, MaximumLength = MaximumLength, MinimumLength = MinimumLength, NegativeColor = NegativeColor, ShowValue = ShowValue, Type = Type, UseGradient = UseGradient, UseNegativeColor = UseNegativeColor, acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[DataBar]
  }
}

