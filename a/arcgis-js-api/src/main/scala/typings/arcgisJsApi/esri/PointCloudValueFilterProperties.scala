package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclude
import typings.arcgisJsApi.arcgisJsApiStrings.include
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PointCloudValueFilterProperties
  extends StObject
     with PointCloudFilterProperties {
  
  /**
  		 * Whether points should be included or excluded from the filter.
  		 *
  		 * @default "exclude"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
  		 */
  var mode: js.UndefOr[include | exclude] = js.undefined
  
  /**
  		 * An array of numeric values representing the classification codes that the filter should apply.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
  		 */
  var values: js.UndefOr[js.Array[Double]] = js.undefined
}
object PointCloudValueFilterProperties {
  
  inline def apply(): PointCloudValueFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudValueFilterProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PointCloudValueFilterProperties] (val x: Self) extends AnyVal {
    
    inline def setMode(value: include | exclude): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    inline def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
