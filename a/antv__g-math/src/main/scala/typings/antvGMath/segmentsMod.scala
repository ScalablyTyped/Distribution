package typings.antvGMath

import typings.antvGMath.typesMod.Point
import typings.antvGMath.typesMod.PointTuple
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/segments", JSImport.Namespace)
@js.native
object segmentsMod extends js.Object {
  
  def angleAtSegments(points: js.Array[PointTuple], t: Double): Double = js.native
  
  def distanceAtSegment(points: js.Array[PointTuple], x: Double, y: Double): Double = js.native
  
  def lengthOfSegment(points: js.Array[PointTuple]): Double = js.native
  
  def pointAtSegments(points: js.Array[PointTuple], t: Double): Point = js.native
}
