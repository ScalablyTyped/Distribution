package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DynamicDataLayer extends Object {
  /**
    * A table, feature class, or raster that resides in a registered workspace (either a folder or geodatabase). The data sources are not visible in the Services Directory by default. They may be viewed, published, and configured using the ArcGIS Server Manager.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource
  /**
    * Controls field visibility in the layer. Only specified fields will be visible. If `null`, all fields are visible in the dynamic layer. The specification for a field object is provided below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var fields: js.Array[DynamicDataLayerFields]
  /**
    * This value is always `data-layer` and is inferred when the `dataSource` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var `type`: String
}

object DynamicDataLayer {
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource,
    fields: js.Array[DynamicDataLayerFields],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): DynamicDataLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor, dataSource = dataSource.asInstanceOf[js.Any], fields = fields, hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[DynamicDataLayer]
  }
}

