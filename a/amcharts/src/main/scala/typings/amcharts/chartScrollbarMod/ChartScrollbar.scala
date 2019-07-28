package typings.amcharts.chartScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartScrollbar extends js.Object {
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
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount, backgroundAlpha = backgroundAlpha, backgroundColor = backgroundColor, categoryAxis = categoryAxis, color = color, graph = graph, graphFillAlpha = graphFillAlpha, graphFillColor = graphFillColor, graphLineAlpha = graphLineAlpha, graphLineColor = graphLineColor, graphType = graphType, gridAlpha = gridAlpha, gridColor = gridColor, gridCount = gridCount, hideResizeGrips = hideResizeGrips, resizeEnabled = resizeEnabled, scrollDuration = scrollDuration, scrollbarHeight = scrollbarHeight, selectedBackgroundAlpha = selectedBackgroundAlpha, selectedBackgroundColor = selectedBackgroundColor, selectedGraphFillAlpha = selectedGraphFillAlpha, selectedGraphFillColor = selectedGraphFillColor, selectedGraphLineAlpha = selectedGraphLineAlpha, selectedGraphLineColor = selectedGraphLineColor, updateOnReleaseOnly = updateOnReleaseOnly)
  
    __obj.asInstanceOf[ChartScrollbar]
  }
}

