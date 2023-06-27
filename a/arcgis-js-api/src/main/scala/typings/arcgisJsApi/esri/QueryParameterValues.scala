package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryParameterValues extends StObject {
  
  /**
  		 * The parameter name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#parameterValues)
  		 */
  var name: String
  
  /**
  		 * Single value or array of values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html#parameterValues)
  		 */
  var value: String | (js.Array[js.Date | Double | String]) | Double | js.Date
}
object QueryParameterValues {
  
  inline def apply(name: String, value: String | (js.Array[js.Date | Double | String]) | Double | js.Date): QueryParameterValues = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryParameterValues]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryParameterValues] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String | (js.Array[js.Date | Double | String]) | Double | js.Date): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueVarargs(value: (js.Date | Double | String)*): Self = StObject.set(x, "value", js.Array(value*))
  }
}
