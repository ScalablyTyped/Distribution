package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.exclude
import typings.arcgisJsApi.arcgisJsApiStrings.include
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PointCloudValueFilterProperties extends PointCloudFilterProperties {
  
  /**
    * Whether points should be included or excluded from the filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#mode)
    */
  var mode: js.UndefOr[include | exclude] = js.native
  
  /**
    * An array of numeric values representing the classification codes that the filter should apply.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-pointCloudFilters-PointCloudValueFilter.html#values)
    */
  var values: js.UndefOr[js.Array[Double]] = js.native
}
object PointCloudValueFilterProperties {
  
  @scala.inline
  def apply(): PointCloudValueFilterProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PointCloudValueFilterProperties]
  }
  
  @scala.inline
  implicit class PointCloudValueFilterPropertiesMutableBuilder[Self <: PointCloudValueFilterProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: include | exclude): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = StObject.set(x, "values", js.Array(value :_*))
  }
}
