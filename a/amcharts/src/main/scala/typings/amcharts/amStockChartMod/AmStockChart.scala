package typings.amcharts.amStockChartMod

import typings.amcharts.AnonChartDate
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmStockChart extends js.Object {
  /**
    * Specifies if animation was already played.
    * Animation is only played once, when chart is rendered for the first time.
    * If you want the animation to be repeated, set this property to false.
    */
  var animationPlayed: Boolean
  /**
    * Balloon object.
    */
  var balloon: typings.amcharts.amBalloonMod.default
  /**
    * Settings for category axes.
    */
  var categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default
  /**
    * Indicates if the chart is created.
    */
  var chartCreated: Boolean
  /**
    * Chart cursor settings.
    */
  var chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default
  /**
    * Chart scrollbar settings.
    */
  var chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default
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
  var dataSetSelector: typings.amcharts.dataSetSelectorMod.default
  /**
    * Array of DataSets.
    */
  var dataSets: js.Array[_]
  /**
    * Current end date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var endDate: Date
  /**
    * Defines on which day week starts. 0 - Sunday, 1 - Monday..
    * @default 1
    */
  var firstDayOfWeek: Double
  /**
    * If set to true the scope of the data view will be set to the end after data update.
    */
  var glueToTheEnd: Boolean
  /**
    * Legend settings.
    */
  var legendSettings: typings.amcharts.legendSettingsMod.default
  /**
    * Data set selected as main.
    */
  var mainDataSet: typings.amcharts.dataSetMod.default
  /**
    * Array of StockPanels (charts).
    */
  var panels: js.Array[_]
  /**
    * Settings for stock panels.
    */
  var panelsSettings: typings.amcharts.panelSettingsMod.default
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  var periodSelector: typings.amcharts.periodSelectorMod.default
  /**
    * Scrollbar's chart object, get only.
    */
  var scrollbarChart: typings.amcharts.amSerialChartMod.default
  /**
    * Current start date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  var startDate: Date
  /**
    * Settings for stock events.
    */
  var stockEventsSettings: js.Any
  /**
    * Settings for value axes.
    */
  var valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default
  /**
    * read-only. Indicates current version of a script.
    */
  var version: String
  /**
    * Specifies whether the chart should zoom-out when main data set is changed.
    */
  var zoomOutOnDataSetChange: Boolean
  /**
    * Adds event listener.
    * @param type - One of
    * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
    * "rollOverStockEvent", "zoomed".
    * @param handler - The event handler.
    */
  def addListener(`type`: String, handler: js.Function1[/* e */ AnonChartDate, Unit]): Unit
  /**
    * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanel(panel: typings.amcharts.stockPanelMod.default): Unit
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  def addPanelAt(panel: typings.amcharts.stockPanelMod.default, index: Double): Unit
  /**
    * Destroys chart, all timeouts and listeners.
    */
  def clear(): Unit
  /**
    * Hides event bullets.
    */
  def hideStockEvents(): Unit
  /**
    * Removes event listener from chart object.
    */
  def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: js.Any): Unit
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  def removePanel(panel: typings.amcharts.stockPanelMod.default): Unit
  /**
    * Shows event bullets.
    */
  def showStockEvents(): Unit
  /**
    * Method which should be called after data was changed.
    */
  def validateData(): Unit
  /**
    * Method which forces the stock chart to rebuild. Should be called after properties are changed.
    */
  def validateNow(): Unit
  /**
    * Zooms chart to specified dates. startDate, endDate - Date objects.
    */
  def zoom(startDate: Date, endDate: Date): Unit
  /**
    * Zooms out the chart.
    */
  def zoomOut(): Unit
}

object AmStockChart {
  @scala.inline
  def apply(
    addListener: (String, js.Function1[/* e */ AnonChartDate, Unit]) => Unit,
    addPanel: typings.amcharts.stockPanelMod.default => Unit,
    addPanelAt: (typings.amcharts.stockPanelMod.default, Double) => Unit,
    animationPlayed: Boolean,
    balloon: typings.amcharts.amBalloonMod.default,
    categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default,
    chartCreated: Boolean,
    chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default,
    chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default,
    clear: () => Unit,
    colors: js.Array[_],
    comparedDataSets: js.Array[_],
    dataSetSelector: typings.amcharts.dataSetSelectorMod.default,
    dataSets: js.Array[_],
    endDate: Date,
    firstDayOfWeek: Double,
    glueToTheEnd: Boolean,
    hideStockEvents: () => Unit,
    legendSettings: typings.amcharts.legendSettingsMod.default,
    mainDataSet: typings.amcharts.dataSetMod.default,
    panels: js.Array[_],
    panelsSettings: typings.amcharts.panelSettingsMod.default,
    periodSelector: typings.amcharts.periodSelectorMod.default,
    removeListener: (typings.amcharts.amChartMod.default, String, js.Any) => Unit,
    removePanel: typings.amcharts.stockPanelMod.default => Unit,
    scrollbarChart: typings.amcharts.amSerialChartMod.default,
    showStockEvents: () => Unit,
    startDate: Date,
    stockEventsSettings: js.Any,
    validateData: () => Unit,
    validateNow: () => Unit,
    valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default,
    version: String,
    zoom: (Date, Date) => Unit,
    zoomOut: () => Unit,
    zoomOutOnDataSetChange: Boolean
  ): AmStockChart = {
    val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPanel = js.Any.fromFunction1(addPanel), addPanelAt = js.Any.fromFunction2(addPanelAt), animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], hideStockEvents = js.Any.fromFunction0(hideStockEvents), legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), removePanel = js.Any.fromFunction1(removePanel), scrollbarChart = scrollbarChart.asInstanceOf[js.Any], showStockEvents = js.Any.fromFunction0(showStockEvents), startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], validateData = js.Any.fromFunction0(validateData), validateNow = js.Any.fromFunction0(validateNow), valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoom = js.Any.fromFunction2(zoom), zoomOut = js.Any.fromFunction0(zoomOut), zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AmStockChart]
  }
}

