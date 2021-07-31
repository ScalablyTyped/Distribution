package typings.amcharts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stockGraphMod {
  
  @JSImport("amcharts/StockGraph", JSImport.Default)
  @js.native
  class default () extends StockGraph
  
  @js.native
  trait StockGraph
    extends typings.amcharts.amGraphMod.default {
    
    /**
      * Specifies whether this graph will be compared if some data set is selected for comparing.
      */
    var comparable: Boolean = js.native
    
    /**
      * Specifies a field to be used to generate comparing graph.
      * Note, this field is not the one used in your dataProvider, but toField from FieldMapping object.
      */
    var compareField: String = js.native
    
    /**
      * Balloon color of comparing graph.
      */
    var compareGraphBalloonColor: String = js.native
    
    /**
      * Balloon text of comparing graph.
      */
    var compareGraphBalloonText: String = js.native
    
    /**
      * Bullet of comparing graph.
      * Possible values are: "square", "round", "line", "triangleUp", "triangleDown", "dashedLine", "bubble".
      */
    var compareGraphBullet: String = js.native
    
    /**
      * Bullet size of comparing graph.
      */
    var compareGraphBulletSize: Double = js.native
    
    /**
      * Corner radius of comparing graph (if type is "column").
      */
    var compareGraphCornerRadiusTop: Double = js.native
    
    /**
      * Dash length of compare graph.
      */
    var compareGraphDashLength: Double = js.native
    
    /**
      * Fill alpha of comparing graph.
      */
    var compareGraphFillAlphas: Double = js.native
    
    /**
      * Fill color of comparing graph.
      */
    var compareGraphFillColors: String = js.native
    
    /**
      * Opacity of comparing graph line.
      */
    var compareGraphLineAlpha: Double = js.native
    
    /**
      * Thickness of compare graph.
      */
    var compareGraphLineThickness: Double = js.native
    
    /**
      * Type of comparing graph. Possible values are: "line", "column", "step", "smoothedLine." line
      */
    var compareGraphType: String = js.native
    
    /**
      * Specifies if compare graph is visible in legend.
      * @default true
      */
    var compareGraphVisibleInLegend: Boolean = js.native
    
    /**
      * When data is grouped to periods, the graph must know which period value should be used.
      * Possible values are: "Open", "Low", "High", "Close", "Average" and "Sum".
      * @default "Close"
      */
    var periodValue: String = js.native
    
    /**
      * Specifies whether data set color should be used as this graph's lineColor.
      * @default true
      */
    var useDataSetColors: Boolean = js.native
  }
}
