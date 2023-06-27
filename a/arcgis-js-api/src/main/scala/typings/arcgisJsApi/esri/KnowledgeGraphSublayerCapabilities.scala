package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilities extends StObject {
  
  /**
  		 * Describes what analytics capabilities are enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var analytics: KnowledgeGraphSublayerCapabilitiesAnalytics
  
  /**
  		 * Describes what attachment capabilities are enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var attachment: KnowledgeGraphSublayerCapabilitiesAttachment
  
  /**
  		 * Describes characteristics of the data in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var data: KnowledgeGraphSublayerCapabilitiesData
  
  /**
  		 * Describes editing capabilities that can be performed on the features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var editing: KnowledgeGraphSublayerCapabilitiesEditing
  
  /**
  		 * Describes the metadata contained on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var metadata: KnowledgeGraphSublayerCapabilitiesMetadata
  
  /**
  		 * Describes operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var operations: KnowledgeGraphSublayerCapabilitiesOperations
  
  /**
  		 * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var query: KnowledgeGraphSublayerCapabilitiesQuery
  
  /**
  		 * Indicates if the layer's query operation supports querying features or records related to features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var queryRelated: KnowledgeGraphSublayerCapabilitiesQueryRelated
  
  /**
  		 * Describes [top features query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var queryTopFeatures: KnowledgeGraphSublayerCapabilitiesQueryTopFeatures
}
object KnowledgeGraphSublayerCapabilities {
  
  inline def apply(
    analytics: KnowledgeGraphSublayerCapabilitiesAnalytics,
    attachment: KnowledgeGraphSublayerCapabilitiesAttachment,
    data: KnowledgeGraphSublayerCapabilitiesData,
    editing: KnowledgeGraphSublayerCapabilitiesEditing,
    metadata: KnowledgeGraphSublayerCapabilitiesMetadata,
    operations: KnowledgeGraphSublayerCapabilitiesOperations,
    query: KnowledgeGraphSublayerCapabilitiesQuery,
    queryRelated: KnowledgeGraphSublayerCapabilitiesQueryRelated,
    queryTopFeatures: KnowledgeGraphSublayerCapabilitiesQueryTopFeatures
  ): KnowledgeGraphSublayerCapabilities = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], attachment = attachment.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any], queryTopFeatures = queryTopFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilities] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: KnowledgeGraphSublayerCapabilitiesAnalytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAttachment(value: KnowledgeGraphSublayerCapabilitiesAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setData(value: KnowledgeGraphSublayerCapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: KnowledgeGraphSublayerCapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: KnowledgeGraphSublayerCapabilitiesMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: KnowledgeGraphSublayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: KnowledgeGraphSublayerCapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: KnowledgeGraphSublayerCapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
    
    inline def setQueryTopFeatures(value: KnowledgeGraphSublayerCapabilitiesQueryTopFeatures): Self = StObject.set(x, "queryTopFeatures", value.asInstanceOf[js.Any])
  }
}
