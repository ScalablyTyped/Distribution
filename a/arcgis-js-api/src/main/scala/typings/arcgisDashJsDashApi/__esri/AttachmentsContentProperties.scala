package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.list
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsContentProperties extends ContentProperties {
  /**
    * An array of [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) objects used to display within the popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#attachmentInfos)
    */
  var attachmentInfos: js.UndefOr[AttachmentInfoProperties] = js.undefined
  /**
    * A string value indicating how to display the attachment. Possible values are: preview | list  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.undefined
}

object AttachmentsContentProperties {
  @scala.inline
  def apply(attachmentInfos: AttachmentInfoProperties = null, displayType: preview | list = null): AttachmentsContentProperties = {
    val __obj = js.Dynamic.literal()
    if (attachmentInfos != null) __obj.updateDynamic("attachmentInfos")(attachmentInfos)
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsContentProperties]
  }
}

