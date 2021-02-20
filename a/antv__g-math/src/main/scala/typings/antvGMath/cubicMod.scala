package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubicMod {
  
  object default {
    
    @JSImport("@antv/g-math/lib/cubic", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-math/lib/cubic", "default.box")
    @js.native
    def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): BBox = js.native
    
    @JSImport("@antv/g-math/lib/cubic", "default.divide")
    @js.native
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
    
    @JSImport("@antv/g-math/lib/cubic", "default.extrema")
    @js.native
    def extrema: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[js.Any]] = js.native
    @JSImport("@antv/g-math/lib/cubic", "default.extrema")
    @js.native
    def extrema(p0: Double, p1: Double, p2: Double, p3: Double): js.Array[_] = js.native
    @scala.inline
    def extrema_=(
      x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[js.Any]]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extrema")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g-math/lib/cubic", "default.interpolationAt")
    @js.native
    def interpolationAt: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double] = js.native
    @JSImport("@antv/g-math/lib/cubic", "default.interpolationAt")
    @js.native
    def interpolationAt(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = js.native
    @scala.inline
    def interpolationAt_=(
      x: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g-math/lib/cubic", "default.length")
    @js.native
    def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): js.Any = js.native
    
    @JSImport("@antv/g-math/lib/cubic", "default.nearestPoint")
    @js.native
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
    @JSImport("@antv/g-math/lib/cubic", "default.nearestPoint")
    @js.native
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
    
    @JSImport("@antv/g-math/lib/cubic", "default.pointAt")
    @js.native
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
    
    @JSImport("@antv/g-math/lib/cubic", "default.pointDistance")
    @js.native
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
    @JSImport("@antv/g-math/lib/cubic", "default.pointDistance")
    @js.native
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
    
    @JSImport("@antv/g-math/lib/cubic", "default.tangentAngle")
    @js.native
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
