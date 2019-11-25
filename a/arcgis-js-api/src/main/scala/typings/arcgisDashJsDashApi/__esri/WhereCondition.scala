package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereCondition extends Object {
  /**
    * The value to be compared/evaluated with.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#WhereCondition)
    */
  var compareValue: js.Any
  /**
    * The field name that contains the value to be compared.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#WhereCondition)
    */
  var field: String
  /**
    * The operator to be used for comparison.  **Possible Values:** equal | not-equal | greater-than | greater-or-equal | less-than | less-or-equal | contains
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#WhereCondition)
    */
  var operator: String
}

object WhereCondition {
  @scala.inline
  def apply(
    compareValue: js.Any,
    constructor: js.Function,
    field: String,
    hasOwnProperty: PropertyKey => Boolean,
    operator: String,
    propertyIsEnumerable: PropertyKey => Boolean
  ): WhereCondition = {
    val __obj = js.Dynamic.literal(compareValue = compareValue.asInstanceOf[js.Any], constructor = constructor.asInstanceOf[js.Any], field = field.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), operator = operator.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
  
    __obj.asInstanceOf[WhereCondition]
  }
}

