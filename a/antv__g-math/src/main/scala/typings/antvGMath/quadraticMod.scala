package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object quadraticMod {
  
  object default {
    
    @JSImport("@antv/g-math/dist/quadratic", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    inline def divide(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): js.Array[js.Array[Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Array[Double]]]
    
    @JSImport("@antv/g-math/dist/quadratic", "default.interpolationAt")
    @js.native
    def interpolationAt: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double] = js.native
    inline def interpolationAt(p0: Double, p1: Double, p2: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolationAt")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def interpolationAt_=(x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* t */ Double, Double]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    inline def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def nearestPoint(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointAt(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointDistance(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x0: Double, y0: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentAngle(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
