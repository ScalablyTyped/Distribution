package typings
package amchartsLib.amangulargaugeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmAngularGauge
  extends amchartsLib.amchartMod.default {
  /**
    * When enabled, chart adds aria-label attributes to columns, bullets or map objects.
    * You can control values of these labels using properties like accessibleLabel of AmGraph.
    * Note, not all screen readers support these tags.
    * We tested this mostly with NVDA Screen reader.
    * WAI-ARIA is now official W3 standard, so in future more readers will handle this well.
    * We will be improving accessibility on our charts, so we would be glad to hear your feedback.
    * @default true
    */
  var accessible: scala.Boolean = js.native
  /**
    * Description which will be added to node of SVG element.
    * Most of the screen readers will read this description.
    */
  var accessibleDescription: java.lang.String = js.native
  /**
    * Description which is added to of a SVG element. Some of the screen readers will read this description.
    */
  var accessibleTitle: java.lang.String = js.native
  /**
    * Uses the whole space of the canvas to draw the gauge.
    * @default true
    */
  var adjustSize: scala.Boolean = js.native
  /**
    * Array of arrows.
    */
  var arrows: js.Array[amchartsLib.gaugearrowMod.default] = js.native
  /**
    * If you set it to true the chart will automatically monitor changes of display style of chart’s container
    * (or any of it’s parents) and will render chart correctly if it is changed from none to block.
    * We recommend setting it to true if you change this style at a run time, as it affects performance a bit.
    * @default false
    */
  var autoDisplay: scala.Boolean = js.native
  /**
    * If you set it to true and your chart div (or any of the parent div) has css scale applied,
    * the chart will position mouse at a correct position.
    * Default value is false because this operation consumes some CPU and quite a
    * few people are using css transfroms.
    * @default false
    */
  var autoTransform: scala.Boolean = js.native
  /**
    * Array of axes.
    * @default [GaugeAxis]
    */
  var axes: js.Array[amchartsLib.gaugeaxisMod.default] = js.native
  /**
    * In case you use gauge to create a clock, set this to true.
    * @default false
    */
  var clockWiseOnly: scala.Boolean = js.native
  /**
    * A config object for Data Loader plugin. Please refer to the following page for more information.
    */
  var dataLoader: js.Object = js.native
  /**
    * Array of data objects, for example:
    * [
    *     {country:"US", value:524},
    *     {country:"UK", value:624},
    *     {country:"Lithuania", value:824}
    * ]
    * You can have any number of fields and use any field names.
    * In case of AmMap, data provider should be MapData object.
    * The data set data.
    * Important: if you are using date/time-based category axis, the data points needs to come pre-ordered
    * in ascending order. Data with incorrect order might result in visual and functional glitches on the chart.
    */
  @JSName("dataProvider")
  var dataProvider_AmAngularGauge: js.Array[js.Object] = js.native
  /**
    * Using this property you can add any additional information to SVG, like SVG filters or clip paths.
    * The structure of this object should be identical to XML structure of a object you are adding,
    * only in JSON format.
    */
  @JSName("defs")
  var defs_AmAngularGauge: js.Object = js.native
  /**
    * Gauge face opacity.
    * @default 0
    */
  var faceAlpha: scala.Double = js.native
  /**
    * Gauge face border opacity.
    * @default 0
    */
  var faceBorderAlpha: scala.Double = js.native
  /**
    * Gauge face border color.
    * @default #555555
    */
  var faceBorderColor: java.lang.String = js.native
  /**
    * Gauge face border width.
    * @default 1
    */
  var faceBorderWidth: scala.Double = js.native
  /**
    * Gauge face color, requires faceAlpha > 0
    * @default #FAFAFA
    */
  var faceColor: java.lang.String = js.native
  /**
    * Gauge face image-pattern.
    * Example: {"url":"../amcharts/patterns/black/pattern1.png", "width":4, "height":4}
    * fontFamily	String	Verdana	Font family.
    * fontSize	Number	11	Font size.
    */
  var facePattern: js.Object = js.native
  /**
    * Gauge's horizontal position in pixel, origin is the center. Centered by default.
    */
  var gaugeX: scala.Double = js.native
  /**
    * Gauge's vertical position in pixel, origin is the center. Centered by default.
    */
  var gaugeY: scala.Double = js.native
  /**
    * Allows changing language easily.
    * Note, you should include language js file from amcharts/lang or ammap/lang folder and then use
    * variable name used in this file, like chart.language = "de"; Note, for maps this works differently -
    * you use language only for country names, as there are no other strings in the maps application.
    */
  var language: java.lang.String = js.native
  /**
    * You can add listeners of events using this property.
    * Example: listeners = [{"event":"dataUpdated", "method":handleEvent}];
    * @default [Object]
    */
  var listeners: js.Array[js.Object] = js.native
  /**
    * Bottom spacing between chart and container.
    * @default 10
    */
  var marginBottom: scala.Double = js.native
  /**
    * Left-hand spacing between chart and container.
    * @default 10
    */
  var marginLeft: scala.Double = js.native
  /**
    * Right-hand spacing between chart and container.
    * @default 10
    */
  var marginRight: scala.Double = js.native
  /**
    * Top spacing between chart and container.
    * @default 10
    */
  var marginTop: scala.Double = js.native
  /**
    * Minimum radius of a gauge.
    * @default 10
    */
  var minRadius: scala.Double = js.native
  /**
    * Prefixes which are used to make big numbers shorter: 2M instead of 2000000, etc.
    * Prefixes are used on value axes and in the legend.
    * To enable prefixes, set usePrefixes property to true.
    * @default [
    *     {"number": 1e+3, "prefix": "k"},
    *     {"number": 1e+6, "prefix": "M"},
    *     {"number": 1e+9, "prefix": "G"},
    *     {"number": 1e+12, "prefix": "T"},
    *     {"number": 1e+15, "prefix": "P"},
    *     {"number": 1e+18, "prefix": "E"},
    *     {"number": 1e+21, "prefix": "Z"},
    *     {"number": 1e+24, "prefix": "Y"}
    * ]
    */
  @JSName("prefixesOfBigNumbers")
  var prefixesOfBigNumbers_AmAngularGauge: js.Array[amchartsLib.Anon_Prefix] = js.native
  /**
    * Prefixes which are used to make small numbers shorter: 2μ instead of 0.000002, etc.
    * Prefixes are used on value axes and in the legend.
    * To enable prefixes, set usePrefixes property to true.
    * @default [
    *     {"number": 1e-24, "prefix": "y"},
    *     {"number": 1e-21, "prefix": "z"},
    *     {"number": 1e-18, "prefix": "a"},
    *     {"number": 1e-15, "prefix": "f"},
    *     {"number": 1e-12, "prefix": "p"},
    *     {"number": 1e-9, "prefix": "n"},
    *     {"number": 1e-6, "prefix": "μ"},
    *     {"number": 1e-3, "prefix": "m"}
    * ]
    */
  @JSName("prefixesOfSmallNumbers")
  var prefixesOfSmallNumbers_AmAngularGauge: js.Array[amchartsLib.Anon_Prefix] = js.native
  /**
    * If processTimeout is > 0, 1000 data items will be parsed at a time,
    * then the chart will make pause and continue parsing data until it finishes.
    * @default 1000
    */
  var processCount: scala.Double = js.native
  /**
    * If you set it to 1 millisecond or some bigger value, chart will be built in chunks instead of all at once.
    * This is useful if you work with a lot of data and the initial build of the chart takes a lot of time,
    * which freezes the whole web application by not allowing other processes to do their
    * job while the chart is busy.
    * @default 0
    */
  var processTimeout: scala.Double = js.native
  /**
    * A config object for Responsive plugin. Please refer to the following page for more information.
    */
  var responsive: js.Object = js.native
  /**
    * Duration of arrow animation.
    * @default 1
    */
  var startDuration: scala.Double = js.native
  /**
    * Transition effect of the arrows, possible effects: easeOutSine, easeInSine, elastic, bounce.
    * @default easeInSine
    */
  var startEffect: java.lang.String = js.native
  /**
    * Charts will use SVG icons (some are loaded from images folder and some are drawn inline)
    * if browser supports SVG. his makes icons look good on retina displays on all resolutions.
    * @default true
    */
  var svgIcons: scala.Boolean = js.native
  /**
    * Charts which require gestures like swipe (charts with scrollbar/cursor) or pinch (maps) used to prevent
    * regular page scrolling and could result page to stick to the same spot if the chart occupied whole screen.
    * Now, in order these gestures to start working user has to touch the chart/maps once.
    * Regular touch events like touching on the bar/slice/map area do not require the first tap and will
    * show balloons and perform other tasks as usual.
    * If you have a map or chart which occupies full screen and your page does not require scrolling,
    * set tapToActivate to false – this will bring old behavior back.
    * @default true
    */
  var tapToActivate: scala.Boolean = js.native
  /**
    * If you set it to 200 (milliseconds) or so, the chart will fire clickGraphItem or clickSlice (AmSlicedChart)
    * or clickMapObject only if user holds his/her finger for 0.2 seconds (200 ms) on the
    * column/bullet/slice/map object.
    * @default 0
    */
  var touchClickDuration: scala.Double = js.native
  /**
    * Adds arrow to the chart.
    */
  def addArrow(arrow: amchartsLib.gaugearrowMod.default): scala.Unit = js.native
  /**
    * Adds axis to angular gauge.
    */
  def addAxis(axis: amchartsLib.gaugeaxisMod.default): scala.Unit = js.native
  /**
    * Adds a label on a chart. You can use it for labeling axes, adding chart title,
    * etc. x and y coordinates can be set in number, percent, or a number with ! in front of it -
    * coordinate will be calculated from right or bottom instead of left or top.
    */
  def addLabel(
    x: scala.Double,
    y: scala.Double,
    text: java.lang.String,
    align: java.lang.String,
    size: scala.Double,
    color: java.lang.String,
    rotation: scala.Double,
    alpha: scala.Double,
    bold: scala.Boolean,
    url: java.lang.String
  ): scala.Unit = js.native
  /**
    * This method allows to create charts with a single config.
    */
  def makeChart(container: java.lang.String, config: js.Any, delay: scala.Double): amchartsLib.amchartMod.default = js.native
  /**
    * Removes arrow from the chart.
    */
  def removeArrow(arrow: amchartsLib.gaugearrowMod.default): scala.Unit = js.native
  /**
    * Removes axis from the chart.
    */
  def removeAxis(axis: amchartsLib.gaugeaxisMod.default): scala.Unit = js.native
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit = js.native
}

