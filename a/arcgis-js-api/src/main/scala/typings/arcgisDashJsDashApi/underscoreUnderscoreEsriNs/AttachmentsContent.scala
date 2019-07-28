package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.list
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.preview
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentsContent
  extends Content
     with typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.contentNs.Content
     with contentContent {
  /**
    * An array of [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) objects used to display within the popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#attachmentInfos)
    */
  var attachmentInfos: AttachmentInfo = js.native
  /**
    * A string value indicating how to display the attachment. Possible values are: preview | list  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html#displayType)
    */
  var displayType: preview | list = js.native
}

@JSGlobal("__esri.AttachmentsContent")
@js.native
/**
  * An `AttachmentsContent` popup element represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
  */
class AttachmentsContentCls () extends AttachmentsContent {
  def this(properties: AttachmentsContentProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

