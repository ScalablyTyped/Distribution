package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`histogram-equalization`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`min-max`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`percent-clip`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`standard-deviation`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.none
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.sigmoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterStretchRendererProperties extends js.Object {
  /**
    * The stretched values are mapped to this specified color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.undefined
  /**
    * The computeGamma automatically calculates best gamma value to render exported image based on empirical model. This is applicable to any stretch type when [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#computeGamma)
    *
    * @default false
    */
  var computeGamma: js.UndefOr[Boolean] = js.undefined
  /**
    * When Dynamic Range Adjustment is `true`, the statistics based on the current display extent are calculated as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#dynamicRangeAdjustment)
    */
  var dynamicRangeAdjustment: js.UndefOr[Boolean] = js.undefined
  /**
    * The gamma values to be used if [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is set to `false`. Gamma refers to the degree of contrast between the mid-level gray values of a raster dataset. Gamma does not affect the black or white values in a raster dataset, only the middle values. By applying a gamma correction, you can control the overall brightness of an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma)
    */
  var gamma: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is percent-clip. Specifies the percentage of the highest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#maxPercent)
    */
  var maxPercent: js.UndefOr[Double] = js.undefined
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is percent-clip. Specifies the percentage of the lowest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#minPercent)
    */
  var minPercent: js.UndefOr[Double] = js.undefined
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is standard-deviation. Specifies the number of standard deviations to use. The values beyond the number of standard deviations become the [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax). The remaining values are linearly stretched between [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#numberOfStandardDeviations)
    */
  var numberOfStandardDeviations: js.UndefOr[Double] = js.undefined
  /**
    * The outputMax denotes the Output Maximum, which is the highest pixel value for the histogram. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax)
    */
  var outputMax: js.UndefOr[Double] = js.undefined
  /**
    * The outputMin denotes the Output Minimum, which is the lowest pixel value for the histogram. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin)
    */
  var outputMin: js.UndefOr[Double] = js.undefined
  /**
    * The Strength Level determines how much of the sigmoidal function will be used in the stretch. A low value such as 1 will only use the middle portion of the curve, which tends to produce dull and faint colors. A high value such as 6 will use the entire curve, which tends to produce bold and sharp colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#sigmoidStrengthLevel)
    */
  var sigmoidStrengthLevel: js.UndefOr[Double] = js.undefined
  /**
    * The stretch type defines a histogram stretch that will be applied to the rasters to enhance their appearance. Stretching improves the appearance of the data by spreading the pixel values along a histogram from the minimum and maximum values defined by their bit depth. For example, an 8-bit raster dataset or mosaic dataset will be stretched from 0 to 255. Different stretches will produce different results in the raster display.  The possible stretch types are listed below.
    *
    * Value | Description
    * ------|------------
    * none  | No stretch method will be applied, even if statistics exist.
    * standard-deviation | This stretch type applies a linear stretch between the values defined by the standard deviation value.
    * histogram-equalization | The pixel values are stretched to adjust the contrast using the histogram of the data.
    * min-max | This stretch type applies a linear stretch based on the output minimum and output maximum pixel values, which are used as the endpoints for the histogram.
    * percent-clip | This stretch type applies a linear stretch between the defined [minPercent](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#minPercent) and [maxPercent](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#maxPercent) pixel values.
    * sigmoid | The Sigmoid contrast stretch is designed to highlight moderate pixel values in your imagery while maintaining sufficient contrast at the extremes.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType)
    *
    * @default none
    */
  var stretchType: js.UndefOr[
    none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid
  ] = js.undefined
  /**
    * Denotes wether the [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) value should be used. When `useGamma` is `false`, the gamma is calculated from the statistics and histogram of the data. The [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) property is required if `useGamma` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma)
    *
    * @default false
    */
  var useGamma: js.UndefOr[Boolean] = js.undefined
}

object RasterStretchRendererProperties {
  @scala.inline
  def apply(
    colorRamp: ColorRampProperties = null,
    computeGamma: js.UndefOr[Boolean] = js.undefined,
    dynamicRangeAdjustment: js.UndefOr[Boolean] = js.undefined,
    gamma: js.Array[Double] = null,
    maxPercent: Int | Double = null,
    minPercent: Int | Double = null,
    numberOfStandardDeviations: Int | Double = null,
    outputMax: Int | Double = null,
    outputMin: Int | Double = null,
    sigmoidStrengthLevel: Int | Double = null,
    stretchType: none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid = null,
    useGamma: js.UndefOr[Boolean] = js.undefined
  ): RasterStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorRamp != null) __obj.updateDynamic("colorRamp")(colorRamp.asInstanceOf[js.Any])
    if (!js.isUndefined(computeGamma)) __obj.updateDynamic("computeGamma")(computeGamma.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamicRangeAdjustment)) __obj.updateDynamic("dynamicRangeAdjustment")(dynamicRangeAdjustment.asInstanceOf[js.Any])
    if (gamma != null) __obj.updateDynamic("gamma")(gamma.asInstanceOf[js.Any])
    if (maxPercent != null) __obj.updateDynamic("maxPercent")(maxPercent.asInstanceOf[js.Any])
    if (minPercent != null) __obj.updateDynamic("minPercent")(minPercent.asInstanceOf[js.Any])
    if (numberOfStandardDeviations != null) __obj.updateDynamic("numberOfStandardDeviations")(numberOfStandardDeviations.asInstanceOf[js.Any])
    if (outputMax != null) __obj.updateDynamic("outputMax")(outputMax.asInstanceOf[js.Any])
    if (outputMin != null) __obj.updateDynamic("outputMin")(outputMin.asInstanceOf[js.Any])
    if (sigmoidStrengthLevel != null) __obj.updateDynamic("sigmoidStrengthLevel")(sigmoidStrengthLevel.asInstanceOf[js.Any])
    if (stretchType != null) __obj.updateDynamic("stretchType")(stretchType.asInstanceOf[js.Any])
    if (!js.isUndefined(useGamma)) __obj.updateDynamic("useGamma")(useGamma.asInstanceOf[js.Any])
    __obj.asInstanceOf[RasterStretchRendererProperties]
  }
}

