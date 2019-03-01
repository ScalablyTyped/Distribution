package typings
package amchartsLib.axisbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisBase extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    * @default true
    */
  var autoGridCount: scala.Boolean
  /**
    * Axis opacity. Value range is 0 - 1.
    * @default 1
    */
  var axisAlpha: scala.Double
  /**
    * Axis color.  #000000
    */
  var axisColor: java.lang.String
  /**
    * Thickness of the axis.
    * @default 1
    */
  var axisThickness: scala.Double
  /**
    * Color of axis value labels. Will use chart's color if not set.
    */
  var color: java.lang.String
  /**
    * Length of a dash. 0 means line is not dashed.
    */
  var dashLength: scala.Double
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillAlpha: scala.Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    * @default "#FFFFFF"
    */
  var fillColor: java.lang.String
  /**
    * Size of value labels text. Will use chart's fontSize if not set.
    */
  var fontSize: java.lang.String
  /**
    * Opacity of grid lines. 0.2
    */
  var gridAlpha: scala.Double
  /**
    * Color of grid lines. #000000
    */
  var gridColor: java.lang.String
  /**
    * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
    * the number is approximate. The default value is 5. If you set autoGridCount to true,
    * this property is ignored.
    * @default 5
    */
  var gridCount: scala.Double
  /**
    * Thickness of grid lines.
    * @default 1
    */
  var gridThickness: scala.Double
  /**
    * The array of guides belonging to this axis.
    */
  var guides: js.Array[_]
  /**
    * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
    * set ignoreAxisWidth to true.
    */
  var ignoreAxisWidth: scala.Boolean
  /**
    * Specifies whether values should be placed inside or outside plot area.
    */
  var inside: scala.Boolean
  /**
    * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
    * @default 1
    */
  var labelFrequency: scala.Double
  /**
    * Rotation angle of a label. Only horizontal axis' values can be rotated.
    * If you set this for vertical axis, the setting will be ignored.
    */
  var labelRotation: scala.Double
  /**
    * Specifies whether axis displays category axis' labels and value axis' values.
    * @default true
    */
  var labelsEnabled: scala.Boolean
  /**
    * The distance of the axis to the plot area, in pixels. Negative values can also be used.
    */
  var offset: scala.Double
  /**
    * Possible values are: "top", "bottom", "left", "right".
    * If axis is vertical, default position is "left".
    * If axis is horizontal, default position is "bottom".
    */
  var position: java.lang.String
  /**
    * Whether to show first axis label or not.
    * @default true
    */
  var showFirstLabel: scala.Boolean
  /**
    * Whether to show last axis label or not.
    * @default true
    */
  var showLastLabel: scala.Boolean
  /**
    * Length of the tick marks.
    * @default 5
    */
  var tickLength: scala.Double
  /**
    * Title of the axis.
    */
  var title: java.lang.String
  /**
    * Specifies if title should be bold or not.
    * @default true
    */
  var titleBold: scala.Boolean
  /**
    * Color of axis title. Will use text color of chart if not set any.
    */
  var titleColor: java.lang.String
  /**
    * Font size of axis title. Will use font size of chart plus two pixels if not set any.
    */
  var titlefontSize: java.lang.String
  /**
    * Adds guide to the axis.
    */
  def addGuide(guide: amchartsLib.guideMod.default): scala.Unit
  /**
    * Removes guide from the axis.
    */
  def removeGuide(guide: amchartsLib.guideMod.default): scala.Unit
}

object AxisBase {
  @scala.inline
  def apply(
    addGuide: js.Function1[amchartsLib.guideMod.default, scala.Unit],
    autoGridCount: scala.Boolean,
    axisAlpha: scala.Double,
    axisColor: java.lang.String,
    axisThickness: scala.Double,
    color: java.lang.String,
    dashLength: scala.Double,
    fillAlpha: scala.Double,
    fillColor: java.lang.String,
    fontSize: java.lang.String,
    gridAlpha: scala.Double,
    gridColor: java.lang.String,
    gridCount: scala.Double,
    gridThickness: scala.Double,
    guides: js.Array[_],
    ignoreAxisWidth: scala.Boolean,
    inside: scala.Boolean,
    labelFrequency: scala.Double,
    labelRotation: scala.Double,
    labelsEnabled: scala.Boolean,
    offset: scala.Double,
    position: java.lang.String,
    removeGuide: js.Function1[amchartsLib.guideMod.default, scala.Unit],
    showFirstLabel: scala.Boolean,
    showLastLabel: scala.Boolean,
    tickLength: scala.Double,
    title: java.lang.String,
    titleBold: scala.Boolean,
    titleColor: java.lang.String,
    titlefontSize: java.lang.String
  ): AxisBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addGuide")(addGuide)
    __obj.updateDynamic("autoGridCount")(autoGridCount)
    __obj.updateDynamic("axisAlpha")(axisAlpha)
    __obj.updateDynamic("axisColor")(axisColor)
    __obj.updateDynamic("axisThickness")(axisThickness)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("dashLength")(dashLength)
    __obj.updateDynamic("fillAlpha")(fillAlpha)
    __obj.updateDynamic("fillColor")(fillColor)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("gridAlpha")(gridAlpha)
    __obj.updateDynamic("gridColor")(gridColor)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("gridThickness")(gridThickness)
    __obj.updateDynamic("guides")(guides)
    __obj.updateDynamic("ignoreAxisWidth")(ignoreAxisWidth)
    __obj.updateDynamic("inside")(inside)
    __obj.updateDynamic("labelFrequency")(labelFrequency)
    __obj.updateDynamic("labelRotation")(labelRotation)
    __obj.updateDynamic("labelsEnabled")(labelsEnabled)
    __obj.updateDynamic("offset")(offset)
    __obj.updateDynamic("position")(position)
    __obj.updateDynamic("removeGuide")(removeGuide)
    __obj.updateDynamic("showFirstLabel")(showFirstLabel)
    __obj.updateDynamic("showLastLabel")(showLastLabel)
    __obj.updateDynamic("tickLength")(tickLength)
    __obj.updateDynamic("title")(title)
    __obj.updateDynamic("titleBold")(titleBold)
    __obj.updateDynamic("titleColor")(titleColor)
    __obj.updateDynamic("titlefontSize")(titlefontSize)
    __obj.asInstanceOf[AxisBase]
  }
}

