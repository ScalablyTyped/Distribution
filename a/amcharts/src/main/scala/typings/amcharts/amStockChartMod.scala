package typings.amcharts

import typings.amcharts.anon.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amStockChartMod {
  
  @JSImport("amcharts/AmStockChart", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with AmStockChart {
    
    /**
      * Adds event listener.
      * @param type - One of
      * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
      * "rollOverStockEvent", "zoomed".
      * @param handler - The event handler.
      */
    /* CompleteClass */
    override def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit = js.native
    
    /**
      * Adds panel to the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def addPanel(panel: typings.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Adds panel to the stock chart at a specified index.
      * Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def addPanelAt(panel: typings.amcharts.stockPanelMod.default, index: Double): Unit = js.native
    
    /**
      * Specifies if animation was already played.
      * Animation is only played once, when chart is rendered for the first time.
      * If you want the animation to be repeated, set this property to false.
      */
    /* CompleteClass */
    var animationPlayed: Boolean = js.native
    
    /**
      * Balloon object.
      */
    /* CompleteClass */
    var balloon: typings.amcharts.amBalloonMod.default = js.native
    
    /**
      * Settings for category axes.
      */
    /* CompleteClass */
    var categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default = js.native
    
    /**
      * Indicates if the chart is created.
      */
    /* CompleteClass */
    var chartCreated: Boolean = js.native
    
    /**
      * Chart cursor settings.
      */
    /* CompleteClass */
    var chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default = js.native
    
    /**
      * Chart scrollbar settings.
      */
    /* CompleteClass */
    var chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default = js.native
    
    /**
      * Destroys chart, all timeouts and listeners.
      */
    /* CompleteClass */
    override def clear(): Unit = js.native
    
    /**
      * Array of colors used by data sets if no color was set explicitly on data set itself.
      * [
      * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
      * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
      * ]
      */
    /* CompleteClass */
    var colors: js.Array[Any] = js.native
    
    /**
      * Array of data sets selected for comparing.
      */
    /* CompleteClass */
    var comparedDataSets: js.Array[Any] = js.native
    
    /**
      * DataSetSelector object.
      * You can add it if you have more than one data set and want users to be able to select/compare them.
      */
    /* CompleteClass */
    var dataSetSelector: typings.amcharts.dataSetSelectorMod.default = js.native
    
    /**
      * Array of DataSets.
      */
    /* CompleteClass */
    var dataSets: js.Array[Any] = js.native
    
    /**
      * Current end date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    /* CompleteClass */
    var endDate: js.Date = js.native
    
    /**
      * Defines on which day week starts. 0 - Sunday, 1 - Monday..
      * @default 1
      */
    /* CompleteClass */
    var firstDayOfWeek: Double = js.native
    
    /**
      * If set to true the scope of the data view will be set to the end after data update.
      */
    /* CompleteClass */
    var glueToTheEnd: Boolean = js.native
    
    /**
      * Hides event bullets.
      */
    /* CompleteClass */
    override def hideStockEvents(): Unit = js.native
    
    /**
      * Legend settings.
      */
    /* CompleteClass */
    var legendSettings: typings.amcharts.legendSettingsMod.default = js.native
    
    /**
      * Data set selected as main.
      */
    /* CompleteClass */
    var mainDataSet: typings.amcharts.dataSetMod.default = js.native
    
    /**
      * Array of StockPanels (charts).
      */
    /* CompleteClass */
    var panels: js.Array[Any] = js.native
    
    /**
      * Settings for stock panels.
      */
    /* CompleteClass */
    var panelsSettings: typings.amcharts.panelSettingsMod.default = js.native
    
    /**
      * Period selector object.
      * You can add it if you want user's to be able to enter date ranges or
      * zoom chart with predefined period buttons.
      */
    /* CompleteClass */
    var periodSelector: typings.amcharts.periodSelectorMod.default = js.native
    
    /**
      * Removes event listener from chart object.
      */
    /* CompleteClass */
    override def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: Any): Unit = js.native
    
    /**
      * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    /* CompleteClass */
    override def removePanel(panel: typings.amcharts.stockPanelMod.default): Unit = js.native
    
    /**
      * Scrollbar's chart object, get only.
      */
    /* CompleteClass */
    var scrollbarChart: typings.amcharts.amSerialChartMod.default = js.native
    
    /**
      * Shows event bullets.
      */
    /* CompleteClass */
    override def showStockEvents(): Unit = js.native
    
    /**
      * Current start date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    /* CompleteClass */
    var startDate: js.Date = js.native
    
    /**
      * Settings for stock events.
      */
    /* CompleteClass */
    var stockEventsSettings: Any = js.native
    
    /**
      * Method which should be called after data was changed.
      */
    /* CompleteClass */
    override def validateData(): Unit = js.native
    
    /**
      * Method which forces the stock chart to rebuild. Should be called after properties are changed.
      */
    /* CompleteClass */
    override def validateNow(): Unit = js.native
    
    /**
      * Settings for value axes.
      */
    /* CompleteClass */
    var valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default = js.native
    
    /**
      * read-only. Indicates current version of a script.
      */
    /* CompleteClass */
    var version: String = js.native
    
    /**
      * Zooms chart to specified dates. startDate, endDate - Date objects.
      */
    /* CompleteClass */
    override def zoom(startDate: js.Date, endDate: js.Date): Unit = js.native
    
    /**
      * Zooms out the chart.
      */
    /* CompleteClass */
    override def zoomOut(): Unit = js.native
    
    /**
      * Specifies whether the chart should zoom-out when main data set is changed.
      */
    /* CompleteClass */
    var zoomOutOnDataSetChange: Boolean = js.native
  }
  
  trait AmStockChart extends StObject {
    
    /**
      * Adds event listener.
      * @param type - One of
      * "buildStarted", "clickStockEvent", "dataUpdated", "init", "panelRemoved", "rendered", "rollOutStockEvent",
      * "rollOverStockEvent", "zoomed".
      * @param handler - The event handler.
      */
    def addListener(`type`: String, handler: js.Function1[/* e */ Date, Unit]): Unit
    
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
      * Destroys chart, all timeouts and listeners.
      */
    def clear(): Unit
    
    /**
      * Array of colors used by data sets if no color was set explicitly on data set itself.
      * [
      * #FF6600, "#FCD202", "#B0DE09", "#0D8ECF", "#2A0CD0", "#CD0D74", "#CC0000",
      * "#00CC00", "#0000CC", "#DDDDDD", "#999999", "#333333", "#990000"
      * ]
      */
    var colors: js.Array[Any]
    
    /**
      * Array of data sets selected for comparing.
      */
    var comparedDataSets: js.Array[Any]
    
    /**
      * DataSetSelector object.
      * You can add it if you have more than one data set and want users to be able to select/compare them.
      */
    var dataSetSelector: typings.amcharts.dataSetSelectorMod.default
    
    /**
      * Array of DataSets.
      */
    var dataSets: js.Array[Any]
    
    /**
      * Current end date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    var endDate: js.Date
    
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
      * Hides event bullets.
      */
    def hideStockEvents(): Unit
    
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
    var panels: js.Array[Any]
    
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
      * Removes event listener from chart object.
      */
    def removeListener(chart: typings.amcharts.amChartMod.default, `type`: String, handler: Any): Unit
    
    /**
      * Removes panel from the stock chart. Requires stockChart.validateNow() method to be called after this action.
      */
    def removePanel(panel: typings.amcharts.stockPanelMod.default): Unit
    
    /**
      * Scrollbar's chart object, get only.
      */
    var scrollbarChart: typings.amcharts.amSerialChartMod.default
    
    /**
      * Shows event bullets.
      */
    def showStockEvents(): Unit
    
    /**
      * Current start date of the selected period, get only.
      * To set start/end dates, use stockChart.zoom(startDate, endDate) method.
      */
    var startDate: js.Date
    
    /**
      * Settings for stock events.
      */
    var stockEventsSettings: Any
    
    /**
      * Method which should be called after data was changed.
      */
    def validateData(): Unit
    
    /**
      * Method which forces the stock chart to rebuild. Should be called after properties are changed.
      */
    def validateNow(): Unit
    
    /**
      * Settings for value axes.
      */
    var valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default
    
    /**
      * read-only. Indicates current version of a script.
      */
    var version: String
    
    /**
      * Zooms chart to specified dates. startDate, endDate - Date objects.
      */
    def zoom(startDate: js.Date, endDate: js.Date): Unit
    
    /**
      * Zooms out the chart.
      */
    def zoomOut(): Unit
    
    /**
      * Specifies whether the chart should zoom-out when main data set is changed.
      */
    var zoomOutOnDataSetChange: Boolean
  }
  object AmStockChart {
    
    inline def apply(
      addListener: (String, js.Function1[/* e */ Date, Unit]) => Unit,
      addPanel: typings.amcharts.stockPanelMod.default => Unit,
      addPanelAt: (typings.amcharts.stockPanelMod.default, Double) => Unit,
      animationPlayed: Boolean,
      balloon: typings.amcharts.amBalloonMod.default,
      categoryAxesSettings: typings.amcharts.categoryAxesSettingsMod.default,
      chartCreated: Boolean,
      chartCursorSettings: typings.amcharts.chartCursorSettingsMod.default,
      chartScrollbarSettings: typings.amcharts.chartScrollbarSettingsMod.default,
      clear: () => Unit,
      colors: js.Array[Any],
      comparedDataSets: js.Array[Any],
      dataSetSelector: typings.amcharts.dataSetSelectorMod.default,
      dataSets: js.Array[Any],
      endDate: js.Date,
      firstDayOfWeek: Double,
      glueToTheEnd: Boolean,
      hideStockEvents: () => Unit,
      legendSettings: typings.amcharts.legendSettingsMod.default,
      mainDataSet: typings.amcharts.dataSetMod.default,
      panels: js.Array[Any],
      panelsSettings: typings.amcharts.panelSettingsMod.default,
      periodSelector: typings.amcharts.periodSelectorMod.default,
      removeListener: (typings.amcharts.amChartMod.default, String, Any) => Unit,
      removePanel: typings.amcharts.stockPanelMod.default => Unit,
      scrollbarChart: typings.amcharts.amSerialChartMod.default,
      showStockEvents: () => Unit,
      startDate: js.Date,
      stockEventsSettings: Any,
      validateData: () => Unit,
      validateNow: () => Unit,
      valueAxesSettings: typings.amcharts.valueAxesSettingsMod.default,
      version: String,
      zoom: (js.Date, js.Date) => Unit,
      zoomOut: () => Unit,
      zoomOutOnDataSetChange: Boolean
    ): AmStockChart = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction2(addListener), addPanel = js.Any.fromFunction1(addPanel), addPanelAt = js.Any.fromFunction2(addPanelAt), animationPlayed = animationPlayed.asInstanceOf[js.Any], balloon = balloon.asInstanceOf[js.Any], categoryAxesSettings = categoryAxesSettings.asInstanceOf[js.Any], chartCreated = chartCreated.asInstanceOf[js.Any], chartCursorSettings = chartCursorSettings.asInstanceOf[js.Any], chartScrollbarSettings = chartScrollbarSettings.asInstanceOf[js.Any], clear = js.Any.fromFunction0(clear), colors = colors.asInstanceOf[js.Any], comparedDataSets = comparedDataSets.asInstanceOf[js.Any], dataSetSelector = dataSetSelector.asInstanceOf[js.Any], dataSets = dataSets.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], firstDayOfWeek = firstDayOfWeek.asInstanceOf[js.Any], glueToTheEnd = glueToTheEnd.asInstanceOf[js.Any], hideStockEvents = js.Any.fromFunction0(hideStockEvents), legendSettings = legendSettings.asInstanceOf[js.Any], mainDataSet = mainDataSet.asInstanceOf[js.Any], panels = panels.asInstanceOf[js.Any], panelsSettings = panelsSettings.asInstanceOf[js.Any], periodSelector = periodSelector.asInstanceOf[js.Any], removeListener = js.Any.fromFunction3(removeListener), removePanel = js.Any.fromFunction1(removePanel), scrollbarChart = scrollbarChart.asInstanceOf[js.Any], showStockEvents = js.Any.fromFunction0(showStockEvents), startDate = startDate.asInstanceOf[js.Any], stockEventsSettings = stockEventsSettings.asInstanceOf[js.Any], validateData = js.Any.fromFunction0(validateData), validateNow = js.Any.fromFunction0(validateNow), valueAxesSettings = valueAxesSettings.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any], zoom = js.Any.fromFunction2(zoom), zoomOut = js.Any.fromFunction0(zoomOut), zoomOutOnDataSetChange = zoomOutOnDataSetChange.asInstanceOf[js.Any])
      __obj.asInstanceOf[AmStockChart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmStockChart] (val x: Self) extends AnyVal {
      
      inline def setAddListener(value: (String, js.Function1[/* e */ Date, Unit]) => Unit): Self = StObject.set(x, "addListener", js.Any.fromFunction2(value))
      
      inline def setAddPanel(value: typings.amcharts.stockPanelMod.default => Unit): Self = StObject.set(x, "addPanel", js.Any.fromFunction1(value))
      
      inline def setAddPanelAt(value: (typings.amcharts.stockPanelMod.default, Double) => Unit): Self = StObject.set(x, "addPanelAt", js.Any.fromFunction2(value))
      
      inline def setAnimationPlayed(value: Boolean): Self = StObject.set(x, "animationPlayed", value.asInstanceOf[js.Any])
      
      inline def setBalloon(value: typings.amcharts.amBalloonMod.default): Self = StObject.set(x, "balloon", value.asInstanceOf[js.Any])
      
      inline def setCategoryAxesSettings(value: typings.amcharts.categoryAxesSettingsMod.default): Self = StObject.set(x, "categoryAxesSettings", value.asInstanceOf[js.Any])
      
      inline def setChartCreated(value: Boolean): Self = StObject.set(x, "chartCreated", value.asInstanceOf[js.Any])
      
      inline def setChartCursorSettings(value: typings.amcharts.chartCursorSettingsMod.default): Self = StObject.set(x, "chartCursorSettings", value.asInstanceOf[js.Any])
      
      inline def setChartScrollbarSettings(value: typings.amcharts.chartScrollbarSettingsMod.default): Self = StObject.set(x, "chartScrollbarSettings", value.asInstanceOf[js.Any])
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setColors(value: js.Array[Any]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
      
      inline def setColorsVarargs(value: Any*): Self = StObject.set(x, "colors", js.Array(value*))
      
      inline def setComparedDataSets(value: js.Array[Any]): Self = StObject.set(x, "comparedDataSets", value.asInstanceOf[js.Any])
      
      inline def setComparedDataSetsVarargs(value: Any*): Self = StObject.set(x, "comparedDataSets", js.Array(value*))
      
      inline def setDataSetSelector(value: typings.amcharts.dataSetSelectorMod.default): Self = StObject.set(x, "dataSetSelector", value.asInstanceOf[js.Any])
      
      inline def setDataSets(value: js.Array[Any]): Self = StObject.set(x, "dataSets", value.asInstanceOf[js.Any])
      
      inline def setDataSetsVarargs(value: Any*): Self = StObject.set(x, "dataSets", js.Array(value*))
      
      inline def setEndDate(value: js.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setFirstDayOfWeek(value: Double): Self = StObject.set(x, "firstDayOfWeek", value.asInstanceOf[js.Any])
      
      inline def setGlueToTheEnd(value: Boolean): Self = StObject.set(x, "glueToTheEnd", value.asInstanceOf[js.Any])
      
      inline def setHideStockEvents(value: () => Unit): Self = StObject.set(x, "hideStockEvents", js.Any.fromFunction0(value))
      
      inline def setLegendSettings(value: typings.amcharts.legendSettingsMod.default): Self = StObject.set(x, "legendSettings", value.asInstanceOf[js.Any])
      
      inline def setMainDataSet(value: typings.amcharts.dataSetMod.default): Self = StObject.set(x, "mainDataSet", value.asInstanceOf[js.Any])
      
      inline def setPanels(value: js.Array[Any]): Self = StObject.set(x, "panels", value.asInstanceOf[js.Any])
      
      inline def setPanelsSettings(value: typings.amcharts.panelSettingsMod.default): Self = StObject.set(x, "panelsSettings", value.asInstanceOf[js.Any])
      
      inline def setPanelsVarargs(value: Any*): Self = StObject.set(x, "panels", js.Array(value*))
      
      inline def setPeriodSelector(value: typings.amcharts.periodSelectorMod.default): Self = StObject.set(x, "periodSelector", value.asInstanceOf[js.Any])
      
      inline def setRemoveListener(value: (typings.amcharts.amChartMod.default, String, Any) => Unit): Self = StObject.set(x, "removeListener", js.Any.fromFunction3(value))
      
      inline def setRemovePanel(value: typings.amcharts.stockPanelMod.default => Unit): Self = StObject.set(x, "removePanel", js.Any.fromFunction1(value))
      
      inline def setScrollbarChart(value: typings.amcharts.amSerialChartMod.default): Self = StObject.set(x, "scrollbarChart", value.asInstanceOf[js.Any])
      
      inline def setShowStockEvents(value: () => Unit): Self = StObject.set(x, "showStockEvents", js.Any.fromFunction0(value))
      
      inline def setStartDate(value: js.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStockEventsSettings(value: Any): Self = StObject.set(x, "stockEventsSettings", value.asInstanceOf[js.Any])
      
      inline def setValidateData(value: () => Unit): Self = StObject.set(x, "validateData", js.Any.fromFunction0(value))
      
      inline def setValidateNow(value: () => Unit): Self = StObject.set(x, "validateNow", js.Any.fromFunction0(value))
      
      inline def setValueAxesSettings(value: typings.amcharts.valueAxesSettingsMod.default): Self = StObject.set(x, "valueAxesSettings", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setZoom(value: (js.Date, js.Date) => Unit): Self = StObject.set(x, "zoom", js.Any.fromFunction2(value))
      
      inline def setZoomOut(value: () => Unit): Self = StObject.set(x, "zoomOut", js.Any.fromFunction0(value))
      
      inline def setZoomOutOnDataSetChange(value: Boolean): Self = StObject.set(x, "zoomOutOnDataSetChange", value.asInstanceOf[js.Any])
    }
  }
}
