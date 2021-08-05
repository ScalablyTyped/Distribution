package typings.amcharts

import typings.amcharts.amChartMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Chart extends StObject {
    
    var chart: default
    
    var `type`: String
  }
  object Chart {
    
    inline def apply(chart: default, `type`: String): Chart = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chart]
    }
    
    extension [Self <: Chart](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait ChartDataItem extends StObject {
    
    var chart: default
    
    // Always "rollOverSlice".
    var dataItem: typings.amcharts.sliceMod.default
    
    var `type`: String
  }
  object ChartDataItem {
    
    inline def apply(chart: default, dataItem: typings.amcharts.sliceMod.default, `type`: String): ChartDataItem = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartDataItem]
    }
    
    extension [Self <: ChartDataItem](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDataItem(value: typings.amcharts.sliceMod.default): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Count extends StObject {
    
    var count: Double
    
    var endDate: typings.std.Date
    
    var predefinedPeriod: String
    
    var startDate: typings.std.Date
    
    var `type`: String
  }
  object Count {
    
    inline def apply(
      count: Double,
      endDate: typings.std.Date,
      predefinedPeriod: String,
      startDate: typings.std.Date,
      `type`: String
    ): Count = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], endDate = endDate.asInstanceOf[js.Any], predefinedPeriod = predefinedPeriod.asInstanceOf[js.Any], startDate = startDate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    extension [Self <: Count](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setPredefinedPeriod(value: String): Self = StObject.set(x, "predefinedPeriod", value.asInstanceOf[js.Any])
      
      inline def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait DD extends StObject {
    
    var DD: String
    
    var hh: String
    
    var mm: String
    
    var ss: String
  }
  object DD {
    
    inline def apply(DD: String, hh: String, mm: String, ss: String): DD = {
      val __obj = js.Dynamic.literal(DD = DD.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[DD]
    }
    
    extension [Self <: DD](x: Self) {
      
      inline def setDD(value: String): Self = StObject.set(x, "DD", value.asInstanceOf[js.Any])
      
      inline def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
      
      inline def setMm(value: String): Self = StObject.set(x, "mm", value.asInstanceOf[js.Any])
      
      inline def setSs(value: String): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
  
  trait DataItem extends StObject {
    
    var chart: default
    
    var dataItem: js.Object
    
    var `type`: String
  }
  object DataItem {
    
    inline def apply(chart: default, dataItem: js.Object, `type`: String): DataItem = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataItem]
    }
    
    extension [Self <: DataItem](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDataItem(value: js.Object): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Date extends StObject {
    
    var chart: this.type
    
    var date: js.UndefOr[typings.std.Date] = js.undefined
    
    var endDate: js.UndefOr[typings.std.Date] = js.undefined
    
    var eventObject: js.UndefOr[typings.amcharts.stockEventMod.default] = js.undefined
    
    var graph: js.UndefOr[typings.amcharts.stockGraphMod.default] = js.undefined
    
    var panel: js.UndefOr[typings.amcharts.stockPanelMod.default] = js.undefined
    
    var period: js.UndefOr[String] = js.undefined
    
    var startDate: js.UndefOr[typings.std.Date] = js.undefined
    
    var `type`: String
  }
  object Date {
    
    inline def apply(chart: Date, `type`: String): Date = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    extension [Self <: Date](x: Self) {
      
      inline def setChart(value: Date): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      inline def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      inline def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      inline def setEventObject(value: typings.amcharts.stockEventMod.default): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      inline def setEventObjectUndefined: Self = StObject.set(x, "eventObject", js.undefined)
      
      inline def setGraph(value: typings.amcharts.stockGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      inline def setPanel(value: typings.amcharts.stockPanelMod.default): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      inline def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      inline def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      inline def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      inline def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Delta2X extends StObject {
    
    var chart: default
    
    var delta2X: js.UndefOr[Double] = js.undefined
    
    var delta2Y: js.UndefOr[Double] = js.undefined
    
    var deltaX: js.UndefOr[Double] = js.undefined
    
    var deltaY: js.UndefOr[Double] = js.undefined
    
    var end: js.UndefOr[Double] = js.undefined
    
    var finalX: js.UndefOr[Double] = js.undefined
    
    var finalY: js.UndefOr[Double] = js.undefined
    
    var index: js.UndefOr[Double] = js.undefined
    
    var initialX: js.UndefOr[Double] = js.undefined
    
    var initialY: js.UndefOr[Double] = js.undefined
    
    var mostCloseGraph: js.UndefOr[typings.amcharts.amGraphMod.default] = js.undefined
    
    var start: js.UndefOr[Double] = js.undefined
    
    var target: js.UndefOr[this.type] = js.undefined
    
    var `type`: String
    
    var x: js.UndefOr[Double] = js.undefined
    
    var y: js.UndefOr[Double] = js.undefined
    
    var zooming: js.UndefOr[Boolean] = js.undefined
  }
  object Delta2X {
    
    inline def apply(chart: default, `type`: String): Delta2X = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta2X]
    }
    
    extension [Self <: Delta2X](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setDelta2X(value: Double): Self = StObject.set(x, "delta2X", value.asInstanceOf[js.Any])
      
      inline def setDelta2XUndefined: Self = StObject.set(x, "delta2X", js.undefined)
      
      inline def setDelta2Y(value: Double): Self = StObject.set(x, "delta2Y", value.asInstanceOf[js.Any])
      
      inline def setDelta2YUndefined: Self = StObject.set(x, "delta2Y", js.undefined)
      
      inline def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      inline def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      inline def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      inline def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setFinalX(value: Double): Self = StObject.set(x, "finalX", value.asInstanceOf[js.Any])
      
      inline def setFinalXUndefined: Self = StObject.set(x, "finalX", js.undefined)
      
      inline def setFinalY(value: Double): Self = StObject.set(x, "finalY", value.asInstanceOf[js.Any])
      
      inline def setFinalYUndefined: Self = StObject.set(x, "finalY", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      inline def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      inline def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      inline def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      inline def setMostCloseGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "mostCloseGraph", value.asInstanceOf[js.Any])
      
      inline def setMostCloseGraphUndefined: Self = StObject.set(x, "mostCloseGraph", js.undefined)
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      inline def setTarget(value: Delta2X): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      inline def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      inline def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
  
  trait EndValue extends StObject {
    
    var chart: default
    
    var endValue: js.UndefOr[typings.std.Date] = js.undefined
    
    var startValue: js.UndefOr[typings.std.Date] = js.undefined
    
    var `type`: String
  }
  object EndValue {
    
    inline def apply(chart: default, `type`: String): EndValue = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndValue]
    }
    
    extension [Self <: EndValue](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setEndValue(value: typings.std.Date): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      inline def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      inline def setStartValue(value: typings.std.Date): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      inline def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Graph extends StObject {
    
    var chart: default
    
    var graph: typings.amcharts.amGraphMod.default
    
    var index: Double
    
    var item: typings.amcharts.graphDataItemMod.default
    
    var `type`: String
  }
  object Graph {
    
    inline def apply(
      chart: default,
      graph: typings.amcharts.amGraphMod.default,
      index: Double,
      item: typings.amcharts.graphDataItemMod.default,
      `type`: String
    ): Graph = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Graph]
    }
    
    extension [Self <: Graph](x: Self) {
      
      inline def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setItem(value: typings.amcharts.graphDataItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Number extends StObject {
    
    var number: Double
    
    var prefix: String
  }
  object Number {
    
    inline def apply(number: Double, prefix: String): Number = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    extension [Self <: Number](x: Self) {
      
      inline def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait Type extends StObject {
    
    // Either "dataUpdated" or "init".
    var chart: this.type
    
    var `type`: String
  }
  object Type {
    
    inline def apply(chart: Type, `type`: String): Type = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    extension [Self <: Type](x: Self) {
      
      inline def setChart(value: Type): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
