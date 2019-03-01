package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCreateDependencyParams
  extends stdLib.Object {
  /**
    * The unique id of the job on which the current job will depend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depJobId: scala.Double
  /**
    * Indicates whether the current job (to which the dependency is being added) will be dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depOnType: java.lang.String
  /**
    * The value of the step or status of the other job on which the current job will be dependent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depOnValue: scala.Double
  /**
    * Indicates whether the current job (to which the dependency is being added) will be held at a step, stage or status.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var heldOnType: java.lang.String
  /**
    * The value of the step, stage or status at which the current job will be held.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var heldOnValue: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var jobId: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var user: java.lang.String
}

object JobTaskCreateDependencyParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    depJobId: scala.Double,
    depOnType: java.lang.String,
    depOnValue: scala.Double,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    heldOnType: java.lang.String,
    heldOnValue: scala.Double,
    jobId: scala.Double,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskCreateDependencyParams = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("depJobId")(depJobId)
    __obj.updateDynamic("depOnType")(depOnType)
    __obj.updateDynamic("depOnValue")(depOnValue)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("heldOnType")(heldOnType)
    __obj.updateDynamic("heldOnValue")(heldOnValue)
    __obj.updateDynamic("jobId")(jobId)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("user")(user)
    __obj.asInstanceOf[JobTaskCreateDependencyParams]
  }
}

