package typings
package amchartsLib.amchartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts")
@js.native
object AmChartsNs extends js.Object {
  @js.native
  class AmAngularGauge ()
    extends amchartsLib.amAngularGaugeMod.default
  
  @js.native
  class AmBalloon ()
    extends amchartsLib.amBalloonMod.default
  
  @js.native
  class AmChart ()
    extends amchartsLib.amChartMod.default
  
  @js.native
  class AmCoordinateChart ()
    extends amchartsLib.amCoordinateChartMod.default
  
  // class AmFunnelChart extends _AmFunnelChart { }
  // class AmGanttChart extends _AmGanttChart { }
  @js.native
  class AmGraph ()
    extends amchartsLib.amGraphMod.default
  
  @js.native
  class AmLegend ()
    extends amchartsLib.amLegendMod.default
  
  @js.native
  class AmPieChart ()
    extends amchartsLib.amPieChartMod.default
  
  @js.native
  class AmRadarChart ()
    extends amchartsLib.amRadarChartMod.default
  
  @js.native
  class AmRectangularChart ()
    extends amchartsLib.amRectangularChartMod.default
  
  @js.native
  class AmSerialChart ()
    extends amchartsLib.amSerialChartMod.default
  
  // class AmSlicedChart extends _AmSlicedChart { }
  @js.native
  class AmXYChart ()
    extends amchartsLib.amXYChartMod.default
  
  @js.native
  class AxisBase ()
    extends amchartsLib.axisBaseMod.default
  
  @js.native
  class CategoryAxis ()
    extends amchartsLib.categoryAxisMod.default
  
  @js.native
  class ChartCursor ()
    extends amchartsLib.chartCursorMod.default
  
  @js.native
  class ChartScrollbar ()
    extends amchartsLib.chartScrollbarMod.default
  
  @js.native
  class GaugeArrow ()
    extends amchartsLib.gaugeArrowMod.default
  
  @js.native
  class GaugeAxis ()
    extends amchartsLib.gaugeAxisMod.default
  
  @js.native
  class GaugeBand ()
    extends amchartsLib.gaugeBandMod.default
  
  @js.native
  class GraphDataItem ()
    extends amchartsLib.graphDataItemMod.default
  
  @js.native
  class Guide ()
    extends amchartsLib.guideMod.default
  
  // class Image extends _Image { }
  @js.native
  class Label ()
    extends amchartsLib.labelMod.default
  
  @js.native
  class SerialDataItem ()
    extends amchartsLib.serialDataItemMod.default
  
  @js.native
  class Slice ()
    extends amchartsLib.sliceMod.default
  
  @js.native
  class Title ()
    extends amchartsLib.titleMod.default
  
  @js.native
  class TrendLine ()
    extends amchartsLib.trendLineMod.default
  
  @js.native
  class ValueAxis ()
    extends amchartsLib.valueAxisMod.default
  
  /**
    * Set it to true if you have base href set for your page.
    * This will fix rendering problems in Firefox caused by base href.
    */
  var baseHref: scala.Boolean = js.native
  /**
    * Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
    */
  var dayNames: js.Array[java.lang.String] = js.native
  /**
    * Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * [
    * 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
    * 'September', 'October', 'November','December'
    * ]
    */
  var monthNames: js.Array[java.lang.String] = js.native
  /**
    * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
    */
  var shortDayNames: js.Array[java.lang.String] = js.native
  /**
    * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    */
  var shortMonthNames: js.Array[java.lang.String] = js.native
  /**
    * Set global used AmCharts theme.
    */
  var theme: js.Any = js.native
  /**
    * Object with existing themes.
    */
  var themes: js.Any = js.native
  /**
    * Set it to true if you want UTC time to be used instead of local time.
    */
  var useUTC: scala.Boolean = js.native
  /**
    * Set a method to be called before initializing the chart.
    * When the method is called, the chart instance is passed as an attribute.
    * You can use this feature to preprocess chart data or do some other things you need
    * before initializing the chart.
    * @param handler - The method to be called.
    * @param types - Which chart types should call this method. Defaults to all
    * if none is passed.
    */
  def addInitHandler(handler: js.Function0[js.Object]): js.Any = js.native
  def addInitHandler(handler: js.Function0[js.Object], types: js.Array[java.lang.String]): js.Any = js.native
  /**
    * Clears all the charts on page, removes listeners and intervals.
    */
  def clear(): scala.Unit = js.native
  /**
    * Create chart by params.
    */
  def makeChart(selector: java.lang.String, params: js.Any): AmChart = js.native
  def makeChart(selector: java.lang.String, params: js.Any, delay: scala.Double): AmChart = js.native
}

