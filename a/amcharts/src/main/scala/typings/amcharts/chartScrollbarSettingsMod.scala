package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object chartScrollbarSettingsMod {
  
  @JSImport("amcharts/ChartScrollbarSettings", JSImport.Default)
  @js.native
  class default ()
    extends StObject
       with ChartScrollbarSettings {
    
    /**
      * Specifies whether number of gridCount is specified automatically, according to the axis size.
      * @default true
      */
    /* CompleteClass */
    var autoGridCount: Boolean = js.native
    
    /**
      * Background opacity.
      */
    /* CompleteClass */
    var backgroundAlpha: Double = js.native
    
    /**
      * Background color of the scrollbar.
      */
    /* CompleteClass */
    var backgroundColor: String = js.native
    
    /**
      * Text color.
      */
    /* CompleteClass */
    var color: String = js.native
    
    /**
      * Set false if you don't need scrollbar.
      * @default true
      */
    /* CompleteClass */
    var enabled: Boolean = js.native
    
    /**
      * Font size.
      */
    /* CompleteClass */
    var fontSize: String = js.native
    
    /**
      * Specifies which graph will be displayed in the scrollbar.
      */
    /* CompleteClass */
    var graph: typings.amcharts.amGraphMod.default = js.native
    
    /**
      * Graph fill opacity.
      */
    /* CompleteClass */
    var graphFillAlpha: Double = js.native
    
    /**
      * Graph fill color.
      */
    /* CompleteClass */
    var graphFillColor: String = js.native
    
    /**
      * Graph line opacity.
      */
    /* CompleteClass */
    var graphLineAlpha: Double = js.native
    
    /**
      * Graph line color.
      */
    /* CompleteClass */
    var graphLineColor: String = js.native
    
    /**
      * Type of chart scrollbar's graph.
      * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
      * "ohlc" you might want to show line graph in the scrollbar.
      * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
      */
    /* CompleteClass */
    var graphType: String = js.native
    
    /**
      * Grid opacity.
      */
    /* CompleteClass */
    var gridAlpha: Double = js.native
    
    /**
      * Grid color.
      */
    /* CompleteClass */
    var gridColor: String = js.native
    
    /**
      * Grid count. You should set autoGridCount to false in order this property to work.
      */
    /* CompleteClass */
    var gridCount: Double = js.native
    
    /**
      * Height of scrollbar, in pixels.
      * @default 40
      */
    /* CompleteClass */
    var height: Double = js.native
    
    /**
      * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
      */
    /* CompleteClass */
    var hideResizeGrips: Boolean = js.native
    
    /**
      * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
      */
    /* CompleteClass */
    var scrollDuration: Double = js.native
    
    /**
      * Selected background opacity.
      */
    /* CompleteClass */
    var selectedBackgroundAlpha: Double = js.native
    
    /**
      * Selected background color.
      */
    /* CompleteClass */
    var selectedBackgroundColor: String = js.native
    
    /**
      * Selected graph'sfill opacity.
      */
    /* CompleteClass */
    var selectedGraphFillAlpha: Double = js.native
    
    /**
      * Selected graph'sfill color.
      */
    /* CompleteClass */
    var selectedGraphFillColor: String = js.native
    
    /**
      * Selected graph'sline opacity.
      */
    /* CompleteClass */
    var selectedGraphLineAlpha: Double = js.native
    
    /**
      * Selected graph's line color.
      */
    /* CompleteClass */
    var selectedGraphLineColor: String = js.native
    
    /**
      * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
      * user releases mouse button. Usefull when working with large data sets.
      * @default true
      */
    /* CompleteClass */
    var updateOnReleaseOnly: Boolean = js.native
  }
  
  trait ChartScrollbarSettings extends StObject {
    
    /**
      * Specifies whether number of gridCount is specified automatically, according to the axis size.
      * @default true
      */
    var autoGridCount: Boolean
    
    /**
      * Background opacity.
      */
    var backgroundAlpha: Double
    
    /**
      * Background color of the scrollbar.
      */
    var backgroundColor: String
    
    /**
      * Text color.
      */
    var color: String
    
    /**
      * Set false if you don't need scrollbar.
      * @default true
      */
    var enabled: Boolean
    
    /**
      * Font size.
      */
    var fontSize: String
    
    /**
      * Specifies which graph will be displayed in the scrollbar.
      */
    var graph: typings.amcharts.amGraphMod.default
    
    /**
      * Graph fill opacity.
      */
    var graphFillAlpha: Double
    
    /**
      * Graph fill color.
      */
    var graphFillColor: String
    
    /**
      * Graph line opacity.
      */
    var graphLineAlpha: Double
    
    /**
      * Graph line color.
      */
    var graphLineColor: String
    
    /**
      * Type of chart scrollbar's graph.
      * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
      * "ohlc" you might want to show line graph in the scrollbar.
      * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
      */
    var graphType: String
    
    /**
      * Grid opacity.
      */
    var gridAlpha: Double
    
    /**
      * Grid color.
      */
    var gridColor: String
    
    /**
      * Grid count. You should set autoGridCount to false in order this property to work.
      */
    var gridCount: Double
    
    /**
      * Height of scrollbar, in pixels.
      * @default 40
      */
    var height: Double
    
    /**
      * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
      */
    var hideResizeGrips: Boolean
    
    /**
      * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
      */
    var scrollDuration: Double
    
    /**
      * Selected background opacity.
      */
    var selectedBackgroundAlpha: Double
    
    /**
      * Selected background color.
      */
    var selectedBackgroundColor: String
    
    /**
      * Selected graph'sfill opacity.
      */
    var selectedGraphFillAlpha: Double
    
    /**
      * Selected graph'sfill color.
      */
    var selectedGraphFillColor: String
    
    /**
      * Selected graph'sline opacity.
      */
    var selectedGraphLineAlpha: Double
    
    /**
      * Selected graph's line color.
      */
    var selectedGraphLineColor: String
    
    /**
      * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
      * user releases mouse button. Usefull when working with large data sets.
      * @default true
      */
    var updateOnReleaseOnly: Boolean
  }
  object ChartScrollbarSettings {
    
    @scala.inline
    def apply(
      autoGridCount: Boolean,
      backgroundAlpha: Double,
      backgroundColor: String,
      color: String,
      enabled: Boolean,
      fontSize: String,
      graph: typings.amcharts.amGraphMod.default,
      graphFillAlpha: Double,
      graphFillColor: String,
      graphLineAlpha: Double,
      graphLineColor: String,
      graphType: String,
      gridAlpha: Double,
      gridColor: String,
      gridCount: Double,
      height: Double,
      hideResizeGrips: Boolean,
      scrollDuration: Double,
      selectedBackgroundAlpha: Double,
      selectedBackgroundColor: String,
      selectedGraphFillAlpha: Double,
      selectedGraphFillColor: String,
      selectedGraphLineAlpha: Double,
      selectedGraphLineColor: String,
      updateOnReleaseOnly: Boolean
    ): ChartScrollbarSettings = {
      val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], graphFillAlpha = graphFillAlpha.asInstanceOf[js.Any], graphFillColor = graphFillColor.asInstanceOf[js.Any], graphLineAlpha = graphLineAlpha.asInstanceOf[js.Any], graphLineColor = graphLineColor.asInstanceOf[js.Any], graphType = graphType.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideResizeGrips = hideResizeGrips.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], selectedBackgroundAlpha = selectedBackgroundAlpha.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedGraphFillAlpha = selectedGraphFillAlpha.asInstanceOf[js.Any], selectedGraphFillColor = selectedGraphFillColor.asInstanceOf[js.Any], selectedGraphLineAlpha = selectedGraphLineAlpha.asInstanceOf[js.Any], selectedGraphLineColor = selectedGraphLineColor.asInstanceOf[js.Any], updateOnReleaseOnly = updateOnReleaseOnly.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChartScrollbarSettings]
    }
    
    @scala.inline
    implicit class ChartScrollbarSettingsMutableBuilder[Self <: ChartScrollbarSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoGridCount(value: Boolean): Self = StObject.set(x, "autoGridCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundAlpha(value: Double): Self = StObject.set(x, "backgroundAlpha", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: String): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
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
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideResizeGrips(value: Boolean): Self = StObject.set(x, "hideResizeGrips", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollDuration(value: Double): Self = StObject.set(x, "scrollDuration", value.asInstanceOf[js.Any])
      
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
