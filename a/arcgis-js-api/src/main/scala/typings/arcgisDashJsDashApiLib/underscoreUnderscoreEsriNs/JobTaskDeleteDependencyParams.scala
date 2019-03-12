package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskDeleteDependencyParams
  extends stdLib.Object {
  /**
    * The unique id of the dependency to be deleted.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var dependencyId: scala.Double
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var jobId: scala.Double
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#deleteDependency)
    */
  var user: java.lang.String
}

object JobTaskDeleteDependencyParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    dependencyId: scala.Double,
    hasOwnProperty: stdLib.PropertyKey => scala.Boolean,
    jobId: scala.Double,
    propertyIsEnumerable: stdLib.PropertyKey => scala.Boolean,
    user: java.lang.String
  ): JobTaskDeleteDependencyParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, dependencyId = dependencyId, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskDeleteDependencyParams]
  }
}

