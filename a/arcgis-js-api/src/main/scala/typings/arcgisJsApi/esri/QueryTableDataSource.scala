package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`query-table`
import typings.arcgisJsApi.arcgisJsApiStrings.multipatch
import typings.arcgisJsApi.arcgisJsApiStrings.multipoint
import typings.arcgisJsApi.arcgisJsApiStrings.point
import typings.arcgisJsApi.arcgisJsApiStrings.polygon
import typings.arcgisJsApi.arcgisJsApiStrings.polyline
import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueryTableDataSource extends Object {
  /**
    * The geometry type of each record in the table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var geometryType: point | multipoint | polyline | polygon | multipatch = js.native
  /**
    * The field name(s) containing the unique IDs for each record in the table. This can be a comma separated list if the query table is used in a [JoinTableDataSource](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#JoinDataTableSource).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var oidFields: String = js.native
  /**
    * The SQL query used to filter records.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var query: String = js.native
  /**
    * The spatial reference of the geometry of each feature in the table source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var spatialReference: SpatialReference = js.native
  /**
    * This value is always `query-table` and is inferred when the `query` property of this object is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var `type`: `query-table` = js.native
  /**
    * The workspace where the data resides (defined in ArcGIS Server Manager).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#QueryTableDataSource)
    */
  var workspaceId: String = js.native
}

object QueryTableDataSource {
  @scala.inline
  def apply(
    constructor: js.Function,
    geometryType: point | multipoint | polyline | polygon | multipatch,
    hasOwnProperty: PropertyKey => Boolean,
    oidFields: String,
    propertyIsEnumerable: PropertyKey => Boolean,
    query: String,
    spatialReference: SpatialReference,
    `type`: `query-table`,
    workspaceId: String
  ): QueryTableDataSource = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], geometryType = geometryType.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), oidFields = oidFields.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), query = query.asInstanceOf[js.Any], spatialReference = spatialReference.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryTableDataSource]
  }
  @scala.inline
  implicit class QueryTableDataSourceOps[Self <: QueryTableDataSource] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGeometryType(value: point | multipoint | polyline | polygon | multipatch): Self = this.set("geometryType", value.asInstanceOf[js.Any])
    @scala.inline
    def setOidFields(value: String): Self = this.set("oidFields", value.asInstanceOf[js.Any])
    @scala.inline
    def setQuery(value: String): Self = this.set("query", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpatialReference(value: SpatialReference): Self = this.set("spatialReference", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: `query-table`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkspaceId(value: String): Self = this.set("workspaceId", value.asInstanceOf[js.Any])
  }
  
}

