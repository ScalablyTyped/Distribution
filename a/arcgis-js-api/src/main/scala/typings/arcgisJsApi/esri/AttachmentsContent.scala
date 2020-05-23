package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.attachments
import typings.arcgisJsApi.arcgisJsApiStrings.list
import typings.arcgisJsApi.arcgisJsApiStrings.preview
import typings.arcgisJsApi.esri.content.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsContent
  extends Content_
     with Content
     with contentContent {
  /**
    * A string value indicating how to display the attachment.  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: preview | list = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#type)
    *
    * @default attachments
    */
  @JSName("type")
  val type_AttachmentsContent: attachments = js.native
}

