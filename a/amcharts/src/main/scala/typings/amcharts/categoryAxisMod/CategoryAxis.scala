package typings.amcharts.categoryAxisMod

import typings.amcharts.axisBaseMod.AxisBase
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoryAxis extends AxisBase {
  /**
    * When parse dates is on for the category axis, the chart will try to highlight the beginning of the periods,
    * like month, in bold. Set this to false to disable the functionality.
    * @default true
    */
  var boldPeriodBeginning: Boolean
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
  var dateFormats: js.Array[_]
  /**
    * In case your category axis values are Date objects and parseDates is set to true,
    * the chart will parse dates and will place your data points at irregular intervals.
    * However if you want dates to be parsed (displayed on the axis, baloons, etc),
    * but data points to be placed at equal intervals (omiting dates with no data), set equalSpacing to true.
    */
  var equalSpacing: Boolean
  /**
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * Field in data provider which specifies if the category value should always be shown.
    * For example: categoryAxis.forceShowField = "forceShow";
    * And in data:
    * {category:"one", forceShow:true, value:100}
    * Note, this works only when parseDates is set to false.
    */
  var forceShowField: String
  /**
    * Specifies if a grid line is placed on the center of a cell or on the beginning of a cell.
    * Possible values are: "start" and "middle" This setting doesn't work if parseDates is set to true.
    * @default "middle"
    */
  var gridPosition: String
  /**
    * Specifies the shortest period of your data. This should be set only if parseDates is set to "true".
    * Possible period values:
    * fff - milliseconds, ss - seconds, mm - minutes, hh - hours, DD - days, MM - months, YYYY - years.
    * @default "DD"
    */
  var minPeriod: String
  /**
    * Specifies if minor grid should be displayed.
    * NOTE: If equalSpacing is set to true, this setting will be ignored.
    * @default false
    */
  var minorGridEnabled: Boolean
  /**
    * In case your category axis values are Date objects, set this to true.
    * In this case the chart will parse dates and will place your data points at irregular intervals.
    * If you want dates to be parsed, but data points to be placed at equal intervals,
    * set both parseDates and equalSpacing to true.
    */
  var parseDates: Boolean
  /**
    * Specifies whether the graph should start on axis or not.
    * In case you display columns, it is recommended to set this to false.
    * If parseDates is set to true, startOnAxis will allways be false, unless equalSpacing is set to true.
    */
  var startOnAxis: Boolean
  /**
    * Works only when parseDates is set to true and equalSpacing is false.
    * If you set it to true, at the position where bigger period changes,
    * category axis will display date strings of bot small and big period, in two rows.
    * @default false
    */
  var twoLineMode: Boolean
  /**
    * Use line color for bullet
    * @default false
    */
  var useLineColorForBulletBorder: Boolean
  /**
    * Number returns coordinate of a category. Works only if parseDates is false.
    * If parseDates is true, use dateToCoordinate method.
    */
  def categoryToCoordinate(category: String): Unit
  /**
    * date - Date object Returns Date of the coordinate, in case parseDates is set to true and
    * equalSpacing is set to false.
    */
  def coordinateToDate(coordinate: Double): Unit
  /**
    * Number Returns coordinate of the date, in case parseDates is set to true.
    * If parseDates is false, use categoryToCoordinate method.
    */
  def dateToCoordinate(date: Date): Unit
  /**
    * Number Returns index of the category which is most close to specified coordinate.
    */
  def xToIndex(x: Double): Unit
}

object CategoryAxis {
  @scala.inline
  def apply(
    addGuide: typings.amcharts.guideMod.default => Unit,
    autoGridCount: Boolean,
    axisAlpha: Double,
    axisColor: String,
    axisThickness: Double,
    boldPeriodBeginning: Boolean,
    categoryToCoordinate: String => Unit,
    color: String,
    coordinateToDate: Double => Unit,
    dashLength: Double,
    dateFormats: js.Array[_],
    dateToCoordinate: Date => Unit,
    equalSpacing: Boolean,
    fillAlpha: Double,
    fillColor: String,
    fontSize: String,
    forceShowField: String,
    gridAlpha: Double,
    gridColor: String,
    gridCount: Double,
    gridPosition: String,
    gridThickness: Double,
    guides: js.Array[_],
    ignoreAxisWidth: Boolean,
    inside: Boolean,
    labelFrequency: Double,
    labelRotation: Double,
    labelsEnabled: Boolean,
    minPeriod: String,
    minorGridEnabled: Boolean,
    offset: Double,
    parseDates: Boolean,
    position: String,
    removeGuide: typings.amcharts.guideMod.default => Unit,
    showFirstLabel: Boolean,
    showLastLabel: Boolean,
    startOnAxis: Boolean,
    tickLength: Double,
    title: String,
    titleBold: Boolean,
    titleColor: String,
    titlefontSize: String,
    twoLineMode: Boolean,
    useLineColorForBulletBorder: Boolean,
    xToIndex: Double => Unit
  ): CategoryAxis = {
    val __obj = js.Dynamic.literal(addGuide = js.Any.fromFunction1(addGuide), autoGridCount = autoGridCount, axisAlpha = axisAlpha, axisColor = axisColor, axisThickness = axisThickness, boldPeriodBeginning = boldPeriodBeginning, categoryToCoordinate = js.Any.fromFunction1(categoryToCoordinate), color = color, coordinateToDate = js.Any.fromFunction1(coordinateToDate), dashLength = dashLength, dateFormats = dateFormats, dateToCoordinate = js.Any.fromFunction1(dateToCoordinate), equalSpacing = equalSpacing, fillAlpha = fillAlpha, fillColor = fillColor, fontSize = fontSize, forceShowField = forceShowField, gridAlpha = gridAlpha, gridColor = gridColor, gridCount = gridCount, gridPosition = gridPosition, gridThickness = gridThickness, guides = guides, ignoreAxisWidth = ignoreAxisWidth, inside = inside, labelFrequency = labelFrequency, labelRotation = labelRotation, labelsEnabled = labelsEnabled, minPeriod = minPeriod, minorGridEnabled = minorGridEnabled, offset = offset, parseDates = parseDates, position = position, removeGuide = js.Any.fromFunction1(removeGuide), showFirstLabel = showFirstLabel, showLastLabel = showLastLabel, startOnAxis = startOnAxis, tickLength = tickLength, title = title, titleBold = titleBold, titleColor = titleColor, titlefontSize = titlefontSize, twoLineMode = twoLineMode, useLineColorForBulletBorder = useLineColorForBulletBorder, xToIndex = js.Any.fromFunction1(xToIndex))
  
    __obj.asInstanceOf[CategoryAxis]
  }
}

