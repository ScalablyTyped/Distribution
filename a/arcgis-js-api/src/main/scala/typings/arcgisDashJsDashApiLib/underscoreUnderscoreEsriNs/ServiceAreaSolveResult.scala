package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceAreaSolveResult
  extends Accessor
     with JSONSupport {
  /**
    * Array of points only returned if `ServiceAreaParameters.returnFacilities = true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#facilities)
    */
  var facilities: js.Array[Point] = js.native
  /**
    * Message received when solve is completed. If a service area cannot be solved, the message returned by the server identifies the incident that could not be solved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#messages)
    */
  var messages: js.Array[NAMessage] = js.native
  /**
    * The point barriers are returned only if `ServiceAreaParameters.returnPointBarriers = true` (which is not the default). If you send in the point barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#pointBarriers)
    */
  var pointBarriers: js.Array[Point] = js.native
  /**
    * The polygon barriers are returned only if `ServiceAreaParameters.returnPolygonBarriers = true` (which is not the default). If you send in the polygon barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polygonBarriers)
    */
  var polygonBarriers: js.Array[Polygon] = js.native
  /**
    * The polyline barriers are returned only if `ServiceAreaParameters.returnPolylineBarriers = true` (which is not the default). If you send in the polyline barriers as a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) (instead of using [DataLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DataLayer.html)), you already have the barriers and might not need to request them back from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#polylineBarriers)
    */
  var polylineBarriers: js.Array[Polyline] = js.native
  /**
    * An array of service area polygon graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolygons)
    */
  var serviceAreaPolygons: js.Array[Graphic] = js.native
  /**
    * An array of service area polyline graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html#serviceAreaPolylines)
    */
  var serviceAreaPolylines: js.Array[Graphic] = js.native
}

@JSGlobal("__esri.ServiceAreaSolveResult")
@js.native
/**
  * The result from [ServiceAreaTask](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-ServiceAreaTask.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ServiceAreaSolveResult.html)
  */
class ServiceAreaSolveResultCls () extends ServiceAreaSolveResult {
  def this(properties: ServiceAreaSolveResultProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

