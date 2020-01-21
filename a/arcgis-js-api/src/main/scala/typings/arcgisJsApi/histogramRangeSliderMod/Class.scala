package typings.arcgisJsApi.histogramRangeSliderMod

import typings.arcgisJsApi.esri.HistogramRangeSlider
import typings.arcgisJsApi.esri.HistogramRangeSliderProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/widgets/HistogramRangeSlider", JSImport.Namespace)
@js.native
/**
  * A slider widget that can be used for filtering data or gathering numeric input from a user for a range of data. When [bins](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#bins) are provided, a histogram will render on the slider showing where data is distributed along the range. Use the [rangeType](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html#rangeType) property to indicate how the histogram should be styled as the user interacts with slider handles.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-HistogramRangeSlider.html)
  */
class Class () extends HistogramRangeSlider {
  def this(properties: HistogramRangeSliderProperties) = this()
}

