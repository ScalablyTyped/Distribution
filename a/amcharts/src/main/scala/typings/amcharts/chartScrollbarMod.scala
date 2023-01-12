package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartScrollbarMod {
  
  @JSImport("amcharts/ChartScrollbar", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ChartScrollbar {
    
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      */
    /* CompleteClass */
    var autoGridCount: Boolean = js.native
    
    /**
      * Background opacity.
      * @default 1
      */
    /* CompleteClass */
    var backgroundAlpha: Double = js.native
    
    /**
      * Background color of the scrollbar.
      * @default #D4D4D4
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * Read-only. Category axis of the scrollbar.
      */
    /* CompleteClass */
    var categoryAxis: typings.amcharts.categoryAxisMod.default = js.native
    
    /**
      * Text color. Will use chart's color if not set.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
      */
    /* CompleteClass */
    var graph: typings.amcharts.amGraphMod.default = js.native
    
    /**
      * Graph fill opacity. Value range is 0 - 1.  0.1
      */
    /* CompleteClass */
    var graphFillAlpha: Double = js.native
    
    /**
      * Graph fill color. #000000
      */
    /* CompleteClass */
    var graphFillColor: String = js.native
    
    /**
      * Graph line opacity. Value range is 0 - 1.
      */
    /* CompleteClass */
    var graphLineAlpha: Double = js.native
    
    /**
      * Graph line color. #000000
      */
    /* CompleteClass */
    var graphLineColor: String = js.native
    
    /**
      * By default the graph type is the same as the original graph's type,
      * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
      * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
      */
    /* CompleteClass */
    var graphType: String = js.native
    
    /**
      * Grid opacity. Value range is 0 - 1. 0.7
      */
    /* CompleteClass */
    var gridAlpha: Double = js.native
    
    /**
      * Grid color. #FFFFFF
      */
    /* CompleteClass */
    var gridColor: String = js.native
    
    /**
      * The number of grid lines.
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
      */
    /* CompleteClass */
    var hideResizeGrips: Boolean = js.native
    
    /**
      * Specifies whether scrollbar has a resize feature.
      * @default true
      */
    /* CompleteClass */
    var resizeEnabled: Boolean = js.native
    
    /**
      * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
      * @default 2
      */
    /* CompleteClass */
    var scrollDuration: Double = js.native
    
    /**
      * Height (width, if chart is rotated) of a scrollbar.
      * @default 20
      */
    /* CompleteClass */
    var scrollbarHeight: Double = js.native
    
    /**
      * Selected backround opacity.
      * @default 1
      */
    /* CompleteClass */
    var selectedBackgroundAlpha: Double = js.native
    
    /**
      * Selected background color. #EFEFEF
      */
    /* CompleteClass */
    var selectedBackgroundColor: String = js.native
    
    /**
      * Selected graph's fill opacity. Value range is 0 - 1. 0.5
      */
    /* CompleteClass */
    var selectedGraphFillAlpha: Double = js.native
    
    /**
      * Selected graph's fill color. #000000
      */
    /* CompleteClass */
    var selectedGraphFillColor: String = js.native
    
    /**
      * Selected graph's line opacity. Value range is 0 - 1.
      */
    /* CompleteClass */
    var selectedGraphLineAlpha: Double = js.native
    
    /**
      * Selected graph's line color. #000000
      */
    /* CompleteClass */
    var selectedGraphLineColor: String = js.native
    
    /**
      * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
      * when user releases mouse button.
      */
    /* CompleteClass */
    var updateOnReleaseOnly: Boolean = js.native
  }
  
  trait ChartScrollbar extends StObject {
    
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      */
    var autoGridCount: Boolean
    
    /**
      * Background opacity.
      * @default 1
      */
    var backgroundAlpha: Double
    
    /**
      * Background color of the scrollbar.
      * @default #D4D4D4
      */
    var backgroundColor: String
    
    /**
      * Read-only. Category axis of the scrollbar.
      */
    var categoryAxis: typings.amcharts.categoryAxisMod.default
    
    /**
      * Text color. Will use chart's color if not set.
      */
    var color: String
    
    /**
      * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
      */
    var graph: typings.amcharts.amGraphMod.default
    
    /**
      * Graph fill opacity. Value range is 0 - 1.  0.1
      */
    var graphFillAlpha: Double
    
    /**
      * Graph fill color. #000000
      */
    var graphFillColor: String
    
    /**
      * Graph line opacity. Value range is 0 - 1.
      */
    var graphLineAlpha: Double
    
    /**
      * Graph line color. #000000
      */
    var graphLineColor: String
    
    /**
      * By default the graph type is the same as the original graph's type,
      * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
      * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
      */
    var graphType: String
    
    /**
      * Grid opacity. Value range is 0 - 1. 0.7
      */
    var gridAlpha: Double
    
    /**
      * Grid color. #FFFFFF
      */
    var gridColor: String
    
    /**
      * The number of grid lines.
      */
    var gridCount: Double
    
    /**
      * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
      */
    var hideResizeGrips: Boolean
    
    /**
      * Specifies whether scrollbar has a resize feature.
      * @default true
      */
    var resizeEnabled: Boolean
    
    /**
      * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
      * @default 2
      */
    var scrollDuration: Double
    
    /**
      * Height (width, if chart is rotated) of a scrollbar.
      * @default 20
      */
    var scrollbarHeight: Double
    
    /**
      * Selected backround opacity.
      * @default 1
      */
    var selectedBackgroundAlpha: Double
    
    /**
      * Selected background color. #EFEFEF
      */
    var selectedBackgroundColor: String
    
    /**
      * Selected graph's fill opacity. Value range is 0 - 1. 0.5
      */
    var selectedGraphFillAlpha: Double
    
    /**
      * Selected graph's fill color. #000000
      */
    var selectedGraphFillColor: String
    
    /**
      * Selected graph's line opacity. Value range is 0 - 1.
      */
    var selectedGraphLineAlpha: Double
    
    /**
      * Selected graph's line color. #000000
      */
    var selectedGraphLineColor: String
    
    /**
      * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
      * when user releases mouse button.
      */
    var updateOnReleaseOnly: Boolean
  }
  object ChartScrollbar {
    
    inline def apply(
      autoGridCount: Boolean,
      backgroundAlpha: Double,
      backgroundColor: String,
      categoryAxis: typings.amcharts.categoryAxisMod.default,
      color: String,
      graph: typings.amcharts.amGraphMod.default,
      graphFillAlpha: Double,
      graphFillColor: String,
      graphLineAlpha: Double,
      graphLineColor: String,
      graphType: String,
      gridAlpha: Double,
      gridColor: String,
      gridCount: Double,
      hideResizeGrips: Boolean,
      resizeEnabled: Boolean,
      scrollDuration: Double,
      scrollbarHeight: Double,
      selectedBackgroundAlpha: Double,
      selectedBackgroundColor: String,
      selectedGraphFillAlpha: Double,
      selectedGraphFillColor: String,
      selectedGraphLineAlpha: Double,
      selectedGraphLineColor: String,
      updateOnReleaseOnly: Boolean
    ): ChartScrollbar = {
      val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], categoryAxis = categoryAxis.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], graphFillAlpha = graphFillAlpha.asInstanceOf[js.Any], graphFillColor = graphFillColor.asInstanceOf[js.Any], graphLineAlpha = graphLineAlpha.asInstanceOf[js.Any], graphLineColor = graphLineColor.asInstanceOf[js.Any], graphType = graphType.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], hideResizeGrips = hideResizeGrips.asInstanceOf[js.Any], resizeEnabled = resizeEnabled.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], scrollbarHeight = scrollbarHeight.asInstanceOf[js.Any], selectedBackgroundAlpha = selectedBackgroundAlpha.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedGraphFillAlpha = selectedGraphFillAlpha.asInstanceOf[js.Any], selectedGraphFillColor = selectedGraphFillColor.asInstanceOf[js.Any], selectedGraphLineAlpha = selectedGraphLineAlpha.asInstanceOf[js.Any], selectedGraphLineColor = selectedGraphLineColor.asInstanceOf[js.Any], updateOnReleaseOnly = updateOnReleaseOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartScrollbar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ChartScrollbar] (val x: Self) extends AnyVal {
      
      inline def setAutoGridCount(value: Boolean): Self = StObject.set(x, "autoGridCount", value.asInstanceOf[js.Any])
      
      inline def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setCategoryAxis(value: typings.amcharts.categoryAxisMod.default): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      inline def setGraphFillAlpha(value: Double): Self = StObject.set(x, "graphFillAlpha", value.asInstanceOf[js.Any])
      
      inline def setGraphFillColor(value: String): Self = StObject.set(x, "graphFillColor", value.asInstanceOf[js.Any])
      
      inline def setGraphLineAlpha(value: Double): Self = StObject.set(x, "graphLineAlpha", value.asInstanceOf[js.Any])
      
      inline def setGraphLineColor(value: String): Self = StObject.set(x, "graphLineColor", value.asInstanceOf[js.Any])
      
      inline def setGraphType(value: String): Self = StObject.set(x, "graphType", value.asInstanceOf[js.Any])
      
      inline def setGridAlpha(value: Double): Self = StObject.set(x, "gridAlpha", value.asInstanceOf[js.Any])
      
      inline def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      inline def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      inline def setHideResizeGrips(value: Boolean): Self = StObject.set(x, "hideResizeGrips", value.asInstanceOf[js.Any])
      
      inline def setResizeEnabled(value: Boolean): Self = StObject.set(x, "resizeEnabled", value.asInstanceOf[js.Any])
      
      inline def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      inline def setScrollbarHeight(value: Double): Self = StObject.set(x, "scrollbarHeight", value.asInstanceOf[js.Any])
      
      inline def setSelectedBackgroundAlpha(value: Double): Self = StObject.set(x, "selectedBackgroundAlpha", value.asInstanceOf[js.Any])
      
      inline def setSelectedBackgroundColor(value: String): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedGraphFillAlpha(value: Double): Self = StObject.set(x, "selectedGraphFillAlpha", value.asInstanceOf[js.Any])
      
      inline def setSelectedGraphFillColor(value: String): Self = StObject.set(x, "selectedGraphFillColor", value.asInstanceOf[js.Any])
      
      inline def setSelectedGraphLineAlpha(value: Double): Self = StObject.set(x, "selectedGraphLineAlpha", value.asInstanceOf[js.Any])
      
      inline def setSelectedGraphLineColor(value: String): Self = StObject.set(x, "selectedGraphLineColor", value.asInstanceOf[js.Any])
      
      inline def setUpdateOnReleaseOnly(value: Boolean): Self = StObject.set(x, "updateOnReleaseOnly", value.asInstanceOf[js.Any])
    }
  }
}
