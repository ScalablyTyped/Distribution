package typings
package amchartsLib.amserialchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmSerialChart
  extends amchartsLib.amrectangularchartMod.default {
  /**
    * Date format of the graph balloon (if chart parses dates and you don't use chartCursor).
    * @default 'MMM DD, YYYY'
    */
  var balloonDateFormat: java.lang.String = js.native
  /**
    * Read-only. Chart creates category axis itself.
    * If you want to change some properties, you should get this axis from the chart and
    * set properties to this object.
    */
  var categoryAxis: amchartsLib.categoryaxisMod.default = js.native
  /**
    * Category field name tells the chart the name of the field in your dataProvider object
    * which will be used for category axis values.
    */
  var categoryField: java.lang.String = js.native
  /**
    * The gap in pixels between two columns of the same category.
    * @default 5
    */
  var columnSpacing: scala.Double = js.native
  /**
    * Space between 3D stacked columns.
    * @default 0
    */
  var columnSpacing3D: scala.Double = js.native
  /**
    * Relative width of columns. Value range is 0 - 1.
    * @default 0.8
    */
  var columnWidth: scala.Double = js.native
  /**
    * Read-only. If category axis parses dates endDate indicates date to which the chart is currently displayed.
    */
  var endDate: stdLib.Date = js.native
  /**
    * Read-only. Category index to which the chart is currently displayed.
    */
  var endIndex: scala.Double = js.native
  /**
    * Maximum number of series allowed to select.
    */
  var maxSelectedSeries: scala.Double = js.native
  /**
    * The longest time span allowed to select (in milliseconds) for example
    * 259200000 will limit selection to 3 days.
    */
  var maxSelectedTime: scala.Double = js.native
  /**
    * The shortest time span allowed to select (in milliseconds) for example
    * 1000 will limit selection to 1 second.
    * @default 0
    */
  var minSelectedTime: scala.Double = js.native
  /**
    * Specifies if scrolling of a chart with mouse wheel is enabled.
    * If you press shift while rotating mouse wheel, the chart will zoom-in/out.
    */
  var mouseWheelScrollEnabled: scala.Boolean = js.native
  /**
    * Specifies if zooming of a chart with mouse wheel is enabled.
    * If you press shift while rotating mouse wheel, the chart will scroll.
    */
  var mouseWheelZoomEnabled: scala.Boolean = js.native
  /**
    * If you set this to true, the chart will be rotated by 90 degrees (the columns will become bars).
    */
  var rotate: scala.Boolean = js.native
  /**
    * Read-only.
    * If category axis parses dates startDate indicates date from which the chart is currently displayed.
    */
  var startDate: stdLib.Date = js.native
  /**
    * Read-only. Category index from which the chart is currently displayed.
    */
  var startIndex: scala.Double = js.native
  /**
    * Specifies if chart should zoom-out when data is updated.
    * @default true
    */
  var zoomOutOnDataUpdate: scala.Boolean = js.native
  /**
    * Number Returns index of the specified category value.
    */
  def getCategoryIndexByValue(value: scala.Double): scala.Unit = js.native
  /**
    * Zooms out, charts shows all available data.
    */
  def zoomOut(): scala.Unit = js.native
  /**
    * Zooms the chart by the value of the category axis.
    */
  def zoomToCategoryValues(start: stdLib.Date, end: stdLib.Date): scala.Unit = js.native
  /**
    * Zooms the chart from one date to another.
    */
  def zoomToDates(start: stdLib.Date, end: stdLib.Date): scala.Unit = js.native
  /**
    * Zooms the chart by the index of the category.
    */
  def zoomToIndexes(start: stdLib.Date, end: stdLib.Date): scala.Unit = js.native
}

