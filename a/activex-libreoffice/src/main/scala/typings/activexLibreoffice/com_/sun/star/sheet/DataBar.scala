package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.util.Color
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataBar extends XConditionEntry {
  var AxisColor: Color
  /** See {@link com.sun.star.sheet.DataBarAxis} for possible values */
  var AxisPosition: Double
  var Color: typings.activexLibreoffice.com_.sun.star.util.Color
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
    val __obj = js.Dynamic.literal(AxisColor = AxisColor.asInstanceOf[js.Any], AxisPosition = AxisPosition.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], DataBarEntries = DataBarEntries.asInstanceOf[js.Any], MaximumLength = MaximumLength.asInstanceOf[js.Any], MinimumLength = MinimumLength.asInstanceOf[js.Any], NegativeColor = NegativeColor.asInstanceOf[js.Any], ShowValue = ShowValue.asInstanceOf[js.Any], Type = Type.asInstanceOf[js.Any], UseGradient = UseGradient.asInstanceOf[js.Any], UseNegativeColor = UseNegativeColor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getType = js.Any.fromFunction0(getType), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[DataBar]
  }
}

