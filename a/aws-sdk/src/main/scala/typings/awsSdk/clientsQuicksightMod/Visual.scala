package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Visual extends StObject {
  
  /**
    * A bar chart. For more information, see Using bar charts in the Amazon QuickSight User Guide.
    */
  var BarChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BarChartVisual] = js.undefined
  
  /**
    * A box plot. For more information, see Using box plots in the Amazon QuickSight User Guide.
    */
  var BoxPlotVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.BoxPlotVisual] = js.undefined
  
  /**
    * A combo chart. For more information, see Using combo charts in the Amazon QuickSight User Guide.
    */
  var ComboChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ComboChartVisual] = js.undefined
  
  /**
    * A visual that contains custom content. For more information, see Using custom visual content in the Amazon QuickSight User Guide.
    */
  var CustomContentVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.CustomContentVisual] = js.undefined
  
  /**
    * An empty visual.
    */
  var EmptyVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.EmptyVisual] = js.undefined
  
  /**
    * A filled map. For more information, see Creating filled maps in the Amazon QuickSight User Guide.
    */
  var FilledMapVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FilledMapVisual] = js.undefined
  
  /**
    * A funnel chart. For more information, see Using funnel charts in the Amazon QuickSight User Guide.
    */
  var FunnelChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.FunnelChartVisual] = js.undefined
  
  /**
    * A gauge chart. For more information, see Using gauge charts in the Amazon QuickSight User Guide.
    */
  var GaugeChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GaugeChartVisual] = js.undefined
  
  /**
    * A geospatial map or a points on map visual. For more information, see Creating point maps in the Amazon QuickSight User Guide.
    */
  var GeospatialMapVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.GeospatialMapVisual] = js.undefined
  
  /**
    * A heat map. For more information, see Using heat maps in the Amazon QuickSight User Guide.
    */
  var HeatMapVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HeatMapVisual] = js.undefined
  
  /**
    * A histogram. For more information, see Using histograms in the Amazon QuickSight User Guide.
    */
  var HistogramVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.HistogramVisual] = js.undefined
  
  /**
    * An insight visual. For more information, see Working with insights in the Amazon QuickSight User Guide.
    */
  var InsightVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.InsightVisual] = js.undefined
  
  /**
    * A key performance indicator (KPI). For more information, see Using KPIs in the Amazon QuickSight User Guide.
    */
  var KPIVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.KPIVisual] = js.undefined
  
  /**
    * A line chart. For more information, see Using line charts in the Amazon QuickSight User Guide.
    */
  var LineChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.LineChartVisual] = js.undefined
  
  /**
    * A pie or donut chart. For more information, see Using pie charts in the Amazon QuickSight User Guide.
    */
  var PieChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PieChartVisual] = js.undefined
  
  /**
    * A pivot table. For more information, see Using pivot tables in the Amazon QuickSight User Guide.
    */
  var PivotTableVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.PivotTableVisual] = js.undefined
  
  /**
    * A radar chart visual. For more information, see Using radar charts in the Amazon QuickSight User Guide.
    */
  var RadarChartVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.RadarChartVisual] = js.undefined
  
  /**
    * A sankey diagram. For more information, see Using Sankey diagrams in the Amazon QuickSight User Guide.
    */
  var SankeyDiagramVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.SankeyDiagramVisual] = js.undefined
  
  /**
    * A scatter plot. For more information, see Using scatter plots in the Amazon QuickSight User Guide.
    */
  var ScatterPlotVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.ScatterPlotVisual] = js.undefined
  
  /**
    * A table visual. For more information, see Using tables as visuals in the Amazon QuickSight User Guide.
    */
  var TableVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TableVisual] = js.undefined
  
  /**
    * A tree map. For more information, see Using tree maps in the Amazon QuickSight User Guide.
    */
  var TreeMapVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.TreeMapVisual] = js.undefined
  
  /**
    * A waterfall chart. For more information, see Using waterfall charts in the Amazon QuickSight User Guide.
    */
  var WaterfallVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WaterfallVisual] = js.undefined
  
  /**
    * A word cloud. For more information, see Using word clouds in the Amazon QuickSight User Guide.
    */
  var WordCloudVisual: js.UndefOr[typings.awsSdk.clientsQuicksightMod.WordCloudVisual] = js.undefined
}
object Visual {
  
