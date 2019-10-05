package typings.arcgisDashJsDashApi.__esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryTableDataSource extends Object {
  /**
    * The geometry type of each record in the table. **Possible Values:** point | multipoint | polyline | polygon | multipatch
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var geometryType: String
  /**
    * The field name(s) containing the unique IDs for each record in the table. This can be a comma separated list if the query table is used in a [JoinTableDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinDataTableSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var oidFields: String
  /**
    * The SQL query used to filter records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var query: String
  /**
    * The spatial reference of the geometry of each feature in the table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var spatialReference: SpatialReference
  /**
    * This value is always `query-table` and is inferred when the `query` property of this object is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var `type`: String
  /**
    * The workspace where the data resides (defined in ArcGIS Server Manager).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var workspaceId: String
}

object QueryTableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: String,
    hasOwnProperty: PropertyKey => Boolean,
    oidFields: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: String,
    spatialReference: SpatialReference,
    `type`: String,
    workspaceId: String
  ): QueryTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor, geometryType = geometryType, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), oidFields = oidFields, propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query, spatialReference = spatialReference, workspaceId = workspaceId)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[QueryTableDataSource]
  }
}

