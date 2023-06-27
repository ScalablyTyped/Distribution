package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Capabilities extends StObject {
  
  /**
  		 * Describes what analytics capabilities are enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var analytics: CapabilitiesAnalytics
  
  /**
  		 * Describes what attachment capabilities are enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var attachment: CapabilitiesAttachment
  
  /**
  		 * Describes characteristics of the data in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var data: CapabilitiesData
  
  /**
  		 * Describes editing capabilities that can be performed on the features in the layer via [applyEdits()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#applyEdits).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var editing: CapabilitiesEditing
  
  /**
  		 * Describes the metadata contained on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var metadata: CapabilitiesMetadata
  
  /**
  		 * Describes operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var operations: CapabilitiesOperations
  
  /**
  		 * Describes [query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var query: CapabilitiesQuery
  
  /**
  		 * Indicates if the layer's query operation supports querying features or records related to features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var queryRelated: CapabilitiesQueryRelated
  
  /**
  		 * Describes [top features query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) operations that can be performed on features in the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var queryTopFeatures: CapabilitiesQueryTopFeatures
}
object Capabilities {
  
  inline def apply(
    analytics: CapabilitiesAnalytics,
    attachment: CapabilitiesAttachment,
    data: CapabilitiesData,
    editing: CapabilitiesEditing,
    metadata: CapabilitiesMetadata,
    operations: CapabilitiesOperations,
    query: CapabilitiesQuery,
    queryRelated: CapabilitiesQueryRelated,
    queryTopFeatures: CapabilitiesQueryTopFeatures
  ): Capabilities = {
    val __obj = js.Dynamic.literal(analytics = analytics.asInstanceOf[js.Any], attachment = attachment.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], editing = editing.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], operations = operations.asInstanceOf[js.Any], query = query.asInstanceOf[js.Any], queryRelated = queryRelated.asInstanceOf[js.Any], queryTopFeatures = queryTopFeatures.asInstanceOf[js.Any])
    __obj.asInstanceOf[Capabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Capabilities] (val x: Self) extends AnyVal {
    
    inline def setAnalytics(value: CapabilitiesAnalytics): Self = StObject.set(x, "analytics", value.asInstanceOf[js.Any])
    
    inline def setAttachment(value: CapabilitiesAttachment): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
    
    inline def setData(value: CapabilitiesData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setEditing(value: CapabilitiesEditing): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setMetadata(value: CapabilitiesMetadata): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
    
    inline def setOperations(value: CapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setQuery(value: CapabilitiesQuery): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryRelated(value: CapabilitiesQueryRelated): Self = StObject.set(x, "queryRelated", value.asInstanceOf[js.Any])
    
    inline def setQueryTopFeatures(value: CapabilitiesQueryTopFeatures): Self = StObject.set(x, "queryTopFeatures", value.asInstanceOf[js.Any])
  }
}
