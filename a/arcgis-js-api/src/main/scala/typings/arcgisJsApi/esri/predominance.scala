package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains a helper method for generating a predominance visualization.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html)
  */
@js.native
trait predominance extends js.Object {
  
  /**
    * Generates a predominance renderer based on a set of competing numeric fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-predominance.html#createRenderer)
    */
  def createRenderer(params: predominanceCreateRendererParams): js.Promise[predominanceRendererResult] = js.native
}
object predominance {
  
  @scala.inline
  def apply(createRenderer: predominanceCreateRendererParams => js.Promise[predominanceRendererResult]): predominance = {
    val __obj = js.Dynamic.literal(createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[predominance]
  }
  
  @scala.inline
  implicit class predominanceOps[Self <: predominance] (val x: Self) extends AnyVal {
    
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
    def setCreateRenderer(value: predominanceCreateRendererParams => js.Promise[predominanceRendererResult]): Self = this.set("createRenderer", js.Any.fromFunction1(value))
  }
}
