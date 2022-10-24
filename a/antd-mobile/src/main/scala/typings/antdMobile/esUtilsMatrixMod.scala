package typings.antdMobile

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esUtilsMatrixMod {
  
  @JSImport("antd-mobile/es/utils/matrix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(m: Matrix, param1: js.Tuple2[Double, Double]): js.Tuple2[Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(m.asInstanceOf[js.Any], param1.asInstanceOf[js.Any])).asInstanceOf[js.Tuple2[Double, Double]]
  
  inline def create(): Matrix = ^.asInstanceOf[js.Dynamic].applyDynamic("create")().asInstanceOf[Matrix]
  
  inline def getScaleX(m: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleX")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getScaleY(m: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getScaleY")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTranslateX(m: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateX")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def getTranslateY(m: Matrix): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("getTranslateY")(m.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  inline def multiply(m1: Matrix, m2: Matrix): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("multiply")(m1.asInstanceOf[js.Any], m2.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def scale(m: Matrix, scaleX: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(m.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  inline def scale(m: Matrix, scaleX: Double, scaleY: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("scale")(m.asInstanceOf[js.Any], scaleX.asInstanceOf[js.Any], scaleY.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  inline def translate(m: Matrix, x: Double, y: Double): Matrix = (^.asInstanceOf[js.Dynamic].applyDynamic("translate")(m.asInstanceOf[js.Any], x.asInstanceOf[js.Any], y.asInstanceOf[js.Any])).asInstanceOf[Matrix]
  
  type Matrix = js.Tuple6[Double, Double, Double, Double, Double, Double]
}
