package typings.amapJsApi.AMap.GeoJSON

import typings.amapJsApi.AMap.LngLat
import typings.amapJsApi.AMap.Marker
import typings.amapJsApi.AMap.Polygon
import typings.amapJsApi.AMap.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var coordsToLatLng: js.UndefOr[js.Function1[/* lnglat */ LngLat, LngLat]] = js.native
  
  // internal
  var coordsToLatLngs: js.UndefOr[js.Function1[/* lnglats */ js.Array[LngLat], js.Array[LngLat]]] = js.native
  
  /**
    * 要加载的标准GeoJSON对象
    */
  var geoJSON: js.UndefOr[GeoJSONObject | js.Array[GeoJSONObject]] = js.native
  
  /**
    * 指定点要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglat 点的位置
    */
  var getMarker: js.UndefOr[js.Function2[/* obj */ GeoJSONObject, /* lnglat */ LngLat, Marker[_]]] = js.native
  
  /**
    * 指定面要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 面的路径
    */
  var getPolygon: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polygon[_]]
  ] = js.native
  
  /**
    * 指定线要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 线的路径
    */
  var getPolyline: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polyline[_]]
  ] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCoordsToLatLng(value: /* lnglat */ LngLat => LngLat): Self = this.set("coordsToLatLng", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCoordsToLatLng: Self = this.set("coordsToLatLng", js.undefined)
    
    @scala.inline
    def setCoordsToLatLngs(value: /* lnglats */ js.Array[LngLat] => js.Array[LngLat]): Self = this.set("coordsToLatLngs", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCoordsToLatLngs: Self = this.set("coordsToLatLngs", js.undefined)
    
    @scala.inline
    def setGeoJSONVarargs(value: GeoJSONObject*): Self = this.set("geoJSON", js.Array(value :_*))
    
    @scala.inline
    def setGeoJSON(value: GeoJSONObject | js.Array[GeoJSONObject]): Self = this.set("geoJSON", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeoJSON: Self = this.set("geoJSON", js.undefined)
    
    @scala.inline
    def setGetMarker(value: (/* obj */ GeoJSONObject, /* lnglat */ LngLat) => Marker[_]): Self = this.set("getMarker", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetMarker: Self = this.set("getMarker", js.undefined)
    
    @scala.inline
    def setGetPolygon(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polygon[_]): Self = this.set("getPolygon", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetPolygon: Self = this.set("getPolygon", js.undefined)
    
    @scala.inline
    def setGetPolyline(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polyline[_]): Self = this.set("getPolyline", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteGetPolyline: Self = this.set("getPolyline", js.undefined)
  }
}
