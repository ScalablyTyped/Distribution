package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobType extends Object {
  /**
    * A category to group other similar job types.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var category: String
  /**
    * The description of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var description: String
  /**
    * The unique id for the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var id: String
  /**
    * The name of the job type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var name: String
  /**
    * The state of the job type.  **Possible Values:** draft | active | retired
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobType)
    */
  var state: String
}

object JobType {
  @scala.inline
  def apply(
    category: String,
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    state: String
  ): JobType = {
    val __obj = js.Dynamic.literal(category = category, constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), state = state)
  
    __obj.asInstanceOf[JobType]
  }
}

