package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskAddEmbeddedAttachmentParams extends Object {
  /**
    * The form element that contains the file input control. The form parameter can be an instance of FormData. Using FormData you can send a "multipart/form-data" request to the server without having to create an HTML form element in markup. Note that the FormData api is not available in all browsers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addEmbeddedAttachment)
    */
  var form: js.Any
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addEmbeddedAttachment)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addEmbeddedAttachment)
    */
  var user: String
}

object JobTaskAddEmbeddedAttachmentParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    form: js.Any,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskAddEmbeddedAttachmentParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], form = form.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskAddEmbeddedAttachmentParams]
  }
}

