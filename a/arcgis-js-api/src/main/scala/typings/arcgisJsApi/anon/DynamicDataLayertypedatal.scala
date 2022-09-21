package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`data-layer`
import typings.arcgisJsApi.esri.DynamicDataLayerFields
import typings.arcgisJsApi.esri.JoinTableDataSource
import typings.arcgisJsApi.esri.QueryTableDataSource
import typings.arcgisJsApi.esri.RasterDataSource
import typings.arcgisJsApi.esri.TableDataSource
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.DynamicDataLayer & {  type :'data-layer'} */
trait DynamicDataLayertypedatal extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  /* standard es5 */
  var constructor: js.Function
  
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
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  /* standard es5 */
  def hasOwnProperty(v: PropertyKey): Boolean
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  /* standard es5 */
  def propertyIsEnumerable(v: PropertyKey): Boolean
  
  /**
    * This value is always `data-layer` and is inferred when the `dataSource` property is set.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Sublayer.html#DynamicDataLayer)
    */
  var `type`: `data-layer`
}
object DynamicDataLayertypedatal {
  
  inline def apply(
    constructor: js.Function,
    dataSource: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource,
    fields: js.Array[DynamicDataLayerFields],
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): DynamicDataLayertypedatal = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], dataSource = dataSource.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")("data-layer")
    __obj.asInstanceOf[DynamicDataLayertypedatal]
  }
  
  extension [Self <: DynamicDataLayertypedatal](x: Self) {
    
    inline def setConstructor(value: js.Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setDataSource(value: TableDataSource | QueryTableDataSource | RasterDataSource | JoinTableDataSource): Self = StObject.set(x, "dataSource", value.asInstanceOf[js.Any])
    
    inline def setFields(value: js.Array[DynamicDataLayerFields]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    inline def setFieldsVarargs(value: DynamicDataLayerFields*): Self = StObject.set(x, "fields", js.Array(value*))
    
    inline def setHasOwnProperty(value: PropertyKey => Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setPropertyIsEnumerable(value: PropertyKey => Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
    
    inline def setType(value: `data-layer`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
