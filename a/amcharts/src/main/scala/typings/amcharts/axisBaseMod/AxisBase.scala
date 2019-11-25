package typings.amcharts.axisBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AxisBase extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    * @default true
    */
  var autoGridCount: Boolean
  /**
    * Axis opacity. Value range is 0 - 1.
    * @default 1
    */
  var axisAlpha: Double
  /**
    * Axis color.  #000000
    */
  var axisColor: String
  /**
    * Thickness of the axis.
    * @default 1
    */
  var axisThickness: Double
  /**
    * Color of axis value labels. Will use chart's color if not set.
    */
  var color: String
  /**
    * Length of a dash. 0 means line is not dashed.
    */
  var dashLength: Double
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillAlpha: Double
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    * @default "#FFFFFF"
    */
  var fillColor: String
  /**
    * Size of value labels text. Will use chart's fontSize if not set.
    */
  var fontSize: String
  /**
    * Opacity of grid lines. 0.2
    */
  var gridAlpha: Double
  /**
    * Color of grid lines. #000000
    */
  var gridColor: String
  /**
    * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
    * the number is approximate. The default value is 5. If you set autoGridCount to true,
    * this property is ignored.
    * @default 5
    */
  var gridCount: Double
  /**
    * Thickness of grid lines.
    * @default 1
    */
  var gridThickness: Double
  /**
    * The array of guides belonging to this axis.
    */
  var guides: js.Array[_]
  /**
    * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
    * set ignoreAxisWidth to true.
    */
  var ignoreAxisWidth: Boolean
  /**
    * Specifies whether values should be placed inside or outside plot area.
    */
  var inside: Boolean
  /**
    * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
    * @default 1
    */
  var labelFrequency: Double
  /**
    * Rotation angle of a label. Only horizontal axis' values can be rotated.
    * If you set this for vertical axis, the setting will be ignored.
    */
  var labelRotation: Double
  /**
    * Specifies whether axis displays category axis' labels and value axis' values.
    * @default true
    */
  var labelsEnabled: Boolean
  /**
    * The distance of the axis to the plot area, in pixels. Negative values can also be used.
    */
  var offset: Double
  /**
    * Possible values are: "top", "bottom", "left", "right".
    * If axis is vertical, default position is "left".
    * If axis is horizontal, default position is "bottom".
    */
  var position: String
  /**
    * Whether to show first axis label or not.
    * @default true
    */
  var showFirstLabel: Boolean
  /**
    * Whether to show last axis label or not.
    * @default true
    */
  var showLastLabel: Boolean
  /**
    * Length of the tick marks.
    * @default 5
    */
  var tickLength: Double
  /**
    * Title of the axis.
    */
  var title: String
  /**
    * Specifies if title should be bold or not.
    * @default true
    */
  var titleBold: Boolean
  /**
    * Color of axis title. Will use text color of chart if not set any.
    */
  var titleColor: String
  /**
    * Font size of axis title. Will use font size of chart plus two pixels if not set any.
    */
  var titlefontSize: String
  /**
    * Adds guide to the axis.
    */
  def addGuide(guide: typings.amcharts.guideMod.default): Unit
  /**
    * Removes guide from the axis.
    */
  def removeGuide(guide: typings.amcharts.guideMod.default): Unit
}

object AxisBase {
  @scala.inline
  def apply(
    addGuide: typings.amcharts.guideMod.default => Unit,
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    color: String,
    dashLength: Double,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridThickness: Double,
    guides: js.Array[_],
    ignoreAxisWidth: Boolean,
    inside: Boolean,
    labelFrequency: Double,
    labelRotation: Double,
    labelsEnabled: Boolean,
    offset: Double,
    position: String,
    removeGuide: typings.amcharts.guideMod.default => Unit,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    tickLength: Double,
    title: String,
    titleBold: Boolean,
    titleColor: String,
    titlefontSize: String
  ): AxisBase = {
    val __obj = js.Dynamic.literal(addGuide = js.Any.fromFunction1(addGuide), autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], guides = guides.asInstanceOf[js.Any], ignoreAxisWidth = ignoreAxisWidth.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], removeGuide = js.Any.fromFunction1(removeGuide), showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], titleBold = titleBold.asInstanceOf[js.Any], titleColor = titleColor.asInstanceOf[js.Any], titlefontSize = titlefontSize.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AxisBase]
  }
}

