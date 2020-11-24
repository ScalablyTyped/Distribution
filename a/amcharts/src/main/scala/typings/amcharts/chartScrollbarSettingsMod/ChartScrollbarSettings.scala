package typings.amcharts.chartScrollbarSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChartScrollbarSettings extends js.Object {
  
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: Boolean = js.native
  
  /**
    * Background opacity.
    */
  var backgroundAlpha: Double = js.native
  
  /**
    * Background color of the scrollbar.
    */
  var backgroundColor: String = js.native
  
  /**
    * Text color.
    */
  var color: String = js.native
  
  /**
    * Set false if you don't need scrollbar.
    * @default true
    */
  var enabled: Boolean = js.native
  
  /**
    * Font size.
    */
  var fontSize: String = js.native
  
  /**
    * Specifies which graph will be displayed in the scrollbar.
    */
  var graph: typings.amcharts.amGraphMod.default = js.native
  
  /**
    * Graph fill opacity.
    */
  var graphFillAlpha: Double = js.native
  
  /**
    * Graph fill color.
    */
  var graphFillColor: String = js.native
  
  /**
    * Graph line opacity.
    */
  var graphLineAlpha: Double = js.native
  
  /**
    * Graph line color.
    */
  var graphLineColor: String = js.native
  
  /**
    * Type of chart scrollbar's graph.
    * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
    * "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
    */
  var graphType: String = js.native
  
  /**
    * Grid opacity.
    */
  var gridAlpha: Double = js.native
  
  /**
    * Grid color.
    */
  var gridColor: String = js.native
  
  /**
    * Grid count. You should set autoGridCount to false in order this property to work.
    */
  var gridCount: Double = js.native
  
  /**
    * Height of scrollbar, in pixels.
    * @default 40
    */
  var height: Double = js.native
  
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  var hideResizeGrips: Boolean = js.native
  
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    */
  var scrollDuration: Double = js.native
  
  /**
    * Selected background opacity.
    */
  var selectedBackgroundAlpha: Double = js.native
  
  /**
    * Selected background color.
    */
  var selectedBackgroundColor: String = js.native
  
  /**
    * Selected graph'sfill opacity.
    */
  var selectedGraphFillAlpha: Double = js.native
  
  /**
    * Selected graph'sfill color.
    */
  var selectedGraphFillColor: String = js.native
  
  /**
    * Selected graph'sline opacity.
    */
  var selectedGraphLineAlpha: Double = js.native
  
  /**
    * Selected graph's line color.
    */
  var selectedGraphLineColor: String = js.native
  
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
    * user releases mouse button. Usefull when working with large data sets.
    * @default true
    */
  var updateOnReleaseOnly: Boolean = js.native
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
  implicit class ChartScrollbarSettingsOps[Self <: ChartScrollbarSettings] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAutoGridCount(value: Boolean): Self = this.set("autoGridCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundAlpha(value: Double): Self = this.set("backgroundAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnabled(value: Boolean): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontSize(value: String): Self = this.set("fontSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraph(value: typings.amcharts.amGraphMod.default): Self = this.set("graph", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphFillAlpha(value: Double): Self = this.set("graphFillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphFillColor(value: String): Self = this.set("graphFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphLineAlpha(value: Double): Self = this.set("graphLineAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphLineColor(value: String): Self = this.set("graphLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphType(value: String): Self = this.set("graphType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridAlpha(value: Double): Self = this.set("gridAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridColor(value: String): Self = this.set("gridColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGridCount(value: Double): Self = this.set("gridCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideResizeGrips(value: Boolean): Self = this.set("hideResizeGrips", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScrollDuration(value: Double): Self = this.set("scrollDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundAlpha(value: Double): Self = this.set("selectedBackgroundAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedBackgroundColor(value: String): Self = this.set("selectedBackgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedGraphFillAlpha(value: Double): Self = this.set("selectedGraphFillAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedGraphFillColor(value: String): Self = this.set("selectedGraphFillColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedGraphLineAlpha(value: Double): Self = this.set("selectedGraphLineAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectedGraphLineColor(value: String): Self = this.set("selectedGraphLineColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateOnReleaseOnly(value: Boolean): Self = this.set("updateOnReleaseOnly", value.asInstanceOf[js.Any])
  }
}
