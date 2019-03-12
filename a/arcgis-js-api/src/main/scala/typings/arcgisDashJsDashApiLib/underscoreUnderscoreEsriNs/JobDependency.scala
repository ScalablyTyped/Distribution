package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobDependency
  extends stdLib.Object {
  /**
    * The unique id of the job on which the current job depends.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depJobId: scala.Double
  /**
    * Indicates whether the job is dependent on a step, stage or status of the other job.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnType: java.lang.String
  /**
    * The value of the step, stage or status of the other job on which the current job is dependent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var depOnValue: java.lang.String
  /**
    * The value of the step, stage or status at which the current job will be held.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var heldOnValue: scala.Double
  /**
    * Indicates whether the job is held at a step, stage or status.  **Possible Values:** step | stage | status
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var holdOnType: java.lang.String
  /**
    * The unique id of the dependency.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var id: scala.Double
  /**
    * The unique id of the job on which the dependency exists.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#JobDependency)
    */
  var jobID: java.lang.String
}

object JobDependency {
  @scala.inline
  def apply(
    constructor: js.Function,
    depJobId: scala.Double,
    depOnType: java.lang.String,
    depOnValue: java.lang.String,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    heldOnValue: scala.Double,
    holdOnType: java.lang.String,
    id: scala.Double,
    jobID: java.lang.String,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean
  ): JobDependency = {
    val __obj = js.Dynamic.literal(constructor = constructor, depJobId = depJobId, depOnType = depOnType, depOnValue = depOnValue, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), heldOnValue = heldOnValue, holdOnType = holdOnType, id = id, jobID = jobID, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobDependency]
  }
}