  inline def apply(): Visual = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Visual]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Visual] (val x: Self) extends AnyVal {
    
    inline def setBarChartVisual(value: BarChartVisual): Self = StObject.set(x, "BarChartVisual", value.asInstanceOf[js.Any])
    
    inline def setBarChartVisualUndefined: Self = StObject.set(x, "BarChartVisual", js.undefined)
    
    inline def setBoxPlotVisual(value: BoxPlotVisual): Self = StObject.set(x, "BoxPlotVisual", value.asInstanceOf[js.Any])
    
    inline def setBoxPlotVisualUndefined: Self = StObject.set(x, "BoxPlotVisual", js.undefined)
    
    inline def setComboChartVisual(value: ComboChartVisual): Self = StObject.set(x, "ComboChartVisual", value.asInstanceOf[js.Any])
    
    inline def setComboChartVisualUndefined: Self = StObject.set(x, "ComboChartVisual", js.undefined)
    
    inline def setCustomContentVisual(value: CustomContentVisual): Self = StObject.set(x, "CustomContentVisual", value.asInstanceOf[js.Any])
    
    inline def setCustomContentVisualUndefined: Self = StObject.set(x, "CustomContentVisual", js.undefined)
    
    inline def setEmptyVisual(value: EmptyVisual): Self = StObject.set(x, "EmptyVisual", value.asInstanceOf[js.Any])
    
    inline def setEmptyVisualUndefined: Self = StObject.set(x, "EmptyVisual", js.undefined)
    
    inline def setFilledMapVisual(value: FilledMapVisual): Self = StObject.set(x, "FilledMapVisual", value.asInstanceOf[js.Any])
    
    inline def setFilledMapVisualUndefined: Self = StObject.set(x, "FilledMapVisual", js.undefined)
    
    inline def setFunnelChartVisual(value: FunnelChartVisual): Self = StObject.set(x, "FunnelChartVisual", value.asInstanceOf[js.Any])
    
    inline def setFunnelChartVisualUndefined: Self = StObject.set(x, "FunnelChartVisual", js.undefined)
    
    inline def setGaugeChartVisual(value: GaugeChartVisual): Self = StObject.set(x, "GaugeChartVisual", value.asInstanceOf[js.Any])
    
    inline def setGaugeChartVisualUndefined: Self = StObject.set(x, "GaugeChartVisual", js.undefined)
    
    inline def setGeospatialMapVisual(value: GeospatialMapVisual): Self = StObject.set(x, "GeospatialMapVisual", value.asInstanceOf[js.Any])
    
    inline def setGeospatialMapVisualUndefined: Self = StObject.set(x, "GeospatialMapVisual", js.undefined)
    
    inline def setHeatMapVisual(value: HeatMapVisual): Self = StObject.set(x, "HeatMapVisual", value.asInstanceOf[js.Any])
    
    inline def setHeatMapVisualUndefined: Self = StObject.set(x, "HeatMapVisual", js.undefined)
    
    inline def setHistogramVisual(value: HistogramVisual): Self = StObject.set(x, "HistogramVisual", value.asInstanceOf[js.Any])
    
    inline def setHistogramVisualUndefined: Self = StObject.set(x, "HistogramVisual", js.undefined)
    
    inline def setInsightVisual(value: InsightVisual): Self = StObject.set(x, "InsightVisual", value.asInstanceOf[js.Any])
    
    inline def setInsightVisualUndefined: Self = StObject.set(x, "InsightVisual", js.undefined)
    
    inline def setKPIVisual(value: KPIVisual): Self = StObject.set(x, "KPIVisual", value.asInstanceOf[js.Any])
    
    inline def setKPIVisualUndefined: Self = StObject.set(x, "KPIVisual", js.undefined)
    
    inline def setLineChartVisual(value: LineChartVisual): Self = StObject.set(x, "LineChartVisual", value.asInstanceOf[js.Any])
    
    inline def setLineChartVisualUndefined: Self = StObject.set(x, "LineChartVisual", js.undefined)
    
    inline def setPieChartVisual(value: PieChartVisual): Self = StObject.set(x, "PieChartVisual", value.asInstanceOf[js.Any])
    
    inline def setPieChartVisualUndefined: Self = StObject.set(x, "PieChartVisual", js.undefined)
    
    inline def setPivotTableVisual(value: PivotTableVisual): Self = StObject.set(x, "PivotTableVisual", value.asInstanceOf[js.Any])
    
    inline def setPivotTableVisualUndefined: Self = StObject.set(x, "PivotTableVisual", js.undefined)
    
    inline def setRadarChartVisual(value: RadarChartVisual): Self = StObject.set(x, "RadarChartVisual", value.asInstanceOf[js.Any])
    
    inline def setRadarChartVisualUndefined: Self = StObject.set(x, "RadarChartVisual", js.undefined)
    
    inline def setSankeyDiagramVisual(value: SankeyDiagramVisual): Self = StObject.set(x, "SankeyDiagramVisual", value.asInstanceOf[js.Any])
    
    inline def setSankeyDiagramVisualUndefined: Self = StObject.set(x, "SankeyDiagramVisual", js.undefined)
    
    inline def setScatterPlotVisual(value: ScatterPlotVisual): Self = StObject.set(x, "ScatterPlotVisual", value.asInstanceOf[js.Any])
    
    inline def setScatterPlotVisualUndefined: Self = StObject.set(x, "ScatterPlotVisual", js.undefined)
    
    inline def setTableVisual(value: TableVisual): Self = StObject.set(x, "TableVisual", value.asInstanceOf[js.Any])
    
    inline def setTableVisualUndefined: Self = StObject.set(x, "TableVisual", js.undefined)
    
    inline def setTreeMapVisual(value: TreeMapVisual): Self = StObject.set(x, "TreeMapVisual", value.asInstanceOf[js.Any])
    
    inline def setTreeMapVisualUndefined: Self = StObject.set(x, "TreeMapVisual", js.undefined)
    
    inline def setWaterfallVisual(value: WaterfallVisual): Self = StObject.set(x, "WaterfallVisual", value.asInstanceOf[js.Any])
    
    inline def setWaterfallVisualUndefined: Self = StObject.set(x, "WaterfallVisual", js.undefined)
    
    inline def setWordCloudVisual(value: WordCloudVisual): Self = StObject.set(x, "WordCloudVisual", value.asInstanceOf[js.Any])
    
    inline def setWordCloudVisualUndefined: Self = StObject.set(x, "WordCloudVisual", js.undefined)
  }
}
