package typings
package amchartsLib.categoryaxessettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryAxesSettings extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
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
    * Height of category axes. Set it to 0 if you set inside property to true.
    * @default 28
    */
  var axisHeight: scala.Double
  /**
    * Thickness of the axis.
    */
  var axisThickness: scala.Double
  /**
    * Text color.
    */
  var color: java.lang.String
  /**
    * Length of a dash.
    */
  var dashLength: scala.Double
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
  var equalSpacing: scala.Boolean
  /**
    * Fill opacity. Every second space between grid lines can be filled with fillColor.
    */
  var fillAlpha: scala.Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: java.lang.String
  /**
    * Text size.
    */
  var fontSize: java.lang.String
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: scala.Double
  /**
    * Color of grid lines.
    */
  var gridColor: java.lang.String
  /**
    * Approximate number of grid lines.
    * You should set autoGridCount to false in order this property not to be ignored.
    * @default 10
    */
  var gridCount: scala.Double
  /**
    * Thickness of grid lines.
    */
  var gridThickness: scala.Double
  /**
    * Periods to which data will be gruoped in case there are more data items in
    * the selected period than specified in maxSeries property.
    * ["ss", "10ss", "30ss", "mm", "10mm", "30mm", "hh", "DD", "WW", "MM", "YYYY"]
    */
  var groupToPeriods: js.Array[_]
  /**
    * Specifies whether values should be placed inside or outside of plot area.
    */
  var inside: scala.Boolean
  /**
    * Rotation angle of a label.
    */
  var labelRotation: scala.Double
  /**
    * Maximum series shown at a time.
    * In case there are more data points in the selection than maxSeries,
    * the chart will group data to longer periods, for example - you have 250 days in the selection,
    * and maxSeries is 150 - the chart will group data to weeks.
    * @default 150
    */
  var maxSeries: scala.Double
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
  var minPeriod: java.lang.String
  /**
    * top or "bottom".
    */
  var position: java.lang.String
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * startOnAxis can be set to true only if equalSpacing is set to true.
    */
  var startOnAxis: scala.Boolean
  /**
    * Tick length.
    */
  var tickLength: scala.Double
}

object CategoryAxesSettings {
  @scala.inline
  def apply(
    autoGridCount: scala.Boolean,
    axisAlpha: scala.Double,
    axisColor: java.lang.String,
    axisHeight: scala.Double,
    axisThickness: scala.Double,
    color: java.lang.String,
    dashLength: scala.Double,
    dateFormats: js.Array[_],
    equalSpacing: scala.Boolean,
    fillAlpha: scala.Double,
    fillColor: java.lang.String,
    fontSize: java.lang.String,
    gridAlpha: scala.Double,
    gridColor: java.lang.String,
    gridCount: scala.Double,
    gridThickness: scala.Double,
    groupToPeriods: js.Array[_],
    inside: scala.Boolean,
    labelRotation: scala.Double,
    maxSeries: scala.Double,
    minPeriod: java.lang.String,
    position: java.lang.String,
    startOnAxis: scala.Boolean,
    tickLength: scala.Double
  ): CategoryAxesSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoGridCount")(autoGridCount)
    __obj.updateDynamic("axisAlpha")(axisAlpha)
    __obj.updateDynamic("axisColor")(axisColor)
    __obj.updateDynamic("axisHeight")(axisHeight)
    __obj.updateDynamic("axisThickness")(axisThickness)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("dashLength")(dashLength)
    __obj.updateDynamic("dateFormats")(dateFormats)
    __obj.updateDynamic("equalSpacing")(equalSpacing)
    __obj.updateDynamic("fillAlpha")(fillAlpha)
    __obj.updateDynamic("fillColor")(fillColor)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("gridAlpha")(gridAlpha)
    __obj.updateDynamic("gridColor")(gridColor)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("gridThickness")(gridThickness)
    __obj.updateDynamic("groupToPeriods")(groupToPeriods)
    __obj.updateDynamic("inside")(inside)
    __obj.updateDynamic("labelRotation")(labelRotation)
    __obj.updateDynamic("maxSeries")(maxSeries)
    __obj.updateDynamic("minPeriod")(minPeriod)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("startOnAxis")(startOnAxis)
    __obj.updateDynamic("tickLength")(tickLength)
    __obj.asInstanceOf[CategoryAxesSettings]
  }
}

