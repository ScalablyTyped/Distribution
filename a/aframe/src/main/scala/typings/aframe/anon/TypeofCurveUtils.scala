package typings.aframe.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofCurveUtils extends StObject {
  
  def interpolate(p0: Double, p1: Double, p2: Double, p3: Double, t: Double): Double
  
  def tangentCubicBezier(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double
  
  def tangentQuadraticBezier(t: Double, p0: Double, p1: Double, p2: Double): Double
  
  def tangentSpline(t: Double, p0: Double, p1: Double, p2: Double, p3: Double): Double
}
object TypeofCurveUtils {
  
  inline def apply(
    interpolate: (Double, Double, Double, Double, Double) => Double,
    tangentCubicBezier: (Double, Double, Double, Double, Double) => Double,
    tangentQuadraticBezier: (Double, Double, Double, Double) => Double,
    tangentSpline: (Double, Double, Double, Double, Double) => Double
  ): TypeofCurveUtils = {
    val __obj = js.Dynamic.literal(interpolate = js.Any.fromFunction5(interpolate), tangentCubicBezier = js.Any.fromFunction5(tangentCubicBezier), tangentQuadraticBezier = js.Any.fromFunction4(tangentQuadraticBezier), tangentSpline = js.Any.fromFunction5(tangentSpline))
    __obj.asInstanceOf[TypeofCurveUtils]
  }
  
  extension [Self <: TypeofCurveUtils](x: Self) {
    
    inline def setInterpolate(value: (Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "interpolate", js.Any.fromFunction5(value))
    
    inline def setTangentCubicBezier(value: (Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "tangentCubicBezier", js.Any.fromFunction5(value))
    
    inline def setTangentQuadraticBezier(value: (Double, Double, Double, Double) => Double): Self = StObject.set(x, "tangentQuadraticBezier", js.Any.fromFunction4(value))
    
    inline def setTangentSpline(value: (Double, Double, Double, Double, Double) => Double): Self = StObject.set(x, "tangentSpline", js.Any.fromFunction5(value))
  }
}
