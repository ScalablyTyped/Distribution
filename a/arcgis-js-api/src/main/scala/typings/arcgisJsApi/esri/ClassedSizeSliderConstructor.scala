package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassedSizeSliderConstructor
  extends /**
  * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
  */
Instantiable0[ClassedSizeSlider]
     with Instantiable1[/* properties */ ClassedSizeSliderProperties, ClassedSizeSlider] {
  
  /**
    * A convenience function used to create a ClassedSizeSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-renderers-size.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#fromRendererResult)
    */
  def fromRendererResult(rendererResult: sizeClassBreaksRendererResult): ClassedSizeSlider = js.native
  def fromRendererResult(rendererResult: sizeClassBreaksRendererResult, histogramResult: HistogramResult): ClassedSizeSlider = js.native
}
