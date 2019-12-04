package typings.amcharts.categoryAxesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryAxesSettings extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
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
    * Height of category axes. Set it to 0 if you set inside property to true.
    * @default 28
    */
  var axisHeight: Double
  /**
    * Thickness of the axis.
    */
  var axisThickness: Double
  /**
    * Text color.
    */
  var color: String
  /**
    * Length of a dash.
    */
  var dashLength: Double
  /**
    * Date formats of different periods.
    * Possible period values:
    * fff - milliseconds,
    * ss - seconds,
    * mm - minutes,
    * hh - hours,
    * DD - days,
    * MM - months,
    * WW - weeks,
    * YYYY - years
    * Check this page for date formatting strings.
    */
  var dateFormats: js.Array[_]
  /**
    * If you want data points to be placed at equal intervals (omiting dates with no data),
    * set equalSpacing to true.
    */
  var equalSpacing: Boolean
  /**
    * Fill opacity. Every second space between grid lines can be filled with fillColor.
    */
  var fillAlpha: Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: String
  /**
    * Text size.
    */
  var fontSize: String
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: Double
  /**
    * Color of grid lines.
    */
  var gridColor: String
  /**
    * Approximate number of grid lines.
    * You should set autoGridCount to false in order this property not to be ignored.
    * @default 10
    */
  var gridCount: Double
  /**
    * Thickness of grid lines.
    */
  var gridThickness: Double
  /**
    * Periods to which data will be gruoped in case there are more data items in
    * the selected period than specified in maxSeries property.
    * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
    */
  var groupToPeriods: js.Array[_]
  /**
    * Specifies whether values should be placed inside or outside of plot area.
    */
  var inside: Boolean
  /**
    * Rotation angle of a label.
    */
  var labelRotation: Double
  /**
    * Maximum series shown at a time.
    * In case there are more data points in the selection than maxSeries,
    * the chart will group data to longer periods, for example - you have 250 days in the selection,
    * and maxSeries is 150 - the chart will group data to weeks.
    * @default 150
    */
  var maxSeries: Double
  /**
    * Specifies the shortest period of your data.
    * fff - millisecond,
    * ss - second,
    * mm - minute,
    * hh - hour,
    * DD - day,
    * MM - month,
    * YYYY - year
    * @default "DD"
    */
  var minPeriod: String
  /**
    * top or "bottom".
    */
  var position: String
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * startOnAxis can be set to true only if equalSpacing is set to true.
    */
  var startOnAxis: Boolean
  /**
    * Tick length.
    */
  var tickLength: Double
}

object CategoryAxesSettings {
  @scala.inline
  def apply(
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisHeight: Double,
    axisThickness: Double,
    color: String,
    dashLength: Double,
    dateFormats: js.Array[_],
    equalSpacing: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridThickness: Double,
    groupToPeriods: js.Array[_],
    inside: Boolean,
    labelRotation: Double,
    maxSeries: Double,
    minPeriod: String,
    position: String,
    startOnAxis: Boolean,
    tickLength: Double
  ): CategoryAxesSettings = {
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisHeight = axisHeight.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], dateFormats = dateFormats.asInstanceOf[js.Any], equalSpacing = equalSpacing.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], groupToPeriods = groupToPeriods.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], maxSeries = maxSeries.asInstanceOf[js.Any], minPeriod = minPeriod.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], startOnAxis = startOnAxis.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CategoryAxesSettings]
  }
}

