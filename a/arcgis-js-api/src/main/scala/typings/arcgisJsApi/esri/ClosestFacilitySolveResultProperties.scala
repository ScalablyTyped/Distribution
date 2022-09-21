package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosestFacilitySolveResultProperties extends StObject {
  
  /**
    * An array of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: js.UndefOr[js.Array[DirectionsFeatureSetProperties]] = js.undefined
  
  /**
    * An array of points representing facilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * An array of points representing incidents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * Message received when the solve is complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  
  /**
    * The point barriers are an array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * The polygon barriers are an array of polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
  
  /**
    * The polyline barriers are an array of polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  
  /**
    * The array of graphics representing routes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}
object ClosestFacilitySolveResultProperties {
  
  inline def apply(): ClosestFacilitySolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilitySolveResultProperties]
  }
  
  extension [Self <: ClosestFacilitySolveResultProperties](x: Self) {
    
    inline def setDirections(value: js.Array[DirectionsFeatureSetProperties]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    inline def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    inline def setDirectionsVarargs(value: DirectionsFeatureSetProperties*): Self = StObject.set(x, "directions", js.Array(value*))
    
    inline def setFacilities(value: js.Array[PointProperties]): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    inline def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    inline def setFacilitiesVarargs(value: PointProperties*): Self = StObject.set(x, "facilities", js.Array(value*))
    
    inline def setIncidents(value: js.Array[PointProperties]): Self = StObject.set(x, "incidents", value.asInstanceOf[js.Any])
    
    inline def setIncidentsUndefined: Self = StObject.set(x, "incidents", js.undefined)
    
    inline def setIncidentsVarargs(value: PointProperties*): Self = StObject.set(x, "incidents", js.Array(value*))
    
    inline def setMessages(value: js.Array[NAMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: NAMessageProperties*): Self = StObject.set(x, "messages", js.Array(value*))
    
    inline def setPointBarriers(value: js.Array[PointProperties]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPointBarriersVarargs(value: PointProperties*): Self = StObject.set(x, "pointBarriers", js.Array(value*))
    
    inline def setPolygonBarriers(value: js.Array[PolygonProperties]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolygonBarriersVarargs(value: PolygonProperties*): Self = StObject.set(x, "polygonBarriers", js.Array(value*))
    
    inline def setPolylineBarriers(value: js.Array[PolylineProperties]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setPolylineBarriersVarargs(value: PolylineProperties*): Self = StObject.set(x, "polylineBarriers", js.Array(value*))
    
    inline def setRoutes(value: js.Array[GraphicProperties]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    inline def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    inline def setRoutesVarargs(value: GraphicProperties*): Self = StObject.set(x, "routes", js.Array(value*))
  }
}
