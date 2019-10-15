package typings.arcgisDashJsDashApi.esriLayersSupportRasterInfoMod

import typings.arcgisDashJsDashApi.__esri.Extent
import typings.arcgisDashJsDashApi.__esri.FeatureSet
import typings.arcgisDashJsDashApi.__esri.Point
import typings.arcgisDashJsDashApi.__esri.RasterInfo
import typings.arcgisDashJsDashApi.__esri.RasterInfoProperties
import typings.arcgisDashJsDashApi.__esri.RasterInfoStatistics
import typings.arcgisDashJsDashApi.__esri.SpatialReference
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vector-magdir`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`vector-uv`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.elevation
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f64
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.generic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.processed
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.scientific
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.thematic
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/support/RasterInfo", JSImport.Namespace)
@js.native
class Class () extends RasterInfo {
  def this(properties: RasterInfoProperties) = this()
  /**
    * The raster attribute table associated with an imagery layer. It returns categorical mapping of pixel values such as class, group, or category, or membership.
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
    * Raster data type controls how the data is rendered by default.
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
  override var dataType: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir` = js.native
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
    * Raster pixel size. Specifies the pixel size being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  /* CompleteClass */
  override var pixelSize: Point = js.native
  /**
    * Pixel type for the raster data source.
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
  override var pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = js.native
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
    * Converts an instance of  [this class]() to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation. See the [Using fromJSON()](https://developers.arcgis.com/javascript/latest/guide/programming-patterns/#using-fromjson) topic in the Guide for more information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    *
    *
    */
  /* CompleteClass */
  override def toJSON(): js.Any = js.native
}

