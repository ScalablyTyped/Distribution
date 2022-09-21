package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * This object contains helper methods for generating data-driven visualizations with continuous color or class breaks based on a field value or expression from features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html)
  */
trait color extends StObject {
  
  /**
    * Generates a continuous color [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) representing the age of features based on one or more fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createAgeRenderer)
    */
  def createAgeRenderer(params: colorCreateAgeRendererParams): js.Promise[AgeRendererResult]
  
  /**
    * Generates a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer)
    */
  def createClassBreaksRenderer(params: colorCreateClassBreaksRendererParams): js.Promise[ClassBreaksRendererResult]
  
  /**
    * Generates a [Renderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html) that may be applied directly to the layer used to call this method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createContinuousRenderer)
    */
  def createContinuousRenderer(params: colorCreateContinuousRendererParams): js.Promise[ContinuousRendererResult]
  
  /**
    * Generates a [PointCloudStretchRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudStretchRenderer.html) with a color scheme best-suited for the view's background based on statistics returned from a given field of a [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCContinuousRenderer)
    */
  def createPCContinuousRenderer(params: colorCreatePCContinuousRendererParams): js.Promise[PCContinuousRendererResult]
  
  /**
    * Generates a [PointCloudRGBRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html) based on the `RGB` field of a given [PointCloudLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-PointCloudLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createPCTrueColorRenderer)
    */
  def createPCTrueColorRenderer(params: colorCreatePCTrueColorRendererParams): js.Promise[PCTrueColorRendererResult]
  
  /**
    * This method generates a color visual variable with default stops that are optimally chosen based on the statistics queried for the indicated field or expression and colors determined by the view's background.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createVisualVariable)
    */
  def createVisualVariable(params: colorCreateVisualVariableParams): js.Promise[VisualVariableResult]
}
object color {
  
  inline def apply(
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
  
  extension [Self <: color](x: Self) {
    
    inline def setCreateAgeRenderer(value: colorCreateAgeRendererParams => js.Promise[AgeRendererResult]): Self = StObject.set(x, "createAgeRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateClassBreaksRenderer(value: colorCreateClassBreaksRendererParams => js.Promise[ClassBreaksRendererResult]): Self = StObject.set(x, "createClassBreaksRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateContinuousRenderer(value: colorCreateContinuousRendererParams => js.Promise[ContinuousRendererResult]): Self = StObject.set(x, "createContinuousRenderer", js.Any.fromFunction1(value))
    
    inline def setCreatePCContinuousRenderer(value: colorCreatePCContinuousRendererParams => js.Promise[PCContinuousRendererResult]): Self = StObject.set(x, "createPCContinuousRenderer", js.Any.fromFunction1(value))
    
    inline def setCreatePCTrueColorRenderer(value: colorCreatePCTrueColorRendererParams => js.Promise[PCTrueColorRendererResult]): Self = StObject.set(x, "createPCTrueColorRenderer", js.Any.fromFunction1(value))
    
    inline def setCreateVisualVariable(value: colorCreateVisualVariableParams => js.Promise[VisualVariableResult]): Self = StObject.set(x, "createVisualVariable", js.Any.fromFunction1(value))
  }
}
