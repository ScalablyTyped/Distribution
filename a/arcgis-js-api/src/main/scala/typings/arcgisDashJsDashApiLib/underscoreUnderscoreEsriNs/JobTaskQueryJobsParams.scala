package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskQueryJobsParams
  extends stdLib.Object {
  /**
    * The unique id of a query, used to query jobs in the database.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobs)
    */
  var queryId: scala.Double
  /**
    * The username of the user who is requesting query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobs)
    */
  var user: java.lang.String
}

object JobTaskQueryJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    queryId: scala.Double,
    user: java.lang.String
  ): JobTaskQueryJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, queryId = queryId, user = user)
  
    __obj.asInstanceOf[JobTaskQueryJobsParams]
  }
}

