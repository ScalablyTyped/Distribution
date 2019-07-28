package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskQueryJobsParams extends Object {
  /**
    * The unique id of a query, used to query jobs in the database.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobs)
    */
  var queryId: Double
  /**
    * The username of the user who is requesting query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryJobs)
    */
  var user: String
}

object JobTaskQueryJobsParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    queryId: Double,
    user: String
  ): JobTaskQueryJobsParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), queryId = queryId, user = user)
  
    __obj.asInstanceOf[JobTaskQueryJobsParams]
  }
}

