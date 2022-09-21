package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubtypeGroupLayerCapabilitiesMetadata
  extends StObject
     with Object {
  
  /**
    * Indicates whether to provide a user-defined field description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SubtypeGroupLayer.html#capabilities)
    */
  var supportsAdvancedFieldProperties: Boolean
}
object SubtypeGroupLayerCapabilitiesMetadata {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportsAdvancedFieldProperties: Boolean
  ): SubtypeGroupLayerCapabilitiesMetadata = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportsAdvancedFieldProperties = supportsAdvancedFieldProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubtypeGroupLayerCapabilitiesMetadata]
  }
  
  extension [Self <: SubtypeGroupLayerCapabilitiesMetadata](x: Self) {
    
    inline def setSupportsAdvancedFieldProperties(value: Boolean): Self = StObject.set(x, "supportsAdvancedFieldProperties", value.asInstanceOf[js.Any])
  }
}
