package typings.antvG2plot

import typings.antvG2plot.anon.Edges
import typings.antvG2plot.libPlotsSankeyTypesMod.SankeyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeyHelperMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/helper", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getNodePaddingRatio(nodePadding: Double, nodePaddingRatio: Double, height: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodePaddingRatio")(nodePadding.asInstanceOf[js.Any], nodePaddingRatio.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getNodeWidthRatio(nodeWidth: Double, nodeWidthRatio: Double, width: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("getNodeWidthRatio")(nodeWidth.asInstanceOf[js.Any], nodeWidthRatio.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def transformToViewsData(options: SankeyOptions, width: Double, height: Double): Edges = (^.asInstanceOf[js.Dynamic].applyDynamic("transformToViewsData")(options.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any])).asInstanceOf[Edges]
}
