package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableDataSource
  extends stdLib.Object {
  /**
    * The name of the table in the registered workspace.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var dataSourceName: java.lang.String
  /**
    * References the geodatabase version if multiple versions exist in the geodatabase.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var gdbVersion: java.lang.String
  /**
    * This value is always `table`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var `type`: java.lang.String
  /**
    * The workspace where the table resides as defined in the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#TableDataSource)
    */
  var workspaceId: java.lang.String
}

object TableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSourceName: java.lang.String,
    gdbVersion: java.lang.String,
    hasOwnProperty: js.Function1[stdLib.PropertyKey, scala.Boolean],
    propertyIsEnumerable: js.Function1[stdLib.PropertyKey, scala.Boolean],
    `type`: java.lang.String,
    workspaceId: java.lang.String
  ): TableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSourceName = dataSourceName, gdbVersion = gdbVersion, hasOwnProperty = hasOwnProperty, propertyIsEnumerable = propertyIsEnumerable, workspaceId = workspaceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[TableDataSource]
  }
}

