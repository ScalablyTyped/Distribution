package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TableListVisibleElements extends StObject {
  
  /**
    * Indicates whether layer load errors will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#VisibleElements)
    */
  var errors: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Indicates whether the status indicators will be displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-TableList.html#VisibleElements)
    */
  var statusIndicators: js.UndefOr[Boolean] = js.undefined
}
object TableListVisibleElements {
  
  inline def apply(): TableListVisibleElements = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableListVisibleElements]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TableListVisibleElements] (val x: Self) extends AnyVal {
    
    inline def setErrors(value: Boolean): Self = StObject.set(x, "errors", value.asInstanceOf[js.Any])
    
    inline def setErrorsUndefined: Self = StObject.set(x, "errors", js.undefined)
    
    inline def setStatusIndicators(value: Boolean): Self = StObject.set(x, "statusIndicators", value.asInstanceOf[js.Any])
    
    inline def setStatusIndicatorsUndefined: Self = StObject.set(x, "statusIndicators", js.undefined)
  }
}
