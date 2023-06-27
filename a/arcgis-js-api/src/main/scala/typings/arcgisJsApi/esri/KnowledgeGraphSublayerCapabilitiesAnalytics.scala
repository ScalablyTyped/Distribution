package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait KnowledgeGraphSublayerCapabilitiesAnalytics extends StObject {
  
  /**
  		 * Indicates if the feature service supports cache hint.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-knowledgeGraph-KnowledgeGraphSublayer.html#Capabilities)
  		 */
  var supportsCacheHint: Boolean
}
object KnowledgeGraphSublayerCapabilitiesAnalytics {
  
  inline def apply(supportsCacheHint: Boolean): KnowledgeGraphSublayerCapabilitiesAnalytics = {
    val __obj = js.Dynamic.literal(supportsCacheHint = supportsCacheHint.asInstanceOf[js.Any])
    __obj.asInstanceOf[KnowledgeGraphSublayerCapabilitiesAnalytics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: KnowledgeGraphSublayerCapabilitiesAnalytics] (val x: Self) extends AnyVal {
    
    inline def setSupportsCacheHint(value: Boolean): Self = StObject.set(x, "supportsCacheHint", value.asInstanceOf[js.Any])
  }
}
