package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with continuous size or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html)
  */
@js.native
trait size extends js.Object {
  
  /**
    * Generates a continuous size [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createAgeRenderer)
    */
  def createAgeRenderer(params: sizeCreateAgeRendererParams): js.Promise[sizeAgeRendererResult] = js.native
  
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  def createClassBreaksRenderer(params: sizeCreateClassBreaksRendererParams): js.Promise[sizeClassBreaksRendererResult] = js.native
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  def createContinuousRenderer(params: sizeCreateContinuousRendererParams): js.Promise[sizeContinuousRendererResult] = js.native
  
  /**
    * This method generates an array of size visual variables with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and mapped to appropriate sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createVisualVariables)
    */
  def createVisualVariables(params: sizeCreateVisualVariablesParams): js.Promise[sizeVisualVariableResult] = js.native
}
object size {
  
  @scala.inline
  def apply(
    createAgeRenderer: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult],
    createClassBreaksRenderer: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult],
    createContinuousRenderer: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult],
    createVisualVariables: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]
  ): size = {
    val __obj = js.Dynamic.literal(createAgeRenderer = js.Any.fromFunction1(createAgeRenderer), createClassBreaksRenderer = js.Any.fromFunction1(createClassBreaksRenderer), createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createVisualVariables = js.Any.fromFunction1(createVisualVariables))
    __obj.asInstanceOf[size]
  }
  
  @scala.inline
  implicit class sizeOps[Self <: size] (val x: Self) extends AnyVal {
    
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
    def setCreateAgeRenderer(value: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult]): Self = this.set("createAgeRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateClassBreaksRenderer(value: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult]): Self = this.set("createClassBreaksRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateContinuousRenderer(value: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult]): Self = this.set("createContinuousRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVisualVariables(value: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]): Self = this.set("createVisualVariables", js.Any.fromFunction1(value))
  }
}
