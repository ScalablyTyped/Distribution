package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SmartMappingSliderBase extends Widget {
  /**
    * The [Histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Histogram.html) associated with the data represented on the slider. The bins are typically generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#histogramConfig)
    */
  var histogramConfig: HistogramConfig = js.native
  /**
    * A modified version of [Slider.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which is a custom function used to format labels on the thumbs, min, max, and average values. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
    */
  @JSName("labelFormatFunction")
  var labelFormatFunction_Original: SmartMappingSliderBaseLabelFormatter = js.native
  /**
    * The maximum value or upper bound of the slider. If the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `max` set in this property, then the `max` will update to match the largest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#max)
    */
  var max: scala.Double = js.native
  /**
    * The minimum value or lower bound of the slider. If the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values) _in the constructor_ is greater than the `min` set in this property, then the `min` will update to match the smallest slider [value](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#values).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#min)
    */
  var min: scala.Double = js.native
  /**
    * The state of the view model.  **Possible Values:** ready | disabled
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#state)
    */
  val state: java.lang.String = js.native
  /**
    * A modified version of [Slider.labelFormatFunction](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slider.html#labelFormatFunction), which is a custom function used to format labels on the thumbs, min, max, and average values. Overrides the default label formatter. This function also supports date formatting.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#labelFormatFunction)
    */
  def labelFormatFunction(value: scala.Double): java.lang.String = js.native
  def labelFormatFunction(value: scala.Double, `type`: java.lang.String): java.lang.String = js.native
  def labelFormatFunction(value: scala.Double, `type`: java.lang.String, index: scala.Double): java.lang.String = js.native
  /**
    * *This method is primarily used by developers when implementing custom widgets.* It must be implemented by subclasses for rendering.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-smartMapping-SmartMappingSliderBase.html#render)
    *
    *
    */
  def render(): js.Any = js.native
}

@JSGlobal("__esri.SmartMappingSliderBase")
@js.native
class SmartMappingSliderBaseCls () extends SmartMappingSliderBase {
  def this(properties: SmartMappingSliderBaseProperties) = this()
}

