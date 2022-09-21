package typings.amapJsApi.AMap

import typings.amapJsApi.AMap.GeoJSON.GeoJSONObject
import typings.amapJsApi.amapJsApiStrings.LineString
import typings.amapJsApi.amapJsApiStrings.MultiLineString
import typings.amapJsApi.amapJsApiStrings.MultiPoint
import typings.amapJsApi.amapJsApiStrings.MultiPolygon
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoJSON[ExtraData]
  extends StObject
     with OverlayGroup[Overlay[Any], ExtraData] {
  
  def importData(obj: js.Array[GeoJSONObject]): Unit = js.native
  /**
    * 加载新的GeoJSON对象，转化为覆盖物，旧的覆盖物将移除
    * @param obj GeoJSON对象
    */
  def importData(obj: GeoJSONObject): Unit = js.native
  
  /**
    * 将当前对象包含的覆盖物转换为GeoJSON对象
    */
  def toGeoJSON(): js.Array[GeoJSONObject] = js.native
}
object GeoJSON {
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.anon.Geometry
    - typings.amapJsApi.anon.Features
  */
  trait GeoJSONObject extends StObject
  object GeoJSONObject {
    
    inline def Features(features: js.Array[GeoJSONObject], properties: Any): typings.amapJsApi.anon.Features = {
      val __obj = js.Dynamic.literal(features = features.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("FeatureCollection")
      __obj.asInstanceOf[typings.amapJsApi.anon.Features]
    }
    
    inline def Geometry(geometry: typings.amapJsApi.AMap.GeoJSON.Geometry, properties: Any): typings.amapJsApi.anon.Geometry = {
      val __obj = js.Dynamic.literal(geometry = geometry.asInstanceOf[js.Any], properties = properties.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Feature")
      __obj.asInstanceOf[typings.amapJsApi.anon.Geometry]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.amapJsApi.anon.Coordinates
    - typings.amapJsApi.anon.CoordinatesType
    - typings.amapJsApi.anon.CoordinatesArray
    - typings.amapJsApi.anon.Geometries
  */
  trait Geometry extends StObject
  object Geometry {
    
    inline def Coordinates(coordinates: js.Tuple2[Double, Double]): typings.amapJsApi.anon.Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[typings.amapJsApi.anon.Coordinates]
    }
    
    inline def CoordinatesArray(coordinates: js.Array[js.Array[js.Tuple2[Double, Double]]], `type`: MultiLineString | MultiPolygon): typings.amapJsApi.anon.CoordinatesArray = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApi.anon.CoordinatesArray]
    }
    
    inline def CoordinatesType(
      coordinates: js.Array[js.Tuple2[Double, Double]],
      `type`: MultiPoint | LineString | typings.amapJsApi.amapJsApiStrings.Polygon
    ): typings.amapJsApi.anon.CoordinatesType = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.amapJsApi.anon.CoordinatesType]
    }
    
    inline def Geometries(geometries: js.Array[Geometry]): typings.amapJsApi.anon.Geometries = {
      val __obj = js.Dynamic.literal(geometries = geometries.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("GeometryCollection")
      __obj.asInstanceOf[typings.amapJsApi.anon.Geometries]
    }
  }
  
  trait Options extends StObject {
    
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
    var getMarker: js.UndefOr[js.Function2[/* obj */ GeoJSONObject, /* lnglat */ LngLat, Marker[Any]]] = js.undefined
    
    /**
      * 指定面要素的绘制方式
      * @param obj GeoJSON对象
      * @param lnglats 面的路径
      */
    var getPolygon: js.UndefOr[
        js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polygon[Any]]
      ] = js.undefined
    
    /**
      * 指定线要素的绘制方式
      * @param obj GeoJSON对象
      * @param lnglats 线的路径
      */
    var getPolyline: js.UndefOr[
        js.Function2[/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat], Polyline[Any]]
      ] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setCoordsToLatLng(value: /* lnglat */ LngLat => LngLat): Self = StObject.set(x, "coordsToLatLng", js.Any.fromFunction1(value))
      
      inline def setCoordsToLatLngUndefined: Self = StObject.set(x, "coordsToLatLng", js.undefined)
      
      inline def setCoordsToLatLngs(value: /* lnglats */ js.Array[LngLat] => js.Array[LngLat]): Self = StObject.set(x, "coordsToLatLngs", js.Any.fromFunction1(value))
      
      inline def setCoordsToLatLngsUndefined: Self = StObject.set(x, "coordsToLatLngs", js.undefined)
      
      inline def setGeoJSON(value: GeoJSONObject | js.Array[GeoJSONObject]): Self = StObject.set(x, "geoJSON", value.asInstanceOf[js.Any])
      
      inline def setGeoJSONUndefined: Self = StObject.set(x, "geoJSON", js.undefined)
      
      inline def setGeoJSONVarargs(value: GeoJSONObject*): Self = StObject.set(x, "geoJSON", js.Array(value*))
      
      inline def setGetMarker(value: (/* obj */ GeoJSONObject, /* lnglat */ LngLat) => Marker[Any]): Self = StObject.set(x, "getMarker", js.Any.fromFunction2(value))
      
      inline def setGetMarkerUndefined: Self = StObject.set(x, "getMarker", js.undefined)
      
      inline def setGetPolygon(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polygon[Any]): Self = StObject.set(x, "getPolygon", js.Any.fromFunction2(value))
      
      inline def setGetPolygonUndefined: Self = StObject.set(x, "getPolygon", js.undefined)
      
      inline def setGetPolyline(value: (/* obj */ GeoJSONObject, /* lnglats */ js.Array[LngLat]) => Polyline[Any]): Self = StObject.set(x, "getPolyline", js.Any.fromFunction2(value))
      
      inline def setGetPolylineUndefined: Self = StObject.set(x, "getPolyline", js.undefined)
    }
  }
}
