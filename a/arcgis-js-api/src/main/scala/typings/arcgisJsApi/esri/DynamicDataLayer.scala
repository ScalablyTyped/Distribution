package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`data-layer`
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DynamicDataLayer extends Object {
  
  /**
    * A table, feature class, or raster that resides in a registered workspace (either a folder or geodatabase).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource = js.native
  
  /**
    * Controls field visibility in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var fields: js.Array[DynamicDataLayerFields] = js.native
  
  /**
    * This value is always `data-layer` and is inferred when the `dataSource` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var `type`: `data-layer` = js.native
}
object DynamicDataLayer {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource,
    fields: js.Array[DynamicDataLayerFields],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: `data-layer`
  ): DynamicDataLayer = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DynamicDataLayer]
  }
  
  @scala.inline
  implicit class DynamicDataLayerMutableBuilder[Self <: DynamicDataLayer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDataSource(value: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: js.Array[DynamicDataLayerFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsVarargs(value: DynamicDataLayerFields*): Self = StObject.set(x, "fields", js.Array(value :_*))
    
    @scala.inline
    def setType(value: `data-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
