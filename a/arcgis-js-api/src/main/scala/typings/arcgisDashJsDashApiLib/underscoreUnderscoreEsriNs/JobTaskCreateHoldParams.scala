package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCreateHoldParams
  extends stdLib.Object {
  /**
    * Reason or more detailed information regarding why the hold is being added.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var comments: java.lang.String
  /**
    * The unique id representing the hold type to be placed on the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var holdTypeId: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var jobId: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createHold)
    */
  var user: java.lang.String
}

object JobTaskCreateHoldParams {
  @scala.inline
  def apply(
    comments: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    holdTypeId: scala.Double,
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskCreateHoldParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("comments")(comments)
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("holdTypeId")(holdTypeId)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JobTaskCreateHoldParams]
  }
}

