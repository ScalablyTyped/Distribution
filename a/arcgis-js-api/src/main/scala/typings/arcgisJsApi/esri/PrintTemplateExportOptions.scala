package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PrintTemplateExportOptions extends StObject {
  
  /**
    * Resolution in dots per inch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#exportOptions)
    */
  var dpi: js.UndefOr[Double] = js.undefined
  
  /**
    * Map height.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#exportOptions)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Map width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-PrintTemplate.html#exportOptions)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object PrintTemplateExportOptions {
  
  inline def apply(): PrintTemplateExportOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PrintTemplateExportOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PrintTemplateExportOptions] (val x: Self) extends AnyVal {
    
    inline def setDpi(value: Double): Self = StObject.set(x, "dpi", value.asInstanceOf[js.Any])
    
    inline def setDpiUndefined: Self = StObject.set(x, "dpi", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
