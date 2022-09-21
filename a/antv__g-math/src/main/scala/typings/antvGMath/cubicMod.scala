package typings.antvGMath

import typings.antvGMath.typesMod.BBox
import typings.antvGMath.typesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cubicMod {
  
  object default {
    
    @JSImport("@antv/g-math/dist/cubic", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    inline def box(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): BBox = (^.asInstanceOf[js.Dynamic].applyDynamic("box")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[BBox]
    
    inline def divide(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): js.Array[js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]] = (^.asInstanceOf[js.Dynamic].applyDynamic("divide")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Tuple8[Double, Double, Double, Double, Double, Double, Double, Double]]]
    
    @JSImport("@antv/g-math/dist/cubic", "default.extrema")
    @js.native
    def extrema: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[Any]] = js.native
    inline def extrema(p0: Double, p1: Double, p2: Double, p3: Double): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("extrema")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
    inline def extrema_=(x: js.Function4[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, js.Array[Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("extrema")(x.asInstanceOf[js.Any])
    
    @JSImport("@antv/g-math/dist/cubic", "default.interpolationAt")
    @js.native
    def interpolationAt: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double] = js.native
    inline def interpolationAt(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("interpolationAt")(p0.asInstanceOf[js.Any], p1.asInstanceOf[js.Any], p2.asInstanceOf[js.Any], p3.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def interpolationAt_=(
      x: js.Function5[/* p0 */ Double, /* p1 */ Double, /* p2 */ Double, /* p3 */ Double, /* t */ Double, Double]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("interpolationAt")(x.asInstanceOf[js.Any])
    
    inline def length(x1: Double, y1: Double, x2: Double, y2: Double, x3: Double, y3: Double, x4: Double, y4: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("length")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def nearestPoint(
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
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Point]
    inline def nearestPoint(
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
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointAt(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("pointAt")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Point]
    
    inline def pointDistance(
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
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any])).asInstanceOf[Double]
    inline def pointDistance(
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
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("pointDistance")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], x0.asInstanceOf[js.Any], y0.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Double]
    
    inline def tangentAngle(
      x1: Double,
      y1: Double,
      x2: Double,
      y2: Double,
      x3: Double,
      y3: Double,
      x4: Double,
      y4: Double,
      t: Double
    ): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("tangentAngle")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any], x3.asInstanceOf[js.Any], y3.asInstanceOf[js.Any], x4.asInstanceOf[js.Any], y4.asInstanceOf[js.Any], t.asInstanceOf[js.Any])).asInstanceOf[Double]
  }
}
