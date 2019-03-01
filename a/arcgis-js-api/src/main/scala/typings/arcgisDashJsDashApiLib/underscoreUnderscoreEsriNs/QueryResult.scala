package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryResult
  extends stdLib.Object {
  /**
    * An array of fields and field properties in the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryResult)
    */
  var fields: js.Array[QueryFieldInfo]
  /**
    * The rows of results.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryResult)
    */
  var rows: js.Array[java.lang.String]
}

object QueryResult {
  @scala.inline
  def apply(
    constructor: js.Function,
    fields: js.Array[QueryFieldInfo],
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    rows: js.Array[java.lang.String]
  ): QueryResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("constructor")(constructor)
    __obj.updateDynamic("fields")(fields)
    __obj.updateDynamic("hasOwnProperty")(hasOwnProperty)
    __obj.updateDynamic("propertyIsEnumerable")(propertyIsEnumerable)
    __obj.updateDynamic("rows")(rows)
    __obj.asInstanceOf[QueryResult]
  }
}

