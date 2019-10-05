package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteJobsParams extends Object {
  /**
    * Indicates whether or not to delete the associated job history, the default is to delete job history.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var deleteHistory: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var jobIds: js.Array[Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var user: String
}

object JobTaskDeleteJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobIds: js.Array[Double],
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String,
    deleteHistory: js.UndefOr[Boolean] = js.undefined
  ): JobTaskDeleteJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobIds = jobIds, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
    if (!js.isUndefined(deleteHistory)) __obj.updateDynamic("deleteHistory")(deleteHistory)
    __obj.asInstanceOf[JobTaskDeleteJobsParams]
  }
}

