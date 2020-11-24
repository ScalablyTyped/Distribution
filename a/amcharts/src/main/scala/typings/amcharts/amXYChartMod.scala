package typings.amcharts

import typings.amcharts.amRectangularChartMod.AmRectangularChart
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("amcharts/AmXYChart", JSImport.Namespace)
@js.native
object amXYChartMod extends js.Object {
  
  @js.native
  trait AmXYChart extends AmRectangularChart {
    
    /**
      * Specifies if Scrollbar of X axis (horizontal) should be hidden.
      */
    var hideXScrollbar: Boolean = js.native
    
    /**
      * Specifies if Scrollbar of Y axis (vertical) should be hidden.
      */
    var hideYScrollbar: Boolean = js.native
    
    /**
      * Maximum zoom factor of the chart.
      * @default 20
      */
    var maxZoomFactor: Double = js.native
    
    /**
      * Zooms out, charts shows all available data.
      */
    def zoomOut(): Unit = js.native
  }
  
  @js.native
  class default () extends AmXYChart
}
