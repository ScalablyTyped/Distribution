package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayField extends StObject {
  
  /**
  		 * The feature's display field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#DisplayField)
  		 */
  var field: String
  
  /**
  		 * The value of the field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UtilityNetworkTrace-UtilityNetworkTraceViewModel.html#DisplayField)
  		 */
  var value: String
}
object DisplayField {
  
  inline def apply(field: String, value: String): DisplayField = {
    val __obj = js.Dynamic.literal(field = field.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayField]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayField] (val x: Self) extends AnyVal {
    
    inline def setField(value: String): Self = StObject.set(x, "field", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
