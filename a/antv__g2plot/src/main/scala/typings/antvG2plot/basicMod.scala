package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.funnelTypesMod.FunnelOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  @JSImport("@antv/g2plot/lib/plots/funnel/geometries/basic", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def basicFunnel(params: Params[FunnelOptions]): Params[FunnelOptions] = ^.asInstanceOf[js.Dynamic].applyDynamic("basicFunnel")(params.asInstanceOf[js.Any]).asInstanceOf[Params[FunnelOptions]]
}
