package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnivariateColorSizeSlider
  extends Accessor
     with Widgette {
  /**
    * Indicates whether to show the handles of the slider that may be dragged by the user. See the image in the [class description](#) to see where handles are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#handlesVisible)
    *
    * @default true
    */
  var handlesVisible: scala.Boolean = js.native
  /**
    * The histogram associated with the data represented on the slider. This may be generated using the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-histogram.html) statistics function.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#histogram)
    */
  var histogram: HistogramResult = js.native
  /**
    * Indicates whether to show the [histogram](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#histogram) in the slider UI. See the image in the [class description](#) to see where the histogram is typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#histogramVisible)
    *
    * @default true
    */
  var histogramVisible: scala.Boolean = js.native
  /**
    * The width of the histogram in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#histogramWidth)
    *
    * @default 100
    */
  var histogramWidth: scala.Double = js.native
  /**
    * Indicates whether to show labels in the slider UI. See the image in the [class description](#) to see where labels are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: scala.Boolean = js.native
  /**
    * The size in points or pixels with which features will be represented at or above the [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#maxValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#maxSize)
    */
  val maxSize: scala.Double = js.native
  /**
    * The maximum value or upper bound of the slider. This value overrides the `max` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics), but may not be smaller than the upper value of the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#values) array.  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#maxValue)
    */
  var maxValue: scala.Double = js.native
  /**
    * The size in points or pixels with which features will be represented at or below the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#minValue).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#minSize)
    */
  val minSize: scala.Double = js.native
  /**
    * The minimum value or lower bound of the slider. This value overrides the `min` property of the [statistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics), but may not be greater than the lower value of the [values](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#values) array.  This property may be set programmatically or by the user in the widget's UI.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#minValue)
    */
  var minValue: scala.Double = js.native
  /**
    * The summary statistics of the data represented in the slider. This is an object that may be generated from the [summaryStatistics](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-statistics-summaryStatistics.html) statistics function. The `min` and `max` values in this object determine the [minValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#minValue) and [maxValue](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#maxValue) of the slider if values for those properties are not already provided.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statistics)
    */
  var statistics: UnivariateColorSizeSliderStatistics = js.native
  /**
    * Indicates whether to show the average of the dataset in the slider UI. See the image in the [class description](#) to see where this symbol is typically placed. Hover over this symbol to view the average in the tooltip.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#statisticsVisible)
    *
    * @default true
    */
  var statisticsVisible: scala.Boolean = js.native
  /**
    * Indicates whether to show tick marks next to the slider handles. See the image in the [class description](#) to see where ticks are typically placed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#ticksVisible)
    *
    * @default true
    */
  var ticksVisible: scala.Boolean = js.native
  /**
    * Represents the data values corresponding to the handles on the slider. It is an array of numbers indicating the `minDataValue` and the `maxDataValue` of the visual variables represented by the slider.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#values)
    */
  val values: js.Array[scala.Double] = js.native
  /**
    * The size and color visual variables represented by the slider. Since this slider represents univariate visualizations, both color and size visual variables must represent data from the same field or expression and be conicident. In other words, the lower stop or bound of the color visual variable must match the lower bound (or `minDataValue`) of the size visual variable. The same is true of the upper bounds of both visual variables.  These must be set initially on the slider for it to render in the view. Both visual variables may be created manually (see snippet below) or generated from the [univariateColorSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-smartMapping-creators-univariateColorSize.html) helper methods. New coincident color and size visual variables are created each time the user slides the handles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-UnivariateColorSizeSlider.html#visualVariables)
    */
  var visualVariables: js.Array[_] = js.native
  /* InferMemberOverrides */
  override def destroy(): scala.Unit = js.native
}

