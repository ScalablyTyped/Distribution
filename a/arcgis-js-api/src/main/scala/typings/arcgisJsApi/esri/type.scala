package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with unique types (or categories) based on a field value from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html)
  */
@js.native
trait `type` extends js.Object {
  
  /**
    * Generates a [PointCloudUniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html) based on a given field of a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createPCClassRenderer)
    */
  def createPCClassRenderer(params: typeCreatePCClassRendererParams): js.Promise[PCClassRendererResult] = js.native
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) that supports renderers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-type.html#createRenderer)
    */
  def createRenderer(params: typeCreateRendererParams): js.Promise[typeRendererResult] = js.native
}
object `type` {
  
  @scala.inline
  def apply(
    createPCClassRenderer: typeCreatePCClassRendererParams => js.Promise[PCClassRendererResult],
    createRenderer: typeCreateRendererParams => js.Promise[typeRendererResult]
  ): `type` = {
    val __obj = js.Dynamic.literal(createPCClassRenderer = js.Any.fromFunction1(createPCClassRenderer), createRenderer = js.Any.fromFunction1(createRenderer))
    __obj.asInstanceOf[`type`]
  }
  
  @scala.inline
  implicit class typeOps[Self <: `type`] (val x: Self) extends AnyVal {
    
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
    def setCreatePCClassRenderer(value: typeCreatePCClassRendererParams => js.Promise[PCClassRendererResult]): Self = this.set("createPCClassRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateRenderer(value: typeCreateRendererParams => js.Promise[typeRendererResult]): Self = this.set("createRenderer", js.Any.fromFunction1(value))
  }
}
