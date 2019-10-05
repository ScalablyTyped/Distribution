package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCreateHoldParams extends Object {
  /**
    * Reason or more detailed information regarding why the hold is being added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var comments: String
  /**
    * The unique id representing the hold type to be placed on the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var holdTypeId: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var user: String
}

object JobTaskCreateHoldParams {
  @scala.inline
  def apply(
    comments: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    holdTypeId: Double,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskCreateHoldParams = {
    val __obj = js.Dynamic.literal(comments = comments, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), holdTypeId = holdTypeId, jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskCreateHoldParams]
  }
}

