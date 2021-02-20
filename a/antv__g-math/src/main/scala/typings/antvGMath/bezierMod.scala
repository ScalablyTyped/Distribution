package typings.antvGMath

import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bezierMod {
  
  @JSImport("@antv/g-math/lib/bezier", "nearestPoint")
  @js.native
  def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double]
  ): Point = js.native
  @JSImport("@antv/g-math/lib/bezier", "nearestPoint")
  @js.native
  def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double],
    length: Double
  ): Point = js.native
  
  @JSImport("@antv/g-math/lib/bezier", "snapLength")
  @js.native
  def snapLength(xArr: js.Array[Double], yArr: js.Array[Double]): Double = js.native
}
