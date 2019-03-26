package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Attachments
  extends ContentElementContentElement
     with arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ContentElementNs.ContentElement
     with supportContentElementContentElement {
  /**
    * An array of [AttachmentInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) objects used to display within the popup's content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Attachments.html#attachmentInfos)
    */
  var attachmentInfos: AttachmentInfo = js.native
  /**
    * A string value indicating how to display the attachment. Possible values are: preview | list  If `list` is specified, attachments show as links.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Attachments.html#displayType)
    */
  var displayType: java.lang.String = js.native
}

@JSGlobal("__esri.Attachments")
@js.native
/**
  * An AttachmentsContentElement represents an attachment element associated with a feature. This resource is available only if the [FeatureLayer's capabilities.data.supportsAttachment](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#capabilities) is `true`.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-support-ContentElement-Attachments.html)
  */
class AttachmentsCls () extends Attachments {
  def this(properties: AttachmentsProperties) = this()
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

