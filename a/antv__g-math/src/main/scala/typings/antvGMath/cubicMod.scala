package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@antv/g-math/lib/cubic", JSImport.Namespace)
@js.native
object cubicMod extends js.Object {
  
  @js.native
  object default extends js.Object {
    
    def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): BBox = js.native
    
    def divide(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): js.Array[js.Array[Double]] = js.native
    
    def extrema(p0: Double, p1: Double, p2: Double, p3: Double): js.Array[_] = js.native
    @JSName("extrema")
    var extrema_Original: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[_]] = js.native
    
    def interpolationAt(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
    @JSName("interpolationAt")
    var interpolationAt_Original: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double] = js.native
    
    def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): js.Any = js.native
    
    def nearestPoint(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double
    ): Point = js.native
    def nearestPoint(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double,
      length: Double
    ): Point = js.native
    
    def pointAt(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Point = js.native
    
    def pointDistance(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double
    ): Double = js.native
    def pointDistance(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      x0: Double,
      y0: Double,
      length: Double
    ): Double = js.native
    
    def tangentAngle(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Double = js.native
  }
}
