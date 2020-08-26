package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClosestFacilitySolveResultProperties extends js.Object {
  /**
    * An array of directions. A direction is an instance of [DirectionsFeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html). Route directions are returned if `returnDirections = true` (default is false).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#directions)
    */
  var directions: js.UndefOr[DirectionsFeatureSetProperties] = js.native
  /**
    * An array of points representing facilities. Only returned when `ClosestFacilityParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#facilities)
    */
  var facilities: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * An array of points representing incidents. Only returned when `ClosestFacilityParameters.returnIncidents = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#incidents)
    */
  var incidents: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * Message received when the solve is complete. If a closest facility cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#messages)
    */
  var messages: js.UndefOr[js.Array[NAMessageProperties]] = js.native
  /**
    * The point barriers are an array of points. They are returned only if `ClosestFacilityParameters.returnPointBarriers` was set to `true` (which is not the default). If you send in the point barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#pointBarriers)
    */
  var pointBarriers: js.UndefOr[js.Array[PointProperties]] = js.native
  /**
    * The polygon barriers are an array of polygons. They are returned only if `ClosestFacilityParameters.returnPolygonBarriers` was set to `true` (which is not the default). If you send in the polygon barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.UndefOr[js.Array[PolygonProperties]] = js.native
  /**
    * The polyline barriers are an array of polylines. They are returned only if `ClosestFacilityParameters.returnPolylineBarriers` was set to `true` (which is not the default). If you send in the polyline barriers as a FeatureSet (instead of using DataLayer), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.UndefOr[js.Array[PolylineProperties]] = js.native
  /**
    * The array of graphics representing routes.  Route graphics are returned if `returnRoutes` is `true` and `outputLines` does not equal `none`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ClosestFacilitySolveResult.html#routes)
    */
  var routes: js.UndefOr[js.Array[GraphicProperties]] = js.native
}

object ClosestFacilitySolveResultProperties {
  @scala.inline
  def apply(): ClosestFacilitySolveResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClosestFacilitySolveResultProperties]
  }
  @scala.inline
  implicit class ClosestFacilitySolveResultPropertiesOps[Self <: ClosestFacilitySolveResultProperties] (val x: Self) extends AnyVal {
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
    def setDirections(value: DirectionsFeatureSetProperties): Self = this.set("directions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirections: Self = this.set("directions", js.undefined)
    @scala.inline
    def setFacilitiesVarargs(value: PointProperties*): Self = this.set("facilities", js.Array(value :_*))
    @scala.inline
    def setFacilities(value: js.Array[PointProperties]): Self = this.set("facilities", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFacilities: Self = this.set("facilities", js.undefined)
    @scala.inline
    def setIncidentsVarargs(value: PointProperties*): Self = this.set("incidents", js.Array(value :_*))
    @scala.inline
    def setIncidents(value: js.Array[PointProperties]): Self = this.set("incidents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncidents: Self = this.set("incidents", js.undefined)
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
    def setRoutesVarargs(value: GraphicProperties*): Self = this.set("routes", js.Array(value :_*))
    @scala.inline
    def setRoutes(value: js.Array[GraphicProperties]): Self = this.set("routes", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoutes: Self = this.set("routes", js.undefined)
  }
  
}

