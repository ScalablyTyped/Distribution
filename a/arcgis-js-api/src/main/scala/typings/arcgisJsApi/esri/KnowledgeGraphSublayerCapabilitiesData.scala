package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesData extends StObject {
  
  /**
  		 * Indicates if the feature service is versioned.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var isVersioned: Boolean
  
  /**
  		 * Indicates if the attachment is enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsAttachment: Boolean
  
  /**
  		 * Indicates if the features in the layer support m-values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsM: Boolean
  
  /**
  		 * Indicates if the features in the layer support z-values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsZ: Boolean
}
object KnowledgeGraphSublayerCapabilitiesData {
  
  inline def apply(isVersioned: Boolean, supportsAttachment: Boolean, supportsM: Boolean, supportsZ: Boolean): KnowledgeGraphSublayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(isVersioned = isVersioned.asInstanceOf[js.Any], supportsAttachment = supportsAttachment.asInstanceOf[js.Any], supportsM = supportsM.asInstanceOf[js.Any], supportsZ = supportsZ.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesData] (val x: Self) extends AnyVal {
    
    inline def setIsVersioned(value: Boolean): Self = StObject.set(x, "isVersioned", value.asInstanceOf[js.Any])
    
    inline def setSupportsAttachment(value: Boolean): Self = StObject.set(x, "supportsAttachment", value.asInstanceOf[js.Any])
    
    inline def setSupportsM(value: Boolean): Self = StObject.set(x, "supportsM", value.asInstanceOf[js.Any])
    
    inline def setSupportsZ(value: Boolean): Self = StObject.set(x, "supportsZ", value.asInstanceOf[js.Any])
  }
}
