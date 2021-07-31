package typings.amapJsApi.anon

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.LocationValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined amap-js-api.AMap.Omit<amap-js-api.AMap.Ellipse<any>, keyof amap-js-api.AMap.Polygon<any>> */
trait OmitEllipseanykeyofPolygo extends StObject {
  
  def getCenter(): js.UndefOr[LngLat]
  @JSName("getCenter")
  var getCenter_Original: js.Function0[js.UndefOr[LngLat]]
  
  def getRadius(): js.Tuple2[Double, Double]
  @JSName("getRadius")
  var getRadius_Original: js.Function0[js.Tuple2[Double, Double]]
  
  def setCenter(center: LocationValue): Unit
  def setCenter(center: LocationValue, preventEvent: Boolean): Unit
  @JSName("setCenter")
  var setCenter_Original: js.Function2[/* center */ LocationValue, /* preventEvent */ js.UndefOr[Boolean], Unit]
  
  def setRadius(radius: js.Tuple2[Double, Double]): Unit
  def setRadius(radius: js.Tuple2[Double, Double], preventEvent: Boolean): Unit
  @JSName("setRadius")
  var setRadius_Original: js.Function2[/* radius */ js.Tuple2[Double, Double], /* preventEvent */ js.UndefOr[Boolean], Unit]
}
object OmitEllipseanykeyofPolygo {
  
  @scala.inline
  def apply(
    getCenter: () => js.UndefOr[LngLat],
    getRadius: () => js.Tuple2[Double, Double],
    setCenter: (/* center */ LocationValue, /* preventEvent */ js.UndefOr[Boolean]) => Unit,
    setRadius: (/* radius */ js.Tuple2[Double, Double], /* preventEvent */ js.UndefOr[Boolean]) => Unit
  ): OmitEllipseanykeyofPolygo = {
    val __obj = js.Dynamic.literal(getCenter = js.Any.fromFunction0(getCenter), getRadius = js.Any.fromFunction0(getRadius), setCenter = js.Any.fromFunction2(setCenter), setRadius = js.Any.fromFunction2(setRadius))
    __obj.asInstanceOf[OmitEllipseanykeyofPolygo]
  }
  
  @scala.inline
  implicit class OmitEllipseanykeyofPolygoMutableBuilder[Self <: OmitEllipseanykeyofPolygo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetCenter(value: () => js.UndefOr[LngLat]): Self = StObject.set(x, "getCenter", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRadius(value: () => js.Tuple2[Double, Double]): Self = StObject.set(x, "getRadius", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetCenter(value: (/* center */ LocationValue, /* preventEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setCenter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetRadius(value: (/* radius */ js.Tuple2[Double, Double], /* preventEvent */ js.UndefOr[Boolean]) => Unit): Self = StObject.set(x, "setRadius", js.Any.fromFunction2(value))
  }
}
