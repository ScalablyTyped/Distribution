package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapNotesLayerCapabilities
  extends StObject
     with Object {
  
  /**
    * Describes operations that can be performed on map notes in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#capabilities)
    */
  var operations: MapNotesLayerCapabilitiesOperations
}
object MapNotesLayerCapabilities {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    operations: MapNotesLayerCapabilitiesOperations,
    propertyIsEnumerable: PropertyKey => Boolean
  ): MapNotesLayerCapabilities = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operations = operations.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[MapNotesLayerCapabilities]
  }
  
  extension [Self <: MapNotesLayerCapabilities](x: Self) {
    
    inline def setOperations(value: MapNotesLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
