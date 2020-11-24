package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a [dot density visualization](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html)
  */
@js.native
trait dotDensity extends js.Object {
  
  /**
    * Generates a [DotDensityRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html) based on one or more complementary numeric fields and/or Arcade expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-dotDensity.html#createRenderer)
    */
  def createRenderer(params: dotDensityCreateRendererParams): js.Promise[RendererResult] = js.native
}
object dotDensity {
  
  @scala.inline
  def apply(createRenderer: dotDensityCreateRendererParams => js.Promise[RendererResult]): dotDensity = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[dotDensity]
  }
  
  @scala.inline
  implicit class dotDensityOps[Self <: dotDensity] (val x: Self) extends AnyVal {
    
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
    def setCreateRenderer(value: dotDensityCreateRendererParams => js.Promise[RendererResult]): Self = this.set("createRenderer", js.Any.fromFunction1(value))
  }
}
