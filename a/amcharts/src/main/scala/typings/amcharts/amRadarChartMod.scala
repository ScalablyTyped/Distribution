package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object amRadarChartMod {
  
  @JSImport("amcharts/AmRadarChart", JSImport.Default)
  @js.native
  class default () extends AmRadarChart
  
  @js.native
  trait AmRadarChart
    extends typings.amcharts.amCoordinateChartMod.default {
    
    /**
      * Bottom margin of the chart.
      */
    var marginBottom: Double = js.native
    
    /**
      * Left margin of the chart.
      */
    var marginLeft: Double = js.native
    
    /**
      * Right margin of the chart.
      */
    var marginRight: Double = js.native
    
    /**
      * Top margin of the chart.
      */
    var marginTop: Double = js.native
    
    /**
      * Radius of a radar. 0.35
      */
    var radius: js.Any = js.native
  }
}
