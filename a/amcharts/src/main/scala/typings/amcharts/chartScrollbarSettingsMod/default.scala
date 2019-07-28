package typings.amcharts.chartScrollbarSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/ChartScrollbarSettings", JSImport.Default)
@js.native
class default () extends ChartScrollbarSettings {
  /**
    * Specifies whether number of gridCount is specified automatically, according to the axis size.
    * @default true
    */
  /* CompleteClass */
  override var autoGridCount: Boolean = js.native
  /**
    * Background opacity.
    */
  /* CompleteClass */
  override var backgroundAlpha: Double = js.native
  /**
    * Background color of the scrollbar.
    */
  /* CompleteClass */
  override var backgroundColor: String = js.native
  /**
    * Text color.
    */
  /* CompleteClass */
  override var color: String = js.native
  /**
    * Set false if you don't need scrollbar.
    * @default true
    */
  /* CompleteClass */
  override var enabled: Boolean = js.native
  /**
    * Font size.
    */
  /* CompleteClass */
  override var fontSize: String = js.native
  /**
    * Specifies which graph will be displayed in the scrollbar.
    */
  /* CompleteClass */
  override var graph: typings.amcharts.amGraphMod.default = js.native
  /**
    * Graph fill opacity.
    */
  /* CompleteClass */
  override var graphFillAlpha: Double = js.native
  /**
    * Graph fill color.
    */
  /* CompleteClass */
  override var graphFillColor: String = js.native
  /**
    * Graph line opacity.
    */
  /* CompleteClass */
  override var graphLineAlpha: Double = js.native
  /**
    * Graph line color.
    */
  /* CompleteClass */
  override var graphLineColor: String = js.native
  /**
    * Type of chart scrollbar's graph.
    * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
    * "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
    */
  /* CompleteClass */
  override var graphType: String = js.native
  /**
    * Grid opacity.
    */
  /* CompleteClass */
  override var gridAlpha: Double = js.native
  /**
    * Grid color.
    */
  /* CompleteClass */
  override var gridColor: String = js.native
  /**
    * Grid count. You should set autoGridCount to false in order this property to work.
    */
  /* CompleteClass */
  override var gridCount: Double = js.native
  /**
    * Height of scrollbar, in pixels.
    * @default 40
    */
  /* CompleteClass */
  override var height: Double = js.native
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  /* CompleteClass */
  override var hideResizeGrips: Boolean = js.native
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    */
  /* CompleteClass */
  override var scrollDuration: Double = js.native
  /**
    * Selected background opacity.
    */
  /* CompleteClass */
  override var selectedBackgroundAlpha: Double = js.native
  /**
    * Selected background color.
    */
  /* CompleteClass */
  override var selectedBackgroundColor: String = js.native
  /**
    * Selected graph'sfill opacity.
    */
  /* CompleteClass */
  override var selectedGraphFillAlpha: Double = js.native
  /**
    * Selected graph'sfill color.
    */
  /* CompleteClass */
  override var selectedGraphFillColor: String = js.native
  /**
    * Selected graph'sline opacity.
    */
  /* CompleteClass */
  override var selectedGraphLineAlpha: Double = js.native
  /**
    * Selected graph's line color.
    */
  /* CompleteClass */
  override var selectedGraphLineColor: String = js.native
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
    * user releases mouse button. Usefull when working with large data sets.
    * @default true
    */
  /* CompleteClass */
  override var updateOnReleaseOnly: Boolean = js.native
}

