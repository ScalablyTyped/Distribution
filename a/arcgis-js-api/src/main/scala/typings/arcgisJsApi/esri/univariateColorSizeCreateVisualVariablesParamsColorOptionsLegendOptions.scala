package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions extends StObject {
  
  /**
    * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  var title: String
}
object univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions {
  
  inline def apply(title: String): univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions = {
    val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: univariateColorSizeCreateVisualVariablesParamsColorOptionsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
