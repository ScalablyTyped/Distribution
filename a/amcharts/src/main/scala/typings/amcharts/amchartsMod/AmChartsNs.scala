package typings.amcharts.amchartsMod

import typings.amcharts.amAngularGaugeMod.default
import typings.amcharts.amchartsMod.AmChartsNs.AmChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts")
@js.native
object AmChartsNs extends js.Object {
  @js.native
  class AmAngularGauge () extends default
  
  @js.native
  class AmBalloon ()
    extends typings.amcharts.amBalloonMod.default
  
  @js.native
  class AmChart ()
    extends typings.amcharts.amChartMod.default
  
  @js.native
  class AmCoordinateChart ()
    extends typings.amcharts.amCoordinateChartMod.default
  
  // class AmFunnelChart extends _AmFunnelChart { }
  // class AmGanttChart extends _AmGanttChart { }
  @js.native
  class AmGraph ()
    extends typings.amcharts.amGraphMod.default
  
  @js.native
  class AmLegend ()
    extends typings.amcharts.amLegendMod.default
  
  @js.native
  class AmPieChart ()
    extends typings.amcharts.amPieChartMod.default
  
  @js.native
  class AmRadarChart ()
    extends typings.amcharts.amRadarChartMod.default
  
  @js.native
  class AmRectangularChart ()
    extends typings.amcharts.amRectangularChartMod.default
  
  @js.native
  class AmSerialChart ()
    extends typings.amcharts.amSerialChartMod.default
  
  // class AmSlicedChart extends _AmSlicedChart { }
  @js.native
  class AmXYChart ()
    extends typings.amcharts.amXYChartMod.default
  
  @js.native
  class AxisBase ()
    extends typings.amcharts.axisBaseMod.default
  
  @js.native
  class CategoryAxis ()
    extends typings.amcharts.categoryAxisMod.default
  
  @js.native
  class ChartCursor ()
    extends typings.amcharts.chartCursorMod.default
  
  @js.native
  class ChartScrollbar ()
    extends typings.amcharts.chartScrollbarMod.default
  
  @js.native
  class GaugeArrow ()
    extends typings.amcharts.gaugeArrowMod.default
  
  @js.native
  class GaugeAxis ()
    extends typings.amcharts.gaugeAxisMod.default
  
  @js.native
  class GaugeBand ()
    extends typings.amcharts.gaugeBandMod.default
  
  @js.native
  class GraphDataItem ()
    extends typings.amcharts.graphDataItemMod.default
  
  @js.native
  class Guide ()
    extends typings.amcharts.guideMod.default
  
  // class Image extends _Image { }
  @js.native
  class Label ()
    extends typings.amcharts.labelMod.default
  
  @js.native
  class SerialDataItem ()
    extends typings.amcharts.serialDataItemMod.default
  
  @js.native
  class Slice ()
    extends typings.amcharts.sliceMod.default
  
  @js.native
  class Title ()
    extends typings.amcharts.titleMod.default
  
  @js.native
  class TrendLine ()
    extends typings.amcharts.trendLineMod.default
  
  @js.native
  class ValueAxis ()
    extends typings.amcharts.valueAxisMod.default
  
  /**
    * Set it to true if you have base href set for your page.
    * This will fix rendering problems in Firefox caused by base href.
    */
  var baseHref: Boolean = js.native
  /**
    * Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
    */
  var dayNames: js.Array[String] = js.native
  /**
    * Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * [
    * 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
    * 'September', 'October', 'November','December'
    * ]
    */
  var monthNames: js.Array[String] = js.native
  /**
    * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
    */
  var shortDayNames: js.Array[String] = js.native
  /**
    * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
    * ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
    */
  var shortMonthNames: js.Array[String] = js.native
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
  var useUTC: Boolean = js.native
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
  def addInitHandler(handler: js.Function0[js.Object], types: js.Array[String]): js.Any = js.native
  /**
    * Clears all the charts on page, removes listeners and intervals.
    */
  def clear(): Unit = js.native
  /**
    * Create chart by params.
    */
  def makeChart(selector: String, params: js.Any): AmChart = js.native
  def makeChart(selector: String, params: js.Any, delay: Double): AmChart = js.native
}

