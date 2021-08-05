package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FeatureLayerCapabilitiesMetadata
  extends StObject
     with Object {
  
  /**
    * Indicates whether to provide a user-defined field description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}
object FeatureLayerCapabilitiesMetadata {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdvancedFieldProperties: Boolean
  ): FeatureLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureLayerCapabilitiesMetadata]
  }
  
  extension [Self <: FeatureLayerCapabilitiesMetadata](x: Self) {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
