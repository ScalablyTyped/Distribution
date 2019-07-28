package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RasterInfo extends JSONSupport {
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category. or membership.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  var attributeTable: FeatureSet
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  var bandCount: Double
  /**
    * Raster colormap that can be used to display the imagery layer. Each element in the array defines the pixel value and the red, green, and blue color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.Array[js.Array[Double]]
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
  var dataType: String
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: Extent
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.Array[_]
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.Any
  /**
    * The multidimensional information associated with the raster.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.Any
  /**
    * Raster pixel size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: Point
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
  var pixelType: String
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: SpatialReference
  /**
    * Raster band statistics. These include the minimum value in the raster, maximum value, mean of all values, and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.Array[RasterInfoStatistics]
}

@JSGlobal("__esri.RasterInfo")
@js.native
class RasterInfoCls () extends RasterInfo {
  def this(properties: RasterInfoProperties) = this()
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category. or membership.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  /* CompleteClass */
  override var attributeTable: FeatureSet = js.native
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  /* CompleteClass */
  override var bandCount: Double = js.native
  /**
    * Raster colormap that can be used to display the imagery layer. Each element in the array defines the pixel value and the red, green, and blue color values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  /* CompleteClass */
  override var colormap: js.Array[js.Array[Double]] = js.native
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
  /* CompleteClass */
  override var dataType: String = js.native
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  /* CompleteClass */
  override var extent: Extent = js.native
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  /* CompleteClass */
  override var histograms: js.Array[_] = js.native
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  /* CompleteClass */
  override var keyProperties: js.Any = js.native
  /**
    * The multidimensional information associated with the raster.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  /* CompleteClass */
  override var multidimensionalInfo: js.Any = js.native
  /**
    * Raster pixel size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  /* CompleteClass */
  override var pixelSize: Point = js.native
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
  /* CompleteClass */
  override var pixelType: String = js.native
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  /* CompleteClass */
  override var spatialReference: SpatialReference = js.native
  /**
    * Raster band statistics. These include the minimum value in the raster, maximum value, mean of all values, and standard deviation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  /* CompleteClass */
  override var statistics: js.Array[RasterInfoStatistics] = js.native
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

object RasterInfo {
  @scala.inline
  def apply(
    attributeTable: FeatureSet,
    bandCount: Double,
    colormap: js.Array[js.Array[Double]],
    dataType: String,
    extent: Extent,
    histograms: js.Array[_],
    keyProperties: js.Any,
    multidimensionalInfo: js.Any,
    pixelSize: Point,
    pixelType: String,
    spatialReference: SpatialReference,
    statistics: js.Array[RasterInfoStatistics],
    toJSON: () => js.Any
  ): RasterInfo = {
    val __obj = js.Dynamic.literal(attributeTable = attributeTable, bandCount = bandCount, colormap = colormap, dataType = dataType, extent = extent, histograms = histograms, keyProperties = keyProperties, multidimensionalInfo = multidimensionalInfo, pixelSize = pixelSize, pixelType = pixelType, spatialReference = spatialReference, statistics = statistics, toJSON = js.Any.fromFunction0(toJSON))
  
    __obj.asInstanceOf[RasterInfo]
  }
}

