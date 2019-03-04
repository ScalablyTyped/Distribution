package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskLogActionParams
  extends stdLib.Object {
  /**
    * The unique id representing the [activity type](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#ActivityType) of the action associated with this log record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var activityTypeId: scala.Double
  /**
    * The comment that is added to the history.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var comments: java.lang.String
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var jobId: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#logAction)
    */
  var user: java.lang.String
}

object JobTaskLogActionParams {
  @scala.inline
  def apply(
    activityTypeId: scala.Double,
    comments: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskLogActionParams = {
    val __obj = js.Dynamic.literal(activityTypeId = activityTypeId, comments = comments, constructor = constructor, hasOwnProperty = hasOwnProperty, jobId = jobId, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[JobTaskLogActionParams]
  }
}

