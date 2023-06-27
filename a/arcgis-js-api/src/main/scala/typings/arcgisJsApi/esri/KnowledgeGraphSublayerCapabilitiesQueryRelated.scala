package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesQueryRelated extends StObject {
  
  /**
  		 * Indicates if the [relationship query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-RelationshipQuery.html) supports a cache hint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsCacheHint: Boolean
  
  /**
  		 * Indicates if the layer's query response includes the number of features or records related to features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsCount: Boolean
  
  /**
  		 * Indicates if the related features or records returned in the query response can be ordered by one or more fields.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsOrderBy: Boolean
  
  /**
  		 * Indicates if the query response supports pagination for related features or records.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsPagination: Boolean
}
object KnowledgeGraphSublayerCapabilitiesQueryRelated {
  
  inline def apply(
    supportsCacheHint: Boolean,
    supportsCount: Boolean,
    supportsOrderBy: Boolean,
    supportsPagination: Boolean
  ): KnowledgeGraphSublayerCapabilitiesQueryRelated = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any], supportsCount = supportsCount.asInstanceOf[js.Any], supportsOrderBy = supportsOrderBy.asInstanceOf[js.Any], supportsPagination = supportsPagination.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesQueryRelated]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesQueryRelated] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
    
    inline def setSupportsCount(value: Boolean): Self = StObject.set(x, "supportsCount", value.asInstanceOf[js.Any])
    
    inline def setSupportsOrderBy(value: Boolean): Self = StObject.set(x, "supportsOrderBy", value.asInstanceOf[js.Any])
    
    inline def setSupportsPagination(value: Boolean): Self = StObject.set(x, "supportsPagination", value.asInstanceOf[js.Any])
  }
}
