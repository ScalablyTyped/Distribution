package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceResultProperties extends StObject {
  
  /**
    * This property defines an aggregation of geometries returned by the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#aggregatedGeometry)
    */
  var aggregatedGeometry: js.UndefOr[AggregatedGeometryProperties] = js.undefined
  
  /**
    * An array of network elements returned by the trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#elements)
    */
  var elements: js.UndefOr[js.Array[NetworkElementProperties]] = js.undefined
  
  /**
    * Returns an array of function aggregation results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#globalFunctionResults)
    */
  var globalFunctionResults: js.UndefOr[js.Array[FunctionResultProperties]] = js.undefined
  
  /**
    * This parameter is specific to the K-Nearest Neighbors Algorithm, when the neariest filter is provided in the trace configuration.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#kFeaturesForKNNFound)
    */
  var kFeaturesForKNNFound: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns `true` if the starting points in the network trace operation are ignored.
    *
    * @default false
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#startingPointsIgnored)
    */
  var startingPointsIgnored: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Returns any warnings encountered by the trace operation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html#warnings)
    */
  var warnings: js.UndefOr[js.Array[String]] = js.undefined
}
object TraceResultProperties {
  
  inline def apply(): TraceResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TraceResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceResultProperties] (val x: Self) extends AnyVal {
    
    inline def setAggregatedGeometry(value: AggregatedGeometryProperties): Self = StObject.set(x, "aggregatedGeometry", value.asInstanceOf[js.Any])
    
    inline def setAggregatedGeometryUndefined: Self = StObject.set(x, "aggregatedGeometry", js.undefined)
    
    inline def setElements(value: js.Array[NetworkElementProperties]): Self = StObject.set(x, "elements", value.asInstanceOf[js.Any])
    
    inline def setElementsUndefined: Self = StObject.set(x, "elements", js.undefined)
    
    inline def setElementsVarargs(value: NetworkElementProperties*): Self = StObject.set(x, "elements", js.Array(value*))
    
    inline def setGlobalFunctionResults(value: js.Array[FunctionResultProperties]): Self = StObject.set(x, "globalFunctionResults", value.asInstanceOf[js.Any])
    
    inline def setGlobalFunctionResultsUndefined: Self = StObject.set(x, "globalFunctionResults", js.undefined)
    
    inline def setGlobalFunctionResultsVarargs(value: FunctionResultProperties*): Self = StObject.set(x, "globalFunctionResults", js.Array(value*))
    
    inline def setKFeaturesForKNNFound(value: Boolean): Self = StObject.set(x, "kFeaturesForKNNFound", value.asInstanceOf[js.Any])
    
    inline def setKFeaturesForKNNFoundUndefined: Self = StObject.set(x, "kFeaturesForKNNFound", js.undefined)
    
    inline def setStartingPointsIgnored(value: Boolean): Self = StObject.set(x, "startingPointsIgnored", value.asInstanceOf[js.Any])
    
    inline def setStartingPointsIgnoredUndefined: Self = StObject.set(x, "startingPointsIgnored", js.undefined)
    
    inline def setWarnings(value: js.Array[String]): Self = StObject.set(x, "warnings", value.asInstanceOf[js.Any])
    
    inline def setWarningsUndefined: Self = StObject.set(x, "warnings", js.undefined)
    
    inline def setWarningsVarargs(value: String*): Self = StObject.set(x, "warnings", js.Array(value*))
  }
}
