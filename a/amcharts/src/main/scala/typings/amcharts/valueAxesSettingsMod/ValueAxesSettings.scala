package typings.amcharts.valueAxesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxesSettings extends js.Object {
  /**
    * Specifies whether number for gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: Boolean
  /**
    * Axis opacity.
    */
  var axisAlpha: Double
  /**
    * Axis color.
    */
  var axisColor: String
  /**
    * Thickness of the axis.
    */
  var axisThickness: Double
  /**
    * Label color.
    */
  var color: String
  /**
    * Length of a dash. By default, the grid line is not dashed.
    */
  var dashLength: Double
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    */
  var fillAlpha: Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: String
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: Double
  /**
    * Color of grid lines.
    */
  var gridColor: String
  /**
    * Approximate number of grid lines. autoGridCount should be set to false,
    * otherwise this property will be ignored.
    */
  var gridCount: Double
  /**
    * Thickness of grid lines.
    */
  var gridThickness: Double
  /**
    * Specifies whether guide values should be included when calculating min and max of the axis.
    */
  var includeGuidesInMinMax: Boolean
  /**
    * If true, the axis will include hidden graphs when calculating min and max values.
    */
  var includeHidden: Boolean
  /**
    * Specifies whether values should be placed inside or outside plot area.
    * In case you set this to false, you'll have to adjust marginLeft or marginRight in
    * [[PanelsSettings]] in order labels to be visible.
    * @default true
    */
  var inside: Boolean
  /**
    * Specifies whether values on axis can only be integers or both integers and doubles.
    */
  var integersOnly: Boolean
  /**
    * Frequency at which labels should be placed.
    */
  var labelFrequency: Double
  /**
    * Specifies whether value labels are displayed.
    */
  var labelsEnabled: Boolean
  /**
    * Set to true if value axis is logarithmic, false otherwise.
    */
  var logarithmic: Boolean
  /**
    * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
    */
  var offset: Double
  /**
    * Position of the value axis. Possible values are "left" and "right".
    */
  var position: String
  /**
    * Set to true if value axis is reversed (smaller values on top), false otherwise.
    */
  var reversed: Boolean
  /**
    * Specifies if first label of value axis should be displayed.
    */
  var showFirstLabel: Boolean
  /**
    * Specifies if last label of value axis should be displayed.
    */
  var showLastLabel: Boolean
  /**
    * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
    */
  var stackType: String
  /**
    * Tick length.
    */
  var tickLength: Double
  /**
    * Unit which will be added to the value label.
    */
  var unit: String
  /**
    * Position of the unit. Possible values are "left" or "right".
    */
  var unitPosition: String
}

object ValueAxesSettings {
  @scala.inline
  def apply(
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    color: String,
    dashLength: Double,
    fillAlpha: Double,
    fillColor: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridThickness: Double,
    includeGuidesInMinMax: Boolean,
    includeHidden: Boolean,
    inside: Boolean,
    integersOnly: Boolean,
    labelFrequency: Double,
    labelsEnabled: Boolean,
    logarithmic: Boolean,
    offset: Double,
    position: String,
    reversed: Boolean,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    stackType: String,
    tickLength: Double,
    unit: String,
    unitPosition: String
  ): ValueAxesSettings = {
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount, axisAlpha = axisAlpha, axisColor = axisColor, axisThickness = axisThickness, color = color, dashLength = dashLength, fillAlpha = fillAlpha, fillColor = fillColor, gridAlpha = gridAlpha, gridColor = gridColor, gridCount = gridCount, gridThickness = gridThickness, includeGuidesInMinMax = includeGuidesInMinMax, includeHidden = includeHidden, inside = inside, integersOnly = integersOnly, labelFrequency = labelFrequency, labelsEnabled = labelsEnabled, logarithmic = logarithmic, offset = offset, position = position, reversed = reversed, showFirstLabel = showFirstLabel, showLastLabel = showLastLabel, stackType = stackType, tickLength = tickLength, unit = unit, unitPosition = unitPosition)
  
    __obj.asInstanceOf[ValueAxesSettings]
  }
}

