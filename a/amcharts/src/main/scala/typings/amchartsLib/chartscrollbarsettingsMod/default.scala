package typings
package amchartsLib.chartscrollbarsettingsMod

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
  override var autoGridCount: scala.Boolean = js.native
  /**
    * Background opacity.
    */
  /* CompleteClass */
  override var backgroundAlpha: scala.Double = js.native
  /**
    * Background color of the scrollbar.
    */
  /* CompleteClass */
  override var backgroundColor: java.lang.String = js.native
  /**
    * Text color.
    */
  /* CompleteClass */
  override var color: java.lang.String = js.native
  /**
    * Set false if you don't need scrollbar.
    * @default true
    */
  /* CompleteClass */
  override var enabled: scala.Boolean = js.native
  /**
    * Font size.
    */
  /* CompleteClass */
  override var fontSize: java.lang.String = js.native
  /**
    * Specifies which graph will be displayed in the scrollbar.
    */
  /* CompleteClass */
  override var graph: amchartsLib.amgraphMod.default = js.native
  /**
    * Graph fill opacity.
    */
  /* CompleteClass */
  override var graphFillAlpha: scala.Double = js.native
  /**
    * Graph fill color.
    */
  /* CompleteClass */
  override var graphFillColor: java.lang.String = js.native
  /**
    * Graph line opacity.
    */
  /* CompleteClass */
  override var graphLineAlpha: scala.Double = js.native
  /**
    * Graph line color.
    */
  /* CompleteClass */
  override var graphLineColor: java.lang.String = js.native
  /**
    * Type of chart scrollbar's graph.
    * By default the graph type is the same as the original graph's type, however in case of "candlestick" or
    * "ohlc" you might want to show line graph in the scrollbar.
    * Possible values are: line, column, step, smoothedLine, candlestick, ohlc.
    */
  /* CompleteClass */
  override var graphType: java.lang.String = js.native
  /**
    * Grid opacity.
    */
  /* CompleteClass */
  override var gridAlpha: scala.Double = js.native
  /**
    * Grid color.
    */
  /* CompleteClass */
  override var gridColor: java.lang.String = js.native
  /**
    * Grid count. You should set autoGridCount to false in order this property to work.
    */
  /* CompleteClass */
  override var gridCount: scala.Double = js.native
  /**
    * Height of scrollbar, in pixels.
    * @default 40
    */
  /* CompleteClass */
  override var height: scala.Double = js.native
  /**
    * Specifies whether resize grips are hidden when mouse is away from the scrollbar.
    */
  /* CompleteClass */
  override var hideResizeGrips: scala.Boolean = js.native
  /**
    * Duration of scrolling, when the user clicks on scrollbar's background, in seconds.
    */
  /* CompleteClass */
  override var scrollDuration: scala.Double = js.native
  /**
    * Selected background opacity.
    */
  /* CompleteClass */
  override var selectedBackgroundAlpha: scala.Double = js.native
  /**
    * Selected background color.
    */
  /* CompleteClass */
  override var selectedBackgroundColor: java.lang.String = js.native
  /**
    * Selected graph'sfill opacity.
    */
  /* CompleteClass */
  override var selectedGraphFillAlpha: scala.Double = js.native
  /**
    * Selected graph'sfill color.
    */
  /* CompleteClass */
  override var selectedGraphFillColor: java.lang.String = js.native
  /**
    * Selected graph'sline opacity.
    */
  /* CompleteClass */
  override var selectedGraphLineAlpha: scala.Double = js.native
  /**
    * Selected graph's line color.
    */
  /* CompleteClass */
  override var selectedGraphLineColor: java.lang.String = js.native
  /**
    * Specifies if the chart should be updated while dragging/resizing the scrollbar or only at the moment when
    * user releases mouse button. Usefull when working with large data sets.
    * @default true
    */
  /* CompleteClass */
  override var updateOnReleaseOnly: scala.Boolean = js.native
}

