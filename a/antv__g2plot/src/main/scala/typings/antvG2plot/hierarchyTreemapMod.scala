package typings.antvG2plot

import typings.antvG2plot.hierarchyTypesMod.HierarchyOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hierarchyTreemapMod {
  
  @JSImport("@antv/g2plot/lib/utils/hierarchy/treemap", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getTileMethod(tile: String, ratio: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("getTileMethod")(tile.asInstanceOf[js.Any], ratio.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def treemap(data: Any, options: HierarchyOption): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("treemap")(data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
}
