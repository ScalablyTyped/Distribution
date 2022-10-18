package typings.antvUtil

import typings.antvUtil.libPathTypesMod.CurveArray
import typings.antvUtil.libPathTypesMod.PathArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPathConvertPath2CurveMod {
  
  @JSImport("@antv/util/lib/path/convert/path-2-curve", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def path2Curve(pathInput: String): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: String, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = ^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any]).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
  inline def path2Curve(pathInput: PathArray, needZCommandIndexes: Boolean): CurveArray | (js.Tuple2[CurveArray, js.Array[Double]]) = (^.asInstanceOf[js.Dynamic].applyDynamic("path2Curve")(pathInput.asInstanceOf[js.Any], needZCommandIndexes.asInstanceOf[js.Any])).asInstanceOf[CurveArray | (js.Tuple2[CurveArray, js.Array[Double]])]
}
