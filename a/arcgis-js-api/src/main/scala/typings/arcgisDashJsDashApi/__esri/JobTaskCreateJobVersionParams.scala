package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskCreateJobVersionParams extends Object {
  /**
    * The unique id of the job.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobVersion)
    */
  var jobId: Double
  /**
    * The name of the version to be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobVersion)
    */
  var name: String
  /**
    * The name of the job's assigned geodatabase (data workspace) version, based on which the new version will be created.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobVersion)
    */
  var parent: String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#createJobVersion)
    */
  var user: String
}

object JobTaskCreateJobVersionParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    jobId: Double,
    name: String,
    parent: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskCreateJobVersionParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), jobId = jobId, name = name, parent = parent, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskCreateJobVersionParams]
  }
}

