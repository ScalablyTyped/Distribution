package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`heavy-traffic`
import typings.arcgisJsApi.arcgisJsApiStrings.`maneuver-segment`
import typings.arcgisJsApi.arcgisJsApiStrings.`moderate-traffic`
import typings.arcgisJsApi.arcgisJsApiStrings.`restriction-violation`
import typings.arcgisJsApi.arcgisJsApiStrings.`scaled-cost-barrier`
import typings.arcgisJsApi.arcgisJsApiStrings.`slow-traffic`
import typings.arcgisJsApi.arcgisJsApiStrings.segment
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionLineProperties extends StObject {
  
  /**
    * The type of line which is defined by esriDirectionLineType.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#directionLineType)
    */
  var directionLineType: js.UndefOr[
    unknown | segment | `maneuver-segment` | `restriction-violation` | `scaled-cost-barrier` | `heavy-traffic` | `slow-traffic` | `moderate-traffic`
  ] = js.undefined
  
  /**
    * Length of the line measured in meters.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#distance)
    */
  var distance: js.UndefOr[Double] = js.undefined
  
  /**
    * Time of the line measured in minutes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#duration)
    */
  var duration: js.UndefOr[Double] = js.undefined
  
  /**
    * Polyline representing the direction's location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-DirectionLine.html#geometry)
    */
  var geometry: js.UndefOr[PolylineProperties] = js.undefined
}
object DirectionLineProperties {
  
  inline def apply(): DirectionLineProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionLineProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionLineProperties] (val x: Self) extends AnyVal {
    
    inline def setDirectionLineType(
      value: unknown | segment | `maneuver-segment` | `restriction-violation` | `scaled-cost-barrier` | `heavy-traffic` | `slow-traffic` | `moderate-traffic`
    ): Self = StObject.set(x, "directionLineType", value.asInstanceOf[js.Any])
    
    inline def setDirectionLineTypeUndefined: Self = StObject.set(x, "directionLineType", js.undefined)
    
    inline def setDistance(value: Double): Self = StObject.set(x, "distance", value.asInstanceOf[js.Any])
    
    inline def setDistanceUndefined: Self = StObject.set(x, "distance", js.undefined)
    
    inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
    
    inline def setGeometry(value: PolylineProperties): Self = StObject.set(x, "geometry", value.asInstanceOf[js.Any])
    
    inline def setGeometryUndefined: Self = StObject.set(x, "geometry", js.undefined)
  }
}
