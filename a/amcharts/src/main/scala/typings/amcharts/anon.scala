package typings.amcharts

import typings.amcharts.amChartMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Chart extends StObject {
    
    var chart: default = js.native
    
    var `type`: String = js.native
  }
  object Chart {
    
    @scala.inline
    def apply(chart: default, `type`: String): Chart = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chart]
    }
    
    @scala.inline
    implicit class ChartMutableBuilder[Self <: Chart] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChartDataItem extends StObject {
    
    var chart: default = js.native
    
    // Always "rollOverSlice".
    var dataItem: typings.amcharts.sliceMod.default = js.native
    
    var `type`: String = js.native
  }
  object ChartDataItem {
    
    @scala.inline
    def apply(chart: default, dataItem: typings.amcharts.sliceMod.default, `type`: String): ChartDataItem = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartDataItem]
    }
    
    @scala.inline
    implicit class ChartDataItemMutableBuilder[Self <: ChartDataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataItem(value: typings.amcharts.sliceMod.default): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: Double = js.native
    
    var endDate: typings.std.Date = js.native
    
    var predefinedPeriod: String = js.native
    
    var startDate: typings.std.Date = js.native
    
    var `type`: String = js.native
  }
  object Count {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredefinedPeriod(value: String): Self = StObject.set(x, "predefinedPeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DD extends StObject {
    
    var DD: String = js.native
    
    var hh: String = js.native
    
    var mm: String = js.native
    
    var ss: String = js.native
  }
  object DD {
    
    @scala.inline
    def apply(DD: String, hh: String, mm: String, ss: String): DD = {
      val __obj = js.Dynamic.literal(DD = DD.asInstanceOf[js.Any], hh = hh.asInstanceOf[js.Any], mm = mm.asInstanceOf[js.Any], ss = ss.asInstanceOf[js.Any])
      __obj.asInstanceOf[DD]
    }
    
    @scala.inline
    implicit class DDMutableBuilder[Self <: DD] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDD(value: String): Self = StObject.set(x, "DD", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHh(value: String): Self = StObject.set(x, "hh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMm(value: String): Self = StObject.set(x, "mm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSs(value: String): Self = StObject.set(x, "ss", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DataItem extends StObject {
    
    var chart: default = js.native
    
    var dataItem: js.Object = js.native
    
    var `type`: String = js.native
  }
  object DataItem {
    
    @scala.inline
    def apply(chart: default, dataItem: js.Object, `type`: String): DataItem = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], dataItem = dataItem.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[DataItem]
    }
    
    @scala.inline
    implicit class DataItemMutableBuilder[Self <: DataItem] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataItem(value: js.Object): Self = StObject.set(x, "dataItem", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Date extends StObject {
    
    var chart: this.type = js.native
    
    var date: js.UndefOr[typings.std.Date] = js.native
    
    var endDate: js.UndefOr[typings.std.Date] = js.native
    
    var eventObject: js.UndefOr[typings.amcharts.stockEventMod.default] = js.native
    
    var graph: js.UndefOr[typings.amcharts.stockGraphMod.default] = js.native
    
    var panel: js.UndefOr[typings.amcharts.stockPanelMod.default] = js.native
    
    var period: js.UndefOr[String] = js.native
    
    var startDate: js.UndefOr[typings.std.Date] = js.native
    
    var `type`: String = js.native
  }
  object Date {
    
    @scala.inline
    def apply(chart: Date, `type`: String): Date = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Date]
    }
    
    @scala.inline
    implicit class DateMutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: Date): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDate(value: typings.std.Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateUndefined: Self = StObject.set(x, "date", js.undefined)
      
      @scala.inline
      def setEndDate(value: typings.std.Date): Self = StObject.set(x, "endDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDateUndefined: Self = StObject.set(x, "endDate", js.undefined)
      
      @scala.inline
      def setEventObject(value: typings.amcharts.stockEventMod.default): Self = StObject.set(x, "eventObject", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventObjectUndefined: Self = StObject.set(x, "eventObject", js.undefined)
      
      @scala.inline
      def setGraph(value: typings.amcharts.stockGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphUndefined: Self = StObject.set(x, "graph", js.undefined)
      
      @scala.inline
      def setPanel(value: typings.amcharts.stockPanelMod.default): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
      
      @scala.inline
      def setPeriod(value: String): Self = StObject.set(x, "period", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPeriodUndefined: Self = StObject.set(x, "period", js.undefined)
      
      @scala.inline
      def setStartDate(value: typings.std.Date): Self = StObject.set(x, "startDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartDateUndefined: Self = StObject.set(x, "startDate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Delta2X extends StObject {
    
    var chart: default = js.native
    
    var delta2X: js.UndefOr[Double] = js.native
    
    var delta2Y: js.UndefOr[Double] = js.native
    
    var deltaX: js.UndefOr[Double] = js.native
    
    var deltaY: js.UndefOr[Double] = js.native
    
    var end: js.UndefOr[Double] = js.native
    
    var finalX: js.UndefOr[Double] = js.native
    
    var finalY: js.UndefOr[Double] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var initialX: js.UndefOr[Double] = js.native
    
    var initialY: js.UndefOr[Double] = js.native
    
    var mostCloseGraph: js.UndefOr[typings.amcharts.amGraphMod.default] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[this.type] = js.native
    
    var `type`: String = js.native
    
    var x: js.UndefOr[Double] = js.native
    
    var y: js.UndefOr[Double] = js.native
    
    var zooming: js.UndefOr[Boolean] = js.native
  }
  object Delta2X {
    
    @scala.inline
    def apply(chart: default, `type`: String): Delta2X = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Delta2X]
    }
    
    @scala.inline
    implicit class Delta2XMutableBuilder[Self <: Delta2X] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta2X(value: Double): Self = StObject.set(x, "delta2X", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta2XUndefined: Self = StObject.set(x, "delta2X", js.undefined)
      
      @scala.inline
      def setDelta2Y(value: Double): Self = StObject.set(x, "delta2Y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelta2YUndefined: Self = StObject.set(x, "delta2Y", js.undefined)
      
      @scala.inline
      def setDeltaX(value: Double): Self = StObject.set(x, "deltaX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaXUndefined: Self = StObject.set(x, "deltaX", js.undefined)
      
      @scala.inline
      def setDeltaY(value: Double): Self = StObject.set(x, "deltaY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeltaYUndefined: Self = StObject.set(x, "deltaY", js.undefined)
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFinalX(value: Double): Self = StObject.set(x, "finalX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalXUndefined: Self = StObject.set(x, "finalX", js.undefined)
      
      @scala.inline
      def setFinalY(value: Double): Self = StObject.set(x, "finalY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinalYUndefined: Self = StObject.set(x, "finalY", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInitialX(value: Double): Self = StObject.set(x, "initialX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialXUndefined: Self = StObject.set(x, "initialX", js.undefined)
      
      @scala.inline
      def setInitialY(value: Double): Self = StObject.set(x, "initialY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialYUndefined: Self = StObject.set(x, "initialY", js.undefined)
      
      @scala.inline
      def setMostCloseGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "mostCloseGraph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMostCloseGraphUndefined: Self = StObject.set(x, "mostCloseGraph", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setTarget(value: Delta2X): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
      
      @scala.inline
      def setZooming(value: Boolean): Self = StObject.set(x, "zooming", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoomingUndefined: Self = StObject.set(x, "zooming", js.undefined)
    }
  }
  
  @js.native
  trait EndValue extends StObject {
    
    var chart: default = js.native
    
    var endValue: js.UndefOr[typings.std.Date] = js.native
    
    var startValue: js.UndefOr[typings.std.Date] = js.native
    
    var `type`: String = js.native
  }
  object EndValue {
    
    @scala.inline
    def apply(chart: default, `type`: String): EndValue = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[EndValue]
    }
    
    @scala.inline
    implicit class EndValueMutableBuilder[Self <: EndValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValue(value: typings.std.Date): Self = StObject.set(x, "endValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndValueUndefined: Self = StObject.set(x, "endValue", js.undefined)
      
      @scala.inline
      def setStartValue(value: typings.std.Date): Self = StObject.set(x, "startValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartValueUndefined: Self = StObject.set(x, "startValue", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Graph extends StObject {
    
    var chart: default = js.native
    
    var graph: typings.amcharts.amGraphMod.default = js.native
    
    var index: Double = js.native
    
    var item: typings.amcharts.graphDataItemMod.default = js.native
    
    var `type`: String = js.native
  }
  object Graph {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GraphMutableBuilder[Self <: Graph] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: default): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItem(value: typings.amcharts.graphDataItemMod.default): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Number extends StObject {
    
    var number: Double = js.native
    
    var prefix: String = js.native
  }
  object Number {
    
    @scala.inline
    def apply(number: Double, prefix: String): Number = {
      val __obj = js.Dynamic.literal(number = number.asInstanceOf[js.Any], prefix = prefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[Number]
    }
    
    @scala.inline
    implicit class NumberMutableBuilder[Self <: Number] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    // Either "dataUpdated" or "init".
    var chart: this.type = js.native
    
    var `type`: String = js.native
  }
  object Type {
    
    @scala.inline
    def apply(chart: Type, `type`: String): Type = {
      val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChart(value: Type): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
