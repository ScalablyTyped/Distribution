package typings
package amchartsLib.chartscrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartScrollbar extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    */
  var autoGridCount: scala.Boolean
  /**
    * Background opacity.
    * @default 1
    */
  var backgroundAlpha: scala.Double
  /**
    * Background color of the scrollbar.
    * @default #D4D4D4
    */
  var backgroundColor: java.lang.String
  /**
    * Read-only. Category axis of the scrollbar.
    */
  var categoryAxis: amchartsLib.categoryaxisMod.default
  /**
    * Text color. Will use chart's color if not set.
    */
  var color: java.lang.String
  /**
    * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
    */
  var graph: amchartsLib.amgraphMod.default
  /**
    * Graph fill opacity. Value range is 0 - 1.  0.1
    */
  var graphFillAlpha: scala.Double
  /**
    * Graph fill color. #000000
    */
  var graphFillColor: java.lang.String
  /**
    * Graph line opacity. Value range is 0 - 1.
    */
  var graphLineAlpha: scala.Double
  /**
    * Graph line color. #000000
    */
  var graphLineColor: java.lang.String
  /**
    * By default the graph type is the same as the original graph's type,
    * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
    */
  var graphType: java.lang.String
  /**
    * Grid opacity. Value range is 0 - 1. 0.7
    */
  var gridAlpha: scala.Double
  /**
    * Grid color. #FFFFFF
    */
  var gridColor: java.lang.String
  /**
    * The number of grid lines.
    */
  var gridCount: scala.Double
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  var hideResizeGrips: scala.Boolean
  /**
    * Specifies whether scrollbar has a resize feature.
    * @default true
    */
  var resizeEnabled: scala.Boolean
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    * @default 2
    */
  var scrollDuration: scala.Double
  /**
    * Height (width, if chart is rotated) of a scrollbar.
    * @default 20
    */
  var scrollbarHeight: scala.Double
  /**
    * Selected backround opacity.
    * @default 1
    */
  var selectedBackgroundAlpha: scala.Double
  /**
    * Selected background color. #EFEFEF
    */
  var selectedBackgroundColor: java.lang.String
  /**
    * Selected graph's fill opacity. Value range is 0 - 1. 0.5
    */
  var selectedGraphFillAlpha: scala.Double
  /**
    * Selected graph's fill color. #000000
    */
  var selectedGraphFillColor: java.lang.String
  /**
    * Selected graph's line opacity. Value range is 0 - 1.
    */
  var selectedGraphLineAlpha: scala.Double
  /**
    * Selected graph's line color. #000000
    */
  var selectedGraphLineColor: java.lang.String
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
    * when user releases mouse button.
    */
  var updateOnReleaseOnly: scala.Boolean
}

object ChartScrollbar {
  @scala.inline
  def apply(
    autoGridCount: scala.Boolean,
    backgroundAlpha: scala.Double,
    backgroundColor: java.lang.String,
    categoryAxis: amchartsLib.categoryaxisMod.default,
    color: java.lang.String,
    graph: amchartsLib.amgraphMod.default,
    graphFillAlpha: scala.Double,
    graphFillColor: java.lang.String,
    graphLineAlpha: scala.Double,
    graphLineColor: java.lang.String,
    graphType: java.lang.String,
    gridAlpha: scala.Double,
    gridColor: java.lang.String,
    gridCount: scala.Double,
    hideResizeGrips: scala.Boolean,
    resizeEnabled: scala.Boolean,
    scrollDuration: scala.Double,
    scrollbarHeight: scala.Double,
    selectedBackgroundAlpha: scala.Double,
    selectedBackgroundColor: java.lang.String,
    selectedGraphFillAlpha: scala.Double,
    selectedGraphFillColor: java.lang.String,
    selectedGraphLineAlpha: scala.Double,
    selectedGraphLineColor: java.lang.String,
    updateOnReleaseOnly: scala.Boolean
  ): ChartScrollbar = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoGridCount")(autoGridCount)
    __obj.updateDynamic("backgroundAlpha")(backgroundAlpha)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("categoryAxis")(categoryAxis)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("graphFillAlpha")(graphFillAlpha)
    __obj.updateDynamic("graphFillColor")(graphFillColor)
    __obj.updateDynamic("graphLineAlpha")(graphLineAlpha)
    __obj.updateDynamic("graphLineColor")(graphLineColor)
    __obj.updateDynamic("graphType")(graphType)
    __obj.updateDynamic("gridAlpha")(gridAlpha)
    __obj.updateDynamic("gridColor")(gridColor)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("hideResizeGrips")(hideResizeGrips)
    __obj.updateDynamic("resizeEnabled")(resizeEnabled)
    __obj.updateDynamic("scrollDuration")(scrollDuration)
    __obj.updateDynamic("scrollbarHeight")(scrollbarHeight)
    __obj.updateDynamic("selectedBackgroundAlpha")(selectedBackgroundAlpha)
    __obj.updateDynamic("selectedBackgroundColor")(selectedBackgroundColor)
    __obj.updateDynamic("selectedGraphFillAlpha")(selectedGraphFillAlpha)
    __obj.updateDynamic("selectedGraphFillColor")(selectedGraphFillColor)
    __obj.updateDynamic("selectedGraphLineAlpha")(selectedGraphLineAlpha)
    __obj.updateDynamic("selectedGraphLineColor")(selectedGraphLineColor)
    __obj.updateDynamic("updateOnReleaseOnly")(updateOnReleaseOnly)
    __obj.asInstanceOf[ChartScrollbar]
  }
}

