package typings
package aframeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Area extends js.Object {
  def area(contour: js.Array[threeLib.threeDashCoreMod.Vec2]): scala.Double
  def isClockWise(pts: js.Array[threeLib.threeDashCoreMod.Vec2]): scala.Boolean
  def triangulate(contour: js.Array[threeLib.threeDashCoreMod.Vec2], indices: scala.Boolean): js.Array[scala.Double]
  def triangulateShape(contour: js.Array[threeLib.threeDashCoreMod.Vec2], holes: js.Array[threeLib.threeDashCoreMod.Vec2]): js.Array[js.Array[scala.Double]]
}

