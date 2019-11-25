package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskReopenClosedJobsParams extends Object {
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#reopenClosedJobs)
    */
  var jobIds: js.Array[Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#reopenClosedJobs)
    */
  var user: String
}

object JobTaskReopenClosedJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobIds: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskReopenClosedJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobIds = jobIds.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskReopenClosedJobsParams]
  }
}

