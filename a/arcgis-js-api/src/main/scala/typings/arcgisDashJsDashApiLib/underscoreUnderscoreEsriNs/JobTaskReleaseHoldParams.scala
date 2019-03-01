package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskReleaseHoldParams
  extends stdLib.Object {
  /**
    * The unique id of the hold.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#releaseHold)
    */
  var holdId: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#releaseHold)
    */
  var jobId: scala.Double
}

object JobTaskReleaseHoldParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    holdId: scala.Double,
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): JobTaskReleaseHoldParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("holdId")(holdId)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.asInstanceOf[JobTaskReleaseHoldParams]
  }
}

