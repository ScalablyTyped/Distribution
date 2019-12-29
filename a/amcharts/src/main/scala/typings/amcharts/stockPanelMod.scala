package typings.amcharts

import typings.amcharts.amSerialChartMod.AmSerialChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("amcharts/StockPanel", JSImport.Namespace)
@js.native
object stockPanelMod extends js.Object {
  @js.native
  trait StockPanel extends AmSerialChart {
    /**
      * Specifies whether x button will be displayed near the panel. This button allows turning panel off.
      */
    var allowTurningOff: Boolean = js.native
    /**
      * Specifies on which value axis user can draw trend lines.
      * Set drawingIconsEnabled to true if you want drawing icons to be visible.
      * First value axis will be used if not set here.
      */
    var drawOnAxis: typings.amcharts.valueAxisMod.default = js.native
    /**
      * If true, drawing icons will be displayed in top-right corner.
      */
    var drawingIconsEnabled: Boolean = js.native
    /**
      * Specifies if all trend lines should be erased when erase button is clicked.
      * If false, trend lines can be erased one by one.
      */
    var eraseAll: Boolean = js.native
    /**
      * Size of trend line drawing icons.
      * If you change this size, you should update icon images if you want them to look properly.
      * @default 18
      */
    var iconSize: Double = js.native
    /**
      * Relative height of panel. Possible values 0 - 100.
      */
    var percentHeight: Double = js.native
    /**
      * Specifies when values should be recalculated to percents.
      * Possible values are: "never", "always", "whenComparing".
      * @default "whenComparing"
      */
    var recalculateToPercents: String = js.native
    /**
      * Specifies whether this panel will show category axis.
      * @default true
      */
    var showCategoryAxis: Boolean = js.native
    var stockGraphs: js.Array[typings.amcharts.stockGraphMod.default] = js.native
    /**
      * Stock chart legend.
      */
    var stockLegend: typings.amcharts.stockLegendMod.default = js.native
    /**
      * Title of a panel. Note, StockLegend should be added in order title to be displayed.
      */
    var title: String = js.native
    /**
      * Trend line opacity.
      * @default 1
      */
    var trendLineAlpha: Double = js.native
    /**
      * Trend line color. #00CC00
      */
    var trendLineColor: String = js.native
    /**
      * Trend line dash length.
      */
    var trendLineDashLength: Double = js.native
    /**
      * Trend line thickness.
      * @default 2
      */
    var trendLineThickness: Double = js.native
    /**
      * Adds a graph to the panel.
      */
    def addStockGraph(graph: typings.amcharts.stockGraphMod.default): Unit = js.native
    /**
      * Removes graph from the panel.
      */
    def removeStockGraph(graph: typings.amcharts.stockGraphMod.default): Unit = js.native
  }
  
  @js.native
  class default () extends StockPanel
  
}

