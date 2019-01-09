package typings
package amchartsLib.amstockchartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmStockChart extends js.Object {
  /**
    * Specifies if animation was already played.
    * Animation is only played once, when chart is rendered for the first time.
    * If you want the animation to be repeated, set this property to false.
    */
  var animationPlayed: scala.Boolean
  /**
    * Balloon object.
    */
  var balloon: amchartsLib.amballoonMod.default
  /**
    * Settings for category axes.
    */
  var categoryAxesSettings: amchartsLib.categoryaxessettingsMod.default
  /**
    * Indicates if the chart is created.
    */
  var chartCreated: scala.Boolean
  /**
    * Chart cursor settings.
    */
  var chartCursorSettings: amchartsLib.chartcursorsettingsMod.default
  /**
    * Chart scrollbar settings.
    */
  var chartScrollbarSettings: amchartsLib.chartscrollbarsettingsMod.default
  /**
    * Array of colors used by data sets if no color was set explicitly on data set itself.
    * [
    * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
    * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
    * ]
    */
  var colors: js.Array[_]
  /**
    * Array of data sets selected for comparing.
    */
  var comparedDataSets: js.Array[_]
  /**
    * DataSetSelector object.
    * You can add it if you have more than one data set and want users to be able to select/compare them.
    */
  var dataSetSelector: amchartsLib.datasetselectorMod.default
  /**
    * Array of DataSets.
    */
  var dataSets: js.Array[_]
  /**
    * Current end date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var endDate: stdLib.Date
  /**
    * Defines on which day week starts. 0 - Sunday, 1 - Monday..
    * @default 1
    */
  var firstDayOfWeek: scala.Double
  /**
    * If set to true the scope of the data view will be set to the end after data update.
    */
  var glueToTheEnd: scala.Boolean
  /**
    * Legend settings.
    */
  var legendSettings: amchartsLib.legendsettingsMod.default
  /**
    * Data set selected as main.
    */
  var mainDataSet: amchartsLib.datasetMod.default
  /**
    * Array of StockPanels (charts).
    */
  var panels: js.Array[_]
  /**
    * Settings for stock panels.
    */
  var panelsSettings: amchartsLib.panelsettingsMod.default
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  var periodSelector: amchartsLib.periodselectorMod.default
  /**
    * Scrollbar's chart object, get only.
    */
  var scrollbarChart: amchartsLib.amserialchartMod.default
  /**
    * Current start date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var startDate: stdLib.Date
  /**
    * Settings for stock events.
    */
  var stockEventsSettings: js.Any
  /**
    * Settings for value axes.
    */
  var valueAxesSettings: amchartsLib.valueaxessettingsMod.default
  /**
    * read-only. Indicates current version of a script.
    */
  var version: java.lang.String
  /**
    * Specifies whether the chart should zoom-out when main data set is changed.
    */
  var zoomOutOnDataSetChange: scala.Boolean
  /**
    * Adds event listener.
    * @param type - One of
    * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
    * "rollOverStockEvent", "zoomed".
    * @param handler - The event handler.
    */
  def addListener(`type`: java.lang.String, handler: js.Function1[/* e */ amchartsLib.Anon_ChartDate, scala.Unit]): scala.Unit
  /**
    * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanel(panel: amchartsLib.stockpanelMod.default): scala.Unit
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanelAt(panel: amchartsLib.stockpanelMod.default, index: scala.Double): scala.Unit
  /**
    * Destroys chart, all timeouts and listeners.
    */
  def clear(): scala.Unit
  /**
    * Hides event bullets.
    */
  def hideStockEvents(): scala.Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: amchartsLib.amchartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def removePanel(panel: amchartsLib.stockpanelMod.default): scala.Unit
  /**
    * Shows event bullets.
    */
  def showStockEvents(): scala.Unit
  /**
    * Method which should be called after data was changed.
    */
  def validateData(): scala.Unit
  /**
    * Method which forces the stock chart to rebuild. Should be called after properties are changed.
    */
  def validateNow(): scala.Unit
  /**
    * Zooms chart to specified dates. startDate, endDate - Date objects.
    */
  def zoom(startDate: stdLib.Date, endDate: stdLib.Date): scala.Unit
  /**
    * Zooms out the chart.
    */
  def zoomOut(): scala.Unit
}

