package typings
package amchartsLib.gaugeaxisMod

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
  override var axisAlpha: scala.Double = js.native
  /**
    * Axis color.
    * @default #000000
    */
  /* CompleteClass */
  override var axisColor: java.lang.String = js.native
  /**
    * Thickness of the axis outline.
    * @default 1
    */
  /* CompleteClass */
  override var axisThickness: scala.Double = js.native
  /**
    * Opacity of band fills.
    * @default 1
    */
  /* CompleteClass */
  override var bandAlpha: scala.Double = js.native
  /**
    * Example: [-0.2, 0, -0.2]. Will make bands to be filled with color gradients.
    * Negative value means the color will be darker than the original,
    * and positive number means the color will be lighter.
    * @default []
    */
  /* CompleteClass */
  override var bandGradientRatio: js.Array[scala.Double] = js.native
  /**
    * Opacity of band outlines.
    * @default 0
    */
  /* CompleteClass */
  override var bandOutlineAlpha: scala.Double = js.native
  /**
    * Color of band outlines.
    * @default #000000
    */
  /* CompleteClass */
  override var bandOutlineColor: java.lang.String = js.native
  /**
    * Thickness of band outlines.
    * @default 0
    */
  /* CompleteClass */
  override var bandOutlineThickness: scala.Double = js.native
  /**
    * Array of bands - GaugeBand objects. Bands are used to draw color fills between specified values.
    */
  /* CompleteClass */
  override var bands: js.Array[amchartsLib.gaugebandMod.default] = js.native
  /**
    * Text displayed below the axis center.
    */
  /* CompleteClass */
  override var bottomText: java.lang.String = js.native
  /**
    * Specifies if text should be bold.
    * @default true
    */
  /* CompleteClass */
  override var bottomTextBold: scala.Boolean = js.native
  /**
    * Bottom text color.
    */
  /* CompleteClass */
  override var bottomTextColor: java.lang.String = js.native
  /**
    * Font size of bottom text.
    */
  /* CompleteClass */
  override var bottomTextFontSize: scala.Double = js.native
  /**
    * Y offset of bottom text.
    * @default 0
    */
  /* CompleteClass */
  override var bottomTextYOffset: scala.Double = js.native
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
  override var color: java.lang.String = js.native
  /**
    * Axis end angle. Valid values are from - 180 to 180.
    * @default 120
    */
  /* CompleteClass */
  override var endAngle: scala.Double = js.native
  /**
    * Axis end (max) value
    */
  /* CompleteClass */
  override var endValue: scala.Double = js.native
  /**
    * Font size for axis labels.
    */
  /* CompleteClass */
  override var fontSize: scala.Double = js.native
  /**
    * Number of grid lines. Note, GaugeAxis doesn't adjust gridCount,
    * so you should check your values and choose a proper gridCount which would result grids at round numbers.
    * @default 5
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Specifies if grid should be drawn inside or outside the axis.
    * @default true
    */
  /* CompleteClass */
  override var gridInside: scala.Boolean = js.native
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
  override var inside: scala.Boolean = js.native
  /**
    * Frequency of labels.
    * @default 1
    */
  /* CompleteClass */
  override var labelFrequency: scala.Double = js.native
  /**
    * Distance from axis to the labels.
    * @default 15
    */
  /* CompleteClass */
  override var labelOffset: scala.Double = js.native
  /**
    * Specifies if labels on the axis should be shown.
    * @default true
    */
  /* CompleteClass */
  override var labelsEnabled: scala.Boolean = js.native
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
  override var minorTickInterval: scala.Double = js.native
  /**
    * Length of a minor tick.
    * @default 5
    */
  /* CompleteClass */
  override var minorTickLength: scala.Double = js.native
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
  override var showFirstLabel: scala.Boolean = js.native
  /**
    * Specifies if the last label should be shown.
    * @default true
    */
  /* CompleteClass */
  override var showLastLabel: scala.Boolean = js.native
  /**
    * Axis start angle. Valid values are from - 180 to 180.
    * @default -120
    */
  /* CompleteClass */
  override var startAngle: scala.Double = js.native
  /**
    * Axis start (min) value.
    * @default 0
    */
  /* CompleteClass */
  override var startValue: scala.Double = js.native
  /**
    * Opacity of axis ticks.
    * @default 1
    */
  /* CompleteClass */
  override var tickAlpha: scala.Double = js.native
  /**
    * Color of axis ticks.
    * @default #555555
    */
  /* CompleteClass */
  override var tickColor: java.lang.String = js.native
  /**
    * Length of a major tick.
    * @default 10
    */
  /* CompleteClass */
  override var tickLength: scala.Double = js.native
  /**
    * Tick thickness.
    * @default 1
    */
  /* CompleteClass */
  override var tickThickness: scala.Double = js.native
  /**
    * Text displayed above the axis center.
    */
  /* CompleteClass */
  override var topText: java.lang.String = js.native
  /**
    * Specifies if text should be bold.
    * @default true
    */
  /* CompleteClass */
  override var topTextBold: scala.Boolean = js.native
  /**
    * Color of top text.
    */
  /* CompleteClass */
  override var topTextColor: java.lang.String = js.native
  /**
    * Font size of top text.
    */
  /* CompleteClass */
  override var topTextFontSize: scala.Double = js.native
  /**
    * Y offset of top text.
    * @default 0
    */
  /* CompleteClass */
  override var topTextYOffset: scala.Double = js.native
  /**
    * A string which can be placed next to axis labels.
    */
  /* CompleteClass */
  override var unit: java.lang.String = js.native
  /**
    * Position of the unit.
    * @default right
    */
  /* CompleteClass */
  override var unitPosition: java.lang.String = js.native
  /**
    * Specifies if small and big numbers should use prefixes to make them more readable.
    * @default false
    */
  /* CompleteClass */
  override var usePrefixes: scala.Boolean = js.native
  /**
    * Interval, at which ticks with values should be placed.
    */
  /* CompleteClass */
  override var valueInterval: scala.Double = js.native
  /**
    * Adds event listener to the object.
    */
  /* CompleteClass */
  override def addListener(`type`: java.lang.String, handler: js.Any): scala.Unit = js.native
  /**
    * You can use this function to format axis labels.
    * This function is called and value is passed as a attribute: labelFunction(value);
    */
  /* CompleteClass */
  override def labelFunction(value: scala.Double): java.lang.String = js.native
  /**
    * Removes event listener from chart object.
    */
  /* CompleteClass */
  override def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit = js.native
  /**
    * Sets bottom text.
    */
  /* CompleteClass */
  override def setBottomText(text: java.lang.String): scala.Unit = js.native
  /**
    * Sets top text.
    */
  /* CompleteClass */
  override def setTopText(textstring: java.lang.String): scala.Unit = js.native
  /**
    * Returns angle of the value.
    */
  /* CompleteClass */
  override def value2angle(value: scala.Double): scala.Unit = js.native
}

