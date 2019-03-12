package typings
package amchartsLib.amStockChartMod

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
  var balloon: amchartsLib.amBalloonMod.default
  /**
    * Settings for category axes.
    */
  var categoryAxesSettings: amchartsLib.categoryAxesSettingsMod.default
  /**
    * Indicates if the chart is created.
    */
  var chartCreated: scala.Boolean
  /**
    * Chart cursor settings.
    */
  var chartCursorSettings: amchartsLib.chartCursorSettingsMod.default
  /**
    * Chart scrollbar settings.
    */
  var chartScrollbarSettings: amchartsLib.chartScrollbarSettingsMod.default
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
  var dataSetSelector: amchartsLib.dataSetSelectorMod.default
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
  var legendSettings: amchartsLib.legendSettingsMod.default
  /**
    * Data set selected as main.
    */
  var mainDataSet: amchartsLib.dataSetMod.default
  /**
    * Array of StockPanels (charts).
    */
  var panels: js.Array[_]
  /**
    * Settings for stock panels.
    */
  var panelsSettings: amchartsLib.panelSettingsMod.default
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  var periodSelector: amchartsLib.periodSelectorMod.default
  /**
    * Scrollbar's chart object, get only.
    */
  var scrollbarChart: amchartsLib.amSerialChartMod.default
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
  var valueAxesSettings: amchartsLib.valueAxesSettingsMod.default
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
  def addPanel(panel: amchartsLib.stockPanelMod.default): scala.Unit
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanelAt(panel: amchartsLib.stockPanelMod.default, index: scala.Double): scala.Unit
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
  def removeListener(chart: amchartsLib.amChartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def removePanel(panel: amchartsLib.stockPanelMod.default): scala.Unit
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

object AmStockChart {
  @scala.inline
  def apply(
    addListener: (java.lang.String, js.Function1[/* e */ amchartsLib.Anon_ChartDate, scala.Unit]) => scala.Unit,
    addPanel: amchartsLib.stockPanelMod.default => scala.Unit,
    addPanelAt: (amchartsLib.stockPanelMod.default, scala.Double) => scala.Unit,
    animationPlayed: scala.Boolean,
    balloon: amchartsLib.amBalloonMod.default,
    categoryAxesSettings: amchartsLib.categoryAxesSettingsMod.default,
    chartCreated: scala.Boolean,
    chartCursorSettings: amchartsLib.chartCursorSettingsMod.default,
    chartScrollbarSettings: amchartsLib.chartScrollbarSettingsMod.default,
    clear: () => scala.Unit,
    colors: js.Array[_],
    comparedDataSets: js.Array[_],
    dataSetSelector: amchartsLib.dataSetSelectorMod.default,
    dataSets: js.Array[_],
    endDate: stdLib.Date,
    firstDayOfWeek: scala.Double,
    glueToTheEnd: scala.Boolean,
    hideStockEvents: () => scala.Unit,
    legendSettings: amchartsLib.legendSettingsMod.default,
    mainDataSet: amchartsLib.dataSetMod.default,
    panels: js.Array[_],
    panelsSettings: amchartsLib.panelSettingsMod.default,
    periodSelector: amchartsLib.periodSelectorMod.default,
    removeListener: (amchartsLib.amChartMod.default, java.lang.String, js.Any) => scala.Unit,
    removePanel: amchartsLib.stockPanelMod.default => scala.Unit,
    scrollbarChart: amchartsLib.amSerialChartMod.default,
    showStockEvents: () => scala.Unit,
    startDate: stdLib.Date,
    stockEventsSettings: js.Any,
    validateData: () => scala.Unit,
    validateNow: () => scala.Unit,
    valueAxesSettings: amchartsLib.valueAxesSettingsMod.default,
    version: java.lang.String,
    zoom: (stdLib.Date, stdLib.Date) => scala.Unit,
    zoomOut: () => scala.Unit,
    zoomOutOnDataSetChange: scala.Boolean
  ): AmStockChart = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPanel = js.Any.fromFunction1(addPanel), addPanelAt = js.Any.fromFunction2(addPanelAt), animationPlayed = animationPlayed, balloon = balloon, categoryAxesSettings = categoryAxesSettings, chartCreated = chartCreated, chartCursorSettings = chartCursorSettings, chartScrollbarSettings = chartScrollbarSettings, clear = js.Any.fromFunction0(clear), colors = colors, comparedDataSets = comparedDataSets, dataSetSelector = dataSetSelector, dataSets = dataSets, endDate = endDate, firstDayOfWeek = firstDayOfWeek, glueToTheEnd = glueToTheEnd, hideStockEvents = js.Any.fromFunction0(hideStockEvents), legendSettings = legendSettings, mainDataSet = mainDataSet, panels = panels, panelsSettings = panelsSettings, periodSelector = periodSelector, removeListener = js.Any.fromFunction3(removeListener), removePanel = js.Any.fromFunction1(removePanel), scrollbarChart = scrollbarChart, showStockEvents = js.Any.fromFunction0(showStockEvents), startDate = startDate, stockEventsSettings = stockEventsSettings, validateData = js.Any.fromFunction0(validateData), validateNow = js.Any.fromFunction0(validateNow), valueAxesSettings = valueAxesSettings, version = version, zoom = js.Any.fromFunction2(zoom), zoomOut = js.Any.fromFunction0(zoomOut), zoomOutOnDataSetChange = zoomOutOnDataSetChange)
  
    __obj.asInstanceOf[AmStockChart]
  }
}

