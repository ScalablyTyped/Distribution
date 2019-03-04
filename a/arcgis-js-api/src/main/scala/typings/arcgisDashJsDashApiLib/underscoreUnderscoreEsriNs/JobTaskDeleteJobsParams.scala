package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteJobsParams
  extends stdLib.Object {
  /**
    * Indicates whether or not to delete the associated job history, the default is to delete job history.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var deleteHistory: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var jobIds: js.Array[scala.Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteJobs)
    */
  var user: java.lang.String
}

object JobTaskDeleteJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobIds: js.Array[scala.Double],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String,
    deleteHistory: js.UndefOr[scala.Boolean] = js.undefined
  ): JobTaskDeleteJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobIds = jobIds, propertyIsEnumerable = propertyIsEnumerable, user = user)
    if (!js.isUndefined(deleteHistory)) __obj.updateDynamic("deleteHistory")(deleteHistory)
    __obj.asInstanceOf[JobTaskDeleteJobsParams]
  }
}

