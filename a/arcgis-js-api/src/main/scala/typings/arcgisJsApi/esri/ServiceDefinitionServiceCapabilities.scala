package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionServiceCapabilities extends StObject {
  
  /**
  		 * Information on the supported capabilities of the the [executeApplyEdits](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeApplyEdits) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var applyEditsCapabilities: ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities
  
  /**
  		 * Information on the supported capabilities of geometries in the knowledge graph service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var geometryCapabilities: ServiceDefinitionServiceCapabilitiesGeometryCapabilities
  
  /**
  		 * Information on the supported capabilities of indexes in the knowledge graph service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var indexCapabilities: ServiceDefinitionServiceCapabilitiesIndexCapabilities
  
  /**
  		 * Information on the supported capabilities of [search](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraphService.html#executeSearch) operations in the knowledge graph service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
  		 */
  var searchCapabilities: ServiceDefinitionServiceCapabilitiesSearchCapabilities
}
object ServiceDefinitionServiceCapabilities {
  
  inline def apply(
    applyEditsCapabilities: ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities,
    geometryCapabilities: ServiceDefinitionServiceCapabilitiesGeometryCapabilities,
    indexCapabilities: ServiceDefinitionServiceCapabilitiesIndexCapabilities,
    searchCapabilities: ServiceDefinitionServiceCapabilitiesSearchCapabilities
  ): ServiceDefinitionServiceCapabilities = {
    val __obj = js.Dynamic.literal(applyEditsCapabilities = applyEditsCapabilities.asInstanceOf[js.Any], geometryCapabilities = geometryCapabilities.asInstanceOf[js.Any], indexCapabilities = indexCapabilities.asInstanceOf[js.Any], searchCapabilities = searchCapabilities.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionServiceCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionServiceCapabilities] (val x: Self) extends AnyVal {
    
    inline def setApplyEditsCapabilities(value: ServiceDefinitionServiceCapabilitiesApplyEditsCapabilities): Self = StObject.set(x, "applyEditsCapabilities", value.asInstanceOf[js.Any])
    
    inline def setGeometryCapabilities(value: ServiceDefinitionServiceCapabilitiesGeometryCapabilities): Self = StObject.set(x, "geometryCapabilities", value.asInstanceOf[js.Any])
    
    inline def setIndexCapabilities(value: ServiceDefinitionServiceCapabilitiesIndexCapabilities): Self = StObject.set(x, "indexCapabilities", value.asInstanceOf[js.Any])
    
    inline def setSearchCapabilities(value: ServiceDefinitionServiceCapabilitiesSearchCapabilities): Self = StObject.set(x, "searchCapabilities", value.asInstanceOf[js.Any])
  }
}
