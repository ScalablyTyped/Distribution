package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DirectionsFeatureSet extends FeatureSet {
  /**
    * The extent of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#extent)
    */
  var extent: Extent = js.native
  /**
    * A single polyline representing the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#mergedGeometry)
    */
  var mergedGeometry: Polyline = js.native
  /**
    * The ID of the route returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeId)
    */
  var routeId: String = js.native
  /**
    * Name specified in [RouteParameters.stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeName)
    */
  var routeName: String = js.native
  /**
    * Lists additional information about the directions depending on the value of [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#strings)
    */
  var strings: js.Array[_] = js.native
  /**
    * Actual drive time calculated for the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalDriveTime)
    */
  var totalDriveTime: Double = js.native
  /**
    * The length of the route as specified in the units set in [RouteParameters.directionsLengthUnits](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalLength)
    */
  var totalLength: Double = js.native
  /**
    * The total time calculated for the route as specified in the units set in [RouteParameters.directionsTimeAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalTime)
    */
  var totalTime: Double = js.native
}

@JSGlobal("__esri.DirectionsFeatureSet")
@js.native
/**
  * A [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html) that has properties specific to routing. The [features](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#features) property contains the turn by turn directions text and geometry of the route. The attributes for each feature provide information associated with the corresponding route segment. The following attributes are returned:
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html)
  */
class DirectionsFeatureSetCls () extends DirectionsFeatureSet {
  def this(properties: DirectionsFeatureSetProperties) = this()
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

