package typings.antvG2plot

import typings.antvG2plot.anon.XNumber
import typings.antvG2plot.anon.XY
import typings.antvG2plot.anon.Y
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsVennLayoutCircleintersectionMod {
  
  @JSImport("@antv/g2plot/lib/plots/venn/layout/circleintersection", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def circleArea(r: Any, width: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("circleArea")(r.asInstanceOf[js.Any], width.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def circleCircleIntersection(p1: Any, p2: Any): js.Array[Y | XY] = (^.asInstanceOf[js.Dynamic].applyDynamic("circleCircleIntersection")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[js.Array[Y | XY]]
  
  inline def circleOverlap(r1: Any, r2: Any, d: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("circleOverlap")(r1.asInstanceOf[js.Any], r2.asInstanceOf[js.Any], d.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def containedInCircles(point: Any, circles: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("containedInCircles")(point.asInstanceOf[js.Any], circles.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def distance(p1: Any, p2: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distance")(p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def getCenter(points: Any): XNumber = ^.asInstanceOf[js.Dynamic].applyDynamic("getCenter")(points.asInstanceOf[js.Any]).asInstanceOf[XNumber]
  
  inline def intersectionArea(circles: Any): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("intersectionArea")(circles.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def intersectionArea(circles: Any, stats: Any): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("intersectionArea")(circles.asInstanceOf[js.Any], stats.asInstanceOf[js.Any])).asInstanceOf[Double]
}
