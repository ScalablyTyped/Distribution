package typings.antvG2plot

import typings.antvG2plot.anon.Call
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsSankeySankeyMod {
  
  @JSImport("@antv/g2plot/lib/plots/sankey/sankey", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def center(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("center")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def justify(node: Any, n: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("justify")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def left(node: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("left")(node.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def right(node: Any, n: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("right")(node.asInstanceOf[js.Any], n.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def sankey(): Call = ^.asInstanceOf[js.Dynamic].applyDynamic("sankey")().asInstanceOf[Call]
}
