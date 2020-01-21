package typings.amcharts.mod.AmCharts

import typings.amcharts.guideMod.default
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts", "AmCharts.CategoryAxis")
@js.native
class CategoryAxis ()
  extends typings.amcharts.categoryAxisMod.CategoryAxis {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    * @default true
    */
  /* CompleteClass */
  override var autoGridCount: Boolean = js.native
  /**
    * Axis opacity. Value range is 0 - 1.
    * @default 1
    */
  /* CompleteClass */
  override var axisAlpha: Double = js.native
  /**
    * Axis color.  #000000
    */
  /* CompleteClass */
  override var axisColor: String = js.native
  /**
    * Thickness of the axis.
    * @default 1
    */
  /* CompleteClass */
  override var axisThickness: Double = js.native
  /**
    * When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods,
    * like month, in bold. Set this to false to disable the functionality.
    * @default true
    */
  /* CompleteClass */
  override var boldPeriodBeginning: Boolean = js.native
  /**
    * Color of axis value labels. Will use chart's color if not set.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Length of a dash. 0 means line is not dashed.
    */
  /* CompleteClass */
  override var dashLength: Double = js.native
  /**
    * Date formats of different periods. Possible period values:
    * fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, WW - weeks, YYYY - years.
    * Check this page for date formatting strings.
    * [
    *     {period:'fff',format:'JJ:NN:SS'},
    *     {period:'ss',format:'JJ:NN:SS'},
    *     {period:'mm',format:'JJ:NN'},
    *     {period:'hh',format:'JJ:NN'},
    *     {period:'DD',format:'MMM DD'},
    *     {period:'WW',format:'MMM DD'},
    *     {period:'MM',format:'MMM'},
    *     {period:'YYYY',format:'YYYY'}
    * ]
    */
  /* CompleteClass */
  override var dateFormats: js.Array[_] = js.native
  /**
    * In case your category axis values are Date objects and parseDates is set to true,
    * the chart will parse dates and will place your data points at irregular intervals.
    * However if you want dates to be parsed (displayed on the axis, baloons, etc),
    * but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true.
    */
  /* CompleteClass */
  override var equalSpacing: Boolean = js.native
  /**
    * Fill opacity. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    */
  /* CompleteClass */
  override var fillAlpha: Double = js.native
  /**
    * Fill color. Every second space between grid lines can be filled with color.
    * Set fillAlpha to a value greater than 0 to see the fills.
    * @default "#FFFFFF"
    */
  /* CompleteClass */
  override var fillColor: String = js.native
  /**
    * Size of value labels text. Will use chart's fontSize if not set.
    */
  /* CompleteClass */
  override var fontSize: String = js.native
  /**
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * And in data:
    * {category:"one", forceShow:true, value:100}
    * Note, this works only when parseDates is set to false.
    */
  /* CompleteClass */
  override var forceShowField: String = js.native
  /**
    * Opacity of grid lines. 0.2
    */
  /* CompleteClass */
  override var gridAlpha: Double = js.native
  /**
    * Color of grid lines. #000000
    */
  /* CompleteClass */
  override var gridColor: String = js.native
  /**
    * Number of grid lines. In case this is value axis, or your categoryAxis parses dates,
    * the number is approximate. The default value is 5. If you set autoGridCount to true,
    * this property is ignored.
    * @default 5
    */
  /* CompleteClass */
  override var gridCount: Double = js.native
  /**
    * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell.
    * Possible values are: "start" and "middle" This setting doesn't work if parseDates is set to true.
    * @default "middle"
    */
  /* CompleteClass */
  override var gridPosition: String = js.native
  /**
    * Thickness of grid lines.
    * @default 1
    */
  /* CompleteClass */
  override var gridThickness: Double = js.native
  /**
    * The array of guides belonging to this axis.
    */
  /* CompleteClass */
  override var guides: js.Array[_] = js.native
  /**
    * If autoMargins of a chart is set to true, but you want this axis not to be measured when calculating margin,
    * set ignoreAxisWidth to true.
    */
  /* CompleteClass */
  override var ignoreAxisWidth: Boolean = js.native
  /**
    * Specifies whether values should be placed inside or outside plot area.
    */
  /* CompleteClass */
  override var inside: Boolean = js.native
  /**
    * Frequency at which labels should be placed. Doesn't work for CategoryAxis if parseDates is set to true.
    * @default 1
    */
  /* CompleteClass */
  override var labelFrequency: Double = js.native
  /**
    * Rotation angle of a label. Only horizontal axis' values can be rotated.
    * If you set this for vertical axis, the setting will be ignored.
    */
  /* CompleteClass */
  override var labelRotation: Double = js.native
  /**
    * Specifies whether axis displays category axis' labels and value axis' values.
    * @default true
    */
  /* CompleteClass */
  override var labelsEnabled: Boolean = js.native
  /**
    * Specifies the shortest period of your data. This should be set only if parseDates is set to "true".
    * Possible period values:
    * fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years.
    * @default "DD"
    */
  /* CompleteClass */
  override var minPeriod: String = js.native
  /**
    * Specifies if minor grid should be displayed.
    * NOTE: If equalSpacing is set to true, this setting will be ignored.
    * @default false
    */
  /* CompleteClass */
  override var minorGridEnabled: Boolean = js.native
  /**
    * The distance of the axis to the plot area, in pixels. Negative values can also be used.
    */
  /* CompleteClass */
  override var offset: Double = js.native
  /**
    * In case your category axis values are Date objects, set this to true.
    * In this case the chart will parse dates and will place your data points at irregular intervals.
    * If you want dates to be parsed, but data points to be placed at equal intervals,
    * set both parseDates and equalSpacing to true.
    */
  /* CompleteClass */
  override var parseDates: Boolean = js.native
  /**
    * Possible values are: "top", "bottom", "left", "right".
    * If axis is vertical, default position is "left".
    * If axis is horizontal, default position is "bottom".
    */
  /* CompleteClass */
  override var position: String = js.native
  /**
    * Whether to show first axis label or not.
    * @default true
    */
  /* CompleteClass */
  override var showFirstLabel: Boolean = js.native
  /**
    * Whether to show last axis label or not.
    * @default true
    */
  /* CompleteClass */
  override var showLastLabel: Boolean = js.native
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true.
    */
  /* CompleteClass */
  override var startOnAxis: Boolean = js.native
  /**
    * Length of the tick marks.
    * @default 5
    */
  /* CompleteClass */
  override var tickLength: Double = js.native
  /**
    * Title of the axis.
    */
  /* CompleteClass */
  override var title: String = js.native
  /**
    * Specifies if title should be bold or not.
    * @default true
    */
  /* CompleteClass */
  override var titleBold: Boolean = js.native
  /**
    * Color of axis title. Will use text color of chart if not set any.
    */
  /* CompleteClass */
  override var titleColor: String = js.native
  /**
    * Font size of axis title. Will use font size of chart plus two pixels if not set any.
    */
  /* CompleteClass */
  override var titlefontSize: String = js.native
  /**
    * Works only when parseDates is set to true and equalSpacing is false.
    * If you set it to true, at the position where bigger period changes,
    * category axis will display date strings of bot small and big period, in two rows.
    * @default false
    */
  /* CompleteClass */
  override var twoLineMode: Boolean = js.native
  /**
    * Use line color for bullet
    * @default false
    */
  /* CompleteClass */
  override var useLineColorForBulletBorder: Boolean = js.native
  /**
    * Adds guide to the axis.
    */
  /* CompleteClass */
  override def addGuide(guide: default): Unit = js.native
  /**
    * Number returns coordinate of a category. Works only if parseDates is false.
    * If parseDates is true, use dateToCoordinate method.
    */
  /* CompleteClass */
  override def categoryToCoordinate(category: String): Unit = js.native
  /**
    * date - Date object Returns Date of the coordinate, in case parseDates is set to true and
    * equalSpacing is set to false.
    */
  /* CompleteClass */
  override def coordinateToDate(coordinate: Double): Unit = js.native
  /**
    * Number Returns coordinate of the date, in case parseDates is set to true.
    * If parseDates is false, use categoryToCoordinate method.
    */
  /* CompleteClass */
  override def dateToCoordinate(date: Date): Unit = js.native
  /**
    * Removes guide from the axis.
    */
  /* CompleteClass */
  override def removeGuide(guide: default): Unit = js.native
  /**
    * Number Returns index of the category which is most close to specified coordinate.
    */
  /* CompleteClass */
  override def xToIndex(x: Double): Unit = js.native
}

