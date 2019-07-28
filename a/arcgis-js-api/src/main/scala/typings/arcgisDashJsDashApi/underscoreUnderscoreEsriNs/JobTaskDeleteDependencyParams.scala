package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteDependencyParams extends Object {
  /**
    * The unique id of the dependency to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var dependencyId: Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var jobId: Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var user: String
}

object JobTaskDeleteDependencyParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    dependencyId: Double,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskDeleteDependencyParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, dependencyId = dependencyId, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskDeleteDependencyParams]
  }
}

