package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaSolveResultProperties extends StObject {
  
  /**
    * Array of points only returned if `ServiceAreaParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.native
  
  /**
    * Message received when solve is completed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.native
  
  /**
    * The point barriers are returned only if `ServiceAreaParameters.returnPointBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.native
  
  /**
    * The polygon barriers are returned only if `ServiceAreaParameters.returnPolygonBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.native
  
  /**
    * The polyline barriers are returned only if `ServiceAreaParameters.returnPolylineBarriers = true` (which is not the default).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.native
  
  /**
    * An array of service area polygon graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolygons)
    */
  var serviceAreaPolygons: js.UndefOr[js.Array[GraphicProperties]] = js.native
  
  /**
    * An array of service area polyline graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolylines)
    */
  var serviceAreaPolylines: js.UndefOr[js.Array[GraphicProperties]] = js.native
}
object ServiceAreaSolveResultProperties {
  
  @scala.inline
  def apply(): ServiceAreaSolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServiceAreaSolveResultProperties]
  }
  
  @scala.inline
  implicit class ServiceAreaSolveResultPropertiesMutableBuilder[Self <: ServiceAreaSolveResultProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFacilities(value: js.Array[PointProperties]): Self = StObject.set(x, "facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFacilitiesUndefined: Self = StObject.set(x, "facilities", js.undefined)
    
    @scala.inline
    def setFacilitiesVarargs(value: PointProperties*): Self = StObject.set(x, "facilities", js.Array(value :_*))
    
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
    def setServiceAreaPolygons(value: js.Array[GraphicProperties]): Self = StObject.set(x, "serviceAreaPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAreaPolygonsUndefined: Self = StObject.set(x, "serviceAreaPolygons", js.undefined)
    
    @scala.inline
    def setServiceAreaPolygonsVarargs(value: GraphicProperties*): Self = StObject.set(x, "serviceAreaPolygons", js.Array(value :_*))
    
    @scala.inline
    def setServiceAreaPolylines(value: js.Array[GraphicProperties]): Self = StObject.set(x, "serviceAreaPolylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceAreaPolylinesUndefined: Self = StObject.set(x, "serviceAreaPolylines", js.undefined)
    
    @scala.inline
    def setServiceAreaPolylinesVarargs(value: GraphicProperties*): Self = StObject.set(x, "serviceAreaPolylines", js.Array(value :_*))
  }
}
