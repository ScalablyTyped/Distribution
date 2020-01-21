package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentQueryConstructor
  extends /**
  * This class defines parameters for executing queries for feature attachments from a [feature layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). Once an AttachmentQuery object's properties are defined, it can then be passed into the [QueryTask.executeAttachmentQuery()](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-QueryTask.html#executeAttachmentQuery) or [FeatureLayer.queryAttachments()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryAttachments) methods, which will return [attachmentInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-AttachmentInfo.html) grouped by the source feature objectIds.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-AttachmentQuery.html)
  */
Instantiable0[AttachmentQuery]
     with Instantiable1[/* properties */ AttachmentQueryProperties, AttachmentQuery] {
  def fromJSON(json: js.Any): AttachmentQuery = js.native
}

