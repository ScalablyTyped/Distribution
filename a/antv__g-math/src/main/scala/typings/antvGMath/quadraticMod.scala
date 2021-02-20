package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadraticMod {
  
  object default {
    
    @JSImport("@antv/g-math/lib/quadratic", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.box")
    @js.native
    def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): BBox = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.divide")
    @js.native
    def divide(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): js.Array[js.Array[Double]] = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.interpolationAt")
    @js.native
    def interpolationAt: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double] = js.native
    @JSImport("@antv/g-math/lib/quadratic", "default.interpolationAt")
    @js.native
    def interpolationAt(p0: Double, p1: Double, p2: Double, t: Double): Double = js.native
    @scala.inline
    def interpolationAt_=(x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g-math/lib/quadratic", "default.length")
    @js.native
    def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): js.Any = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.nearestPoint")
    @js.native
    def nearestPoint(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Point = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.pointAt")
    @js.native
    def pointAt(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Point = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.pointDistance")
    @js.native
    def pointDistance(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Double = js.native
    
    @JSImport("@antv/g-math/lib/quadratic", "default.tangentAngle")
    @js.native
    def tangentAngle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Double = js.native
  }
}
