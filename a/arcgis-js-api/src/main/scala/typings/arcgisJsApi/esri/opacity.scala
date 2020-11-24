package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating data-driven visualizations with continuous opacity based on data returned from a field value or expression in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html)
  */
@js.native
trait opacity extends js.Object {
  
  /**
    * This method generates an opacity visual variable with default alpha values optimally mapped to data values based on the statistics queried for the indicated field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-opacity.html#createVisualVariable)
    */
  def createVisualVariable(params: opacityCreateVisualVariableParams): js.Promise[opacityVisualVariableResult] = js.native
}
object opacity {
  
  @scala.inline
  def apply(createVisualVariable: opacityCreateVisualVariableParams => js.Promise[opacityVisualVariableResult]): opacity = {
    val __obj = js.Dynamic.literal(createVisualVariable = js.Any.fromFunction1(createVisualVariable))
    __obj.asInstanceOf[opacity]
  }
  
  @scala.inline
  implicit class opacityOps[Self <: opacity] (val x: Self) extends AnyVal {
    
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
    def setCreateVisualVariable(value: opacityCreateVisualVariableParams => js.Promise[opacityVisualVariableResult]): Self = this.set("createVisualVariable", js.Any.fromFunction1(value))
  }
}
