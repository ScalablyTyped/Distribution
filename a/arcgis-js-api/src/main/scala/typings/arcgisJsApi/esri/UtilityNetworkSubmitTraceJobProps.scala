package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetworkSubmitTraceJobProps extends StObject {
  
  /**
  		 * The geodatabase version to execute the function against.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var gdbVersion: js.UndefOr[String] = js.undefined
  
  /**
  		 * The globalId (UUID) of the named trace configuration persisted in the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var namedTraceConfigurationGlobalId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The spatial reference that should be used to project the [aggregated geometries](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-AggregatedGeometry.html) returned by the trace (if applicable).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var outSpatialReference: js.UndefOr[SpatialReference] = js.undefined
  
  /**
  		 * Parameter specifying the types of results to return after running a trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var resultTypes: js.UndefOr[js.Array[ResultTypeJSON]] = js.undefined
  
  /**
  		 * Defines the properties of a trace.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var traceConfiguration: js.UndefOr[UNTraceConfiguration] = js.undefined
  
  /**
  		 * The list of starting points and barriers that will define where the trace starts and stops.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var traceLocations: js.UndefOr[js.Array[TraceLocation]] = js.undefined
  
  /**
  		 * The [traceType](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html#traceType) defined in this trace configuration.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#submitTraceJob)
  		 */
  var traceTypes: js.UndefOr[String] = js.undefined
}
object UtilityNetworkSubmitTraceJobProps {
  
  inline def apply(): UtilityNetworkSubmitTraceJobProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UtilityNetworkSubmitTraceJobProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UtilityNetworkSubmitTraceJobProps] (val x: Self) extends AnyVal {
    
    inline def setGdbVersion(value: String): Self = StObject.set(x, "gdbVersion", value.asInstanceOf[js.Any])
    
    inline def setGdbVersionUndefined: Self = StObject.set(x, "gdbVersion", js.undefined)
    
    inline def setNamedTraceConfigurationGlobalId(value: String): Self = StObject.set(x, "namedTraceConfigurationGlobalId", value.asInstanceOf[js.Any])
    
    inline def setNamedTraceConfigurationGlobalIdUndefined: Self = StObject.set(x, "namedTraceConfigurationGlobalId", js.undefined)
    
    inline def setOutSpatialReference(value: SpatialReference): Self = StObject.set(x, "outSpatialReference", value.asInstanceOf[js.Any])
    
    inline def setOutSpatialReferenceUndefined: Self = StObject.set(x, "outSpatialReference", js.undefined)
    
    inline def setResultTypes(value: js.Array[ResultTypeJSON]): Self = StObject.set(x, "resultTypes", value.asInstanceOf[js.Any])
    
    inline def setResultTypesUndefined: Self = StObject.set(x, "resultTypes", js.undefined)
    
    inline def setResultTypesVarargs(value: ResultTypeJSON*): Self = StObject.set(x, "resultTypes", js.Array(value*))
    
    inline def setTraceConfiguration(value: UNTraceConfiguration): Self = StObject.set(x, "traceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setTraceConfigurationUndefined: Self = StObject.set(x, "traceConfiguration", js.undefined)
    
    inline def setTraceLocations(value: js.Array[TraceLocation]): Self = StObject.set(x, "traceLocations", value.asInstanceOf[js.Any])
    
    inline def setTraceLocationsUndefined: Self = StObject.set(x, "traceLocations", js.undefined)
    
    inline def setTraceLocationsVarargs(value: TraceLocation*): Self = StObject.set(x, "traceLocations", js.Array(value*))
    
    inline def setTraceTypes(value: String): Self = StObject.set(x, "traceTypes", value.asInstanceOf[js.Any])
    
    inline def setTraceTypesUndefined: Self = StObject.set(x, "traceTypes", js.undefined)
  }
}
