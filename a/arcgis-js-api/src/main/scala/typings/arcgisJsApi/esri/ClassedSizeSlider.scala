package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedSizeSlider extends SmartMappingSliderBase {
  
  /**
    * An array of class breaks with associated sizes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks)
    */
  var breaks: js.Array[ClassedSizeSliderBreaks] = js.native
  
  /**
    * Exposes various properties of the widget that can be styled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#style)
    */
  var style: ClassedSizeSliderStyle = js.native
  
  /**
    * A convenience function used to update the [classBreakInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html#classBreakInfos) of a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html) associated with this slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#updateClassBreakInfos)
    */
  def updateClassBreakInfos(breakInfos: js.Array[ClassBreakInfo]): js.Array[ClassBreakInfo] = js.native
  /**
    * A convenience function used to update the properties a ClassedSizeSlider from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#updateClassBreakInfos)
    */
  def updateClassBreakInfos(rendererResult: sizeClassBreaksRendererResult): Unit = js.native
  def updateClassBreakInfos(rendererResult: sizeClassBreaksRendererResult, histogramResult: HistogramResult): Unit = js.native
  
  /**
    * The view model for the ClassedSizeSlider widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#viewModel)
    */
  var viewModel: ClassedSizeSliderViewModel = js.native
}
