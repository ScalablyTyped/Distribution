package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceAreaSolveResultProperties extends StObject {
  
  /**
    * Array of points only returned if `ServiceAreaParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * Message received when solve is completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.undefined
  
  /**
    * The point barriers are returned only if `ServiceAreaParameters.returnPointBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.undefined
  
  /**
    * The polygon barriers are returned only if `ServiceAreaParameters.returnPolygonBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.undefined
  
  /**
    * The polyline barriers are returned only if `ServiceAreaParameters.returnPolylineBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.undefined
  
  /**
    * An array of service area polygon graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolygons)
    */
  var serviceAreaPolygons: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
  
  /**
    * An array of service area polyline graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolylines)
    */
  var serviceAreaPolylines: js.UndefOr[js.Array[GraphicProperties]] = js.undefined
}
object ServiceAreaSolveResultProperties {
  
  inline def apply(): ServiceAreaSolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaSolveResultProperties]
  }
  
  extension [Self <: ServiceAreaSolveResultProperties](x: Self) {
    
    inline def setFacilities(value: js.Array[PointProperties]): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    inline def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    inline def setFacilitiesVarargs(value: PointProperties*): Self = StObject.set(x, "facilities", js.Array(value :_*))
    
    inline def setMessages(value: js.Array[NAMessageProperties]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
    
    inline def setMessagesUndefined: Self = StObject.set(x, "messages", js.undefined)
    
    inline def setMessagesVarargs(value: NAMessageProperties*): Self = StObject.set(x, "messages", js.Array(value :_*))
    
    inline def setPointBarriers(value: js.Array[PointProperties]): Self = StObject.set(x, "pointBarriers", value.asInstanceOf[js.Any])
    
    inline def setPointBarriersUndefined: Self = StObject.set(x, "pointBarriers", js.undefined)
    
    inline def setPointBarriersVarargs(value: PointProperties*): Self = StObject.set(x, "pointBarriers", js.Array(value :_*))
    
    inline def setPolygonBarriers(value: js.Array[PolygonProperties]): Self = StObject.set(x, "polygonBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolygonBarriersUndefined: Self = StObject.set(x, "polygonBarriers", js.undefined)
    
    inline def setPolygonBarriersVarargs(value: PolygonProperties*): Self = StObject.set(x, "polygonBarriers", js.Array(value :_*))
    
    inline def setPolylineBarriers(value: js.Array[PolylineProperties]): Self = StObject.set(x, "polylineBarriers", value.asInstanceOf[js.Any])
    
    inline def setPolylineBarriersUndefined: Self = StObject.set(x, "polylineBarriers", js.undefined)
    
    inline def setPolylineBarriersVarargs(value: PolylineProperties*): Self = StObject.set(x, "polylineBarriers", js.Array(value :_*))
    
    inline def setServiceAreaPolygons(value: js.Array[GraphicProperties]): Self = StObject.set(x, "serviceAreaPolygons", value.asInstanceOf[js.Any])
    
    inline def setServiceAreaPolygonsUndefined: Self = StObject.set(x, "serviceAreaPolygons", js.undefined)
    
    inline def setServiceAreaPolygonsVarargs(value: GraphicProperties*): Self = StObject.set(x, "serviceAreaPolygons", js.Array(value :_*))
    
    inline def setServiceAreaPolylines(value: js.Array[GraphicProperties]): Self = StObject.set(x, "serviceAreaPolylines", value.asInstanceOf[js.Any])
    
    inline def setServiceAreaPolylinesUndefined: Self = StObject.set(x, "serviceAreaPolylines", js.undefined)
    
    inline def setServiceAreaPolylinesVarargs(value: GraphicProperties*): Self = StObject.set(x, "serviceAreaPolylines", js.Array(value :_*))
  }
}
