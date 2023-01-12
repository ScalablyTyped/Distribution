package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesMetadata extends StObject {
  
  /**
    * Indicates whether to provide a user-defined field description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}
object FeatureLayerCapabilitiesMetadata {
  
  inline def apply(supportsAdvancedFieldProperties: Boolean): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FeatureLayerCapabilitiesMetadata] (val x: Self) extends AnyVal {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
