package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`histogram-equalization`
import typings.arcgisJsApi.arcgisJsApiStrings.`min-max`
import typings.arcgisJsApi.arcgisJsApiStrings.`percent-clip`
import typings.arcgisJsApi.arcgisJsApiStrings.`standard-deviation`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.sigmoid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterStretchRendererProperties extends js.Object {
  /**
    * The stretched values are mapped to this specified color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#colorRamp)
    */
  var colorRamp: js.UndefOr[ColorRampProperties] = js.native
  /**
    * The computeGamma automatically calculates best gamma value to render exported image based on empirical model. This is applicable to any stretch type when [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#computeGamma)
    *
    * @default false
    */
  var computeGamma: js.UndefOr[Boolean] = js.native
  /**
    * When Dynamic Range Adjustment is `true`, the statistics based on the current display extent are calculated as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#dynamicRangeAdjustment)
    *
    * @default false
    */
  var dynamicRangeAdjustment: js.UndefOr[Boolean] = js.native
  /**
    * The gamma values to be used if [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma) is set to `false`. Gamma refers to the degree of contrast between the mid-level gray values of a raster dataset. Gamma does not affect the black or white values in a raster dataset, only the middle values. By applying a gamma correction, you can control the overall brightness of an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html). Gamma stretching is only valid with the `none`, `standard-deviation`, and `min-max` [stretch types](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma)
    */
  var gamma: js.UndefOr[js.Array[Double]] = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`. Specifies the percentage of the highest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#maxPercent)
    */
  var maxPercent: js.UndefOr[Double] = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `percent-clip`. Specifies the percentage of the lowest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#minPercent)
    */
  var minPercent: js.UndefOr[Double] = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#stretchType) is `standard-deviation`. Specifies the number of standard deviations to use. The values beyond the number of standard deviations become the [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax). The remaining values are linearly stretched between [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#numberOfStandardDeviations)
    */
  var numberOfStandardDeviations: js.UndefOr[Double] = js.native
  /**
    * The outputMax denotes the output maximum, which is the highest pixel value. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched. The outputMax value ranges from 0-255.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax)
    */
  var outputMax: js.UndefOr[Double] = js.native
  /**
    * The outputMin denotes the output minimum, which is the lowest pixel value. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched. The outputMin value ranges from 0-255.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#outputMin)
    */
  var outputMin: js.UndefOr[Double] = js.native
  /**
    * The sigmoid strength level determines how much of the sigmoidal function will be used in the stretch. A low value such as 1 will only use the middle portion of the curve, which tends to produce dull and faint colors. A high value such as 6 will use the entire curve, which tends to produce bold and sharp colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#sigmoidStrengthLevel)
    */
  var sigmoidStrengthLevel: js.UndefOr[Double] = js.native
  /**
    * The input statistics can be specified through the statistics property. If not specified, they will be retrieved from the data. If [dynamicRangeAdjustment](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#dynamicRangeAdjustment) is `true`, these values will be ignored.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[js.Array[Double]] | RasterStretchRendererStatistics] = js.native
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
  ] = js.native
  /**
    * Denotes whether the [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) value should be used. When `useGamma` is `false`, the gamma is calculated from the statistics and histogram of the data. The [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#gamma) property is required if `useGamma` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html#useGamma)
    *
    * @default false
    */
  var useGamma: js.UndefOr[Boolean] = js.native
}

object RasterStretchRendererProperties {
  @scala.inline
  def apply(): RasterStretchRendererProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterStretchRendererProperties]
  }
  @scala.inline
  implicit class RasterStretchRendererPropertiesOps[Self <: RasterStretchRendererProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setColorRamp(value: ColorRampProperties): Self = this.set("colorRamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColorRamp: Self = this.set("colorRamp", js.undefined)
    @scala.inline
    def setComputeGamma(value: Boolean): Self = this.set("computeGamma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeGamma: Self = this.set("computeGamma", js.undefined)
    @scala.inline
    def setDynamicRangeAdjustment(value: Boolean): Self = this.set("dynamicRangeAdjustment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamicRangeAdjustment: Self = this.set("dynamicRangeAdjustment", js.undefined)
    @scala.inline
    def setGammaVarargs(value: Double*): Self = this.set("gamma", js.Array(value :_*))
    @scala.inline
    def setGamma(value: js.Array[Double]): Self = this.set("gamma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGamma: Self = this.set("gamma", js.undefined)
    @scala.inline
    def setMaxPercent(value: Double): Self = this.set("maxPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPercent: Self = this.set("maxPercent", js.undefined)
    @scala.inline
    def setMinPercent(value: Double): Self = this.set("minPercent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinPercent: Self = this.set("minPercent", js.undefined)
    @scala.inline
    def setNumberOfStandardDeviations(value: Double): Self = this.set("numberOfStandardDeviations", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfStandardDeviations: Self = this.set("numberOfStandardDeviations", js.undefined)
    @scala.inline
    def setOutputMax(value: Double): Self = this.set("outputMax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputMax: Self = this.set("outputMax", js.undefined)
    @scala.inline
    def setOutputMin(value: Double): Self = this.set("outputMin", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputMin: Self = this.set("outputMin", js.undefined)
    @scala.inline
    def setSigmoidStrengthLevel(value: Double): Self = this.set("sigmoidStrengthLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigmoidStrengthLevel: Self = this.set("sigmoidStrengthLevel", js.undefined)
    @scala.inline
    def setStatisticsVarargs(value: js.Array[Double]*): Self = this.set("statistics", js.Array(value :_*))
    @scala.inline
    def setStatistics(value: js.Array[js.Array[Double]] | RasterStretchRendererStatistics): Self = this.set("statistics", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatistics: Self = this.set("statistics", js.undefined)
    @scala.inline
    def setStretchType(
      value: none | `standard-deviation` | `histogram-equalization` | `min-max` | `percent-clip` | sigmoid
    ): Self = this.set("stretchType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStretchType: Self = this.set("stretchType", js.undefined)
    @scala.inline
    def setUseGamma(value: Boolean): Self = this.set("useGamma", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseGamma: Self = this.set("useGamma", js.undefined)
  }
  
}

