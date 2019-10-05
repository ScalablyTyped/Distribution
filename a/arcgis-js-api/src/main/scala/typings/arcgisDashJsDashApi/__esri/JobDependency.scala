package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDependency extends Object {
  /**
    * The unique id of the job on which the current job depends.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depJobId: Double
  /**
    * Indicates whether the job is dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnType: String
  /**
    * The value of the step, stage or status of the other job on which the current job is dependent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnValue: String
  /**
    * The value of the step, stage or status at which the current job will be held.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var heldOnValue: Double
  /**
    * Indicates whether the job is held at a step, stage or status.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var holdOnType: String
  /**
    * The unique id of the dependency.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var id: Double
  /**
    * The unique id of the job on which the dependency exists.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var jobID: String
}

object JobDependency {
  @scala.inline
  def apply(
    constructor: js.Function,
    depJobId: Double,
    depOnType: String,
    depOnValue: String,
    hasOwnProperty: PropertyKey => Boolean,
    heldOnValue: Double,
    holdOnType: String,
    id: Double,
    jobID: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): JobDependency = {
    val __obj = js.Dynamic.literal(constructor = constructor, depJobId = depJobId, depOnType = depOnType, depOnValue = depOnValue, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), heldOnValue = heldOnValue, holdOnType = holdOnType, id = id, jobID = jobID, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobDependency]
  }
}

