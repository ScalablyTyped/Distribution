package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with continuous size or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html)
  */
trait size extends StObject {
  
  /**
    * Generates a continuous size [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createAgeRenderer)
    */
  def createAgeRenderer(params: sizeCreateAgeRendererParams): js.Promise[sizeAgeRendererResult]
  
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer)
    */
  def createClassBreaksRenderer(params: sizeCreateClassBreaksRendererParams): js.Promise[sizeClassBreaksRendererResult]
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createContinuousRenderer)
    */
  def createContinuousRenderer(params: sizeCreateContinuousRendererParams): js.Promise[sizeContinuousRendererResult]
  
  /**
    * This method generates an array of size visual variables with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and mapped to appropriate sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createVisualVariables)
    */
  def createVisualVariables(params: sizeCreateVisualVariablesParams): js.Promise[sizeVisualVariableResult]
}
object size {
  
  inline def apply(
    createAgeRenderer: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult],
    createClassBreaksRenderer: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult],
    createContinuousRenderer: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult],
    createVisualVariables: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]
  ): size = {
    val __obj = js.Dynamic.literal(createAgeRenderer = js.Any.fromFunction1(createAgeRenderer), createClassBreaksRenderer = js.Any.fromFunction1(createClassBreaksRenderer), createContinuousRenderer = js.Any.fromFunction1(createContinuousRenderer), createVisualVariables = js.Any.fromFunction1(createVisualVariables))
    __obj.asInstanceOf[size]
  }
  
  extension [Self <: size](x: Self) {
    
    inline def setCreateAgeRenderer(value: sizeCreateAgeRendererParams => js.Promise[sizeAgeRendererResult]): Self = StObject.set(x, "createAgeRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateClassBreaksRenderer(value: sizeCreateClassBreaksRendererParams => js.Promise[sizeClassBreaksRendererResult]): Self = StObject.set(x, "createClassBreaksRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateContinuousRenderer(value: sizeCreateContinuousRendererParams => js.Promise[sizeContinuousRendererResult]): Self = StObject.set(x, "createContinuousRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateVisualVariables(value: sizeCreateVisualVariablesParams => js.Promise[sizeVisualVariableResult]): Self = StObject.set(x, "createVisualVariables", js.Any.fromFunction1(value))
  }
}
