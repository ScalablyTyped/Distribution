package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataSource extends Object {
  /**
    * The name of the table in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var dataSourceName: String
  /**
    * References the geodatabase version if multiple versions exist in the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var gdbVersion: String
  /**
    * This value is always `table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var `type`: String
  /**
    * The workspace where the table resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var workspaceId: String
}

object TableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSourceName: String,
    gdbVersion: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String,
    workspaceId: String
  ): TableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSourceName = dataSourceName, gdbVersion = gdbVersion, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), workspaceId = workspaceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableDataSource]
  }
}

