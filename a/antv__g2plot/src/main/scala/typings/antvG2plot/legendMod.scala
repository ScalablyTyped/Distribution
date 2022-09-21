package typings.antvG2plot

import typings.antvG2plot.anon.Legend
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object legendMod {
  
  @JSImport("@antv/g2plot/lib/plots/dual-axes/util/legend", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getViewLegendItems(params: Legend): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("getViewLegendItems")(params.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
}
