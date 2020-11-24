package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ServiceAreaSolveResultProperties extends js.Object {
  
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
  implicit class ServiceAreaSolveResultPropertiesOps[Self <: ServiceAreaSolveResultProperties] (val x: Self) extends AnyVal {
    
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
    def setFacilitiesVarargs(value: PointProperties*): Self = this.set("facilities", js.Array(value :_*))
    
    @scala.inline
    def setFacilities(value: js.Array[PointProperties]): Self = this.set("facilities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFacilities: Self = this.set("facilities", js.undefined)
    
    @scala.inline
    def setMessagesVarargs(value: NAMessageProperties*): Self = this.set("messages", js.Array(value :_*))
    
    @scala.inline
    def setMessages(value: js.Array[NAMessageProperties]): Self = this.set("messages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessages: Self = this.set("messages", js.undefined)
    
    @scala.inline
    def setPointBarriersVarargs(value: PointProperties*): Self = this.set("pointBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPointBarriers(value: js.Array[PointProperties]): Self = this.set("pointBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePointBarriers: Self = this.set("pointBarriers", js.undefined)
    
    @scala.inline
    def setPolygonBarriersVarargs(value: PolygonProperties*): Self = this.set("polygonBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPolygonBarriers(value: js.Array[PolygonProperties]): Self = this.set("polygonBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolygonBarriers: Self = this.set("polygonBarriers", js.undefined)
    
    @scala.inline
    def setPolylineBarriersVarargs(value: PolylineProperties*): Self = this.set("polylineBarriers", js.Array(value :_*))
    
    @scala.inline
    def setPolylineBarriers(value: js.Array[PolylineProperties]): Self = this.set("polylineBarriers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePolylineBarriers: Self = this.set("polylineBarriers", js.undefined)
    
    @scala.inline
    def setServiceAreaPolygonsVarargs(value: GraphicProperties*): Self = this.set("serviceAreaPolygons", js.Array(value :_*))
    
    @scala.inline
    def setServiceAreaPolygons(value: js.Array[GraphicProperties]): Self = this.set("serviceAreaPolygons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAreaPolygons: Self = this.set("serviceAreaPolygons", js.undefined)
    
    @scala.inline
    def setServiceAreaPolylinesVarargs(value: GraphicProperties*): Self = this.set("serviceAreaPolylines", js.Array(value :_*))
    
    @scala.inline
    def setServiceAreaPolylines(value: js.Array[GraphicProperties]): Self = this.set("serviceAreaPolylines", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceAreaPolylines: Self = this.set("serviceAreaPolylines", js.undefined)
  }
}
