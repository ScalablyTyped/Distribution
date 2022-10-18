package typings.antvG2plot

import typings.antvG2plot.anon.Constraints
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennLayoutLayoutMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn/layout/layout", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bestInitialLayout(areas: Any, params: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("bestInitialLayout")(areas.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def constrainedMDSLayout(areas: Any, params: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("constrainedMDSLayout")(areas.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def disjointCluster(circles: Any): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("disjointCluster")(circles.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def distanceFromIntersectArea(r1: Any, r2: Any, overlap: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceFromIntersectArea")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], overlap.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getDistanceMatrices(areas: Any, sets: Any, setids: Any): Constraints = (^.asInstanceOf[js.Dynamic].applyDynamic("getDistanceMatrices")(areas.asInstanceOf[js.Any], sets.asInstanceOf[js.Any], setids.asInstanceOf[js.Any])).asInstanceOf[Constraints]
  
  inline def greedyLayout(areas: Any, params: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("greedyLayout")(areas.asInstanceOf[js.Any], params.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def lossFunction(sets: Any, overlaps: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("lossFunction")(sets.asInstanceOf[js.Any], overlaps.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def normalizeSolution(solution: Any, orientation: Any, orientationOrder: Any): js.Object = (^.asInstanceOf[js.Dynamic].applyDynamic("normalizeSolution")(solution.asInstanceOf[js.Any], orientation.asInstanceOf[js.Any], orientationOrder.asInstanceOf[js.Any])).asInstanceOf[js.Object]
  
  inline def scaleSolution(solution: Any, width: Any, height: Any, padding: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("scaleSolution")(solution.asInstanceOf[js.Any], width.asInstanceOf[js.Any], height.asInstanceOf[js.Any], padding.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def venn(areas: Any): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("venn")(areas.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def venn(areas: Any, parameters: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("venn")(areas.asInstanceOf[js.Any], parameters.asInstanceOf[js.Any])).asInstanceOf[Any]
}
