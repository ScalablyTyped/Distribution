package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapNotesLayerCapabilities extends StObject {
  
  /**
    * Describes operations that can be performed on map notes in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#capabilities)
    */
  var operations: MapNotesLayerCapabilitiesOperations
}
object MapNotesLayerCapabilities {
  
  inline def apply(operations: MapNotesLayerCapabilitiesOperations): MapNotesLayerCapabilities = {
    val __obj = js.Dynamic.literal(operations = operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNotesLayerCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapNotesLayerCapabilities] (val x: Self) extends AnyVal {
    
    inline def setOperations(value: MapNotesLayerCapabilitiesOperations): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
  }
}
