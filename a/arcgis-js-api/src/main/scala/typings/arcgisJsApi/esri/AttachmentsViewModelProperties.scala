package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.add
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsViewModelProperties extends StObject {
  
  /**
  		 * The current [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-query-support-AttachmentInfo.html) being edited.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#activeAttachmentInfo)
  		 */
  var activeAttachmentInfo: js.UndefOr[AttachmentInfoProperties] = js.undefined
  
  /**
  		 * Configures the attachment editing functionality that can be performed by the user.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#capabilities)
  		 */
  var capabilities: js.UndefOr[AttachmentsCapabilities] = js.undefined
  
  /**
  		 * The graphic for the attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#graphic)
  		 */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
  		 * The current mode performed by the user.
  		 *
  		 * @default "view"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#mode)
  		 */
  var mode: js.UndefOr[view | add | edit] = js.undefined
  
  /**
  		 * Defines whether or not the feature supports resizing attachments.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#supportsResizeAttachments)
  		 */
  var supportsResizeAttachments: js.UndefOr[Boolean] = js.undefined
}
object AttachmentsViewModelProperties {
  
  inline def apply(): AttachmentsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AttachmentsViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setActiveAttachmentInfo(value: AttachmentInfoProperties): Self = StObject.set(x, "activeAttachmentInfo", value.asInstanceOf[js.Any])
    
    inline def setActiveAttachmentInfoUndefined: Self = StObject.set(x, "activeAttachmentInfo", js.undefined)
    
    inline def setCapabilities(value: AttachmentsCapabilities): Self = StObject.set(x, "capabilities", value.asInstanceOf[js.Any])
    
    inline def setCapabilitiesUndefined: Self = StObject.set(x, "capabilities", js.undefined)
    
    inline def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    inline def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    inline def setMode(value: view | add | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setSupportsResizeAttachments(value: Boolean): Self = StObject.set(x, "supportsResizeAttachments", value.asInstanceOf[js.Any])
    
    inline def setSupportsResizeAttachmentsUndefined: Self = StObject.set(x, "supportsResizeAttachments", js.undefined)
  }
}
