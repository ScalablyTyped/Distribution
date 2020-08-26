package typings.amcharts.valueAxesSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ValueAxesSettings extends js.Object {
  /**
    * Specifies whether number for gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: Boolean = js.native
  /**
    * Axis opacity.
    */
  var axisAlpha: Double = js.native
  /**
    * Axis color.
    */
  var axisColor: String = js.native
  /**
    * Thickness of the axis.
    */
  var axisThickness: Double = js.native
  /**
    * Label color.
    */
  var color: String = js.native
  /**
    * Length of a dash. By default, the grid line is not dashed.
    */
  var dashLength: Double = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    */
  var fillAlpha: Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  var fillColor: String = js.native
  /**
    * Opacity of grid lines.
    */
  var gridAlpha: Double = js.native
  /**
    * Color of grid lines.
    */
  var gridColor: String = js.native
  /**
    * Approximate number of grid lines. autoGridCount should be set to false,
    * otherwise this property will be ignored.
    */
  var gridCount: Double = js.native
  /**
    * Thickness of grid lines.
    */
  var gridThickness: Double = js.native
  /**
    * Specifies whether guide values should be included when calculating min and max of the axis.
    */
  var includeGuidesInMinMax: Boolean = js.native
  /**
    * If true, the axis will include hidden graphs when calculating min and max values.
    */
  var includeHidden: Boolean = js.native
  /**
    * Specifies whether values should be placed inside or outside plot area.
    * In case you set this to false, you'll have to adjust marginLeft or marginRight in
    * [[PanelsSettings]] in order labels to be visible.
    * @default true
    */
  var inside: Boolean = js.native
  /**
    * Specifies whether values on axis can only be integers or both integers and doubles.
    */
  var integersOnly: Boolean = js.native
  /**
    * Frequency at which labels should be placed.
    */
  var labelFrequency: Double = js.native
  /**
    * Specifies whether value labels are displayed.
    */
  var labelsEnabled: Boolean = js.native
  /**
    * Set to true if value axis is logarithmic, false otherwise.
    */
  var logarithmic: Boolean = js.native
  /**
    * The distance of the axis to the plot area, in pixels. Useful if you have more then one axis on the same side.
    */
  var offset: Double = js.native
  /**
    * Position of the value axis. Possible values are "left" and "right".
    */
  var position: String = js.native
  /**
    * Set to true if value axis is reversed (smaller values on top), false otherwise.
    */
  var reversed: Boolean = js.native
  /**
    * Specifies if first label of value axis should be displayed.
    */
  var showFirstLabel: Boolean = js.native
  /**
    * Specifies if last label of value axis should be displayed.
    */
  var showLastLabel: Boolean = js.native
  /**
    * Stacking mode of the axis. Possible values are: "none", "regular", "100%", "3d".
    */
  var stackType: String = js.native
  /**
    * Tick length.
    */
  var tickLength: Double = js.native
  /**
    * Unit which will be added to the value label.
    */
  var unit: String = js.native
  /**
    * Position of the unit. Possible values are "left" or "right".
    */
  var unitPosition: String = js.native
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
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], axisAlpha = axisAlpha.asInstanceOf[js.Any], axisColor = axisColor.asInstanceOf[js.Any], axisThickness = axisThickness.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], gridThickness = gridThickness.asInstanceOf[js.Any], includeGuidesInMinMax = includeGuidesInMinMax.asInstanceOf[js.Any], includeHidden = includeHidden.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], integersOnly = integersOnly.asInstanceOf[js.Any], labelFrequency = labelFrequency.asInstanceOf[js.Any], labelsEnabled = labelsEnabled.asInstanceOf[js.Any], logarithmic = logarithmic.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reversed = reversed.asInstanceOf[js.Any], showFirstLabel = showFirstLabel.asInstanceOf[js.Any], showLastLabel = showLastLabel.asInstanceOf[js.Any], stackType = stackType.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], unit = unit.asInstanceOf[js.Any], unitPosition = unitPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueAxesSettings]
  }
  @scala.inline
  implicit class ValueAxesSettingsOps[Self <: ValueAxesSettings] (val x: Self) extends AnyVal {
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
    def setGridAlpha(value: Double): Self = this.set("gridAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridColor(value: String): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridCount(value: Double): Self = this.set("gridCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setGridThickness(value: Double): Self = this.set("gridThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeGuidesInMinMax(value: Boolean): Self = this.set("includeGuidesInMinMax", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeHidden(value: Boolean): Self = this.set("includeHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    @scala.inline
    def setIntegersOnly(value: Boolean): Self = this.set("integersOnly", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelFrequency(value: Double): Self = this.set("labelFrequency", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelsEnabled(value: Boolean): Self = this.set("labelsEnabled", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogarithmic(value: Boolean): Self = this.set("logarithmic", value.asInstanceOf[js.Any])
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowFirstLabel(value: Boolean): Self = this.set("showFirstLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setShowLastLabel(value: Boolean): Self = this.set("showLastLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setStackType(value: String): Self = this.set("stackType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnit(value: String): Self = this.set("unit", value.asInstanceOf[js.Any])
    @scala.inline
    def setUnitPosition(value: String): Self = this.set("unitPosition", value.asInstanceOf[js.Any])
  }
  
}

