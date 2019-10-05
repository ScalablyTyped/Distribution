package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskAddLinkedAttachmentParams extends Object {
  /**
    * The type of attachment to be added.  **Possible Values:** linked-file | url
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var attachmentType: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var jobId: Double
  /**
    * The file path to the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var path: String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var user: String
}

object JobTaskAddLinkedAttachmentParams {
  @scala.inline
  def apply(
    attachmentType: Double,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    path: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskAddLinkedAttachmentParams = {
    val __obj = js.Dynamic.literal(attachmentType = attachmentType, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, path = path, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskAddLinkedAttachmentParams]
  }
}

