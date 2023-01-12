package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CustomTemplateLayoutOptions extends StObject {
  
  /**
    * Indicates whether the legend will be included in the print-out.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Print-CustomTemplate.html#layoutOptions)
    */
  var legend: js.UndefOr[Boolean] = js.undefined
}
object CustomTemplateLayoutOptions {
  
  inline def apply(): CustomTemplateLayoutOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomTemplateLayoutOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CustomTemplateLayoutOptions] (val x: Self) extends AnyVal {
    
    inline def setLegend(value: Boolean): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
    
    inline def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
  }
}
