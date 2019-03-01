package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskAddLinkedAttachmentParams
  extends stdLib.Object {
  /**
    * The type of attachment to be added.  **Possible Values:** linked-file | url
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var attachmentType: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var jobId: scala.Double
  /**
    * The file path to the attachment.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var path: java.lang.String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addLinkedAttachment)
    */
  var user: java.lang.String
}

object JobTaskAddLinkedAttachmentParams {
  @scala.inline
  def apply(
    attachmentType: scala.Double,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    path: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskAddLinkedAttachmentParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attachmentType")(attachmentType)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JobTaskAddLinkedAttachmentParams]
  }
}

