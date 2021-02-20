package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartScrollbarMod {
  
  @JSImport("amcharts/ChartScrollbar", JSImport.Default)
  @js.native
  class default () extends ChartScrollbar
  
  @js.native
  trait ChartScrollbar extends StObject {
    
    /**
      * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
      */
    var autoGridCount: Boolean = js.native
    
    /**
      * Background opacity.
      * @default 1
      */
    var backgroundAlpha: Double = js.native
    
    /**
      * Background color of the scrollbar.
      * @default #D4D4D4
      */
    var backgroundColor: String = js.native
    
    /**
      * Read-only. Category axis of the scrollbar.
      */
    var categoryAxis: typings.amcharts.categoryAxisMod.default = js.native
    
    /**
      * Text color. Will use chart's color if not set.
      */
    var color: String = js.native
    
    /**
      * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
      */
    var graph: typings.amcharts.amGraphMod.default = js.native
    
    /**
      * Graph fill opacity. Value range is 0 - 1.  0.1
      */
    var graphFillAlpha: Double = js.native
    
    /**
      * Graph fill color. #000000
      */
    var graphFillColor: String = js.native
    
    /**
      * Graph line opacity. Value range is 0 - 1.
      */
    var graphLineAlpha: Double = js.native
    
    /**
      * Graph line color. #000000
      */
    var graphLineColor: String = js.native
    
    /**
      * By default the graph type is the same as the original graph's type,
      * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
      * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
      */
    var graphType: String = js.native
    
    /**
      * Grid opacity. Value range is 0 - 1. 0.7
      */
    var gridAlpha: Double = js.native
    
    /**
      * Grid color. #FFFFFF
      */
    var gridColor: String = js.native
    
    /**
      * The number of grid lines.
      */
    var gridCount: Double = js.native
    
    /**
      * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
      */
    var hideResizeGrips: Boolean = js.native
    
    /**
      * Specifies whether scrollbar has a resize feature.
      * @default true
      */
    var resizeEnabled: Boolean = js.native
    
    /**
      * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
      * @default 2
      */
    var scrollDuration: Double = js.native
    
    /**
      * Height (width, if chart is rotated) of a scrollbar.
      * @default 20
      */
    var scrollbarHeight: Double = js.native
    
    /**
      * Selected backround opacity.
      * @default 1
      */
    var selectedBackgroundAlpha: Double = js.native
    
    /**
      * Selected background color. #EFEFEF
      */
    var selectedBackgroundColor: String = js.native
    
    /**
      * Selected graph's fill opacity. Value range is 0 - 1. 0.5
      */
    var selectedGraphFillAlpha: Double = js.native
    
    /**
      * Selected graph's fill color. #000000
      */
    var selectedGraphFillColor: String = js.native
    
    /**
      * Selected graph's line opacity. Value range is 0 - 1.
      */
    var selectedGraphLineAlpha: Double = js.native
    
    /**
      * Selected graph's line color. #000000
      */
    var selectedGraphLineColor: String = js.native
    
    /**
      * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
      * when user releases mouse button.
      */
    var updateOnReleaseOnly: Boolean = js.native
  }
  object ChartScrollbar {
    
    @scala.inline
    def apply(
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
    implicit class ChartScrollbarMutableBuilder[Self <: ChartScrollbar] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGridCount(value: Boolean): Self = StObject.set(x, "autoGridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCategoryAxis(value: typings.amcharts.categoryAxisMod.default): Self = StObject.set(x, "categoryAxis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraph(value: typings.amcharts.amGraphMod.default): Self = StObject.set(x, "graph", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphFillAlpha(value: Double): Self = StObject.set(x, "graphFillAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphFillColor(value: String): Self = StObject.set(x, "graphFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphLineAlpha(value: Double): Self = StObject.set(x, "graphLineAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphLineColor(value: String): Self = StObject.set(x, "graphLineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGraphType(value: String): Self = StObject.set(x, "graphType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridAlpha(value: Double): Self = StObject.set(x, "gridAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridColor(value: String): Self = StObject.set(x, "gridColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridCount(value: Double): Self = StObject.set(x, "gridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideResizeGrips(value: Boolean): Self = StObject.set(x, "hideResizeGrips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeEnabled(value: Boolean): Self = StObject.set(x, "resizeEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollbarHeight(value: Double): Self = StObject.set(x, "scrollbarHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedBackgroundAlpha(value: Double): Self = StObject.set(x, "selectedBackgroundAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedBackgroundColor(value: String): Self = StObject.set(x, "selectedBackgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedGraphFillAlpha(value: Double): Self = StObject.set(x, "selectedGraphFillAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedGraphFillColor(value: String): Self = StObject.set(x, "selectedGraphFillColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedGraphLineAlpha(value: Double): Self = StObject.set(x, "selectedGraphLineAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedGraphLineColor(value: String): Self = StObject.set(x, "selectedGraphLineColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateOnReleaseOnly(value: Boolean): Self = StObject.set(x, "updateOnReleaseOnly", value.asInstanceOf[js.Any])
    }
  }
}
