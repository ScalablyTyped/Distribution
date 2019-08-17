package typings.amapDashJsDashApi.AMapNs.GeoJSONNs

import typings.amapDashJsDashApi.AMapNs.LngLat
import typings.amapDashJsDashApi.AMapNs.Marker
import typings.amapDashJsDashApi.AMapNs.Polygon
import typings.amapDashJsDashApi.AMapNs.Polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var coordsToLatLng: js.UndefOr[js.Function1[/* lnglat */ LngLat, LngLat]] = js.undefined
  // internal
  var coordsToLatLngs: js.UndefOr[js.Function1[/* lnglats */ js.Array[LngLat], js.Array[LngLat]]] = js.undefined
  /**
    * 要加载的标准GeoJSON对象
    */
  var geoJSON: js.UndefOr[GeoJSONObject | js.Array[GeoJSONObject]] = js.undefined
  /**
    * 指定点要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglat 点的位置
    */
  var getMarker: js.UndefOr[js.Function2[/* obj */ GeoJSONObject, /* lnglat */ LngLat, Marker[_]]] = js.undefined
  /**
    * 指定面要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 面的路径
    */
  var getPolygon: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polygon[_]]
  ] = js.undefined
  /**
    * 指定线要素的绘制方式
    * @param obj GeoJSON对象
    * @param lnglats 线的路径
    */
  var getPolyline: js.UndefOr[
    js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polyline[_]]
  ] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    coordsToLatLng: /* lnglat */ LngLat => LngLat = null,
    coordsToLatLngs: /* lnglats */ js.Array[LngLat] => js.Array[LngLat] = null,
    geoJSON: GeoJSONObject | js.Array[GeoJSONObject] = null,
    getMarker: (/* obj */ GeoJSONObject, /* lnglat */ LngLat) => Marker[_] = null,
    getPolygon: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polygon[_] = null,
    getPolyline: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polyline[_] = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (coordsToLatLng != null) __obj.updateDynamic("coordsToLatLng")(js.Any.fromFunction1(coordsToLatLng))
    if (coordsToLatLngs != null) __obj.updateDynamic("coordsToLatLngs")(js.Any.fromFunction1(coordsToLatLngs))
    if (geoJSON != null) __obj.updateDynamic("geoJSON")(geoJSON.asInstanceOf[js.Any])
    if (getMarker != null) __obj.updateDynamic("getMarker")(js.Any.fromFunction2(getMarker))
    if (getPolygon != null) __obj.updateDynamic("getPolygon")(js.Any.fromFunction2(getPolygon))
    if (getPolyline != null) __obj.updateDynamic("getPolyline")(js.Any.fromFunction2(getPolyline))
    __obj.asInstanceOf[Options]
  }
}

