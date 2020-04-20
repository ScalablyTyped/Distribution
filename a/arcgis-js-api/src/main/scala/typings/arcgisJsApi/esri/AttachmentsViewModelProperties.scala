package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.add
import typings.arcgisJsApi.arcgisJsApiStrings.edit
import typings.arcgisJsApi.arcgisJsApiStrings.view
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsViewModelProperties extends js.Object {
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
    *
    * @default "view"
    */
  var mode: js.UndefOr[view | add | edit] = js.undefined
  /**
    * Defines whether or not the feature supports resizing attachments. This depends on whether the feature layer's [capabilities.operations.supportsResizeAttachments](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Attachments-AttachmentsViewModel.html#supportsResizeAttachments)
    */
  var supportsResizeAttachments: js.UndefOr[Boolean] = js.undefined
}

object AttachmentsViewModelProperties {
  @scala.inline
  def apply(
    activeAttachmentInfo: AttachmentInfoProperties = null,
    graphic: GraphicProperties = null,
    mode: view | add | edit = null,
    supportsResizeAttachments: js.UndefOr[Boolean] = js.undefined
  ): AttachmentsViewModelProperties = {
    val __obj = js.Dynamic.literal()
    if (activeAttachmentInfo != null) __obj.updateDynamic("activeAttachmentInfo")(activeAttachmentInfo.asInstanceOf[js.Any])
    if (graphic != null) __obj.updateDynamic("graphic")(graphic.asInstanceOf[js.Any])
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(supportsResizeAttachments)) __obj.updateDynamic("supportsResizeAttachments")(supportsResizeAttachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsViewModelProperties]
  }
}

