package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`standard-time`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-direction`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-magdir`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-magnitude`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-u`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-uv`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-v`
import typings.arcgisJsApi.arcgisJsApiStrings.elevation
import typings.arcgisJsApi.arcgisJsApiStrings.f32
import typings.arcgisJsApi.arcgisJsApiStrings.f64
import typings.arcgisJsApi.arcgisJsApiStrings.generic
import typings.arcgisJsApi.arcgisJsApiStrings.processed
import typings.arcgisJsApi.arcgisJsApiStrings.s16
import typings.arcgisJsApi.arcgisJsApiStrings.s32
import typings.arcgisJsApi.arcgisJsApiStrings.s8
import typings.arcgisJsApi.arcgisJsApiStrings.scientific
import typings.arcgisJsApi.arcgisJsApiStrings.thematic
import typings.arcgisJsApi.arcgisJsApiStrings.u16
import typings.arcgisJsApi.arcgisJsApiStrings.u32
import typings.arcgisJsApi.arcgisJsApiStrings.u8
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RasterInfoProperties extends StObject {
  
  /**
    * The raster attribute table associated with an imagery layer.
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
    * Raster colormap that can be used to display the imagery layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
  
  /**
    * Raster data type controls how the data is rendered by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#dataType)
    */
  var dataType: js.UndefOr[
    generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-u` | `vector-v` | `vector-magdir` | `vector-magnitude` | `vector-direction` | `standard-time`
  ] = js.undefined
  
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  
  /**
    * Indicates whether the source multidimensional data has been transposed
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#hasMultidimensionalTranspose)
    */
  var hasMultidimensionalTranspose: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Raster height (row count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#height)
    */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.UndefOr[Any] = js.undefined
  
  /**
    * Returns the multidimensional information associated with the raster service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[RasterMultidimensionalInfo] = js.undefined
  
  /**
    * The pixel value representing no available information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#noDataValue)
    */
  var noDataValue: js.UndefOr[Double | js.Array[Double]] = js.undefined
  
  /**
    * Raster pixel size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: js.UndefOr[RasterInfoPixelSize] = js.undefined
  
  /**
    * Pixel type for the raster data source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelType)
    */
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.undefined
  
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
    * Raster band statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[RasterInfoStatistics]] = js.undefined
  
  /**
    * Raster width (column count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#width)
    */
  var width: js.UndefOr[Double] = js.undefined
}
object RasterInfoProperties {
  
  inline def apply(): RasterInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterInfoProperties]
  }
  
  extension [Self <: RasterInfoProperties](x: Self) {
    
    inline def setAttributeTable(value: FeatureSetProperties): Self = StObject.set(x, "attributeTable", value.asInstanceOf[js.Any])
    
    inline def setAttributeTableUndefined: Self = StObject.set(x, "attributeTable", js.undefined)
    
    inline def setBandCount(value: Double): Self = StObject.set(x, "bandCount", value.asInstanceOf[js.Any])
    
    inline def setBandCountUndefined: Self = StObject.set(x, "bandCount", js.undefined)
    
    inline def setColormap(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
    
    inline def setColormapUndefined: Self = StObject.set(x, "colormap", js.undefined)
    
    inline def setColormapVarargs(value: js.Array[Double]*): Self = StObject.set(x, "colormap", js.Array(value*))
    
    inline def setDataType(
      value: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-u` | `vector-v` | `vector-magdir` | `vector-magnitude` | `vector-direction` | `standard-time`
    ): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    inline def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    inline def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    inline def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    inline def setHasMultidimensionalTranspose(value: Boolean): Self = StObject.set(x, "hasMultidimensionalTranspose", value.asInstanceOf[js.Any])
    
    inline def setHasMultidimensionalTransposeUndefined: Self = StObject.set(x, "hasMultidimensionalTranspose", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setHistograms(value: js.Array[Any]): Self = StObject.set(x, "histograms", value.asInstanceOf[js.Any])
    
    inline def setHistogramsUndefined: Self = StObject.set(x, "histograms", js.undefined)
    
    inline def setHistogramsVarargs(value: Any*): Self = StObject.set(x, "histograms", js.Array(value*))
    
    inline def setKeyProperties(value: Any): Self = StObject.set(x, "keyProperties", value.asInstanceOf[js.Any])
    
    inline def setKeyPropertiesUndefined: Self = StObject.set(x, "keyProperties", js.undefined)
    
    inline def setMultidimensionalInfo(value: RasterMultidimensionalInfo): Self = StObject.set(x, "multidimensionalInfo", value.asInstanceOf[js.Any])
    
    inline def setMultidimensionalInfoUndefined: Self = StObject.set(x, "multidimensionalInfo", js.undefined)
    
    inline def setNoDataValue(value: Double | js.Array[Double]): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    inline def setNoDataValueVarargs(value: Double*): Self = StObject.set(x, "noDataValue", js.Array(value*))
    
    inline def setPixelSize(value: RasterInfoPixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    inline def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    inline def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    inline def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setStatistics(value: js.Array[RasterInfoStatistics]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    inline def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    inline def setStatisticsVarargs(value: RasterInfoStatistics*): Self = StObject.set(x, "statistics", js.Array(value*))
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
