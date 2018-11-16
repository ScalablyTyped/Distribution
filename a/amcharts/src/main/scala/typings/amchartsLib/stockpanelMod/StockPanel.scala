package typings
package amchartsLib.stockpanelMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StockPanel
  extends amchartsLib.amserialchartMod.default {
  /**
       * Specifies whether x button will be displayed near the panel. This button allows turning panel off.
       */
  var allowTurningOff: scala.Boolean = js.native
  /**
       * Specifies on which value axis user can draw trend lines.
       * Set drawingIconsEnabled to true if you want drawing icons to be visible.
       * First value axis will be used if not set here.
       */
  var drawOnAxis: amchartsLib.valueaxisMod.default = js.native
  /**
       * If true, drawing icons will be displayed in top-right corner.
       */
  var drawingIconsEnabled: scala.Boolean = js.native
  /**
       * Specifies if all trend lines should be erased when erase button is clicked.
       * If false, trend lines can be erased one by one.
       */
  var eraseAll: scala.Boolean = js.native
  /**
       * Size of trend line drawing icons.
       * If you change this size, you should update icon images if you want them to look properly.
       * @default 18
       */
  var iconSize: scala.Double = js.native
  /**
       * Relative height of panel. Possible values 0 - 100.
       */
  var percentHeight: scala.Double = js.native
  /**
       * Specifies when values should be recalculated to percents.
       * Possible values are: "never", "always", "whenComparing".
       * @default "whenComparing"
       */
  var recalculateToPercents: java.lang.String = js.native
  /**
       * Specifies whether this panel will show category axis.
       * @default true
       */
  var showCategoryAxis: scala.Boolean = js.native
  var stockGraphs: js.Array[amchartsLib.stockgraphMod.default] = js.native
  /**
       * Stock chart legend.
       */
  var stockLegend: amchartsLib.stocklegendMod.default = js.native
  /**
       * Title of a panel. Note, StockLegend should be added in order title to be displayed.
       */
  var title: java.lang.String = js.native
  /**
       * Trend line opacity.
       * @default 1
       */
  var trendLineAlpha: scala.Double = js.native
  /**
       * Trend line color. #00CC00
       */
  var trendLineColor: java.lang.String = js.native
  /**
       * Trend line dash length.
       */
  var trendLineDashLength: scala.Double = js.native
  /**
       * Trend line thickness.
       * @default 2
       */
  var trendLineThickness: scala.Double = js.native
  /**
       * Adds a graph to the panel.
       */
  def addStockGraph(graph: amchartsLib.stockgraphMod.default): scala.Unit = js.native
  /**
       * Removes graph from the panel.
       */
  def removeStockGraph(graph: amchartsLib.stockgraphMod.default): scala.Unit = js.native
}

