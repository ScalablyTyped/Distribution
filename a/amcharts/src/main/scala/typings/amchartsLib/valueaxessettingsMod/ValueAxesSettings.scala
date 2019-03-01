package typings
package amchartsLib.valueaxessettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValueAxesSettings extends js.Object {
  /**
    * Specifies whether number for gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: scala.Boolean
  /**
    * Axis opacity.
    */
  var axisAlpha: scala.Double
  /**
    * Axis color.
    */
  var axisColor: java.lang.String
  /**
    * Thickness of the axis.
    */
  var axisThickness: scala.Double
  /**
    * Label color.
    */
  var color: java.lang.String
  /**
    * Length of a dash. By default, the grid line is not dashed.
    */
  var dashLength: scala.Double
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    */
  var fillAlpha: scala.Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: java.lang.String
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: scala.Double
  /**
    * Color of grid lines.
    */
  var gridColor: java.lang.String
  /**
    * Approximate number of grid lines. autoGridCount should be set to false,
    * otherwise this property will be ignored.
    */
  var gridCount: scala.Double
  /**
    * Thickness of grid lines.
    */
  var gridThickness: scala.Double
  /**
    * Specifies whether guide values should be included when calculating min and max of the axis.
    */
  var includeGuidesInMinMax: scala.Boolean
  /**
    * If true, the axis will include hidden graphs when calculating min and max values.
    */
  var includeHidden: scala.Boolean
  /**
    * Specifies whether values should be placed inside or outside plot area.
    * In case you set this to false, you'll have to adjust marginLeft or marginRight in
    * [[PanelsSettings]] in order labels to be visible.
    * @default true
    */
  var inside: scala.Boolean
  /**
    * Specifies whether values on axis can only be integers or both integers and doubles.
    */
  var integersOnly: scala.Boolean
  /**
    * Frequency at which labels should be placed.
    */
  var labelFrequency: scala.Double
  /**
    * Specifies whether value labels are displayed.
    */
  var labelsEnabled: scala.Boolean
  /**
    * Set to true if value axis is logarithmic, false otherwise.
    */
  var logarithmic: scala.Boolean
  /**
    * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
    */
  var offset: scala.Double
  /**
    * Position of the value axis. Possible values are "left" and "right".
    */
  var position: java.lang.String
  /**
    * Set to true if value axis is reversed (smaller values on top), false otherwise.
    */
  var reversed: scala.Boolean
  /**
    * Specifies if first label of value axis should be displayed.
    */
  var showFirstLabel: scala.Boolean
  /**
    * Specifies if last label of value axis should be displayed.
    */
  var showLastLabel: scala.Boolean
  /**
    * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
    */
  var stackType: java.lang.String
  /**
    * Tick length.
    */
  var tickLength: scala.Double
  /**
    * Unit which will be added to the value label.
    */
  var unit: java.lang.String
  /**
    * Position of the unit. Possible values are "left" or "right".
    */
  var unitPosition: java.lang.String
}

object ValueAxesSettings {
  @scala.inline
  def apply(
    autoGridCount: scala.Boolean,
    axisAlpha: scala.Double,
    axisColor: java.lang.String,
    axisThickness: scala.Double,
    color: java.lang.String,
    dashLength: scala.Double,
    fillAlpha: scala.Double,
    fillColor: java.lang.String,
    gridAlpha: scala.Double,
    gridColor: java.lang.String,
    gridCount: scala.Double,
    gridThickness: scala.Double,
    includeGuidesInMinMax: scala.Boolean,
    includeHidden: scala.Boolean,
    inside: scala.Boolean,
    integersOnly: scala.Boolean,
    labelFrequency: scala.Double,
    labelsEnabled: scala.Boolean,
    logarithmic: scala.Boolean,
    offset: scala.Double,
    position: java.lang.String,
    reversed: scala.Boolean,
    showFirstLabel: scala.Boolean,
    showLastLabel: scala.Boolean,
    stackType: java.lang.String,
    tickLength: scala.Double,
    unit: java.lang.String,
    unitPosition: java.lang.String
  ): ValueAxesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoGridCount")(autoGridCount)
    __obj.updateDynamic("axisAlpha")(axisAlpha)
    __obj.updateDynamic("axisColor")(axisColor)
    __obj.updateDynamic("axisThickness")(axisThickness)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("dashLength")(dashLength)
    __obj.updateDynamic("fillAlpha")(fillAlpha)
    __obj.updateDynamic("fillColor")(fillColor)
    __obj.updateDynamic("gridAlpha")(gridAlpha)
    __obj.updateDynamic("gridColor")(gridColor)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("gridThickness")(gridThickness)
    __obj.updateDynamic("includeGuidesInMinMax")(includeGuidesInMinMax)
    __obj.updateDynamic("includeHidden")(includeHidden)
    __obj.updateDynamic("inside")(inside)
    __obj.updateDynamic("integersOnly")(integersOnly)
    __obj.updateDynamic("labelFrequency")(labelFrequency)
    __obj.updateDynamic("labelsEnabled")(labelsEnabled)
    __obj.updateDynamic("logarithmic")(logarithmic)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("reversed")(reversed)
    __obj.updateDynamic("showFirstLabel")(showFirstLabel)
    __obj.updateDynamic("showLastLabel")(showLastLabel)
    __obj.updateDynamic("stackType")(stackType)
    __obj.updateDynamic("tickLength")(tickLength)
    __obj.updateDynamic("unit")(unit)
    __obj.updateDynamic("unitPosition")(unitPosition)
    __obj.asInstanceOf[ValueAxesSettings]
  }
}

