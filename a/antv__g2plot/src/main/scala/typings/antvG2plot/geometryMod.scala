package typings.antvG2plot

import typings.antvG2plot.adaptorMod.Params
import typings.antvG2plot.anon.GeometryOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object geometryMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes/util/geometry", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def drawSingleGeometry[O /* <: GeometryOption */](params: Params[O]): Params[O] = ^.asInstanceOf[js.Dynamic].applyDynamic("drawSingleGeometry")(params.asInstanceOf[js.Any]).asInstanceOf[Params[O]]
}
