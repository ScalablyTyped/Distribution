package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MapNotesLayerCapabilitiesOperations extends StObject {
  
  /**
    * Indicates if map notes in the layer can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html#capabilities)
    */
  var supportsMapNotesEditing: Boolean
}
object MapNotesLayerCapabilitiesOperations {
  
  inline def apply(supportsMapNotesEditing: Boolean): MapNotesLayerCapabilitiesOperations = {
    val __obj = js.Dynamic.literal(supportsMapNotesEditing = supportsMapNotesEditing.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapNotesLayerCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapNotesLayerCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setSupportsMapNotesEditing(value: Boolean): Self = StObject.set(x, "supportsMapNotesEditing", value.asInstanceOf[js.Any])
  }
}
