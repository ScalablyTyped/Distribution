package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeSliderConstructor
  extends /**
  * The SizeSlider widget is intended for authoring and exploring data-driven visualizations in any layer that can be rendered with a [SizeVariable](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-visualVariables-SizeVariable.html). At a minimum you must set the [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#max), and [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops) properties of the widget.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html)
  */
Instantiable0[SizeSlider]
     with Instantiable1[/* properties */ SizeSliderProperties, SizeSlider] {
  /**
    * A convenience function used to create a SizeSlider widget instance from the [result](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#ContinuousRendererResult) of the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) method.  This method sets the slider [stops](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#stops), [min](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#min), [max](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#maxDataValue), and [histogramConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#histogramConfig). It is still the developer's responsibility to assign it a proper [container](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#container) and any other optional properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SizeSlider.html#fromRendererResult)
    *
    * @param rendererResult The result object from the [createContinuousRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-size.html#createContinuousRenderer) method.
    * @param histogramResult The result histogram object from the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html#histogram) method.
    *
    */
  def fromRendererResult(rendererResult: sizeContinuousRendererResult): SizeSlider = js.native
  def fromRendererResult(rendererResult: sizeContinuousRendererResult, histogramResult: HistogramResult): SizeSlider = js.native
}

