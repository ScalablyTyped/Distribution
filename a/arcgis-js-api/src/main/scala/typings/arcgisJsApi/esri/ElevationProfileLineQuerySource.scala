package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ElevationProfileLineQuerySource extends StObject {
  
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
    queryElevation: (/* geometry */ Point | Multipoint | Polyline, /* options */ js.UndefOr[Any]) => js.Promise[ElevationLayerElevationQueryResult]
  ): ElevationProfileLineQuerySource = {
    val __obj = js.Dynamic.literal(queryElevation = js.Any.fromFunction2(queryElevation))
    __obj.asInstanceOf[ElevationProfileLineQuerySource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ElevationProfileLineQuerySource] (val x: Self) extends AnyVal {
    
    inline def setQueryElevation(
      value: (/* geometry */ Point | Multipoint | Polyline, /* options */ js.UndefOr[Any]) => js.Promise[ElevationLayerElevationQueryResult]
    ): Self = StObject.set(x, "queryElevation", js.Any.fromFunction2(value))
  }
}
