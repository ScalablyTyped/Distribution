package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.BezierCurve<any>, keyof amap-js-api.AMap.Polyline<any>> */
trait OmitBezierCurveanykeyofPo extends StObject {
  
  def getInterpolateLngLats(): js.Array[LngLat]
  @JSName("getInterpolateLngLats")
  var getInterpolateLngLats_Original: js.Function0[js.Array[LngLat]]
  
  def getSerializedPath(): js.Array[js.Array[Double]]
  @JSName("getSerializedPath")
  var getSerializedPath_Original: js.Function0[js.Array[js.Array[Double]]]
}
object OmitBezierCurveanykeyofPo {
  
  inline def apply(getInterpolateLngLats: () => js.Array[LngLat], getSerializedPath: () => js.Array[js.Array[Double]]): OmitBezierCurveanykeyofPo = {
    val __obj = js.Dynamic.literal(getInterpolateLngLats = js.Any.fromFunction0(getInterpolateLngLats), getSerializedPath = js.Any.fromFunction0(getSerializedPath))
    __obj.asInstanceOf[OmitBezierCurveanykeyofPo]
  }
  
  extension [Self <: OmitBezierCurveanykeyofPo](x: Self) {
    
    inline def setGetInterpolateLngLats(value: () => js.Array[LngLat]): Self = StObject.set(x, "getInterpolateLngLats", js.Any.fromFunction0(value))
    
    inline def setGetSerializedPath(value: () => js.Array[js.Array[Double]]): Self = StObject.set(x, "getSerializedPath", js.Any.fromFunction0(value))
  }
}
