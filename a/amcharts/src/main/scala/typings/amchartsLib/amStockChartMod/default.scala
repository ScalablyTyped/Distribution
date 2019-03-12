package typings
package amchartsLib.amStockChartMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/AmStockChart", JSImport.Default)
@js.native
class default () extends AmStockChart {
  /**
    * Specifies if animation was already played.
    * Animation is only played once, when chart is rendered for the first time.
    * If you want the animation to be repeated, set this property to false.
    */
  /* CompleteClass */
  override var animationPlayed: scala.Boolean = js.native
  /**
    * Balloon object.
    */
  /* CompleteClass */
  override var balloon: amchartsLib.amBalloonMod.default = js.native
  /**
    * Settings for category axes.
    */
  /* CompleteClass */
  override var categoryAxesSettings: amchartsLib.categoryAxesSettingsMod.default = js.native
  /**
    * Indicates if the chart is created.
    */
  /* CompleteClass */
  override var chartCreated: scala.Boolean = js.native
  /**
    * Chart cursor settings.
    */
  /* CompleteClass */
  override var chartCursorSettings: amchartsLib.chartCursorSettingsMod.default = js.native
  /**
    * Chart scrollbar settings.
    */
  /* CompleteClass */
  override var chartScrollbarSettings: amchartsLib.chartScrollbarSettingsMod.default = js.native
  /**
    * Array of colors used by data sets if no color was set explicitly on data set itself.
    * [
    * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
    * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
    * ]
    */
  /* CompleteClass */
  override var colors: js.Array[_] = js.native
  /**
    * Array of data sets selected for comparing.
    */
  /* CompleteClass */
  override var comparedDataSets: js.Array[_] = js.native
  /**
    * DataSetSelector object.
    * You can add it if you have more than one data set and want users to be able to select/compare them.
    */
  /* CompleteClass */
  override var dataSetSelector: amchartsLib.dataSetSelectorMod.default = js.native
  /**
    * Array of DataSets.
    */
  /* CompleteClass */
  override var dataSets: js.Array[_] = js.native
  /**
    * Current end date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  /* CompleteClass */
  override var endDate: stdLib.Date = js.native
  /**
    * Defines on which day week starts. 0 - Sunday, 1 - Monday..
    * @default 1
    */
  /* CompleteClass */
  override var firstDayOfWeek: scala.Double = js.native
  /**
    * If set to true the scope of the data view will be set to the end after data update.
    */
  /* CompleteClass */
  override var glueToTheEnd: scala.Boolean = js.native
  /**
    * Legend settings.
    */
  /* CompleteClass */
  override var legendSettings: amchartsLib.legendSettingsMod.default = js.native
  /**
    * Data set selected as main.
    */
  /* CompleteClass */
  override var mainDataSet: amchartsLib.dataSetMod.default = js.native
  /**
    * Array of StockPanels (charts).
    */
  /* CompleteClass */
  override var panels: js.Array[_] = js.native
  /**
    * Settings for stock panels.
    */
  /* CompleteClass */
  override var panelsSettings: amchartsLib.panelSettingsMod.default = js.native
  /**
    * Period selector object.
    * You can add it if you want user's to be able to enter date ranges or
    * zoom chart with predefined period buttons.
    */
  /* CompleteClass */
  override var periodSelector: amchartsLib.periodSelectorMod.default = js.native
  /**
    * Scrollbar's chart object, get only.
    */
  /* CompleteClass */
  override var scrollbarChart: amchartsLib.amSerialChartMod.default = js.native
  /**
    * Current start date of the selected period, get only.
    * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
    */
  /* CompleteClass */
  override var startDate: stdLib.Date = js.native
  /**
    * Settings for stock events.
    */
  /* CompleteClass */
  override var stockEventsSettings: js.Any = js.native
  /**
    * Settings for value axes.
    */
  /* CompleteClass */
  override var valueAxesSettings: amchartsLib.valueAxesSettingsMod.default = js.native
  /**
    * read-only. Indicates current version of a script.
    */
  /* CompleteClass */
  override var version: java.lang.String = js.native
  /**
    * Specifies whether the chart should zoom-out when main data set is changed.
    */
  /* CompleteClass */
  override var zoomOutOnDataSetChange: scala.Boolean = js.native
  /**
    * Adds event listener.
    * @param type - One of
    * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
    * "rollOverStockEvent", "zoomed".
    * @param handler - The event handler.
    */
  /* CompleteClass */
  override def addListener(`type`: java.lang.String, handler: js.Function1[/* e */ amchartsLib.Anon_ChartDate, scala.Unit]): scala.Unit = js.native
  /**
    * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  /* CompleteClass */
  override def addPanel(panel: amchartsLib.stockPanelMod.default): scala.Unit = js.native
  /**
    * Adds panel to the stock chart at a specified index.
    * Requires stockChart.validateNow() method to be called after this action.
    */
  /* CompleteClass */
  override def addPanelAt(panel: amchartsLib.stockPanelMod.default, index: scala.Double): scala.Unit = js.native
  /**
    * Destroys chart, all timeouts and listeners.
    */
  /* CompleteClass */
  override def clear(): scala.Unit = js.native
  /**
    * Hides event bullets.
    */
  /* CompleteClass */
  override def hideStockEvents(): scala.Unit = js.native
  /**
    * Removes event listener from chart object.
    */
  /* CompleteClass */
  override def removeListener(chart: amchartsLib.amChartMod.default, `type`: java.lang.String, handler: js.Any): scala.Unit = js.native
  /**
    * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
    */
  /* CompleteClass */
  override def removePanel(panel: amchartsLib.stockPanelMod.default): scala.Unit = js.native
  /**
    * Shows event bullets.
    */
  /* CompleteClass */
  override def showStockEvents(): scala.Unit = js.native
  /**
    * Method which should be called after data was changed.
    */
  /* CompleteClass */
  override def validateData(): scala.Unit = js.native
  /**
    * Method which forces the stock chart to rebuild. Should be called after properties are changed.
    */
  /* CompleteClass */
  override def validateNow(): scala.Unit = js.native
  /**
    * Zooms chart to specified dates. startDate, endDate - Date objects.
    */
  /* CompleteClass */
  override def zoom(startDate: stdLib.Date, endDate: stdLib.Date): scala.Unit = js.native
  /**
    * Zooms out the chart.
    */
  /* CompleteClass */
  override def zoomOut(): scala.Unit = js.native
}

