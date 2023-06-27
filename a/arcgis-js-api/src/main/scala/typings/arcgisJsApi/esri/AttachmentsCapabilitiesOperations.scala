package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsCapabilitiesOperations extends StObject {
  
  /**
  		 * Indicates whether to allow adding attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#AttachmentsCapabilities)
  		 */
  var add: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to allow deleting an existing attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#AttachmentsCapabilities)
  		 */
  var delete: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether to allow updating an existing attachment.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#AttachmentsCapabilities)
  		 */
  var update: js.UndefOr[Boolean] = js.undefined
}
object AttachmentsCapabilitiesOperations {
  
  inline def apply(): AttachmentsCapabilitiesOperations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsCapabilitiesOperations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentsCapabilitiesOperations] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: Boolean): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddUndefined: Self = StObject.set(x, "add", js.undefined)
    
    inline def setDelete(value: Boolean): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    
    inline def setDeleteUndefined: Self = StObject.set(x, "delete", js.undefined)
    
    inline def setUpdate(value: Boolean): Self = StObject.set(x, "update", value.asInstanceOf[js.Any])
    
    inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
  }
}
