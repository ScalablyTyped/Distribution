package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LayerListVisibleElements extends StObject {
  
  /**
  		 * _Since 4.25_ Indicates whether layer load errors will be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
  		 */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
  		 * Indicates whether the status indicators will be displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html#VisibleElements)
  		 */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}
object LayerListVisibleElements {
  
  inline def apply(): LayerListVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayerListVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LayerListVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
