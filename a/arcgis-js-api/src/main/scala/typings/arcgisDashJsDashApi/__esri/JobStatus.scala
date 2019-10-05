package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobStatus extends Object {
  /**
    * An alias name for the status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var caption: String
  /**
    * The description of the type of status.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var description: String
  /**
    * The unique id for the status type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var id: Double
  /**
    * The name of the status type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-ConfigurationTask.html#JobStatus)
    */
  var name: String
}

object JobStatus {
  @scala.inline
  def apply(
    caption: String,
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    id: Double,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): JobStatus = {
    val __obj = js.Dynamic.literal(caption = caption, constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), id = id, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[JobStatus]
  }
}

