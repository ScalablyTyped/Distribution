package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterInfoProperties extends js.Object {
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category. or membership.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  var attributeTable: js.UndefOr[FeatureSetProperties] = js.undefined
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  var bandCount: js.UndefOr[Double] = js.undefined
  /**
    * Raster colormap that can be used to display the imagery layer. Each element in the array defines the pixel value and the red, green, and blue color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  /**
    * Raster data type controls how the data is rendered by default.  **Possible Values:**
    *
    * Value | Description |
    * ----- | ----------- |
    * generic | Uses the application defaults for resampling and stretching.
    * elevation | Applies bilinear resampling and a Min-Max stretch.
    * thematic | Applies nearest neighbor resampling and a Deviation stretch.
    * processed | No stretch is applied.
    * scientific | Uses the blue to red color ramp to display the data.
    * vector-uv | Uses the U (magnitude component) and V(direction component) components in the vector field renderer.
    * vector-magdir | Uses the magnitude and direction in the vector field renderer.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#dataType)
    */
  var dataType: js.UndefOr[String] = js.undefined
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.UndefOr[js.Array[_]] = js.undefined
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.UndefOr[js.Any] = js.undefined
  /**
    * The multidimensional information associated with the raster.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * Raster pixel size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PointProperties] = js.undefined
  /**
    * Pixel type for the raster data source.  **Possible Values:**
    *
    * Value | Range of values that each cell can contain |
    * ----- | ------------------------------------------- |
    * unknown | Pixel type is unknown |
    * s8 | -128 to 127 |
    * s16 | -32768 to 32767 |
    * s32 | -2147483648 to 2147483647 |
    * u8 | 0 to 255 |
    * u16 | 0 to 65535
    * u32 | 0 to 4294967295
    * f32 | -3.402823466e+38 to 3.402823466e+38
    * f64 | 0 to 18446744073709551616
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelType)
    */
  var pixelType: js.UndefOr[String] = js.undefined
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * Raster band statistics. These include the minimum value in the raster, maximum value, mean of all values, and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[RasterInfoStatistics]] = js.undefined
}

object RasterInfoProperties {
  @scala.inline
  def apply(
    attributeTable: FeatureSetProperties = null,
    bandCount: Int | Double = null,
    colormap: js.Array[js.Array[Double]] = null,
    dataType: String = null,
    extent: ExtentProperties = null,
    histograms: js.Array[_] = null,
    keyProperties: js.Any = null,
    multidimensionalInfo: js.Any = null,
    pixelSize: PointProperties = null,
    pixelType: String = null,
    spatialReference: SpatialReferenceProperties = null,
    statistics: js.Array[RasterInfoStatistics] = null
  ): RasterInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (attributeTable != null) __obj.updateDynamic("attributeTable")(attributeTable)
    if (bandCount != null) __obj.updateDynamic("bandCount")(bandCount.asInstanceOf[js.Any])
    if (colormap != null) __obj.updateDynamic("colormap")(colormap)
    if (dataType != null) __obj.updateDynamic("dataType")(dataType)
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (histograms != null) __obj.updateDynamic("histograms")(histograms)
    if (keyProperties != null) __obj.updateDynamic("keyProperties")(keyProperties)
    if (multidimensionalInfo != null) __obj.updateDynamic("multidimensionalInfo")(multidimensionalInfo)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (statistics != null) __obj.updateDynamic("statistics")(statistics)
    __obj.asInstanceOf[RasterInfoProperties]
  }
}

