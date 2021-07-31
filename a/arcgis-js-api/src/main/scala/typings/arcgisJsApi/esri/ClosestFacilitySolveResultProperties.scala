package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClosestFacilitySolveResultProperties extends StObject {
  
  /**
    * An array of directions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: js.UndefOr[js.Array[DirectionsFeatureSetProperties]] = js.undefined
  
  /**
    * An array of points representing facilities.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * An array of points representing incidents.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * Message received when the solve is complete.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  
  /**
    * The point barriers are an array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * The polygon barriers are an array of polygons.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
  
  /**
    * The polyline barriers are an array of polylines.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  
  /**
    * The array of graphics representing routes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}
object ClosestFacilitySolveResultProperties {
  
  @scala.inline
  def apply(): ClosestFacilitySolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilitySolveResultProperties]
  }
  
  @scala.inline
  implicit class ClosestFacilitySolveResultPropertiesMutableBuilder[Self <: ClosestFacilitySolveResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirections(value: js.Array[DirectionsFeatureSetProperties]): Self = StObject.set(x, "directions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectionsUndefined: Self = StObject.set(x, "directions", js.undefined)
    
    @scala.inline
    def setDirectionsVarargs(value: DirectionsFeatureSetProperties*): Self = StObject.set(x, "directions", js.Array(value :_*))
    
    @scala.inline
    def setFacilities(value: js.Array[PointProperties]): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    @scala.inline
    def setFacilitiesVarargs(value: PointProperties*): Self = StObject.set(x, "facilities", js.Array(value :_*))
    
    @scala.inline
    def setIncidents(value: js.Array[PointProperties]): Self = StObject.set(x, "incidents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncidentsUndefined: Self = StObject.set(x, "incidents", js.undefined)
    
    @scala.inline
    def setIncidentsVarargs(value: PointProperties*): Self = StObject.set(x, "incidents", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[NAMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: NAMessageProperties*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    @scala.inline
    def setPointBarriers(value: js.Array[PointProperties]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    @scala.inline
    def setPointBarriersVarargs(value: PointProperties*): Self = StObject.set(x, "pointBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPolygonBarriers(value: js.Array[PolygonProperties]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    @scala.inline
    def setPolygonBarriersVarargs(value: PolygonProperties*): Self = StObject.set(x, "polygonBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPolylineBarriers(value: js.Array[PolylineProperties]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    @scala.inline
    def setPolylineBarriersVarargs(value: PolylineProperties*): Self = StObject.set(x, "polylineBarriers", js.Array(value :_*))
    
    @scala.inline
    def setRoutes(value: js.Array[GraphicProperties]): Self = StObject.set(x, "routes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRoutesUndefined: Self = StObject.set(x, "routes", js.undefined)
    
    @scala.inline
    def setRoutesVarargs(value: GraphicProperties*): Self = StObject.set(x, "routes", js.Array(value :_*))
  }
}
