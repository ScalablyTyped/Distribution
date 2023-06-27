package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerCapabilitiesOperations extends StObject {
  
  /**
  		 * Indicates if features in the layer can be [queried](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#queryFeatures).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#capabilities)
  		 */
  var supportsQuery: Boolean
  
  /**
  		 * Indicates if the layer supports [REST API queryAttachments](https://developers.arcgis.com/rest/services-reference/query-attachments-feature-service-layer-.htm) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#capabilities)
  		 */
  var supportsQueryAttachments: Boolean
}
object SublayerCapabilitiesOperations {
  
  inline def apply(supportsQuery: Boolean, supportsQueryAttachments: Boolean): SublayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsQuery = supportsQuery.asInstanceOf[js.Any], supportsQueryAttachments = supportsQueryAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SublayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SublayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setSupportsQuery(value: Boolean): Self = StObject.set(x, "supportsQuery", value.asInstanceOf[js.Any])
    
    inline def setSupportsQueryAttachments(value: Boolean): Self = StObject.set(x, "supportsQueryAttachments", value.asInstanceOf[js.Any])
  }
}
