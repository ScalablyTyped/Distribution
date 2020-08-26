package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.add
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsViewModelProperties extends js.Object {
  /**
    * The current [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) being edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#activeAttachmentInfo)
    */
  var activeAttachmentInfo: js.UndefOr[AttachmentInfoProperties] = js.native
  /**
    * The graphic for the attachments.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#graphic)
    */
  var graphic: js.UndefOr[GraphicProperties] = js.native
  /**
    * The current mode performed by the user.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#mode)
    *
    * @default "view"
    */
  var mode: js.UndefOr[view | add | edit] = js.native
  /**
    * Defines whether or not the feature supports resizing attachments. This depends on whether the feature layer's [capabilities.operations.supportsResizeAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#supportsResizeAttachments)
    */
  var supportsResizeAttachments: js.UndefOr[Boolean] = js.native
}

object AttachmentsViewModelProperties {
  @scala.inline
  def apply(): AttachmentsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentsViewModelProperties]
  }
  @scala.inline
  implicit class AttachmentsViewModelPropertiesOps[Self <: AttachmentsViewModelProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setActiveAttachmentInfo(value: AttachmentInfoProperties): Self = this.set("activeAttachmentInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActiveAttachmentInfo: Self = this.set("activeAttachmentInfo", js.undefined)
    @scala.inline
    def setGraphic(value: GraphicProperties): Self = this.set("graphic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGraphic: Self = this.set("graphic", js.undefined)
    @scala.inline
    def setMode(value: view | add | edit): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setSupportsResizeAttachments(value: Boolean): Self = this.set("supportsResizeAttachments", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSupportsResizeAttachments: Self = this.set("supportsResizeAttachments", js.undefined)
  }
  
}

