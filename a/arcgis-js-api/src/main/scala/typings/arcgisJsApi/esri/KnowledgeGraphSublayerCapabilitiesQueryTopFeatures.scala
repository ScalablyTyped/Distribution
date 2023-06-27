package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesQueryTopFeatures extends StObject {
  
  /**
  		 * Indicates if the [top query operation](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TopFeaturesQuery.html) supports a cache hint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsCacheHint: Boolean
}
object KnowledgeGraphSublayerCapabilitiesQueryTopFeatures {
  
  inline def apply(supportsCacheHint: Boolean): KnowledgeGraphSublayerCapabilitiesQueryTopFeatures = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesQueryTopFeatures]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesQueryTopFeatures] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
  }
}
