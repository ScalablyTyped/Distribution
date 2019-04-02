package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StretchRenderer extends Renderer {
  /**
    * The stretched values are mapped to this specified color ramp.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#colorRamp)
    */
  var colorRamp: ColorRamp = js.native
  /**
    * The computeGamma automatically calculates best gamma value to render exported image based on empirical model. This is applicable to any stretch type when [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#useGamma) is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#computeGamma)
    */
  var computeGamma: scala.Boolean = js.native
  /**
    * When Dynamic Range Adjustment is `true`, the statistics based on the current display extent are calculated as you zoom and pan around the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#dynamicRangeAdjustment)
    */
  var dynamicRangeAdjustment: scala.Boolean = js.native
  /**
    * The gamma values to be used if [useGamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#useGamma) is set to `false`. Gamma refers to the degree of contrast between the mid-level gray values of a raster dataset. Gamma does not affect the black or white values in a raster dataset, only the middle values. By applying a gamma correction, you can control the overall brightness of an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#gamma)
    */
  var gamma: js.Array[scala.Double] = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#stretchType) is percent-clip. Specifies the percentage of the highest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#maxPercent)
    */
  var maxPercent: scala.Double = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#stretchType) is percent-clip. Specifies the percentage of the lowest values to exclude from the stretch.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#minPercent)
    */
  var minPercent: scala.Double = js.native
  /**
    * Applicable when [stretchType](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#stretchType) is standard-deviation. Specifies the number of standard deviations to use. The values beyond the number of standard deviations become the [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMax). The remaining values are linearly stretched between [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMax).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#numberOfStandardDeviations)
    */
  var numberOfStandardDeviations: scala.Double = js.native
  /**
    * The outputMax denotes the Output Maximum, which is the highest pixel value for the histogram. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMax)
    */
  var outputMax: scala.Double = js.native
  /**
    * The outputMin denotes the Output Minimum, which is the lowest pixel value for the histogram. The [outputMin](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMin) and [outputMax](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMax) will set the range of values that will then be linearly contrast stretched.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#outputMin)
    */
  var outputMin: scala.Double = js.native
  /**
    * The Strength Level determines how much of the sigmoidal function will be used in the stretch. A low value such as 1 will only use the middle portion of the curve, which tends to produce dull and faint colors. A high value such as 6 will use the entire curve, which tends to produce bold and sharp colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#sigmoidStrengthLevel)
    */
  var sigmoidStrengthLevel: scala.Double = js.native
  /**
    * The stretch type defines a histogram stretch that will be applied to the rasters to enhance their appearance. Stretching improves the appearance of the data by spreading the pixel values along a histogram from the minimum and maximum values defined by their bit depth. For example, an 8-bit raster dataset or mosaic dataset will be stretched from 0 to 255. Different stretches will produce different results in the raster display.  The possible stretch types are listed below.
    *
    * Value | Description
    * ------|------------
    * none  | No stretch method will be applied, even if statistics exist.
    * standard-deviation | This stretch type applies a linear stretch between the values defined by the standard deviation value.
    * histogram-equalization | The pixel values are stretched to adjust the contrast using the histogram of the data.
    * min-max | This stretch type applies a linear stretch based on the output minimum and output maximum pixel values, which are used as the endpoints for the histogram.
    * percent-clip | This stretch type applies a linear stretch between the defined [minPercent](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#minPercent) and [maxPercent](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#maxPercent) pixel values.
    * sigmoid | The Sigmoid contrast stretch is designed to highlight moderate pixel values in your imagery while maintaining sufficient contrast at the extremes.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#stretchType)
    */
  var stretchType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.none | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`standard-deviation` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`histogram-equalization` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`min-max` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`percent-clip` | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.sigmoid = js.native
  /**
    * The type of Renderer. For StretchRenderer this value is always `raster-stretch`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#type)
    */
  @JSName("type")
  val type_StretchRenderer: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`raster-stretch` = js.native
  /**
    * Denotes wether the [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#gamma) value should be used. When `useGamma` is `false`, the gamma is calculated from the statistics and histogram of the data. The [gamma](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#gamma) property is required if `useGamma` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html#useGamma)
    */
  var useGamma: scala.Boolean = js.native
}

@JSGlobal("__esri.StretchRenderer")
@js.native
/**
  * StretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value. The StretchRenderer works well when you have a large range of values to display, such as in imagery, aerial photographs, or elevation models.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-StretchRenderer.html)
  */
class StretchRendererCls () extends StretchRenderer {
  def this(properties: StretchRendererProperties) = this()
  /**
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/using-fromjson/index.html) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

