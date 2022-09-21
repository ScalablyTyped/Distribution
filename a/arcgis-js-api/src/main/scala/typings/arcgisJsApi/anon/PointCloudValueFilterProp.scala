package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.exclude
import typings.arcgisJsApi.arcgisJsApiStrings.include
import typings.arcgisJsApi.arcgisJsApiStrings.value
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.PointCloudValueFilterProperties & {  type :'value'} */
trait PointCloudValueFilterProp extends StObject {
  
  /**
    * The field used for applying the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudFilter.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  
  /**
    * Whether points should be included or excluded from the filter.
    *
    * @default "exclude"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    */
  var mode: js.UndefOr[include | exclude] = js.undefined
  
  var `type`: value
  
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object PointCloudValueFilterProp {
  
  inline def apply(): PointCloudValueFilterProp = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("value")
    __obj.asInstanceOf[PointCloudValueFilterProp]
  }
  
  extension [Self <: PointCloudValueFilterProp](x: Self) {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setFieldUndefined: Self = StObject.set(x, "field", js.undefined)
    
    inline def setMode(value: include | exclude): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setType(value: value): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
