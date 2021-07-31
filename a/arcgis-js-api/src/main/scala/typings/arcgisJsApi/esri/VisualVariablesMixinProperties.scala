package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VisualVariablesMixinProperties extends StObject {
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    */
  var visualVariables: js.UndefOr[js.Array[VisualVariableProperties]] = js.undefined
}
object VisualVariablesMixinProperties {
  
  @scala.inline
  def apply(): VisualVariablesMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VisualVariablesMixinProperties]
  }
  
  @scala.inline
  implicit class VisualVariablesMixinPropertiesMutableBuilder[Self <: VisualVariablesMixinProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariableProperties]): Self = StObject.set(x, "visualVariables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisualVariablesUndefined: Self = StObject.set(x, "visualVariables", js.undefined)
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariableProperties*): Self = StObject.set(x, "visualVariables", js.Array(value :_*))
  }
}
