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
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): JobTaskGetAttachmentContentUrlParams = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobTaskGetAttachmentContentUrlParams]
  }
}

