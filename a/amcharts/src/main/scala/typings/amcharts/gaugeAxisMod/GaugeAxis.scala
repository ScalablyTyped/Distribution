package typings.amcharts.gaugeAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeAxis extends js.Object {
  /**
    * Axis opacity.
    * @default 1
    */
  var axisAlpha: Double
  /**
    * Axis color.
    * @default #000000
    */
  var axisColor: String
  /**
    * Thickness of the axis outline.
    * @default 1
    */
  var axisThickness: Double
  /**
    * Opacity of band fills.
    * @default 1
    */
  var bandAlpha: Double
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var bandGradientRatio: js.Array[Double]
  /**
    * Opacity of band outlines.
    * @default 0
    */
  var bandOutlineAlpha: Double
  /**
    * Color of band outlines.
    * @default #000000
    */
  var bandOutlineColor: String
  /**
    * Thickness of band outlines.
    * @default 0
    */
  var bandOutlineThickness: Double
  /**
    * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
    */
  var bands: js.Array[typings.amcharts.gaugeBandMod.default]
  /**
    * Text displayed below the axis center.
    */
  var bottomText: String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var bottomTextBold: Boolean
  /**
    * Bottom text color.
    */
  var bottomTextColor: String
  /**
    * Font size of bottom text.
    */
  var bottomTextFontSize: Double
  /**
    * Y offset of bottom text.
    * @default 0
    */
  var bottomTextYOffset: Double
  /**
    * X position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  var centerX: js.Any
  /**
    * Y position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  var centerY: js.Any
  /**
    * Specifies labels color of the axis.
    */
  var color: String
  /**
    * Axis end angle. Valid values are from - 180 to 180.
    * @default 120
    */
  var endAngle: Double
  /**
    * Axis end (max) value
    */
  var endValue: Double
  /**
    * Font size for axis labels.
    */
  var fontSize: Double
  /**
    * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
    * so you should check your values and choose a proper gridCount which would result grids at round numbers.
    * @default 5
    */
  var gridCount: Double
  /**
    * Specifies if grid should be drawn inside or outside the axis.
    * @default true
    */
  var gridInside: Boolean
  /**
    * Unique id of an axis.
    */
  var id: js.Any
  /**
    * Specifies if labels should be placed inside or outside the axis.
    * @default true
    */
  var inside: Boolean
  /**
    * Frequency of labels.
    * @default 1
    */
  var labelFrequency: Double
  /**
    * Distance from axis to the labels.
    * @default 15
    */
  var labelOffset: Double
  /**
    * Specifies if labels on the axis should be shown.
    * @default true
    */
  var labelsEnabled: Boolean
  /**
    * You can add listeners of events using this property.
    * Example: listeners = [{"event":"clickBand", "method":handleClick}];
    */
  var listeners: js.Array[js.Object]
  /**
    * Interval, at which minor ticks should be placed.
    */
  var minorTickInterval: Double
  /**
    * Length of a minor tick.
    * @default 5
    */
  var minorTickLength: Double
  /**
    * Axis radius.
    * @default '95%'
    */
  var radius: js.Any
  /**
    * Specifies if the first label should be shown.
    * @default true
    */
  var showFirstLabel: Boolean
  /**
    * Specifies if the last label should be shown.
    * @default true
    */
  var showLastLabel: Boolean
  /**
    * Axis start angle. Valid values are from - 180 to 180.
    * @default -120
    */
  var startAngle: Double
  /**
    * Axis start (min) value.
    * @default 0
    */
  var startValue: Double
  /**
    * Opacity of axis ticks.
    * @default 1
    */
  var tickAlpha: Double
  /**
    * Color of axis ticks.
    * @default #555555
    */
  var tickColor: String
  /**
    * Length of a major tick.
    * @default 10
    */
  var tickLength: Double
  /**
    * Tick thickness.
    * @default 1
    */
  var tickThickness: Double
  /**
    * Text displayed above the axis center.
    */
  var topText: String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var topTextBold: Boolean
  /**
    * Color of top text.
    */
  var topTextColor: String
  /**
    * Font size of top text.
    */
  var topTextFontSize: Double
  /**
    * Y offset of top text.
    * @default 0
    */
  var topTextYOffset: Double
  /**
    * A string which can be placed next to axis labels.
    */
  var unit: String
  /**
    * Position of the unit.
    * @default right
    */
  var unitPosition: String
  /**
    * Specifies if small and big numbers should use prefixes to make them more readable.
    * @default false
    */
  var usePrefixes: Boolean
  /**
    * Interval, at which ticks with values should be placed.
    */
  var valueInterval: Double
  /**
    * Adds event listener to the object.
    */
  def addListener(`type`: String, handler: js.Any): Unit
  /**
    * You can use this function to format axis labels.
    * This function is called and value is passed as a attribute: labelFunction(value);
    */
  def labelFunction(value: Double): String
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
  /**
    * Sets bottom text.
    */
  def setBottomText(text: String): Unit
  /**
    * Sets top text.
    */
  def setTopText(textstring: String): Unit
  /**
    * Returns angle of the value.
    */
  def value2angle(value: Double): Unit
}

