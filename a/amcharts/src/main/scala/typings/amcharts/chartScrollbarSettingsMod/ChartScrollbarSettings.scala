package typings.amcharts.chartScrollbarSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartScrollbarSettings extends js.Object {
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
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount, backgroundAlpha = backgroundAlpha, backgroundColor = backgroundColor, color = color, enabled = enabled, fontSize = fontSize, graph = graph, graphFillAlpha = graphFillAlpha, graphFillColor = graphFillColor, graphLineAlpha = graphLineAlpha, graphLineColor = graphLineColor, graphType = graphType, gridAlpha = gridAlpha, gridColor = gridColor, gridCount = gridCount, height = height, hideResizeGrips = hideResizeGrips, scrollDuration = scrollDuration, selectedBackgroundAlpha = selectedBackgroundAlpha, selectedBackgroundColor = selectedBackgroundColor, selectedGraphFillAlpha = selectedGraphFillAlpha, selectedGraphFillColor = selectedGraphFillColor, selectedGraphLineAlpha = selectedGraphLineAlpha, selectedGraphLineColor = selectedGraphLineColor, updateOnReleaseOnly = updateOnReleaseOnly)
  
    __obj.asInstanceOf[ChartScrollbarSettings]
  }
}

