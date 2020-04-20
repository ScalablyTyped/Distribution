package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentsContentProperties extends ContentProperties {
  /**
    * A string value indicating how to display the attachment.  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: js.UndefOr[preview | list] = js.undefined
}

object AttachmentsContentProperties {
  @scala.inline
  def apply(displayType: preview | list = null): AttachmentsContentProperties = {
    val __obj = js.Dynamic.literal()
    if (displayType != null) __obj.updateDynamic("displayType")(displayType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentsContentProperties]
  }
}

