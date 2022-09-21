package typings.amcharts

import typings.amcharts.amAngularGaugeMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object AmCharts {
    
    @JSImport("amcharts", "AmCharts")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("amcharts", "AmCharts.AmAngularGauge")
    @js.native
    open class AmAngularGauge () extends default
    
    @JSImport("amcharts", "AmCharts.AmBalloon")
    @js.native
    open class AmBalloon ()
      extends typings.amcharts.amBalloonMod.default
    
    @JSImport("amcharts", "AmCharts.AmChart")
    @js.native
    /**
      * used when constructing a chart with a theme
      */
    open class AmChart ()
      extends typings.amcharts.amChartMod.default {
      def this(theme: Any) = this()
    }
    
    @JSImport("amcharts", "AmCharts.AmCoordinateChart")
    @js.native
    open class AmCoordinateChart ()
      extends typings.amcharts.amCoordinateChartMod.default
    
    // class AmFunnelChart extends _AmFunnelChart { }
    // class AmGanttChart extends _AmGanttChart { }
    @JSImport("amcharts", "AmCharts.AmGraph")
    @js.native
    open class AmGraph ()
      extends typings.amcharts.amGraphMod.default
    
    @JSImport("amcharts", "AmCharts.AmLegend")
    @js.native
    open class AmLegend ()
      extends typings.amcharts.amLegendMod.default
    
    @JSImport("amcharts", "AmCharts.AmPieChart")
    @js.native
    open class AmPieChart ()
      extends typings.amcharts.amPieChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmRadarChart")
    @js.native
    open class AmRadarChart ()
      extends typings.amcharts.amRadarChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmRectangularChart")
    @js.native
    open class AmRectangularChart ()
      extends typings.amcharts.amRectangularChartMod.default
    
    @JSImport("amcharts", "AmCharts.AmSerialChart")
    @js.native
    open class AmSerialChart ()
      extends typings.amcharts.amSerialChartMod.default
    
    // class AmSlicedChart extends _AmSlicedChart { }
    @JSImport("amcharts", "AmCharts.AmXYChart")
    @js.native
    open class AmXYChart ()
      extends typings.amcharts.amXYChartMod.default
    
    @JSImport("amcharts", "AmCharts.AxisBase")
    @js.native
    open class AxisBase ()
      extends typings.amcharts.axisBaseMod.default
    
    @JSImport("amcharts", "AmCharts.CategoryAxis")
    @js.native
    open class CategoryAxis ()
      extends typings.amcharts.categoryAxisMod.default
    
    @JSImport("amcharts", "AmCharts.ChartCursor")
    @js.native
    open class ChartCursor ()
      extends typings.amcharts.chartCursorMod.default
    
    @JSImport("amcharts", "AmCharts.ChartScrollbar")
    @js.native
    open class ChartScrollbar ()
      extends typings.amcharts.chartScrollbarMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeArrow")
    @js.native
    open class GaugeArrow ()
      extends typings.amcharts.gaugeArrowMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeAxis")
    @js.native
    open class GaugeAxis ()
      extends typings.amcharts.gaugeAxisMod.default
    
    @JSImport("amcharts", "AmCharts.GaugeBand")
    @js.native
    open class GaugeBand ()
      extends typings.amcharts.gaugeBandMod.default
    
    @JSImport("amcharts", "AmCharts.GraphDataItem")
    @js.native
    open class GraphDataItem ()
      extends typings.amcharts.graphDataItemMod.default
    
    @JSImport("amcharts", "AmCharts.Guide")
    @js.native
    open class Guide ()
      extends typings.amcharts.guideMod.default
    
    // class Image extends _Image { }
    @JSImport("amcharts", "AmCharts.Label")
    @js.native
    open class Label ()
      extends typings.amcharts.labelMod.default
    
    @JSImport("amcharts", "AmCharts.SerialDataItem")
    @js.native
    open class SerialDataItem ()
      extends typings.amcharts.serialDataItemMod.default
    
    @JSImport("amcharts", "AmCharts.Slice")
    @js.native
    open class Slice ()
      extends typings.amcharts.sliceMod.default
    
    @JSImport("amcharts", "AmCharts.Title")
    @js.native
    open class Title ()
      extends typings.amcharts.titleMod.default
    
    @JSImport("amcharts", "AmCharts.TrendLine")
    @js.native
    open class TrendLine ()
      extends typings.amcharts.trendLineMod.default
    
    @JSImport("amcharts", "AmCharts.ValueAxis")
    @js.native
    open class ValueAxis ()
      extends typings.amcharts.valueAxisMod.default
    
    /**
      * Set a method to be called before initializing the chart.
      * When the method is called, the chart instance is passed as an attribute.
      * You can use this feature to preprocess chart data or do some other things you need
      * before initializing the chart.
      * @param handler - The method to be called.
      * @param types - Which chart types should call this method. Defaults to all
      * if none is passed.
      */
    inline def addInitHandler(handler: js.Function0[js.Object]): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("addInitHandler")(handler.asInstanceOf[js.Any]).asInstanceOf[Any]
    inline def addInitHandler(handler: js.Function0[js.Object], types: js.Array[String]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("addInitHandler")(handler.asInstanceOf[js.Any], types.asInstanceOf[js.Any])).asInstanceOf[Any]
    
    /**
      * Set it to true if you have base href set for your page.
      * This will fix rendering problems in Firefox caused by base href.
      */
    @JSImport("amcharts", "AmCharts.baseHref")
    @js.native
    def baseHref: Boolean = js.native
    inline def baseHref_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("baseHref")(x.asInstanceOf[js.Any])
    
    /**
      * Clears all the charts on page, removes listeners and intervals.
      */
    inline def clear(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("clear")().asInstanceOf[Unit]
    
    /**
      * Array of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Sunday', 'Monday', 'Tuesday', 'Wednesday', 'Thursday', 'Friday', 'Saturday']
      */
    @JSImport("amcharts", "AmCharts.dayNames")
    @js.native
    def dayNames: js.Array[String] = js.native
    inline def dayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("dayNames")(x.asInstanceOf[js.Any])
    
    /**
      * Create chart by params.
      */
    inline def makeChart(selector: String, params: Any): AmChart = (^.asInstanceOf[js.Dynamic].applyDynamic("makeChart")(selector.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[AmChart]
    inline def makeChart(selector: String, params: Any, delay: Double): AmChart = (^.asInstanceOf[js.Dynamic].applyDynamic("makeChart")(selector.asInstanceOf[js.Any], params.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[AmChart]
    
    /**
      * Array of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * [
      * 'January', 'February', 'March', 'April', 'May', 'June', 'July', 'August',
      * 'September', 'October', 'November','December'
      * ]
      */
    @JSImport("amcharts", "AmCharts.monthNames")
    @js.native
    def monthNames: js.Array[String] = js.native
    inline def monthNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("monthNames")(x.asInstanceOf[js.Any])
    
    /**
      * Array of short versions of day names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Sun', 'Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat']
      */
    @JSImport("amcharts", "AmCharts.shortDayNames")
    @js.native
    def shortDayNames: js.Array[String] = js.native
    inline def shortDayNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortDayNames")(x.asInstanceOf[js.Any])
    
    /**
      * Array of short versions of month names, used when formatting dates (if categoryAxis.parseDates is set to true)
      * ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec']
      */
    @JSImport("amcharts", "AmCharts.shortMonthNames")
    @js.native
    def shortMonthNames: js.Array[String] = js.native
    inline def shortMonthNames_=(x: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("shortMonthNames")(x.asInstanceOf[js.Any])
    
    /**
      * Set global used AmCharts theme.
      */
    @JSImport("amcharts", "AmCharts.theme")
    @js.native
    def theme: Any = js.native
    inline def theme_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("theme")(x.asInstanceOf[js.Any])
    
    /**
      * Object with existing themes.
      */
    @JSImport("amcharts", "AmCharts.themes")
    @js.native
    def themes: Any = js.native
    inline def themes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("themes")(x.asInstanceOf[js.Any])
    
    /**
      * Set it to true if you want UTC time to be used instead of local time.
      */
    @JSImport("amcharts", "AmCharts.useUTC")
    @js.native
    def useUTC: Boolean = js.native
    inline def useUTC_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("useUTC")(x.asInstanceOf[js.Any])
  }
}
