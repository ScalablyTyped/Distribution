package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteAttachmentParams extends Object {
  /**
    * The unique id of the attachment to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteAttachment)
    */
  var attachmentId: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteAttachment)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteAttachment)
    */
  var user: String
}

object JobTaskDeleteAttachmentParams {
  @scala.inline
  def apply(
    attachmentId: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskDeleteAttachmentParams = {
    val __obj = js.Dynamic.literal(attachmentId = attachmentId, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskDeleteAttachmentParams]
  }
}

