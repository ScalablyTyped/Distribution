package typings
package amchartsLib.gaugeaxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GaugeAxis extends js.Object {
  /**
    * Axis opacity.
    * @default 1
    */
  var axisAlpha: scala.Double
  /**
    * Axis color.
    * @default #000000
    */
  var axisColor: java.lang.String
  /**
    * Thickness of the axis outline.
    * @default 1
    */
  var axisThickness: scala.Double
  /**
    * Opacity of band fills.
    * @default 1
    */
  var bandAlpha: scala.Double
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  var bandGradientRatio: js.Array[scala.Double]
  /**
    * Opacity of band outlines.
    * @default 0
    */
  var bandOutlineAlpha: scala.Double
  /**
    * Color of band outlines.
    * @default #000000
    */
  var bandOutlineColor: java.lang.String
  /**
    * Thickness of band outlines.
    * @default 0
    */
  var bandOutlineThickness: scala.Double
  /**
    * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
    */
  var bands: js.Array[amchartsLib.gaugebandMod.default]
  /**
    * Text displayed below the axis center.
    */
  var bottomText: java.lang.String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var bottomTextBold: scala.Boolean
  /**
    * Bottom text color.
    */
  var bottomTextColor: java.lang.String
  /**
    * Font size of bottom text.
    */
  var bottomTextFontSize: scala.Double
  /**
    * Y offset of bottom text.
    * @default 0
    */
  var bottomTextYOffset: scala.Double
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
  var color: java.lang.String
  /**
    * Axis end angle. Valid values are from - 180 to 180.
    * @default 120
    */
  var endAngle: scala.Double
  /**
    * Axis end (max) value
    */
  var endValue: scala.Double
  /**
    * Font size for axis labels.
    */
  var fontSize: scala.Double
  /**
    * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
    * so you should check your values and choose a proper gridCount which would result grids at round numbers.
    * @default 5
    */
  var gridCount: scala.Double
  /**
    * Specifies if grid should be drawn inside or outside the axis.
    * @default true
    */
  var gridInside: scala.Boolean
  /**
    * Unique id of an axis.
    */
  var id: js.Any
  /**
    * Specifies if labels should be placed inside or outside the axis.
    * @default true
    */
  var inside: scala.Boolean
  /**
    * Frequency of labels.
    * @default 1
    */
  var labelFrequency: scala.Double
  /**
    * Distance from axis to the labels.
    * @default 15
    */
  var labelOffset: scala.Double
  /**
    * Specifies if labels on the axis should be shown.
    * @default true
    */
  var labelsEnabled: scala.Boolean
  /**
    * You can add listeners of events using this property.
    * Example: listeners = [{"event":"clickBand", "method":handleClick}];
    */
  var listeners: js.Array[js.Object]
  /**
    * Interval, at which minor ticks should be placed.
    */
  var minorTickInterval: scala.Double
  /**
    * Length of a minor tick.
    * @default 5
    */
  var minorTickLength: scala.Double
  /**
    * Axis radius.
    * @default '95%'
    */
  var radius: js.Any
  /**
    * Specifies if the first label should be shown.
    * @default true
    */
  var showFirstLabel: scala.Boolean
  /**
    * Specifies if the last label should be shown.
    * @default true
    */
  var showLastLabel: scala.Boolean
  /**
    * Axis start angle. Valid values are from - 180 to 180.
    * @default -120
    */
  var startAngle: scala.Double
  /**
    * Axis start (min) value.
    * @default 0
    */
  var startValue: scala.Double
  /**
    * Opacity of axis ticks.
    * @default 1
    */
  var tickAlpha: scala.Double
  /**
    * Color of axis ticks.
    * @default #555555
    */
  var tickColor: java.lang.String
  /**
    * Length of a major tick.
    * @default 10
    */
  var tickLength: scala.Double
  /**
    * Tick thickness.
    * @default 1
    */
  var tickThickness: scala.Double
  /**
    * Text displayed above the axis center.
    */
  var topText: java.lang.String
  /**
    * Specifies if text should be bold.
    * @default true
    */
  var topTextBold: scala.Boolean
  /**
    * Color of top text.
    */
  var topTextColor: java.lang.String
  /**
    * Font size of top text.
    */
  var topTextFontSize: scala.Double
  /**
    * Y offset of top text.
    * @default 0
    */
  var topTextYOffset: scala.Double
  /**
    * A string which can be placed next to axis labels.
    */
  var unit: java.lang.String
  /**
    * Position of the unit.
    * @default right
    */
  var unitPosition: java.lang.String
  /**
    * Specifies if small and big numbers should use prefixes to make them more readable.
    * @default false
    */
  var usePrefixes: scala.Boolean
  /**
    * Interval, at which ticks with values should be placed.
    */
  var valueInterval: scala.Double
  /**
    * Adds event listener to the object.
    */
  def addListener(`type`: java.lang.String, handler: js.Any): scala.Unit
  /**
    * You can use this function to format axis labels.
    * This function is called and value is passed as a attribute: labelFunction(value);
    */
  def labelFunction(value: scala.Double): java.lang.String
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit
  /**
    * Sets bottom text.
    */
  def setBottomText(text: java.lang.String): scala.Unit
  /**
    * Sets top text.
    */
  def setTopText(textstring: java.lang.String): scala.Unit
  /**
    * Returns angle of the value.
    */
  def value2angle(value: scala.Double): scala.Unit
}

