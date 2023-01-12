package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`data-file`
import typings.arcgisJsApi.arcgisJsApiStrings.`feature-record-set-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`linear-unit`
import typings.arcgisJsApi.arcgisJsApiStrings.`multi-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data-layer`
import typings.arcgisJsApi.arcgisJsApiStrings.`raster-data`
import typings.arcgisJsApi.arcgisJsApiStrings.`record-set`
import typings.arcgisJsApi.arcgisJsApiStrings.boolean
import typings.arcgisJsApi.arcgisJsApiStrings.date
import typings.arcgisJsApi.arcgisJsApiStrings.double
import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.long
import typings.arcgisJsApi.arcgisJsApiStrings.string_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ParameterValueProperties extends StObject {
  
  /**
    * Specifies the parameter's data type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#dataType)
    */
  var dataType: js.UndefOr[
    boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string_ | `multi-value`
  ] = js.undefined
  
  /**
    * The value of the parameter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html#value)
    */
  var value: js.UndefOr[
    Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String | (js.Array[
      Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String
    ])
  ] = js.undefined
}
object ParameterValueProperties {
  
  inline def apply(): ParameterValueProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ParameterValueProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ParameterValueProperties] (val x: Self) extends AnyVal {
    
    inline def setDataType(
      value: boolean | `data-file` | date | double | `feature-record-set-layer` | field | `linear-unit` | long | `raster-data` | `raster-data-layer` | `record-set` | string_ | `multi-value`
    ): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setValue(
      value: Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String | (js.Array[
          Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String
        ])
    ): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValueVarargs(
      value: (Boolean | DataFileProperties | DateProperties | Double | FeatureSetProperties | FieldProperties | LinearUnitProperties | RasterDataProperties | String)*
    ): Self = StObject.set(x, "value", js.Array(value*))
  }
}
