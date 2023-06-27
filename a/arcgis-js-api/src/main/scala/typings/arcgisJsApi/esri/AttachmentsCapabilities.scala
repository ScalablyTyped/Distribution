package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsCapabilities extends StObject {
  
  /**
  		 * Indicates whether to allow attachment editing.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#AttachmentsCapabilities)
  		 */
  var editing: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Describes the configurable attachments operations.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#AttachmentsCapabilities)
  		 */
  var operations: js.UndefOr[js.Array[AttachmentsCapabilitiesOperations]] = js.undefined
}
object AttachmentsCapabilities {
  
  inline def apply(): AttachmentsCapabilities = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsCapabilities]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentsCapabilities] (val x: Self) extends AnyVal {
    
    inline def setEditing(value: Boolean): Self = StObject.set(x, "editing", value.asInstanceOf[js.Any])
    
    inline def setEditingUndefined: Self = StObject.set(x, "editing", js.undefined)
    
    inline def setOperations(value: js.Array[AttachmentsCapabilitiesOperations]): Self = StObject.set(x, "operations", value.asInstanceOf[js.Any])
    
    inline def setOperationsUndefined: Self = StObject.set(x, "operations", js.undefined)
    
    inline def setOperationsVarargs(value: AttachmentsCapabilitiesOperations*): Self = StObject.set(x, "operations", js.Array(value*))
  }
}
