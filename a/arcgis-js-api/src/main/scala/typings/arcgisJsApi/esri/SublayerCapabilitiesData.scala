package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SublayerCapabilitiesData extends StObject {
  
  /**
  		 * Indicates if attachments are enabled on the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#capabilities)
  		 */
  var supportsAttachment: Boolean
}
object SublayerCapabilitiesData {
  
  inline def apply(supportsAttachment: Boolean): SublayerCapabilitiesData = {
    val __obj = js.Dynamic.literal(supportsAttachment = supportsAttachment.asInstanceOf[js.Any])
    __obj.asInstanceOf[SublayerCapabilitiesData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SublayerCapabilitiesData] (val x: Self) extends AnyVal {
    
    inline def setSupportsAttachment(value: Boolean): Self = StObject.set(x, "supportsAttachment", value.asInstanceOf[js.Any])
  }
}
