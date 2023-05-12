package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDefinitionServiceCapabilitiesIndexCapabilities extends StObject {
  
  /**
    * Specifies if the service supports indexes in descending order.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  var supportsDescendingIndex: Boolean
  
  /**
    * Specifies if the service supports indexes on relationships.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  var supportsRelationshipIndex: Boolean
  
  /**
    * Specifies if the system supports creating unique constraints for relationship types
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-knowledgeGraph-ServiceDefinition.html#serviceCapabilities)
    */
  var supportsUniqueRelationshipConstraint: Boolean
}
object ServiceDefinitionServiceCapabilitiesIndexCapabilities {
  
  inline def apply(
    supportsDescendingIndex: Boolean,
    supportsRelationshipIndex: Boolean,
    supportsUniqueRelationshipConstraint: Boolean
  ): ServiceDefinitionServiceCapabilitiesIndexCapabilities = {
    val __obj = js.Dynamic.literal(supportsDescendingIndex = supportsDescendingIndex.asInstanceOf[js.Any], supportsRelationshipIndex = supportsRelationshipIndex.asInstanceOf[js.Any], supportsUniqueRelationshipConstraint = supportsUniqueRelationshipConstraint.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDefinitionServiceCapabilitiesIndexCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDefinitionServiceCapabilitiesIndexCapabilities] (val x: Self) extends AnyVal {
    
    inline def setSupportsDescendingIndex(value: Boolean): Self = StObject.set(x, "supportsDescendingIndex", value.asInstanceOf[js.Any])
    
    inline def setSupportsRelationshipIndex(value: Boolean): Self = StObject.set(x, "supportsRelationshipIndex", value.asInstanceOf[js.Any])
    
    inline def setSupportsUniqueRelationshipConstraint(value: Boolean): Self = StObject.set(x, "supportsUniqueRelationshipConstraint", value.asInstanceOf[js.Any])
  }
}
