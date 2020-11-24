package typings.antvGMath

import typings.antvGMath.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/bezier", JSImport.Namespace)
@js.native
object bezierMod extends js.Object {
  
  def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double]
  ): Point = js.native
  def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double],
    length: Double
  ): Point = js.native
  
  def snapLength(xArr: js.Array[Double], yArr: js.Array[Double]): Double = js.native
}
