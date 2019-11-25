package typings.amcharts.guideMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Guide extends js.Object {
  /**
    * If you set it to true, the guide will be displayed above the graphs.
    */
  var above: Boolean
  /**
    * Radar chart only. Specifies angle at which guide should start. Affects only fills, not lines.
    */
  var angle: Double
  /**
    * Baloon fill color.
    */
  var balloonColor: String
  /**
    * The text which will be displayed if the user rolls-over the guide.
    */
  var balloonText: String
  /**
    * Specifies if label should be bold or not.
    */
  var boldLabel: Boolean
  /**
    * Category of the guide (in case the guide is for category axis).
    */
  var category: String
  /**
    * Dash length.
    */
  var dashLength: Double
  /**
    * Date of the guide (in case the guide is for category axis and parseDates is set to true).
    */
  var date: Date
  /**
    * Works if a guide is added to CategoryAxis and this axis is non-date-based.
    * If you set it to true, the guide will start (or be placed, if it's not a fill) on the
    * beginning of the category cell and will end at the end of toCategory cell.
    */
  var expand: Boolean
  /**
    * Fill opacity. Value range is 0 - 1.
    */
  var fillAlpha: Double
  /**
    * Fill color.
    */
  var fillColor: String
  /**
    * Font size of guide label.
    */
  var fontSize: String
  /**
    * Unique id of a Guide. You don't need to set it, unless you want to.
    */
  var id: String
  /**
    * Specifies whether label should be placed inside or outside plot area.
    */
  var inside: Boolean
  /**
    * The label which will be displayed near the guide.
    */
  var label: String
  /**
    * Rotation angle of a guide label.
    */
  var labelRotation: Double
  /**
    * Line opacity.
    */
  var lineAlpha: Double
  /**
    * Line color.
    */
  var lineColor: String
  /**
    * Line thickness.
    */
  var lineThickness: Double
  /**
    * Position of guide label. Possible values are "left" or "right" for horizontal axis
    * and "top" or "bottom" for vertical axis.
    */
  var position: String
  /**
    * Tick length.
    */
  var tickLength: Double
  /**
    * Radar chart only. Specifies angle at which guide should end. Affects only fills, not lines.
    */
  var toAngle: Double
  /**
    * To category of the guide (in case the guide is for category axis).
    */
  var toCategory: String
  /**
    * To date of the guide (in case the guide is for category axis and parseDates is set to true).
    * If you have both date and toDate, the space between these two dates can be filled with color.
    */
  var toDate: Date
  /**
    * To value of the guide (in case the guide is for value axis).
    */
  var toValue: Double
  /**
    * Value of the guide (in case the guide is for value axis).
    */
  var value: Double
  /**
    * Value axis of a guide. As you can add guides directly to the chart,
    * you might need to specify which which value axis should be used.
    */
  var valueAxis: typings.amcharts.valueAxisMod.default
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
}

