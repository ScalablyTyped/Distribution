package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectionsFeatureSetProperties extends FeatureSetProperties {
  
  /**
    * The extent of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * The geometry type of the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#geometryType)
    */
  @JSName("geometryType")
  var geometryType_DirectionsFeatureSetProperties: js.UndefOr[polyline] = js.native
  
  /**
    * A single polyline representing the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#mergedGeometry)
    */
  var mergedGeometry: js.UndefOr[PolylineProperties] = js.native
  
  /**
    * The ID of the route returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeId)
    */
  var routeId: js.UndefOr[String] = js.native
  
  /**
    * Name specified in [RouteParameters.stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.native
  
  /**
    * Lists additional information about the directions depending on the value of [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#strings)
    */
  var strings: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Actual drive time calculated for the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalDriveTime)
    */
  var totalDriveTime: js.UndefOr[Double] = js.native
  
  /**
    * The length of the route as specified in the units set in [RouteParameters.directionsLengthUnits](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalLength)
    */
  var totalLength: js.UndefOr[Double] = js.native
  
  /**
    * The total time calculated for the route as specified in the units set in [RouteParameters.directionsTimeAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalTime)
    */
  var totalTime: js.UndefOr[Double] = js.native
}
object DirectionsFeatureSetProperties {
  
  @scala.inline
  def apply(): DirectionsFeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsFeatureSetProperties]
  }
  
  @scala.inline
  implicit class DirectionsFeatureSetPropertiesOps[Self <: DirectionsFeatureSetProperties] (val x: Self) extends AnyVal {
    
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
    def setExtent(value: ExtentProperties): Self = this.set("extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExtent: Self = this.set("extent", js.undefined)
    
    @scala.inline
    def setGeometryType(value: polyline): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGeometryType: Self = this.set("geometryType", js.undefined)
    
    @scala.inline
    def setMergedGeometry(value: PolylineProperties): Self = this.set("mergedGeometry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMergedGeometry: Self = this.set("mergedGeometry", js.undefined)
    
    @scala.inline
    def setRouteId(value: String): Self = this.set("routeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteId: Self = this.set("routeId", js.undefined)
    
    @scala.inline
    def setRouteName(value: String): Self = this.set("routeName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRouteName: Self = this.set("routeName", js.undefined)
    
    @scala.inline
    def setStringsVarargs(value: js.Any*): Self = this.set("strings", js.Array(value :_*))
    
    @scala.inline
    def setStrings(value: js.Array[_]): Self = this.set("strings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStrings: Self = this.set("strings", js.undefined)
    
    @scala.inline
    def setTotalDriveTime(value: Double): Self = this.set("totalDriveTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalDriveTime: Self = this.set("totalDriveTime", js.undefined)
    
    @scala.inline
    def setTotalLength(value: Double): Self = this.set("totalLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalLength: Self = this.set("totalLength", js.undefined)
    
    @scala.inline
    def setTotalTime(value: Double): Self = this.set("totalTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTotalTime: Self = this.set("totalTime", js.undefined)
  }
}
