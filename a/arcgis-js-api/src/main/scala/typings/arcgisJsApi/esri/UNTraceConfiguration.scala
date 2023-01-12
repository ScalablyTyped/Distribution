package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.edges
import typings.arcgisJsApi.arcgisJsApiStrings.junctions
import typings.arcgisJsApi.arcgisJsApiStrings.junctionsAndEdges
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UNTraceConfiguration extends StObject {
  
  /**
    * Specifies the name of the domain network where the trace will be run.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#domainNetworkName)
    */
  var domainNetworkName: String
  
  /**
    * An array of objects representing specific categories or network attributes where the trace will stop.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterBarriers)
    */
  var filterBarriers: js.Array[Any]
  
  /**
    * Ensures the trace results include any bit that is set in the starting points for the network attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterBitsetNetworkAttributeName)
    */
  var filterBitsetNetworkAttributeName: String
  
  /**
    * An array of objects representing filter function barriers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterFunctionBarriers)
    */
  var filterFunctionBarriers: js.Array[Any]
  
  /**
    * Specifies where the filter will be applied.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#filterScope)
    */
  var filterScope: junctions | edges | junctionsAndEdges
  
  /**
    * Specifies if the container features will be included in the trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeContainers)
    */
  var includeContainers: Boolean
  
  /**
    * Specifies if the content in containers will be included in the results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeContent)
    */
  var includeContent: Boolean
  
  /**
    * Specifies whether to include isolated features for an isolation trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeIsolated)
    */
  var includeIsolated: Boolean
  
  /**
    * Specifies if structure features and objects will be included in the trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeStructures)
    */
  var includeStructures: Boolean
  
  /**
    * Specifies whether to limit the containers returned to include only those encountered up to, and including, the first spatial container for each network element in the trace results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#includeUpToFirstSpatialContainer)
    */
  var includeUpToFirstSpatialContainer: Boolean
  
  /**
    * Specifies the parameters needed for calculating nearest neighbors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#nearestNeighbor)
    */
  var nearestNeighbor: Any
  
  /**
    * An array of objects representing the output filter categories.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#outputFilterCategories)
    */
  var outputFilterCategories: js.Array[Any]
  
  /**
    * An array of objects used to control what is returned in the results of a trace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#outputFilters)
    */
  var outputFilters: js.Array[Any]
  
  /**
    * A propagator defines the propagation of a network attribute along a traversal and provides a filter to stop traversal.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#propagators)
    */
  var propagators: js.Array[Any]
  
  /**
    * Specifies the name of the [subnetwork](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks.htm) where the trace will be run.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#subnetworkName)
    */
  var subnetworkName: String
  
  /**
    * Specifies the name of the tier where an upstream or downstream trace ends.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#targetTierName)
    */
  var targetTierName: String
  
  /**
    * Specifies the name of the tier where the trace will be run.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#tierName)
    */
  var tierName: String
  
  /**
    * Specifies if its necessary to validate whether traversed junction or edge objects have the necessary containment, attachment, or connectivity association in their association hierarchy.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-UNTraceConfiguration.html#validateLocatability)
    */
  var validateLocatability: Boolean
}
object UNTraceConfiguration {
  
