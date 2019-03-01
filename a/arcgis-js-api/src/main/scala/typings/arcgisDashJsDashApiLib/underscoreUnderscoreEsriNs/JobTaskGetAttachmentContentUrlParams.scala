package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskGetAttachmentContentUrlParams
  extends stdLib.Object {
  /**
    * The Id of the attachment to be retrieved.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getAttachmentContentUrl)
    */
  var attachmentId: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#getAttachmentContentUrl)
    */
  var jobId: scala.Double
}

object JobTaskGetAttachmentContentUrlParams {
  @scala.inline
  def apply(
    attachmentId: scala.Double,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): JobTaskGetAttachmentContentUrlParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentId")(attachmentId)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[JobTaskGetAttachmentContentUrlParams]
  }
}

