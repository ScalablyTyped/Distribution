package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskAddEmbeddedAttachmentParams
  extends stdLib.Object {
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
  var jobId: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#addEmbeddedAttachment)
    */
  var user: java.lang.String
}

object JobTaskAddEmbeddedAttachmentParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    form: js.Any,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskAddEmbeddedAttachmentParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("form")(form)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JobTaskAddEmbeddedAttachmentParams]
  }
}

