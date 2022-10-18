package typings.antvGMath

import typings.antvGMath.distTypesMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distBezierMod {
  
  @JSImport("@antv/g-math/dist/bezier", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double]
  ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(xArr.asInstanceOf[js.Any], yArr.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tCallback.asInstanceOf[js.Any])).asInstanceOf[Point]
  inline def nearestPoint(
    xArr: js.Array[Double],
    yArr: js.Array[Double],
    x: Double,
    y: Double,
    tCallback: js.Function1[/* repeated */ Double, Double],
    length: Double
  ): Point = (^.asInstanceOf[js.Dynamic].applyDynamic("nearestPoint")(xArr.asInstanceOf[js.Any], yArr.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any], tCallback.asInstanceOf[js.Any], length.asInstanceOf[js.Any])).asInstanceOf[Point]
  
  inline def snapLength(xArr: js.Array[Double], yArr: js.Array[Double]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("snapLength")(xArr.asInstanceOf[js.Any], yArr.asInstanceOf[js.Any])).asInstanceOf[Double]
}
