package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedColorSlider
  extends StObject
     with SmartMappingSliderBase {
  
  /**
    * An array of class breaks with associated colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks)
    */
  var breaks: js.Array[ClassedColorSliderBreaks] = js.native
  
  /**
    * A convenience function used to update the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) of a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) associated with this slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#updateClassBreakInfos)
    */
  def updateClassBreakInfos(breakInfos: js.Array[ClassBreakInfo]): js.Array[ClassBreakInfo] = js.native
  
  /**
    * A convenience function used to update the properties a ClassedColorSlider from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-color.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#updateFromRendererResult)
    */
  def updateFromRendererResult(rendererResult: ClassBreaksRendererResult): Unit = js.native
  def updateFromRendererResult(rendererResult: ClassBreaksRendererResult, histogramResult: HistogramResult): Unit = js.native
  
  /**
    * The view model for the ClassedColorSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#viewModel)
    */
  var viewModel: ClassedColorSliderViewModel = js.native
}
