package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsFeatureSetProperties
  extends StObject
     with FeatureSetProperties {
  
  /**
    * The extent of the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * The geometry type of the FeatureSet.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#geometryType)
    */
  @JSName("geometryType")
  var geometryType_DirectionsFeatureSetProperties: js.UndefOr[polyline] = js.undefined
  
  /**
    * A single polyline representing the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#mergedGeometry)
    */
  var mergedGeometry: js.UndefOr[PolylineProperties] = js.undefined
  
  /**
    * The ID of the route returned from the server.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeId)
    */
  var routeId: js.UndefOr[String] = js.undefined
  
  /**
    * Name specified in [RouteParameters.stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#stops).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#routeName)
    */
  var routeName: js.UndefOr[String] = js.undefined
  
  /**
    * Lists additional information about the directions depending on the value of [RouteParameters.directionsOutputType](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsOutputType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#strings)
    */
  var strings: js.UndefOr[js.Array[js.Any]] = js.undefined
  
  /**
    * Actual drive time calculated for the route.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalDriveTime)
    */
  var totalDriveTime: js.UndefOr[Double] = js.undefined
  
  /**
    * The length of the route as specified in the units set in [RouteParameters.directionsLengthUnits](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsLengthUnits).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalLength)
    */
  var totalLength: js.UndefOr[Double] = js.undefined
  
  /**
    * The total time calculated for the route as specified in the units set in [RouteParameters.directionsTimeAttribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-RouteParameters.html#directionsTimeAttribute).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-DirectionsFeatureSet.html#totalTime)
    */
  var totalTime: js.UndefOr[Double] = js.undefined
}
object DirectionsFeatureSetProperties {
  
  inline def apply(): DirectionsFeatureSetProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectionsFeatureSetProperties]
  }
  
  extension [Self <: DirectionsFeatureSetProperties](x: Self) {
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setGeometryType(value: polyline): Self = StObject.set(x, "geometryType", value.asInstanceOf[js.Any])
    
    inline def setGeometryTypeUndefined: Self = StObject.set(x, "geometryType", js.undefined)
    
    inline def setMergedGeometry(value: PolylineProperties): Self = StObject.set(x, "mergedGeometry", value.asInstanceOf[js.Any])
    
    inline def setMergedGeometryUndefined: Self = StObject.set(x, "mergedGeometry", js.undefined)
    
    inline def setRouteId(value: String): Self = StObject.set(x, "routeId", value.asInstanceOf[js.Any])
    
    inline def setRouteIdUndefined: Self = StObject.set(x, "routeId", js.undefined)
    
    inline def setRouteName(value: String): Self = StObject.set(x, "routeName", value.asInstanceOf[js.Any])
    
    inline def setRouteNameUndefined: Self = StObject.set(x, "routeName", js.undefined)
    
    inline def setStrings(value: js.Array[js.Any]): Self = StObject.set(x, "strings", value.asInstanceOf[js.Any])
    
    inline def setStringsUndefined: Self = StObject.set(x, "strings", js.undefined)
    
    inline def setStringsVarargs(value: js.Any*): Self = StObject.set(x, "strings", js.Array(value :_*))
    
    inline def setTotalDriveTime(value: Double): Self = StObject.set(x, "totalDriveTime", value.asInstanceOf[js.Any])
    
    inline def setTotalDriveTimeUndefined: Self = StObject.set(x, "totalDriveTime", js.undefined)
    
    inline def setTotalLength(value: Double): Self = StObject.set(x, "totalLength", value.asInstanceOf[js.Any])
    
    inline def setTotalLengthUndefined: Self = StObject.set(x, "totalLength", js.undefined)
    
    inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    
    inline def setTotalTimeUndefined: Self = StObject.set(x, "totalTime", js.undefined)
  }
}
