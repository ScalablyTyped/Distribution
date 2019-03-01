package typings
package amchartsLib.chartscrollbarsettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartScrollbarSettings extends js.Object {
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
    * @default true
    */
  var autoGridCount: scala.Boolean
  /**
    * Background opacity.
    */
  var backgroundAlpha: scala.Double
  /**
    * Background color of the scrollbar.
    */
  var backgroundColor: java.lang.String
  /**
    * Text color.
    */
  var color: java.lang.String
  /**
    * Set false if you don't need scrollbar.
    * @default true
    */
  var enabled: scala.Boolean
  /**
    * Font size.
    */
  var fontSize: java.lang.String
  /**
    * Specifies which graph will be displayed in the scrollbar.
    */
  var graph: amchartsLib.amgraphMod.default
  /**
    * Graph fill opacity.
    */
  var graphFillAlpha: scala.Double
  /**
    * Graph fill color.
    */
  var graphFillColor: java.lang.String
  /**
    * Graph line opacity.
    */
  var graphLineAlpha: scala.Double
  /**
    * Graph line color.
    */
  var graphLineColor: java.lang.String
  /**
    * Type of chart scrollbar's graph.
    * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
    * "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
    */
  var graphType: java.lang.String
  /**
    * Grid opacity.
    */
  var gridAlpha: scala.Double
  /**
    * Grid color.
    */
  var gridColor: java.lang.String
  /**
    * Grid count. You should set autoGridCount to false in order this property to work.
    */
  var gridCount: scala.Double
  /**
    * Height of scrollbar, in pixels.
    * @default 40
    */
  var height: scala.Double
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  var hideResizeGrips: scala.Boolean
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    */
  var scrollDuration: scala.Double
  /**
    * Selected background opacity.
    */
  var selectedBackgroundAlpha: scala.Double
  /**
    * Selected background color.
    */
  var selectedBackgroundColor: java.lang.String
  /**
    * Selected graph'sfill opacity.
    */
  var selectedGraphFillAlpha: scala.Double
  /**
    * Selected graph'sfill color.
    */
  var selectedGraphFillColor: java.lang.String
  /**
    * Selected graph'sline opacity.
    */
  var selectedGraphLineAlpha: scala.Double
  /**
    * Selected graph's line color.
    */
  var selectedGraphLineColor: java.lang.String
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
    * user releases mouse button. Usefull when working with large data sets.
    * @default true
    */
  var updateOnReleaseOnly: scala.Boolean
}

object ChartScrollbarSettings {
  @scala.inline
  def apply(
    autoGridCount: scala.Boolean,
    backgroundAlpha: scala.Double,
    backgroundColor: java.lang.String,
    color: java.lang.String,
    enabled: scala.Boolean,
    fontSize: java.lang.String,
    graph: amchartsLib.amgraphMod.default,
    graphFillAlpha: scala.Double,
    graphFillColor: java.lang.String,
    graphLineAlpha: scala.Double,
    graphLineColor: java.lang.String,
    graphType: java.lang.String,
    gridAlpha: scala.Double,
    gridColor: java.lang.String,
    gridCount: scala.Double,
    height: scala.Double,
    hideResizeGrips: scala.Boolean,
    scrollDuration: scala.Double,
    selectedBackgroundAlpha: scala.Double,
    selectedBackgroundColor: java.lang.String,
    selectedGraphFillAlpha: scala.Double,
    selectedGraphFillColor: java.lang.String,
    selectedGraphLineAlpha: scala.Double,
    selectedGraphLineColor: java.lang.String,
    updateOnReleaseOnly: scala.Boolean
  ): ChartScrollbarSettings = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoGridCount")(autoGridCount)
    __obj.updateDynamic("backgroundAlpha")(backgroundAlpha)
    __obj.updateDynamic("backgroundColor")(backgroundColor)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("enabled")(enabled)
    __obj.updateDynamic("fontSize")(fontSize)
    __obj.updateDynamic("graph")(graph)
    __obj.updateDynamic("graphFillAlpha")(graphFillAlpha)
    __obj.updateDynamic("graphFillColor")(graphFillColor)
    __obj.updateDynamic("graphLineAlpha")(graphLineAlpha)
    __obj.updateDynamic("graphLineColor")(graphLineColor)
    __obj.updateDynamic("graphType")(graphType)
    __obj.updateDynamic("gridAlpha")(gridAlpha)
    __obj.updateDynamic("gridColor")(gridColor)
    __obj.updateDynamic("gridCount")(gridCount)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("hideResizeGrips")(hideResizeGrips)
    __obj.updateDynamic("scrollDuration")(scrollDuration)
    __obj.updateDynamic("selectedBackgroundAlpha")(selectedBackgroundAlpha)
    __obj.updateDynamic("selectedBackgroundColor")(selectedBackgroundColor)
    __obj.updateDynamic("selectedGraphFillAlpha")(selectedGraphFillAlpha)
    __obj.updateDynamic("selectedGraphFillColor")(selectedGraphFillColor)
    __obj.updateDynamic("selectedGraphLineAlpha")(selectedGraphLineAlpha)
    __obj.updateDynamic("selectedGraphLineColor")(selectedGraphLineColor)
    __obj.updateDynamic("updateOnReleaseOnly")(updateOnReleaseOnly)
    __obj.asInstanceOf[ChartScrollbarSettings]
  }
}

