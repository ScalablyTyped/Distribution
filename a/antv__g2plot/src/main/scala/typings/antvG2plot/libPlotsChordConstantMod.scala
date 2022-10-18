package typings.antvG2plot

import typings.antvG2plot.anon.Callback
import typings.antvG2plot.anon.Fields
import typings.antvG2plot.anon.FillOpacity
import typings.antvG2plot.anon.LineWidth
import typings.antvG2plot.anon.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsChordConstantMod {
  
  object DEFAULT_OPTIONS {
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.edgeStyle")
    @js.native
    def edgeStyle: LineWidth = js.native
    inline def edgeStyle_=(x: LineWidth): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("edgeStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.interactions")
    @js.native
    def interactions: js.Array[Type] = js.native
    inline def interactions_=(x: js.Array[Type]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interactions")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.label")
    @js.native
    def label: Callback = js.native
    inline def label_=(x: Callback): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("label")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.nodePaddingRatio")
    @js.native
    def nodePaddingRatio: Double = js.native
    inline def nodePaddingRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodePaddingRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.nodeStyle")
    @js.native
    def nodeStyle: FillOpacity = js.native
    inline def nodeStyle_=(x: FillOpacity): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeStyle")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.nodeWidthRatio")
    @js.native
    def nodeWidthRatio: Double = js.native
    inline def nodeWidthRatio_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("nodeWidthRatio")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.tooltip")
    @js.native
    def tooltip: Fields = js.native
    inline def tooltip_=(x: Fields): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tooltip")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g2plot/lib/plots/chord/constant", "DEFAULT_OPTIONS.weight")
    @js.native
    def weight: Boolean = js.native
    inline def weight_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("weight")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@antv/g2plot/lib/plots/chord/constant", "EDGE_COLOR_FIELD")
  @js.native
  val EDGE_COLOR_FIELD: /* "source" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/chord/constant", "NODE_COLOR_FIELD")
  @js.native
  val NODE_COLOR_FIELD: /* "name" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/chord/constant", "X_FIELD")
  @js.native
  val X_FIELD: /* "x" */ String = js.native
  
  @JSImport("@antv/g2plot/lib/plots/chord/constant", "Y_FIELD")
  @js.native
  val Y_FIELD: /* "y" */ String = js.native
}
