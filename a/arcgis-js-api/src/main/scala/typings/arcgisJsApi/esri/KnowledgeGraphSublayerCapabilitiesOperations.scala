package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesOperations extends StObject {
  
  /**
  		 * Indicates if new features can be added to the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsAdd: Boolean
  
  /**
  		 * Indicates if values of one or more field values in the layer can be updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsCalculate: Boolean
  
  /**
  		 * Indicates if features can be deleted from the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsDelete: Boolean
  
  /**
  		 * Indicates if features in the layer can be edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsEditing: Boolean
  
  /**
  		 * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#queryFeatures).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsQuery: Boolean
  
  /**
  		 * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsQueryAttachments: Boolean
  
  /**
  		 * Indicates if the layer supports [REST API queryTopFeatures](https://developers.arcgis.com/rest/services-reference/enterprise/query-top-features-feature-service-layer-.htm) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsQueryTopFeatures: Boolean
  
  /**
  		 * Deprecated since 4.24.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsResizeAttachments: Boolean
  
  /**
  		 * Indicates if features in the layer can be updated.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsUpdate: Boolean
  
  /**
  		 * Indicates if the layer supports a SQL-92 expression or where clause.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsValidateSql: Boolean
}
object KnowledgeGraphSublayerCapabilitiesOperations {
  
  inline def apply(
    supportsAdd: Boolean,
    supportsCalculate: Boolean,
    supportsDelete: Boolean,
    supportsEditing: Boolean,
    supportsQuery: Boolean,
    supportsQueryAttachments: Boolean,
    supportsQueryTopFeatures: Boolean,
    supportsResizeAttachments: Boolean,
    supportsUpdate: Boolean,
    supportsValidateSql: Boolean
  ): KnowledgeGraphSublayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsAdd = supportsAdd.asInstanceOf[js.Any], supportsCalculate = supportsCalculate.asInstanceOf[js.Any], supportsDelete = supportsDelete.asInstanceOf[js.Any], supportsEditing = supportsEditing.asInstanceOf[js.Any], supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryAttachments = supportsQueryAttachments.asInstanceOf[js.Any], supportsQueryTopFeatures = supportsQueryTopFeatures.asInstanceOf[js.Any], supportsResizeAttachments = supportsResizeAttachments.asInstanceOf[js.Any], supportsUpdate = supportsUpdate.asInstanceOf[js.Any], supportsValidateSql = supportsValidateSql.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setSupportsAdd(value: Boolean): Self = StObject.set(x, "supportsAdd", value.asInstanceOf[js.Any])
    
    inline def setSupportsCalculate(value: Boolean): Self = StObject.set(x, "supportsCalculate", value.asInstanceOf[js.Any])
    
    inline def setSupportsDelete(value: Boolean): Self = StObject.set(x, "supportsDelete", value.asInstanceOf[js.Any])
    
    inline def setSupportsEditing(value: Boolean): Self = StObject.set(x, "supportsEditing", value.asInstanceOf[js.Any])
    
    inline def setSupportsQuery(value: Boolean): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryAttachments(value: Boolean): Self = StObject.set(x, "supportsQueryAttachments", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryTopFeatures(value: Boolean): Self = StObject.set(x, "supportsQueryTopFeatures", value.asInstanceOf[js.Any])
    
    inline def setSupportsResizeAttachments(value: Boolean): Self = StObject.set(x, "supportsResizeAttachments", value.asInstanceOf[js.Any])
    
    inline def setSupportsUpdate(value: Boolean): Self = StObject.set(x, "supportsUpdate", value.asInstanceOf[js.Any])
    
    inline def setSupportsValidateSql(value: Boolean): Self = StObject.set(x, "supportsValidateSql", value.asInstanceOf[js.Any])
  }
}
