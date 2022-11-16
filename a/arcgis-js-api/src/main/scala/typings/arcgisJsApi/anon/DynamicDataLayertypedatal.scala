package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`data-layer`
import typings.arcgisJsApi.esri.DynamicDataLayerFields
import typings.arcgisJsApi.esri.JoinTableDataSource
import typings.arcgisJsApi.esri.QueryTableDataSource
import typings.arcgisJsApi.esri.RasterDataSource
import typings.arcgisJsApi.esri.TableDataSource
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.DynamicDataLayer & {  type :'data-layer'} */
trait DynamicDataLayertypedatal extends StObject {
  
  /**
    * A table, feature class, or raster that resides in a registered workspace (either a folder or geodatabase).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource
  
  /**
    * Controls field visibility in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var fields: js.Array[DynamicDataLayerFields]
  
  /**
    * This value is always `data-layer` and is inferred when the `dataSource` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var `type`: `data-layer`
}
object DynamicDataLayertypedatal {
  
  inline def apply(
    dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource,
    fields: js.Array[DynamicDataLayerFields]
  ): DynamicDataLayertypedatal = {
    val __obj = js.Dynamic.literal(dataSource = dataSource.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("data-layer")
    __obj.asInstanceOf[DynamicDataLayertypedatal]
  }
  
  extension [Self <: DynamicDataLayertypedatal](x: Self) {
    
    inline def setDataSource(value: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[DynamicDataLayerFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: DynamicDataLayerFields*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setType(value: `data-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
