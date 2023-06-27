package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait predominanceCreateRendererParamsFields extends StObject {
  
  /**
  		 * The label describing the field name (or category) in the legend.
  		 *
  		 * [Read more...](global.html)
  		 */
  var label: js.UndefOr[String] = js.undefined
  
  /**
  		 * The name of a numeric field.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
  		 */
  var name: String
}
object predominanceCreateRendererParamsFields {
  
  inline def apply(name: String): predominanceCreateRendererParamsFields = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[predominanceCreateRendererParamsFields]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: predominanceCreateRendererParamsFields] (val x: Self) extends AnyVal {
    
    inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
    
    inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
