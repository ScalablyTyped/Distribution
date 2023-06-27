package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait opacityCreateVisualVariableParamsLegendOptions extends StObject {
  
  /**
  		 * The title used to represent the given field or expression in the [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object opacityCreateVisualVariableParamsLegendOptions {
  
  inline def apply(): opacityCreateVisualVariableParamsLegendOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[opacityCreateVisualVariableParamsLegendOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: opacityCreateVisualVariableParamsLegendOptions] (val x: Self) extends AnyVal {
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
