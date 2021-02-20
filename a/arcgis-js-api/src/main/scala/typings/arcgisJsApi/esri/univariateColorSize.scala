package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven univariate visualizations using both continuous color and continuous size based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html)
  */
@js.native
trait univariateColorSize extends StObject {
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createContinuousRenderer)
    */
  def createContinuousRenderer(params: univariateColorSizeCreateContinuousRendererParams): js.Promise[univariateColorSizeContinuousRendererResult] = js.native
  
  /**
    * This method generates color and size visual variables, both based on the same given field or expression.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-univariateColorSize.html#createVisualVariables)
    */
  def createVisualVariables(params: univariateColorSizeCreateVisualVariablesParams): js.Promise[VisualVariablesResult] = js.native
}
object univariateColorSize {
  
  @scala.inline
  def apply(
    createContinuousRenderer: univariateColorSizeCreateContinuousRendererParams => js.Promise[univariateColorSizeContinuousRendererResult],
    createVisualVariables: univariateColorSizeCreateVisualVariablesParams => js.Promise[VisualVariablesResult]
  ): univariateColorSize = {
    val __obj = js.Dynamic.literal(createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createVisualVariables = js.Any.fromFunction1(createVisualVariables))
    __obj.asInstanceOf[univariateColorSize]
  }
  
  @scala.inline
  implicit class univariateColorSizeMutableBuilder[Self <: univariateColorSize] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCreateContinuousRenderer(
      value: univariateColorSizeCreateContinuousRendererParams => js.Promise[univariateColorSizeContinuousRendererResult]
    ): Self = StObject.set(x, "createContinuousRenderer", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateVisualVariables(value: univariateColorSizeCreateVisualVariablesParams => js.Promise[VisualVariablesResult]): Self = StObject.set(x, "createVisualVariables", js.Any.fromFunction1(value))
  }
}
