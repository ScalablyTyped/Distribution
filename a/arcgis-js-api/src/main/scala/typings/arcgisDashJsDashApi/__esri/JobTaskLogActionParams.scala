package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskLogActionParams extends Object {
  /**
    * The unique id representing the [activity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType) of the action associated with this log record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var activityTypeId: Double
  /**
    * The comment that is added to the history.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var comments: String
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var user: String
}

object JobTaskLogActionParams {
  @scala.inline
  def apply(
    activityTypeId: Double,
    comments: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskLogActionParams = {
    val __obj = js.Dynamic.literal(activityTypeId = activityTypeId.asInstanceOf[js.Any], comments = comments.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskLogActionParams]
  }
}

