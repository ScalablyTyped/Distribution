package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassedColorSliderConstructor
  extends /**
  * The ClassedColorSlider widget is designed for authoring and exploring data-driven visualizations in any layer that can be rendered with color in a [ClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html). At a minimum you must set the [breaks](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#breaks) property of the widget. The breaks are used to set the thumbs and render the color of each slider segment.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html)
  */
Instantiable0[ClassedColorSlider]
     with Instantiable1[/* properties */ ClassedColorSliderProperties, ClassedColorSlider] {
  /**
    * A convenience function used to create a ClassedColorSlider widget from the result of the [createClassBreaksRenderer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-ClassedColorSlider.html#fromRendererResult)
    *
    * @param rendererResult The result object from the [createClassBreaksRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-color.html#createClassBreaksRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def fromRendererResult(rendererResult: ClassBreaksRendererResult): ClassedColorSlider = js.native
  def fromRendererResult(rendererResult: ClassBreaksRendererResult, histogramResult: HistogramResult): ClassedColorSlider = js.native
}

