package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WhereCondition
  extends stdLib.Object {
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
  var field: java.lang.String
  /**
    * The operator to be used for comparison.  **Possible Values:** equal | not-equal | greater-than | greater-or-equal | less-than | less-or-equal | contains
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-NotificationTask.html#WhereCondition)
    */
  var operator: java.lang.String
}

object WhereCondition {
  @scala.inline
  def apply(
    compareValue: js.Any,
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    operator: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean]
  ): WhereCondition = {
    val __obj = js.Dynamic.literal(compareValue = compareValue, constructor = constructor, field = field, hasOwnProperty = hasOwnProperty, operator = operator, propertyIsEnumerable = propertyIsEnumerable)
  
    __obj.asInstanceOf[WhereCondition]
  }
}

