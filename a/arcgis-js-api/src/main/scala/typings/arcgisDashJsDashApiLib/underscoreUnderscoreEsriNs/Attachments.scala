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

