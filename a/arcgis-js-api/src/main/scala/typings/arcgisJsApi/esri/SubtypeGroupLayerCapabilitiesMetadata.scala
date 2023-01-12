package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerCapabilitiesMetadata extends StObject {
  
  /**
    * Indicates whether to provide a user-defined field description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}
object SubtypeGroupLayerCapabilitiesMetadata {
  
  inline def apply(supportsAdvancedFieldProperties: Boolean): SubtypeGroupLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerCapabilitiesMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubtypeGroupLayerCapabilitiesMetadata] (val x: Self) extends AnyVal {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
