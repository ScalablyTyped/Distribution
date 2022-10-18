package typings.antvGMath

import typings.antvGMath.distTypesMod.Point
import typings.antvGMath.distTypesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSegmentsMod {
  
  @JSImport("@antv/g-math/dist/segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def angleAtSegments(points: js.Array[PointTuple], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleAtSegments")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def distanceAtSegment(points: js.Array[PointTuple], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAtSegment")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def lengthOfSegment(points: js.Array[PointTuple]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthOfSegment")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def pointAtSegments(points: js.Array[PointTuple], t: Double): Point | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAtSegments")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point | Null]
}
