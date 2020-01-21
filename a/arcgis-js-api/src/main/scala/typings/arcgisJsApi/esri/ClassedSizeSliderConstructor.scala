package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedSizeSliderConstructor
  extends /**
  * The ClassedSizeSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with size in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#breaks) property of the widget. The breaks are used to set the slider's thumbs.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html)
  */
Instantiable0[ClassedSizeSlider]
     with Instantiable1[/* properties */ ClassedSizeSliderProperties, ClassedSizeSlider] {
  /**
    * A convenience function used to create a ClassedSizeSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedSizeSlider.html#fromRendererResult)
    *
    * @param rendererResult The result object from the [createClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createClassBreaksRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def fromRendererResult(rendererResult: sizeClassBreaksRendererResult): ClassedSizeSlider = js.native
  def fromRendererResult(rendererResult: sizeClassBreaksRendererResult, histogramResult: HistogramResult): ClassedSizeSlider = js.native
}

