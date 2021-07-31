package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.add
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AttachmentsViewModelProperties extends StObject {
  
  /**
    * The current [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) being edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#activeAttachmentInfo)
    */
  var activeAttachmentInfo: js.UndefOr[AttachmentInfoProperties] = js.undefined
  
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.undefined
  
  /**
    * The current mode performed by the user.
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
  
  @scala.inline
  def apply(): AttachmentsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsViewModelProperties]
  }
  
  @scala.inline
  implicit class AttachmentsViewModelPropertiesMutableBuilder[Self <: AttachmentsViewModelProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActiveAttachmentInfo(value: AttachmentInfoProperties): Self = StObject.set(x, "activeAttachmentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveAttachmentInfoUndefined: Self = StObject.set(x, "activeAttachmentInfo", js.undefined)
    
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = StObject.set(x, "graphic", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGraphicUndefined: Self = StObject.set(x, "graphic", js.undefined)
    
    @scala.inline
    def setMode(value: view | add | edit): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSupportsResizeAttachments(value: Boolean): Self = StObject.set(x, "supportsResizeAttachments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsResizeAttachmentsUndefined: Self = StObject.set(x, "supportsResizeAttachments", js.undefined)
  }
}
