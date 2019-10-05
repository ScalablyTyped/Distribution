package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldValue extends Object {
  /**
    * The description of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#FieldValue)
    */
  var description: String
  /**
    * The value that is stored for the extended properties record.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#FieldValue)
    */
  var value: js.Any
}

object FieldValue {
  @scala.inline
  def apply(
    constructor: js.Function,
    description: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    value: js.Any
  ): FieldValue = {
    val __obj = js.Dynamic.literal(constructor = constructor, description = description, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), value = value)
  
    __obj.asInstanceOf[FieldValue]
  }
}

