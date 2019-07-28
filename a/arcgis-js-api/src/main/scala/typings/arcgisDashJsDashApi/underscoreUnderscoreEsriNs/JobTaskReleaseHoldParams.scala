package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskReleaseHoldParams extends Object {
  /**
    * The unique id of the hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#releaseHold)
    */
  var holdId: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#releaseHold)
    */
  var jobId: Double
}

object JobTaskReleaseHoldParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    holdId: Double,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean
  ): JobTaskReleaseHoldParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), holdId = holdId, jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobTaskReleaseHoldParams]
  }
}