object GaugeAxis {
  @scala.inline
  def apply(
    addListener: js.Function2[java.lang.String, js.Any, scala.Unit],
    axisAlpha: scala.Double,
    axisColor: java.lang.String,
    axisThickness: scala.Double,
    bandAlpha: scala.Double,
    bandGradientRatio: js.Array[scala.Double],
    bandOutlineAlpha: scala.Double,
    bandOutlineColor: java.lang.String,
    bandOutlineThickness: scala.Double,
    bands: js.Array[amchartsLib.gaugebandMod.default],
    bottomText: java.lang.String,
    bottomTextBold: scala.Boolean,
    bottomTextColor: java.lang.String,
    bottomTextFontSize: scala.Double,
    bottomTextYOffset: scala.Double,
    centerX: js.Any,
    centerY: js.Any,
    color: java.lang.String,
    endAngle: scala.Double,
    endValue: scala.Double,
    fontSize: scala.Double,
    gridCount: scala.Double,
    gridInside: scala.Boolean,
    id: js.Any,
    inside: scala.Boolean,
    labelFrequency: scala.Double,
    labelFunction: js.Function1[scala.Double, java.lang.String],
    labelOffset: scala.Double,
    labelsEnabled: scala.Boolean,
    listeners: js.Array[js.Object],
    minorTickInterval: scala.Double,
    minorTickLength: scala.Double,
    radius: js.Any,
    removeListener: js.Function3[amchartsLib.amchartMod.default, java.lang.String, js.Any, scala.Unit],
    setBottomText: js.Function1[java.lang.String, scala.Unit],
    setTopText: js.Function1[java.lang.String, scala.Unit],
    showFirstLabel: scala.Boolean,
    showLastLabel: scala.Boolean,
    startAngle: scala.Double,
    startValue: scala.Double,
    tickAlpha: scala.Double,
    tickColor: java.lang.String,
    tickLength: scala.Double,
    tickThickness: scala.Double,
    topText: java.lang.String,
    topTextBold: scala.Boolean,
    topTextColor: java.lang.String,
    topTextFontSize: scala.Double,
    topTextYOffset: scala.Double,
    unit: java.lang.String,
    unitPosition: java.lang.String,
    usePrefixes: scala.Boolean,
    value2angle: js.Function1[scala.Double, scala.Unit],
    valueInterval: scala.Double
  ): GaugeAxis = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addListener")(addListener)
    __obj.updateDynamic("axisAlpha")(axisAlpha)
    __obj.updateDynamic("axisColor")(axisColor)
    __obj.updateDynamic("axisThickness")(axisThickness)
    __obj.updateDynamic("bandAlpha")(bandAlpha)
    __obj.updateDynamic("bandGradientRatio")(bandGradientRatio)
    __obj.updateDynamic("bandOutlineAlpha")(bandOutlineAlpha)
    __obj.updateDynamic("bandOutlineColor")(bandOutlineColor)
    __obj.updateDynamic("bandOutlineThickness")(bandOutlineThickness)
    __obj.updateDynamic("bands")(bands)
    __obj.updateDynamic("bottomText")(bottomText)
    __obj.updateDynamic("bottomTextBold")(bottomTextBold)
    __obj.updateDynamic("bottomTextColor")(bottomTextColor)
    __obj.updateDynamic("bottomTextFontSize")(bottomTextFontSize)
    __obj.updateDynamic("bottomTextYOffset")(bottomTextYOffset)
    __obj.updateDynamic("centerX")(centerX)
    __obj.updateDynamic("centerY")(centerY)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("endAngle")(endAngle)
    __obj.updateDynamic("endValue")(endValue)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("gridInside")(gridInside)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("inside")(inside)
    __obj.updateDynamic("labelFrequency")(labelFrequency)
    __obj.updateDynamic("labelFunction")(labelFunction)
    __obj.updateDynamic("labelOffset")(labelOffset)
    __obj.updateDynamic("labelsEnabled")(labelsEnabled)
    __obj.updateDynamic("listeners")(listeners)
    __obj.updateDynamic("minorTickInterval")(minorTickInterval)
    __obj.updateDynamic("minorTickLength")(minorTickLength)
    __obj.updateDynamic("radius")(radius)
    __obj.updateDynamic("removeListener")(removeListener)
    __obj.updateDynamic("setBottomText")(setBottomText)
    __obj.updateDynamic("setTopText")(setTopText)
    __obj.updateDynamic("showFirstLabel")(showFirstLabel)
    __obj.updateDynamic("showLastLabel")(showLastLabel)
    __obj.updateDynamic("startAngle")(startAngle)
    __obj.updateDynamic("startValue")(startValue)
    __obj.updateDynamic("tickAlpha")(tickAlpha)
    __obj.updateDynamic("tickColor")(tickColor)
    __obj.updateDynamic("tickLength")(tickLength)
    __obj.updateDynamic("tickThickness")(tickThickness)
    __obj.updateDynamic("topText")(topText)
    __obj.updateDynamic("topTextBold")(topTextBold)
    __obj.updateDynamic("topTextColor")(topTextColor)
    __obj.updateDynamic("topTextFontSize")(topTextFontSize)
    __obj.updateDynamic("topTextYOffset")(topTextYOffset)
    __obj.updateDynamic("unit")(unit)
    __obj.updateDynamic("unitPosition")(unitPosition)
    __obj.updateDynamic("usePrefixes")(usePrefixes)
    __obj.updateDynamic("value2angle")(value2angle)
    __obj.updateDynamic("valueInterval")(valueInterval)
    __obj.asInstanceOf[GaugeAxis]
  }
}

