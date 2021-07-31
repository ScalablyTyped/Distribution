package typings.antvGMath

import typings.antvGMath.typesMod.Point
import typings.antvGMath.typesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentsMod {
  
  @JSImport("@antv/g-math/lib/segments", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def angleAtSegments(points: js.Array[PointTuple], t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("angleAtSegments")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def distanceAtSegment(points: js.Array[PointTuple], x: Double, y: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("distanceAtSegment")(points.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  @scala.inline
  def lengthOfSegment(points: js.Array[PointTuple]): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("lengthOfSegment")(points.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @scala.inline
  def pointAtSegments(points: js.Array[PointTuple], t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAtSegments")(points.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
}
