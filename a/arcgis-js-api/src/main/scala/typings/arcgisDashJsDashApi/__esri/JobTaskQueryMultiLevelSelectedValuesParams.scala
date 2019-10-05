package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskQueryMultiLevelSelectedValuesParams extends Object {
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryMultiLevelSelectedValues)
    */
  var field: String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryMultiLevelSelectedValues)
    */
  var user: String
}

object JobTaskQueryMultiLevelSelectedValuesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    user: String
  ): JobTaskQueryMultiLevelSelectedValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), user = user)
  
    __obj.asInstanceOf[JobTaskQueryMultiLevelSelectedValuesParams]
  }
}

