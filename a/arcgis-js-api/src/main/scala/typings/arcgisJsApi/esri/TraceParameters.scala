package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`shortest-path`
import typings.arcgisJsApi.arcgisJsApiStrings.`subnetwork-controllers`
import typings.arcgisJsApi.arcgisJsApiStrings.connected
import typings.arcgisJsApi.arcgisJsApiStrings.downstream
import typings.arcgisJsApi.arcgisJsApiStrings.isolation
import typings.arcgisJsApi.arcgisJsApiStrings.loops
import typings.arcgisJsApi.arcgisJsApiStrings.subnetwork
import typings.arcgisJsApi.arcgisJsApiStrings.upstream
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TraceParameters
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
    * The geodatabase version to execute the function against.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#gdbVersion)
    */
  var gdbVersion: String = js.native
  
  /**
    * The date/timestamp (in UTC) to execute the function at a given time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#moment)
    */
  var moment: js.Date = js.native
  
  /**
    * The globalId (UUID) of the named trace configuration persisted in the network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#namedTraceConfigurationGlobalId)
    */
  var namedTraceConfigurationGlobalId: String = js.native
  
  /**
    * The spatial reference that should be used to project the [aggregated geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) returned by the trace (if applicable).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#outSpatialReference)
    */
  var outSpatialReference: SpatialReference = js.native
  
  var resultTypes: js.Array[Any] = js.native
  
  /**
    * Defines the properties of a trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceConfiguration)
    */
  var traceConfiguration: TraceConfiguration = js.native
  
  /**
    * The list of starting points and barriers that will define where the trace starts and stops.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceLocations)
    */
  var traceLocations: js.Array[TraceLocation] = js.native
  
  /**
    * The trace type defined in this trace configuration.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceType)
    */
  var traceType: connected | upstream | downstream | `shortest-path` | subnetwork | `subnetwork-controllers` | loops | isolation = js.native
}
