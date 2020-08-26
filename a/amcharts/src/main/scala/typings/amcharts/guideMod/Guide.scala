package typings.amcharts.guideMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Guide extends js.Object {
  /**
    * If you set it to true, the guide will be displayed above the graphs.
    */
  var above: Boolean = js.native
  /**
    * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
    */
  var angle: Double = js.native
  /**
    * Baloon fill color.
    */
  var balloonColor: String = js.native
  /**
    * The text which will be displayed if the user rolls-over the guide.
    */
  var balloonText: String = js.native
  /**
    * Specifies if label should be bold or not.
    */
  var boldLabel: Boolean = js.native
  /**
    * Category of the guide (in case the guide is for category axis).
    */
  var category: String = js.native
  /**
    * Dash length.
    */
  var dashLength: Double = js.native
  /**
    * Date of the guide (in case the guide is for category axis and parseDates is set to true).
    */
  var date: Date = js.native
  /**
    * Works if a guide is added to CategoryAxis and this axis is non-date-based.
    * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
    * beginning of the category cell and will end at the end of toCategory cell.
    */
  var expand: Boolean = js.native
  /**
    * Fill opacity. Value range is 0 - 1.
    */
  var fillAlpha: Double = js.native
  /**
    * Fill color.
    */
  var fillColor: String = js.native
  /**
    * Font size of guide label.
    */
  var fontSize: String = js.native
  /**
    * Unique id of a Guide. You don't need to set it, unless you want to.
    */
  var id: String = js.native
  /**
    * Specifies whether label should be placed inside or outside plot area.
    */
  var inside: Boolean = js.native
  /**
    * The label which will be displayed near the guide.
    */
  var label: String = js.native
  /**
    * Rotation angle of a guide label.
    */
  var labelRotation: Double = js.native
  /**
    * Line opacity.
    */
  var lineAlpha: Double = js.native
  /**
    * Line color.
    */
  var lineColor: String = js.native
  /**
    * Line thickness.
    */
  var lineThickness: Double = js.native
  /**
    * Position of guide label. Possible values are "left" or "right" for horizontal axis
    * and "top" or "bottom" for vertical axis.
    */
  var position: String = js.native
  /**
    * Tick length.
    */
  var tickLength: Double = js.native
  /**
    * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
    */
  var toAngle: Double = js.native
  /**
    * To category of the guide (in case the guide is for category axis).
    */
  var toCategory: String = js.native
  /**
    * To date of the guide (in case the guide is for category axis and parseDates is set to true).
    * If you have both date and toDate, the space between these two dates can be filled with color.
    */
  var toDate: Date = js.native
  /**
    * To value of the guide (in case the guide is for value axis).
    */
  var toValue: Double = js.native
  /**
    * Value of the guide (in case the guide is for value axis).
    */
  var value: Double = js.native
  /**
    * Value axis of a guide. As you can add guides directly to the chart,
    * you might need to specify which which value axis should be used.
    */
  var valueAxis: typings.amcharts.valueAxisMod.default = js.native
}

object Guide {
  @scala.inline
  def apply(
    above: Boolean,
    angle: Double,
    balloonColor: String,
    balloonText: String,
    boldLabel: Boolean,
    category: String,
    dashLength: Double,
    date: Date,
    expand: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    id: String,
    inside: Boolean,
    label: String,
    labelRotation: Double,
    lineAlpha: Double,
    lineColor: String,
    lineThickness: Double,
    position: String,
    tickLength: Double,
    toAngle: Double,
    toCategory: String,
    toDate: Date,
    toValue: Double,
    value: Double,
    valueAxis: typings.amcharts.valueAxisMod.default
  ): Guide = {
    val __obj = js.Dynamic.literal(above = above.asInstanceOf[js.Any], angle = angle.asInstanceOf[js.Any], balloonColor = balloonColor.asInstanceOf[js.Any], balloonText = balloonText.asInstanceOf[js.Any], boldLabel = boldLabel.asInstanceOf[js.Any], category = category.asInstanceOf[js.Any], dashLength = dashLength.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], expand = expand.asInstanceOf[js.Any], fillAlpha = fillAlpha.asInstanceOf[js.Any], fillColor = fillColor.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inside = inside.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], labelRotation = labelRotation.asInstanceOf[js.Any], lineAlpha = lineAlpha.asInstanceOf[js.Any], lineColor = lineColor.asInstanceOf[js.Any], lineThickness = lineThickness.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], tickLength = tickLength.asInstanceOf[js.Any], toAngle = toAngle.asInstanceOf[js.Any], toCategory = toCategory.asInstanceOf[js.Any], toDate = toDate.asInstanceOf[js.Any], toValue = toValue.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], valueAxis = valueAxis.asInstanceOf[js.Any])
    __obj.asInstanceOf[Guide]
  }
  @scala.inline
  implicit class GuideOps[Self <: Guide] (val x: Self) extends AnyVal {
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
    def setAbove(value: Boolean): Self = this.set("above", value.asInstanceOf[js.Any])
    @scala.inline
    def setAngle(value: Double): Self = this.set("angle", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalloonColor(value: String): Self = this.set("balloonColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBalloonText(value: String): Self = this.set("balloonText", value.asInstanceOf[js.Any])
    @scala.inline
    def setBoldLabel(value: Boolean): Self = this.set("boldLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def setCategory(value: String): Self = this.set("category", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashLength(value: Double): Self = this.set("dashLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setDate(value: Date): Self = this.set("date", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpand(value: Boolean): Self = this.set("expand", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillAlpha(value: Double): Self = this.set("fillAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setFillColor(value: String): Self = this.set("fillColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setInside(value: Boolean): Self = this.set("inside", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def setLabelRotation(value: Double): Self = this.set("labelRotation", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineAlpha(value: Double): Self = this.set("lineAlpha", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineColor(value: String): Self = this.set("lineColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setLineThickness(value: Double): Self = this.set("lineThickness", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: String): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setTickLength(value: Double): Self = this.set("tickLength", value.asInstanceOf[js.Any])
    @scala.inline
    def setToAngle(value: Double): Self = this.set("toAngle", value.asInstanceOf[js.Any])
    @scala.inline
    def setToCategory(value: String): Self = this.set("toCategory", value.asInstanceOf[js.Any])
    @scala.inline
    def setToDate(value: Date): Self = this.set("toDate", value.asInstanceOf[js.Any])
    @scala.inline
    def setToValue(value: Double): Self = this.set("toValue", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueAxis(value: typings.amcharts.valueAxisMod.default): Self = this.set("valueAxis", value.asInstanceOf[js.Any])
  }
  
}

