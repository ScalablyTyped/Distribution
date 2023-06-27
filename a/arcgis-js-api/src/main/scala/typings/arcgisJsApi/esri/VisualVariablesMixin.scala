package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariablesMixin extends StObject {
  
  /**
  		 * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
  		 */
  var visualVariables: js.Array[VisualVariable]
}
object VisualVariablesMixin {
  
  inline def apply(visualVariables: js.Array[VisualVariable]): VisualVariablesMixin = {
    val __obj = js.Dynamic.literal(visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariablesMixin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: VisualVariablesMixin] (val x: Self) extends AnyVal {
    
    inline def setVisualVariables(value: js.Array[VisualVariable]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    inline def setVisualVariablesVarargs(value: VisualVariable*): Self = StObject.set(x, "visualVariables", js.Array(value*))
  }
}