  inline def apply(
    domainNetworkName: String,
    filterBarriers: js.Array[Any],
    filterBitsetNetworkAttributeName: String,
    filterFunctionBarriers: js.Array[Any],
    filterScope: junctions | edges | junctionsAndEdges,
    includeContainers: Boolean,
    includeContent: Boolean,
    includeIsolated: Boolean,
    includeStructures: Boolean,
    includeUpToFirstSpatialContainer: Boolean,
    nearestNeighbor: Any,
    outputFilterCategories: js.Array[Any],
    outputFilters: js.Array[Any],
    propagators: js.Array[Any],
    subnetworkName: String,
    targetTierName: String,
    tierName: String,
    validateLocatability: Boolean
  ): UNTraceConfiguration = {
    val __obj = js.Dynamic.literal(domainNetworkName = domainNetworkName.asInstanceOf[js.Any], filterBarriers = filterBarriers.asInstanceOf[js.Any], filterBitsetNetworkAttributeName = filterBitsetNetworkAttributeName.asInstanceOf[js.Any], filterFunctionBarriers = filterFunctionBarriers.asInstanceOf[js.Any], filterScope = filterScope.asInstanceOf[js.Any], includeContainers = includeContainers.asInstanceOf[js.Any], includeContent = includeContent.asInstanceOf[js.Any], includeIsolated = includeIsolated.asInstanceOf[js.Any], includeStructures = includeStructures.asInstanceOf[js.Any], includeUpToFirstSpatialContainer = includeUpToFirstSpatialContainer.asInstanceOf[js.Any], nearestNeighbor = nearestNeighbor.asInstanceOf[js.Any], outputFilterCategories = outputFilterCategories.asInstanceOf[js.Any], outputFilters = outputFilters.asInstanceOf[js.Any], propagators = propagators.asInstanceOf[js.Any], subnetworkName = subnetworkName.asInstanceOf[js.Any], targetTierName = targetTierName.asInstanceOf[js.Any], tierName = tierName.asInstanceOf[js.Any], validateLocatability = validateLocatability.asInstanceOf[js.Any])
    __obj.asInstanceOf[UNTraceConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UNTraceConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDomainNetworkName(value: String): Self = StObject.set(x, "domainNetworkName", value.asInstanceOf[js.Any])
    
    inline def setFilterBarriers(value: js.Array[Any]): Self = StObject.set(x, "filterBarriers", value.asInstanceOf[js.Any])
    
    inline def setFilterBarriersVarargs(value: Any*): Self = StObject.set(x, "filterBarriers", js.Array(value*))
    
    inline def setFilterBitsetNetworkAttributeName(value: String): Self = StObject.set(x, "filterBitsetNetworkAttributeName", value.asInstanceOf[js.Any])
    
    inline def setFilterFunctionBarriers(value: js.Array[Any]): Self = StObject.set(x, "filterFunctionBarriers", value.asInstanceOf[js.Any])
    
    inline def setFilterFunctionBarriersVarargs(value: Any*): Self = StObject.set(x, "filterFunctionBarriers", js.Array(value*))
    
    inline def setFilterScope(value: junctions | edges | junctionsAndEdges): Self = StObject.set(x, "filterScope", value.asInstanceOf[js.Any])
    
    inline def setIncludeContainers(value: Boolean): Self = StObject.set(x, "includeContainers", value.asInstanceOf[js.Any])
    
    inline def setIncludeContent(value: Boolean): Self = StObject.set(x, "includeContent", value.asInstanceOf[js.Any])
    
    inline def setIncludeIsolated(value: Boolean): Self = StObject.set(x, "includeIsolated", value.asInstanceOf[js.Any])
    
    inline def setIncludeStructures(value: Boolean): Self = StObject.set(x, "includeStructures", value.asInstanceOf[js.Any])
    
    inline def setIncludeUpToFirstSpatialContainer(value: Boolean): Self = StObject.set(x, "includeUpToFirstSpatialContainer", value.asInstanceOf[js.Any])
    
    inline def setNearestNeighbor(value: Any): Self = StObject.set(x, "nearestNeighbor", value.asInstanceOf[js.Any])
    
    inline def setOutputFilterCategories(value: js.Array[Any]): Self = StObject.set(x, "outputFilterCategories", value.asInstanceOf[js.Any])
    
    inline def setOutputFilterCategoriesVarargs(value: Any*): Self = StObject.set(x, "outputFilterCategories", js.Array(value*))
    
    inline def setOutputFilters(value: js.Array[Any]): Self = StObject.set(x, "outputFilters", value.asInstanceOf[js.Any])
    
    inline def setOutputFiltersVarargs(value: Any*): Self = StObject.set(x, "outputFilters", js.Array(value*))
    
    inline def setPropagators(value: js.Array[Any]): Self = StObject.set(x, "propagators", value.asInstanceOf[js.Any])
    
    inline def setPropagatorsVarargs(value: Any*): Self = StObject.set(x, "propagators", js.Array(value*))
    
    inline def setSubnetworkName(value: String): Self = StObject.set(x, "subnetworkName", value.asInstanceOf[js.Any])
    
    inline def setTargetTierName(value: String): Self = StObject.set(x, "targetTierName", value.asInstanceOf[js.Any])
    
    inline def setTierName(value: String): Self = StObject.set(x, "tierName", value.asInstanceOf[js.Any])
    
    inline def setValidateLocatability(value: Boolean): Self = StObject.set(x, "validateLocatability", value.asInstanceOf[js.Any])
  }
}
