package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.edges
import typings.arcgisJsApi.arcgisJsApiStrings.junctions
import typings.arcgisJsApi.arcgisJsApiStrings.junctionsAndEdges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TraceConfiguration extends StObject {
  
  /**
  		 * An array of objects representing network attribute or category conditions that serve as barriers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#conditionBarriers)
  		 */
  var conditionBarriers: js.Array[Any]
  
  /**
  		 * An array of objects representing function barriers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#functionBarriers)
  		 */
  var functionBarriers: js.Array[Any]
  
  /**
  		 * An array of objects representing function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#functions)
  		 */
  var functions: js.Array[Any]
  
  /**
  		 * Do not stop the trace if the starting point is a barrier.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#ignoreBarriersAtStartingPoints)
  		 */
  var ignoreBarriersAtStartingPoints: Boolean
  
  /**
  		 * Specifies whether the traversability barrier features will be included in the trace results.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#includeBarriers)
  		 */
  var includeBarriers: Boolean
  
  /**
  		 * Specifies the type of features returned based on a network attribute or check for a category string.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#outputConditions)
  		 */
  var outputConditions: js.Array[Any]
  
  /**
  		 * Specifies the network attribute name used for determining the shortest path.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#shortestPathNetworkAttributeName)
  		 */
  var shortestPathNetworkAttributeName: String
  
  /**
  		 * Determines whether traversability is applied to both junctions and edges, junctions only, or edges only.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#traversabilityScope)
  		 */
  var traversabilityScope: junctions | edges | junctionsAndEdges
  
  /**
  		 * Specifies whether an error will be returned if dirty areas are encountered in any of the traversed features.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceConfiguration.html#validateConsistency)
  		 */
  var validateConsistency: Boolean
}
object TraceConfiguration {
  
  inline def apply(
    conditionBarriers: js.Array[Any],
    functionBarriers: js.Array[Any],
    functions: js.Array[Any],
    ignoreBarriersAtStartingPoints: Boolean,
    includeBarriers: Boolean,
    outputConditions: js.Array[Any],
    shortestPathNetworkAttributeName: String,
    traversabilityScope: junctions | edges | junctionsAndEdges,
    validateConsistency: Boolean
  ): TraceConfiguration = {
    val __obj = js.Dynamic.literal(conditionBarriers = conditionBarriers.asInstanceOf[js.Any], functionBarriers = functionBarriers.asInstanceOf[js.Any], functions = functions.asInstanceOf[js.Any], ignoreBarriersAtStartingPoints = ignoreBarriersAtStartingPoints.asInstanceOf[js.Any], includeBarriers = includeBarriers.asInstanceOf[js.Any], outputConditions = outputConditions.asInstanceOf[js.Any], shortestPathNetworkAttributeName = shortestPathNetworkAttributeName.asInstanceOf[js.Any], traversabilityScope = traversabilityScope.asInstanceOf[js.Any], validateConsistency = validateConsistency.asInstanceOf[js.Any])
    __obj.asInstanceOf[TraceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TraceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setConditionBarriers(value: js.Array[Any]): Self = StObject.set(x, "conditionBarriers", value.asInstanceOf[js.Any])
    
    inline def setConditionBarriersVarargs(value: Any*): Self = StObject.set(x, "conditionBarriers", js.Array(value*))
    
    inline def setFunctionBarriers(value: js.Array[Any]): Self = StObject.set(x, "functionBarriers", value.asInstanceOf[js.Any])
    
    inline def setFunctionBarriersVarargs(value: Any*): Self = StObject.set(x, "functionBarriers", js.Array(value*))
    
    inline def setFunctions(value: js.Array[Any]): Self = StObject.set(x, "functions", value.asInstanceOf[js.Any])
    
    inline def setFunctionsVarargs(value: Any*): Self = StObject.set(x, "functions", js.Array(value*))
    
    inline def setIgnoreBarriersAtStartingPoints(value: Boolean): Self = StObject.set(x, "ignoreBarriersAtStartingPoints", value.asInstanceOf[js.Any])
    
    inline def setIncludeBarriers(value: Boolean): Self = StObject.set(x, "includeBarriers", value.asInstanceOf[js.Any])
    
    inline def setOutputConditions(value: js.Array[Any]): Self = StObject.set(x, "outputConditions", value.asInstanceOf[js.Any])
    
    inline def setOutputConditionsVarargs(value: Any*): Self = StObject.set(x, "outputConditions", js.Array(value*))
    
    inline def setShortestPathNetworkAttributeName(value: String): Self = StObject.set(x, "shortestPathNetworkAttributeName", value.asInstanceOf[js.Any])
    
    inline def setTraversabilityScope(value: junctions | edges | junctionsAndEdges): Self = StObject.set(x, "traversabilityScope", value.asInstanceOf[js.Any])
    
    inline def setValidateConsistency(value: Boolean): Self = StObject.set(x, "validateConsistency", value.asInstanceOf[js.Any])
  }
}
