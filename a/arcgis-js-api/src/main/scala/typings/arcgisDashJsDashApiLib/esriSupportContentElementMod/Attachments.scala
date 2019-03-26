package typings
package arcgisDashJsDashApiLib.esriSupportContentElementMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/support/ContentElement", "Attachments")
@js.native
/**
  * An AttachmentsContentElement represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer's capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Attachments.html)
  */
class AttachmentsCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Attachments {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.AttachmentsProperties) = this()
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

