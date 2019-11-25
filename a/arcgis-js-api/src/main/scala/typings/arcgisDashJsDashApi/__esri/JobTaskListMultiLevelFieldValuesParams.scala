package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskListMultiLevelFieldValuesParams extends Object {
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var field: String
  /**
    * The array of previous values, on which the current value is dependent on. For example, when selecting a city based on the state and county. The value for the state and county would be the previous values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var previousSelectedValues: js.Array[String]
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#listMultiLevelFieldValues)
    */
  var user: String
}

object JobTaskListMultiLevelFieldValuesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    previousSelectedValues: js.Array[String],
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskListMultiLevelFieldValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), previousSelectedValues = previousSelectedValues.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[JobTaskListMultiLevelFieldValuesParams]
  }
}

