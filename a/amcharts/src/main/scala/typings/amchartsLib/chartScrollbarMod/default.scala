package typings
package amchartsLib.chartScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ChartScrollbar", JSImport.Default)
@js.native
class default () extends ChartScrollbar {
  /**
    * Specifies whether number of gridCount is specified automatically, acoarding to the axis size.
    */
  /* CompleteClass */
  override var autoGridCount: scala.Boolean = js.native
  /**
    * Background opacity.
    * @default 1
    */
  /* CompleteClass */
  override var backgroundAlpha: scala.Double = js.native
  /**
    * Background color of the scrollbar.
    * @default #D4D4D4
    */
  /* CompleteClass */
  override var backgroundColor: java.lang.String = js.native
  /**
    * Read-only. Category axis of the scrollbar.
    */
  /* CompleteClass */
  override var categoryAxis: amchartsLib.categoryAxisMod.default = js.native
  /**
    * Text color. Will use chart's color if not set.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
    */
  /* CompleteClass */
  override var graph: amchartsLib.amGraphMod.default = js.native
  /**
    * Graph fill opacity. Value range is 0 - 1.  0.1
    */
  /* CompleteClass */
  override var graphFillAlpha: scala.Double = js.native
  /**
    * Graph fill color. #000000
    */
  /* CompleteClass */
  override var graphFillColor: java.lang.String = js.native
  /**
    * Graph line opacity. Value range is 0 - 1.
    */
  /* CompleteClass */
  override var graphLineAlpha: scala.Double = js.native
  /**
    * Graph line color. #000000
    */
  /* CompleteClass */
  override var graphLineColor: java.lang.String = js.native
  /**
    * By default the graph type is the same as the original graph's type,
    * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
    */
  /* CompleteClass */
  override var graphType: java.lang.String = js.native
  /**
    * Grid opacity. Value range is 0 - 1. 0.7
    */
  /* CompleteClass */
  override var gridAlpha: scala.Double = js.native
  /**
    * Grid color. #FFFFFF
    */
  /* CompleteClass */
  override var gridColor: java.lang.String = js.native
  /**
    * The number of grid lines.
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  /* CompleteClass */
  override var hideResizeGrips: scala.Boolean = js.native
  /**
    * Specifies whether scrollbar has a resize feature.
    * @default true
    */
  /* CompleteClass */
  override var resizeEnabled: scala.Boolean = js.native
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    * @default 2
    */
  /* CompleteClass */
  override var scrollDuration: scala.Double = js.native
  /**
    * Height (width, if chart is rotated) of a scrollbar.
    * @default 20
    */
  /* CompleteClass */
  override var scrollbarHeight: scala.Double = js.native
  /**
    * Selected backround opacity.
    * @default 1
    */
  /* CompleteClass */
  override var selectedBackgroundAlpha: scala.Double = js.native
  /**
    * Selected background color. #EFEFEF
    */
  /* CompleteClass */
  override var selectedBackgroundColor: java.lang.String = js.native
  /**
    * Selected graph's fill opacity. Value range is 0 - 1. 0.5
    */
  /* CompleteClass */
  override var selectedGraphFillAlpha: scala.Double = js.native
  /**
    * Selected graph's fill color. #000000
    */
  /* CompleteClass */
  override var selectedGraphFillColor: java.lang.String = js.native
  /**
    * Selected graph's line opacity. Value range is 0 - 1.
    */
  /* CompleteClass */
  override var selectedGraphLineAlpha: scala.Double = js.native
  /**
    * Selected graph's line color. #000000
    */
  /* CompleteClass */
  override var selectedGraphLineColor: java.lang.String = js.native
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
    * when user releases mouse button.
    */
  /* CompleteClass */
  override var updateOnReleaseOnly: scala.Boolean = js.native
}

