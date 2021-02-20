package typings.antvGMath

import typings.antvGMath.typesMod.Point
import typings.antvGMath.typesMod.PointTuple
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object segmentsMod {
  
  @JSImport("@antv/g-math/lib/segments", "angleAtSegments")
  @js.native
  def angleAtSegments(points: js.Array[PointTuple], t: Double): Double = js.native
  
  @JSImport("@antv/g-math/lib/segments", "distanceAtSegment")
  @js.native
  def distanceAtSegment(points: js.Array[PointTuple], x: Double, y: Double): Double = js.native
  
  @JSImport("@antv/g-math/lib/segments", "lengthOfSegment")
  @js.native
  def lengthOfSegment(points: js.Array[PointTuple]): Double = js.native
  
  @JSImport("@antv/g-math/lib/segments", "pointAtSegments")
  @js.native
  def pointAtSegments(points: js.Array[PointTuple], t: Double): Point = js.native
}
