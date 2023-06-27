package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesMetadata extends StObject {
  
  /**
  		 * Indicates whether to provide a user-defined field description.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsAdvancedFieldProperties: Boolean
}
object KnowledgeGraphSublayerCapabilitiesMetadata {
  
  inline def apply(supportsAdvancedFieldProperties: Boolean): KnowledgeGraphSublayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesMetadata] (val x: Self) extends AnyVal {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
