package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCloseJobsParams
  extends stdLib.Object {
  /**
    * An array of unique job Ids.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#closeJobs)
    */
  var jobIds: js.Array[scala.Double]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#closeJobs)
    */
  var user: java.lang.String
}

object JobTaskCloseJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    jobIds: js.Array[scala.Double],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskCloseJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, jobIds = jobIds, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[JobTaskCloseJobsParams]
  }
}

