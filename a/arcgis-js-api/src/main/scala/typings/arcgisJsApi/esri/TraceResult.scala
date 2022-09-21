package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceResult
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * This property defines an aggregation of geometries returned by the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#aggregatedGeometry)
    */
  var aggregatedGeometry: AggregatedGeometry = js.native
  
  /**
    * An array of network elements returned by the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#elements)
    */
  var elements: js.Array[NetworkElement] = js.native
  
  /**
    * Returns an array of function aggregation results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#globalFunctionResults)
    */
  var globalFunctionResults: js.Array[FunctionResult] = js.native
  
  /**
    * This parameter is specific to the K-Nearest Neighbors Algorithm, when the neariest filter is provided in the trace configuration.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#kFeaturesForKNNFound)
    */
  var kFeaturesForKNNFound: Boolean = js.native
  
  /**
    * Returns `true` if the starting points in the network trace operation are ignored.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#startingPointsIgnored)
    */
  var startingPointsIgnored: Boolean = js.native
  
  /**
    * Returns any warnings encountered by the trace operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#warnings)
    */
  var warnings: js.Array[String] = js.native
}
