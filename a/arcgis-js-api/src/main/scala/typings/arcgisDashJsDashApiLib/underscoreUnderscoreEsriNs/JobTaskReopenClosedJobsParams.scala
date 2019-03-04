package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskReopenClosedJobsParams
  extends stdLib.Object {
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#reopenClosedJobs)
    */
  var jobIds: js.Array[scala.Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#reopenClosedJobs)
    */
  var user: java.lang.String
}

object JobTaskReopenClosedJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobIds: js.Array[scala.Double],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskReopenClosedJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobIds = jobIds, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[JobTaskReopenClosedJobsParams]
  }
}

