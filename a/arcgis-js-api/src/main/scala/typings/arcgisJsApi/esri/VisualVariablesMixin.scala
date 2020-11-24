package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VisualVariablesMixin extends js.Object {
  
  /**
    * An array of [VisualVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-VisualVariable.html) objects.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-mixins-VisualVariablesMixin.html#visualVariables)
    */
  var visualVariables: js.Array[VisualVariable] = js.native
}
object VisualVariablesMixin {
  
  @scala.inline
  def apply(visualVariables: js.Array[VisualVariable]): VisualVariablesMixin = {
    val __obj = js.Dynamic.literal(visualVariables = visualVariables.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisualVariablesMixin]
  }
  
  @scala.inline
  implicit class VisualVariablesMixinOps[Self <: VisualVariablesMixin] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setVisualVariablesVarargs(value: VisualVariable*): Self = this.set("visualVariables", js.Array(value :_*))
    
    @scala.inline
    def setVisualVariables(value: js.Array[VisualVariable]): Self = this.set("visualVariables", value.asInstanceOf[js.Any])
  }
}
