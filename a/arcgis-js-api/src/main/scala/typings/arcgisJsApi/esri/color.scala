package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with continuous color or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html)
  */
@js.native
trait color extends js.Object {
  
  /**
    * Generates a continuous color [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  def createAgeRenderer(params: colorCreateAgeRendererParams): js.Promise[AgeRendererResult] = js.native
  
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  def createClassBreaksRenderer(params: colorCreateClassBreaksRendererParams): js.Promise[ClassBreaksRendererResult] = js.native
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer)
    */
  def createContinuousRenderer(params: colorCreateContinuousRendererParams): js.Promise[ContinuousRendererResult] = js.native
  
  /**
    * Generates a [PointCloudStretchRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html) with a color scheme best-suited for the given basemap based on statistics returned from a given field of a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
    */
  def createPCContinuousRenderer(params: colorCreatePCContinuousRendererParams): js.Promise[PCContinuousRendererResult] = js.native
  
  /**
    * Generates a [PointCloudRGBRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html) based on the `RGB` field of a given [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    */
  def createPCTrueColorRenderer(params: colorCreatePCTrueColorRendererParams): js.Promise[PCTrueColorRendererResult] = js.native
  
  /**
    * This method generates a color visual variable with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and colors based on the input basemap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createVisualVariable)
    */
  def createVisualVariable(params: colorCreateVisualVariableParams): js.Promise[VisualVariableResult] = js.native
}
object color {
  
  @scala.inline
  def apply(
    createAgeRenderer: colorCreateAgeRendererParams => js.Promise[AgeRendererResult],
    createClassBreaksRenderer: colorCreateClassBreaksRendererParams => js.Promise[ClassBreaksRendererResult],
    createContinuousRenderer: colorCreateContinuousRendererParams => js.Promise[ContinuousRendererResult],
    createPCContinuousRenderer: colorCreatePCContinuousRendererParams => js.Promise[PCContinuousRendererResult],
    createPCTrueColorRenderer: colorCreatePCTrueColorRendererParams => js.Promise[PCTrueColorRendererResult],
    createVisualVariable: colorCreateVisualVariableParams => js.Promise[VisualVariableResult]
  ): color = {
    val __obj = js.Dynamic.literal(createAgeRenderer = js.Any.fromFunction1(createAgeRenderer), createClassBreaksRenderer = js.Any.fromFunction1(createClassBreaksRenderer), createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createPCContinuousRenderer = js.Any.fromFunction1(createPCContinuousRenderer), createPCTrueColorRenderer = js.Any.fromFunction1(createPCTrueColorRenderer), createVisualVariable = js.Any.fromFunction1(createVisualVariable))
    __obj.asInstanceOf[color]
  }
  
  @scala.inline
  implicit class colorOps[Self <: color] (val x: Self) extends AnyVal {
    
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
    def setCreateAgeRenderer(value: colorCreateAgeRendererParams => js.Promise[AgeRendererResult]): Self = this.set("createAgeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClassBreaksRenderer(value: colorCreateClassBreaksRendererParams => js.Promise[ClassBreaksRendererResult]): Self = this.set("createClassBreaksRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateContinuousRenderer(value: colorCreateContinuousRendererParams => js.Promise[ContinuousRendererResult]): Self = this.set("createContinuousRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePCContinuousRenderer(value: colorCreatePCContinuousRendererParams => js.Promise[PCContinuousRendererResult]): Self = this.set("createPCContinuousRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreatePCTrueColorRenderer(value: colorCreatePCTrueColorRendererParams => js.Promise[PCTrueColorRendererResult]): Self = this.set("createPCTrueColorRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVisualVariable(value: colorCreateVisualVariableParams => js.Promise[VisualVariableResult]): Self = this.set("createVisualVariable", js.Any.fromFunction1(value))
  }
}
