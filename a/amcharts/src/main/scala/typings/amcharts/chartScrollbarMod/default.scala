package typings.amcharts.chartScrollbarMod

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
  override var autoGridCount: Boolean = js.native
  /**
    * Background opacity.
    * @default 1
    */
  /* CompleteClass */
  override var backgroundAlpha: Double = js.native
  /**
    * Background color of the scrollbar.
    * @default #D4D4D4
    */
  /* CompleteClass */
  override var backgroundColor: String = js.native
  /**
    * Read-only. Category axis of the scrollbar.
    */
  /* CompleteClass */
  override var categoryAxis: typings.amcharts.categoryAxisMod.default = js.native
  /**
    * Text color. Will use chart's color if not set.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Specifies which graph will be displayed in the scrollbar. Only Serial chart's scrollbar can display a graph.
    */
  /* CompleteClass */
  override var graph: typings.amcharts.amGraphMod.default = js.native
  /**
    * Graph fill opacity. Value range is 0 - 1.  0.1
    */
  /* CompleteClass */
  override var graphFillAlpha: Double = js.native
  /**
    * Graph fill color. #000000
    */
  /* CompleteClass */
  override var graphFillColor: String = js.native
  /**
    * Graph line opacity. Value range is 0 - 1.
    */
  /* CompleteClass */
  override var graphLineAlpha: Double = js.native
  /**
    * Graph line color. #000000
    */
  /* CompleteClass */
  override var graphLineColor: String = js.native
  /**
    * By default the graph type is the same as the original graph's type,
    * however in case of "candlestick" or "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: "line", "column", "step", "smoothedLine", "candlestick", "ohlc".
    */
  /* CompleteClass */
  override var graphType: String = js.native
  /**
    * Grid opacity. Value range is 0 - 1. 0.7
    */
  /* CompleteClass */
  override var gridAlpha: Double = js.native
  /**
    * Grid color. #FFFFFF
    */
  /* CompleteClass */
  override var gridColor: String = js.native
  /**
    * The number of grid lines.
    */
  /* CompleteClass */
  override var gridCount: Double = js.native
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  /* CompleteClass */
  override var hideResizeGrips: Boolean = js.native
  /**
    * Specifies whether scrollbar has a resize feature.
    * @default true
    */
  /* CompleteClass */
  override var resizeEnabled: Boolean = js.native
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    * @default 2
    */
  /* CompleteClass */
  override var scrollDuration: Double = js.native
  /**
    * Height (width, if chart is rotated) of a scrollbar.
    * @default 20
    */
  /* CompleteClass */
  override var scrollbarHeight: Double = js.native
  /**
    * Selected backround opacity.
    * @default 1
    */
  /* CompleteClass */
  override var selectedBackgroundAlpha: Double = js.native
  /**
    * Selected background color. #EFEFEF
    */
  /* CompleteClass */
  override var selectedBackgroundColor: String = js.native
  /**
    * Selected graph's fill opacity. Value range is 0 - 1. 0.5
    */
  /* CompleteClass */
  override var selectedGraphFillAlpha: Double = js.native
  /**
    * Selected graph's fill color. #000000
    */
  /* CompleteClass */
  override var selectedGraphFillColor: String = js.native
  /**
    * Selected graph's line opacity. Value range is 0 - 1.
    */
  /* CompleteClass */
  override var selectedGraphLineAlpha: Double = js.native
  /**
    * Selected graph's line color. #000000
    */
  /* CompleteClass */
  override var selectedGraphLineColor: String = js.native
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment
    * when user releases mouse button.
    */
  /* CompleteClass */
  override var updateOnReleaseOnly: Boolean = js.native
}

