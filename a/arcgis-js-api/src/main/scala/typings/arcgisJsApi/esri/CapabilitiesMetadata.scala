package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CapabilitiesMetadata extends StObject {
  
  /**
  		 * Indicates whether to provide a user-defined field description.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#Capabilities)
  		 */
  var supportsAdvancedFieldProperties: Boolean
}
object CapabilitiesMetadata {
  
  inline def apply(supportsAdvancedFieldProperties: Boolean): CapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[CapabilitiesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CapabilitiesMetadata] (val x: Self) extends AnyVal {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
