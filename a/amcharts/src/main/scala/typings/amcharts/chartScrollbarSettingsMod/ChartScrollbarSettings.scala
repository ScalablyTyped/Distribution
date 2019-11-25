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
    val __obj = js.Dynamic.literal(autoGridCount = autoGridCount.asInstanceOf[js.Any], backgroundAlpha = backgroundAlpha.asInstanceOf[js.Any], backgroundColor = backgroundColor.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], enabled = enabled.asInstanceOf[js.Any], fontSize = fontSize.asInstanceOf[js.Any], graph = graph.asInstanceOf[js.Any], graphFillAlpha = graphFillAlpha.asInstanceOf[js.Any], graphFillColor = graphFillColor.asInstanceOf[js.Any], graphLineAlpha = graphLineAlpha.asInstanceOf[js.Any], graphLineColor = graphLineColor.asInstanceOf[js.Any], graphType = graphType.asInstanceOf[js.Any], gridAlpha = gridAlpha.asInstanceOf[js.Any], gridColor = gridColor.asInstanceOf[js.Any], gridCount = gridCount.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], hideResizeGrips = hideResizeGrips.asInstanceOf[js.Any], scrollDuration = scrollDuration.asInstanceOf[js.Any], selectedBackgroundAlpha = selectedBackgroundAlpha.asInstanceOf[js.Any], selectedBackgroundColor = selectedBackgroundColor.asInstanceOf[js.Any], selectedGraphFillAlpha = selectedGraphFillAlpha.asInstanceOf[js.Any], selectedGraphFillColor = selectedGraphFillColor.asInstanceOf[js.Any], selectedGraphLineAlpha = selectedGraphLineAlpha.asInstanceOf[js.Any], selectedGraphLineColor = selectedGraphLineColor.asInstanceOf[js.Any], updateOnReleaseOnly = updateOnReleaseOnly.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChartScrollbarSettings]
  }
}

