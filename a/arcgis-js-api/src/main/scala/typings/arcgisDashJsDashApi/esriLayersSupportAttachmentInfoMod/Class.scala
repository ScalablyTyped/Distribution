package typings.arcgisDashJsDashApi.esriLayersSupportAttachmentInfoMod

import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.AttachmentInfo
import typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs.AttachmentInfoProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/AttachmentInfo", JSImport.Namespace)
@js.native
/**
  * The `AttachmentInfo` class returns information about attachments associated with a feature. The contents of the attachment are streamed to the client. Attachments are available if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html)
  */
class Class () extends AttachmentInfo {
  def this(properties: AttachmentInfoProperties) = this()
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

