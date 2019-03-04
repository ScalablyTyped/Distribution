package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFieldInfo
  extends stdLib.Object {
  /**
    * The alias name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var alias: java.lang.String
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var length: java.lang.String
  /**
    * The name of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var name: java.lang.String
  /**
    * The type of data expected in the field.  **Possible Values:** small-integer | integer | single | double | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var `type`: java.lang.String
}

object QueryFieldInfo {
  @scala.inline
  def apply(
    alias: java.lang.String,
    constructor: js.Function,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    length: java.lang.String,
    name: java.lang.String,
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String
  ): QueryFieldInfo = {
    val __obj = js.Dynamic.literal(alias = alias, constructor = constructor, hasOwnProperty = hasOwnProperty, length = length, name = name, propertyIsEnumerable = propertyIsEnumerable)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryFieldInfo]
  }
}

