package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCreateDependencyParams extends Object {
  /**
    * The unique id of the job on which the current job will depend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depJobId: Double
  /**
    * Indicates whether the current job (to which the dependency is being added) will be dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depOnType: String
  /**
    * The value of the step or status of the other job on which the current job will be dependent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var depOnValue: Double
  /**
    * Indicates whether the current job (to which the dependency is being added) will be held at a step, stage or status.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var heldOnType: String
  /**
    * The value of the step, stage or status at which the current job will be held.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var heldOnValue: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createDependency)
    */
  var user: String
}

object JobTaskCreateDependencyParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    depJobId: Double,
    depOnType: String,
    depOnValue: Double,
    hasOwnProperty: PropertyKey => Boolean,
    heldOnType: String,
    heldOnValue: Double,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskCreateDependencyParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], depJobId = depJobId.asInstanceOf[js.Any], depOnType = depOnType.asInstanceOf[js.Any], depOnValue = depOnValue.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), heldOnType = heldOnType.asInstanceOf[js.Any], heldOnValue = heldOnValue.asInstanceOf[js.Any], jobId = jobId.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskCreateDependencyParams]
  }
}

