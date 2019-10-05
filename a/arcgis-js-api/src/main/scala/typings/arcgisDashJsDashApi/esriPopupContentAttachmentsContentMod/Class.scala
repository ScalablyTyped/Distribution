package typings.arcgisDashJsDashApi.esriPopupContentAttachmentsContentMod

import typings.arcgisDashJsDashApi.__esri.AttachmentsContent
import typings.arcgisDashJsDashApi.__esri.AttachmentsContentProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/popup/content/AttachmentsContent", JSImport.Namespace)
@js.native
/**
  * An `AttachmentsContent` popup element represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer.capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-AttachmentsContent.html)
  */
class Class () extends AttachmentsContent {
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

