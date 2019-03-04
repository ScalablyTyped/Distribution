package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobTaskQueryMultiLevelSelectedValuesParams
  extends stdLib.Object {
  /**
    * The name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryMultiLevelSelectedValues)
    */
  var field: java.lang.String
  /**
    * The user name of the user who is requesting the change.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#queryMultiLevelSelectedValues)
    */
  var user: java.lang.String
}

object JobTaskQueryMultiLevelSelectedValuesParams {
  @scala.inline
  def apply(
    constructor: js.Function,
    field: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    user: java.lang.String
  ): JobTaskQueryMultiLevelSelectedValuesParams = {
    val __obj = js.Dynamic.literal(constructor = constructor, field = field, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, user = user)
  
    __obj.asInstanceOf[JobTaskQueryMultiLevelSelectedValuesParams]
  }
}