object GaugeAxis {
  @scala.inline
  def apply(
    addListener: (String, js.Any) => Unit,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    bandAlpha: Double,
    bandGradientRatio: js.Array[Double],
    bandOutlineAlpha: Double,
    bandOutlineColor: String,
    bandOutlineThickness: Double,
    bands: js.Array[typings.amcharts.gaugeBandMod.default],
    bottomText: String,
    bottomTextBold: Boolean,
    bottomTextColor: String,
    bottomTextFontSize: Double,
    bottomTextYOffset: Double,
    centerX: js.Any,
    centerY: js.Any,
    color: String,
    endAngle: Double,
    endValue: Double,
    fontSize: Double,
    gridCount: Double,
    gridInside: Boolean,
    id: js.Any,
    inside: Boolean,
    labelFrequency: Double,
    labelFunction: Double => String,
    labelOffset: Double,
    labelsEnabled: Boolean,
    listeners: js.Array[js.Object],
    minorTickInterval: Double,
    minorTickLength: Double,
    radius: js.Any,
    removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
    setBottomText: String => Unit,
    setTopText: String => Unit,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    startAngle: Double,
    startValue: Double,
    tickAlpha: Double,
    tickColor: String,
    tickLength: Double,
    tickThickness: Double,
    topText: String,
    topTextBold: Boolean,
    topTextColor: String,
    topTextFontSize: Double,
    topTextYOffset: Double,
    unit: String,
    unitPosition: String,
    usePrefixes: Boolean,
    value2angle: Double => Unit,
    valueInterval: Double
  ): GaugeAxis = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), axisAlpha = axisAlpha, axisColor = axisColor, axisThickness = axisThickness, bandAlpha = bandAlpha, bandGradientRatio = bandGradientRatio, bandOutlineAlpha = bandOutlineAlpha, bandOutlineColor = bandOutlineColor, bandOutlineThickness = bandOutlineThickness, bands = bands, bottomText = bottomText, bottomTextBold = bottomTextBold, bottomTextColor = bottomTextColor, bottomTextFontSize = bottomTextFontSize, bottomTextYOffset = bottomTextYOffset, centerX = centerX, centerY = centerY, color = color, endAngle = endAngle, endValue = endValue, fontSize = fontSize, gridCount = gridCount, gridInside = gridInside, id = id, inside = inside, labelFrequency = labelFrequency, labelFunction = js.Any.fromFunction1(labelFunction), labelOffset = labelOffset, labelsEnabled = labelsEnabled, listeners = listeners, minorTickInterval = minorTickInterval, minorTickLength = minorTickLength, radius = radius, removeListener = js.Any.fromFunction3(removeListener), setBottomText = js.Any.fromFunction1(setBottomText), setTopText = js.Any.fromFunction1(setTopText), showFirstLabel = showFirstLabel, showLastLabel = showLastLabel, startAngle = startAngle, startValue = startValue, tickAlpha = tickAlpha, tickColor = tickColor, tickLength = tickLength, tickThickness = tickThickness, topText = topText, topTextBold = topTextBold, topTextColor = topTextColor, topTextFontSize = topTextFontSize, topTextYOffset = topTextYOffset, unit = unit, unitPosition = unitPosition, usePrefixes = usePrefixes, value2angle = js.Any.fromFunction1(value2angle), valueInterval = valueInterval)
  
    __obj.asInstanceOf[GaugeAxis]
  }
}

