package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.treemapTypesMod.TreemapOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object treemapAdaptorMod {
  
  @JSImport("@antv/g2plot/lib/plots/treemap/adaptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def adaptor(params: Params[TreemapOptions]): Params[TreemapOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("adaptor")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TreemapOptions]]
  
  inline def interaction(params: Params[TreemapOptions]): Params[TreemapOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("interaction")(params.asInstanceOf[js.Any]).asInstanceOf[Params[TreemapOptions]]
}
