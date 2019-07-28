package typings.amcharts.gaugeAxisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/GaugeAxis", JSImport.Default)
@js.native
class default () extends GaugeAxis {
  /**
    * Axis opacity.
    * @default 1
    */
  /* CompleteClass */
  override var axisAlpha: Double = js.native
  /**
    * Axis color.
    * @default #000000
    */
  /* CompleteClass */
  override var axisColor: String = js.native
  /**
    * Thickness of the axis outline.
    * @default 1
    */
  /* CompleteClass */
  override var axisThickness: Double = js.native
  /**
    * Opacity of band fills.
    * @default 1
    */
  /* CompleteClass */
  override var bandAlpha: Double = js.native
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  /* CompleteClass */
  override var bandGradientRatio: js.Array[Double] = js.native
  /**
    * Opacity of band outlines.
    * @default 0
    */
  /* CompleteClass */
  override var bandOutlineAlpha: Double = js.native
  /**
    * Color of band outlines.
    * @default #000000
    */
  /* CompleteClass */
  override var bandOutlineColor: String = js.native
  /**
    * Thickness of band outlines.
    * @default 0
    */
  /* CompleteClass */
  override var bandOutlineThickness: Double = js.native
  /**
    * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
    */
  /* CompleteClass */
  override var bands: js.Array[typings.amcharts.gaugeBandMod.default] = js.native
  /**
    * Text displayed below the axis center.
    */
  /* CompleteClass */
  override var bottomText: String = js.native
  /**
    * Specifies if text should be bold.
    * @default true
    */
  /* CompleteClass */
  override var bottomTextBold: Boolean = js.native
  /**
    * Bottom text color.
    */
  /* CompleteClass */
  override var bottomTextColor: String = js.native
  /**
    * Font size of bottom text.
    */
  /* CompleteClass */
  override var bottomTextFontSize: Double = js.native
  /**
    * Y offset of bottom text.
    * @default 0
    */
  /* CompleteClass */
  override var bottomTextYOffset: Double = js.native
  /**
    * X position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  /* CompleteClass */
  override var centerX: js.Any = js.native
  /**
    * Y position of the axis, relative to the center of the gauge.
    * @default '0%'
    */
  /* CompleteClass */
  override var centerY: js.Any = js.native
  /**
    * Specifies labels color of the axis.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Axis end angle. Valid values are from - 180 to 180.
    * @default 120
    */
  /* CompleteClass */
  override var endAngle: Double = js.native
  /**
    * Axis end (max) value
    */
  /* CompleteClass */
  override var endValue: Double = js.native
  /**
    * Font size for axis labels.
    */
  /* CompleteClass */
  override var fontSize: Double = js.native
  /**
    * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
    * so you should check your values and choose a proper gridCount which would result grids at round numbers.
    * @default 5
    */
  /* CompleteClass */
  override var gridCount: Double = js.native
  /**
    * Specifies if grid should be drawn inside or outside the axis.
    * @default true
    */
  /* CompleteClass */
  override var gridInside: Boolean = js.native
  /**
    * Unique id of an axis.
    */
  /* CompleteClass */
  override var id: js.Any = js.native
  /**
    * Specifies if labels should be placed inside or outside the axis.
    * @default true
    */
  /* CompleteClass */
  override var inside: Boolean = js.native
  /**
    * Frequency of labels.
    * @default 1
    */
  /* CompleteClass */
  override var labelFrequency: Double = js.native
  /**
    * Distance from axis to the labels.
    * @default 15
    */
  /* CompleteClass */
  override var labelOffset: Double = js.native
  /**
    * Specifies if labels on the axis should be shown.
    * @default true
    */
  /* CompleteClass */
  override var labelsEnabled: Boolean = js.native
  /**
    * You can add listeners of events using this property.
    * Example: listeners = [{"event":"clickBand", "method":handleClick}];
    */
  /* CompleteClass */
  override var listeners: js.Array[js.Object] = js.native
  /**
    * Interval, at which minor ticks should be placed.
    */
  /* CompleteClass */
  override var minorTickInterval: Double = js.native
  /**
    * Length of a minor tick.
    * @default 5
    */
  /* CompleteClass */
  override var minorTickLength: Double = js.native
  /**
    * Axis radius.
    * @default '95%'
    */
  /* CompleteClass */
  override var radius: js.Any = js.native
  /**
    * Specifies if the first label should be shown.
    * @default true
    */
  /* CompleteClass */
  override var showFirstLabel: Boolean = js.native
  /**
    * Specifies if the last label should be shown.
    * @default true
    */
  /* CompleteClass */
  override var showLastLabel: Boolean = js.native
  /**
    * Axis start angle. Valid values are from - 180 to 180.
    * @default -120
    */
  /* CompleteClass */
  override var startAngle: Double = js.native
  /**
    * Axis start (min) value.
    * @default 0
    */
  /* CompleteClass */
  override var startValue: Double = js.native
  /**
    * Opacity of axis ticks.
    * @default 1
    */
  /* CompleteClass */
  override var tickAlpha: Double = js.native
  /**
    * Color of axis ticks.
    * @default #555555
    */
  /* CompleteClass */
  override var tickColor: String = js.native
  /**
    * Length of a major tick.
    * @default 10
    */
  /* CompleteClass */
  override var tickLength: Double = js.native
  /**
    * Tick thickness.
    * @default 1
    */
  /* CompleteClass */
  override var tickThickness: Double = js.native
  /**
    * Text displayed above the axis center.
    */
  /* CompleteClass */
  override var topText: String = js.native
  /**
    * Specifies if text should be bold.
    * @default true
    */
  /* CompleteClass */
  override var topTextBold: Boolean = js.native
  /**
    * Color of top text.
    */
  /* CompleteClass */
  override var topTextColor: String = js.native
  /**
    * Font size of top text.
    */
  /* CompleteClass */
  override var topTextFontSize: Double = js.native
  /**
    * Y offset of top text.
    * @default 0
    */
  /* CompleteClass */
  override var topTextYOffset: Double = js.native
  /**
    * A string which can be placed next to axis labels.
    */
  /* CompleteClass */
  override var unit: String = js.native
  /**
    * Position of the unit.
    * @default right
    */
  /* CompleteClass */
  override var unitPosition: String = js.native
  /**
    * Specifies if small and big numbers should use prefixes to make them more readable.
    * @default false
    */
  /* CompleteClass */
  override var usePrefixes: Boolean = js.native
  /**
    * Interval, at which ticks with values should be placed.
    */
  /* CompleteClass */
  override var valueInterval: Double = js.native
  /**
    * Adds event listener to the object.
    */
  /* CompleteClass */
  override def addListener(`type`: String, handler: js.Any): Unit = js.native
  /**
    * You can use this function to format axis labels.
    * This function is called and value is passed as a attribute: labelFunction(value);
    */
  /* CompleteClass */
  override def labelFunction(value: Double): String = js.native
  /**
    * Removes event listener from chart object.
    */
  /* CompleteClass */
  override def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit = js.native
  /**
    * Sets bottom text.
    */
  /* CompleteClass */
  override def setBottomText(text: String): Unit = js.native
  /**
    * Sets top text.
    */
  /* CompleteClass */
  override def setTopText(textstring: String): Unit = js.native
  /**
    * Returns angle of the value.
    */
  /* CompleteClass */
  override def value2angle(value: Double): Unit = js.native
}

