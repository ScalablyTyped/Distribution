package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileLineQuerySource
  extends StObject
     with Object {
  
  def queryElevation(geometry: Multipoint): js.Promise[ElevationLayerElevationQueryResult]
  def queryElevation(geometry: Multipoint, options: Any): js.Promise[ElevationLayerElevationQueryResult]
  /**
    * Function used to query elevation values for a geometry ([Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) or [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#source)
    */
  def queryElevation(geometry: Point): js.Promise[ElevationLayerElevationQueryResult]
  def queryElevation(geometry: Point, options: Any): js.Promise[ElevationLayerElevationQueryResult]
  def queryElevation(geometry: Polyline): js.Promise[ElevationLayerElevationQueryResult]
  def queryElevation(geometry: Polyline, options: Any): js.Promise[ElevationLayerElevationQueryResult]
  /**
    * Function used to query elevation values for a geometry ([Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html), [Multipoint](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html) or [Polyline](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html)).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ElevationProfile-ElevationProfileLineQuery.html#source)
    */
  @JSName("queryElevation")
  var queryElevation_Original: QueryElevation
}
object ElevationProfileLineQuerySource {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    queryElevation: (/* geometry */ Point | Multipoint | Polyline, /* options */ js.UndefOr[Any]) => js.Promise[ElevationLayerElevationQueryResult]
  ): ElevationProfileLineQuerySource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), queryElevation = js.Any.fromFunction2(queryElevation))
    __obj.asInstanceOf[ElevationProfileLineQuerySource]
  }
  
  extension [Self <: ElevationProfileLineQuerySource](x: Self) {
    
    inline def setQueryElevation(
      value: (/* geometry */ Point | Multipoint | Polyline, /* options */ js.UndefOr[Any]) => js.Promise[ElevationLayerElevationQueryResult]
    ): Self = StObject.set(x, "queryElevation", js.Any.fromFunction2(value))
  }
}
