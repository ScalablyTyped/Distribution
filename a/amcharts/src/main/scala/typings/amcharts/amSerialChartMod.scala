package typings.amcharts

import typings.amcharts.amRectangularChartMod.AmRectangularChart
import typings.amcharts.amSerialChartMod.AmSerialChart
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AmSerialChart", JSImport.Namespace)
@js.native
object amSerialChartMod extends js.Object {
  @js.native
  trait AmSerialChart extends AmRectangularChart {
    /**
      * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
      * @default 'MMM DD, YYYY'
      */
    var balloonDateFormat: String = js.native
    /**
      * Read-only. Chart creates category axis itself.
      * If you want to change some properties, you should get this axis from the chart and
      * set properties to this object.
      */
    var categoryAxis: typings.amcharts.categoryAxisMod.default = js.native
    /**
      * Category field name tells the chart the name of the field in your dataProvider object
      * which will be used for category axis values.
      */
    var categoryField: String = js.native
    /**
      * The gap in pixels between two columns of the same category.
      * @default 5
      */
    var columnSpacing: Double = js.native
    /**
      * Space between 3D stacked columns.
      * @default 0
      */
    var columnSpacing3D: Double = js.native
    /**
      * Relative width of columns. Value range is 0 - 1.
      * @default 0.8
      */
    var columnWidth: Double = js.native
    /**
      * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
      */
    var endDate: Date = js.native
    /**
      * Read-only. Category index to which the chart is currently displayed.
      */
    var endIndex: Double = js.native
    /**
      * Maximum number of series allowed to select.
      */
    var maxSelectedSeries: Double = js.native
    /**
      * The longest time span allowed to select (in milliseconds) for example
      * 259200000 will limit selection to 3 days.
      */
    var maxSelectedTime: Double = js.native
    /**
      * The shortest time span allowed to select (in milliseconds) for example
      * 1000 will limit selection to 1 second.
      * @default 0
      */
    var minSelectedTime: Double = js.native
    /**
      * Specifies if scrolling of a chart with mouse wheel is enabled.
      * If you press shift while rotating mouse wheel, the chart will zoom-in/out.
      */
    var mouseWheelScrollEnabled: Boolean = js.native
    /**
      * Specifies if zooming of a chart with mouse wheel is enabled.
      * If you press shift while rotating mouse wheel, the chart will scroll.
      */
    var mouseWheelZoomEnabled: Boolean = js.native
    /**
      * If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars).
      */
    var rotate: Boolean = js.native
    /**
      * Read-only.
      * If category axis parses dates startDate indicates date from which the chart is currently displayed.
      */
    var startDate: Date = js.native
    /**
      * Read-only. Category index from which the chart is currently displayed.
      */
    var startIndex: Double = js.native
    /**
      * Specifies if chart should zoom-out when data is updated.
      * @default true
      */
    var zoomOutOnDataUpdate: Boolean = js.native
    /**
      * Number Returns index of the specified category value.
      */
    def getCategoryIndexByValue(value: Double): Unit = js.native
    /**
      * Zooms out, charts shows all available data.
      */
    def zoomOut(): Unit = js.native
    /**
      * Zooms the chart by the value of the category axis.
      */
    def zoomToCategoryValues(start: Date, end: Date): Unit = js.native
    /**
      * Zooms the chart from one date to another.
      */
    def zoomToDates(start: Date, end: Date): Unit = js.native
    /**
      * Zooms the chart by the index of the category.
      */
    def zoomToIndexes(start: Date, end: Date): Unit = js.native
  }
  
  @js.native
  class default () extends AmSerialChart
  
}

