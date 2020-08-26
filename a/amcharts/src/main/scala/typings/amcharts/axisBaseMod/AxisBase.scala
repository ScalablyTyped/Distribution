package typings.amcharts.axisBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AxisBase extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    * @default true
    */
  var autoGridCount: Boolean = js.native
  /**
    * Axis opacity. Value range is 0 - 1.
    * @default 1
    */
  var axisAlpha: Double = js.native
  /**
    * Axis color.  #000000
    */
  var axisColor: String = js.native
  /**
    * Thickness of the axis.
    * @default 1
    */
  var axisThickness: Double = js.native
  /**
    * Color of axis value labels. Will use chart's color if not set.
    */
  var color: String = js.native
  /**
    * Length of a dash. 0 means line is not dashed.
    */
  var dashLength: Double = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillAlpha: Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    * @default "#FFFFFF"
    */
  var fillColor: String = js.native
  /**
    * Size of value labels text. Will use chart's fontSize if not set.
    */
  var fontSize: String = js.native
  /**
    * Opacity of grid lines. 0.2
    */
  var gridAlpha: Double = js.native
  /**
    * Color of grid lines. #000000
    */
  var gridColor: String = js.native
  /**
    * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
    * the number is approximate. The default value is 5. If you set autoGridCount to true,
    * this property is ignored.
    * @default 5
    */
  var gridCount: Double = js.native
  /**
    * Thickness of grid lines.
    * @default 1
    */
  var gridThickness: Double = js.native
  /**
    * The array of guides belonging to this axis.
    */
  var guides: js.Array[_] = js.native
  /**
    * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
    * set ignoreAxisWidth to true.
    */
  var ignoreAxisWidth: Boolean = js.native
  /**
    * Specifies whether values should be placed inside or outside plot area.
    */
  var inside: Boolean = js.native
  /**
    * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
    * @default 1
    */
  var labelFrequency: Double = js.native
  /**
    * Rotation angle of a label. Only horizontal axis' values can be rotated.
    * If you set this for vertical axis, the setting will be ignored.
    */
  var labelRotation: Double = js.native
  /**
    * Specifies whether axis displays category axis' labels and value axis' values.
    * @default true
    */
  var labelsEnabled: Boolean = js.native
  /**
    * The distance of the axis to the plot area, in pixels. Negative values can also be used.
    */
  var offset: Double = js.native
  /**
    * Possible values are: "top", "bottom", "left", "right".
    * If axis is vertical, default position is "left".
    * If axis is horizontal, default position is "bottom".
    */
  var position: String = js.native
  /**
    * Whether to show first axis label or not.
    * @default true
    */
  var showFirstLabel: Boolean = js.native
  /**
    * Whether to show last axis label or not.
    * @default true
    */
  var showLastLabel: Boolean = js.native
  /**
    * Length of the tick marks.
    * @default 5
    */
  var tickLength: Double = js.native
  /**
    * Title of the axis.
    */
  var title: String = js.native
  /**
    * Specifies if title should be bold or not.
    * @default true
    */
  var titleBold: Boolean = js.native
  /**
    * Color of axis title. Will use text color of chart if not set any.
    */
  var titleColor: String = js.native
  /**
    * Font size of axis title. Will use font size of chart plus two pixels if not set any.
    */
  var titlefontSize: String = js.native
  /**
    * Adds guide to the axis.
    */
  def addGuide(guide: typings.amcharts.guideMod.default): Unit = js.native
  /**
    * Removes guide from the axis.
    */
  def removeGuide(guide: typings.amcharts.guideMod.default): Unit = js.native
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
  @scala.inline
  implicit class AxisBaseOps[Self <: AxisBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAddGuide(value: typings.amcharts.guideMod.default => Unit): Self = this.set("addGuide", js.Any.fromFunction1(value))
    @scala.inline
    def setAutoGridCount(value: Boolean): Self = this.set("autoGridCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisAlpha(value: Double): Self = this.set("axisAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisColor(value: String): Self = this.set("axisColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setAxisThickness(value: Double): Self = this.set("axisThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashLength(value: Double): Self = this.set("dashLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridAlpha(value: Double): Self = this.set("gridAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridColor(value: String): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridCount(value: Double): Self = this.set("gridCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridThickness(value: Double): Self = this.set("gridThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setGuidesVarargs(value: js.Any*): Self = this.set("guides", js.Array(value :_*))
    @scala.inline
    def setGuides(value: js.Array[_]): Self = this.set("guides", value.asInstanceOf[js.Any])
    @scala.inline
    def setIgnoreAxisWidth(value: Boolean): Self = this.set("ignoreAxisWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelFrequency(value: Double): Self = this.set("labelFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelRotation(value: Double): Self = this.set("labelRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsEnabled(value: Boolean): Self = this.set("labelsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setRemoveGuide(value: typings.amcharts.guideMod.default => Unit): Self = this.set("removeGuide", js.Any.fromFunction1(value))
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = this.set("showFirstLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowLastLabel(value: Boolean): Self = this.set("showLastLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleBold(value: Boolean): Self = this.set("titleBold", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitleColor(value: String): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setTitlefontSize(value: String): Self = this.set("titlefontSize", value.asInstanceOf[js.Any])
  }
  
}

