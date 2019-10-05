package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFieldInfo extends Object {
  /**
    * The alias name of the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var alias: String
  /**
    * The field length.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var length: String
  /**
    * The name of the data workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var name: String
  /**
    * The type of data expected in the field.  **Possible Values:** small-integer | integer | single | double | string | date | oid | geometry | blob | raster | guid | global-id | xml
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-workflow-JobTask.html#QueryFieldInfo)
    */
  var `type`: String
}

object QueryFieldInfo {
  @scala.inline
  def apply(
    alias: String,
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    length: String,
    name: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): QueryFieldInfo = {
    val __obj = js.Dynamic.literal(alias = alias, constructor = constructor, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), length = length, name = name, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryFieldInfo]
  }
}

