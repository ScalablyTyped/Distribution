package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`vector-magdir`
import typings.arcgisJsApi.arcgisJsApiStrings.`vector-uv`
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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterInfoProperties extends StObject {
  
  /**
    * The raster attribute table associated with an imagery layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#attributeTable)
    */
  var attributeTable: js.UndefOr[FeatureSetProperties] = js.native
  
  /**
    * Raster band count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#bandCount)
    */
  var bandCount: js.UndefOr[Double] = js.native
  
  /**
    * Raster colormap that can be used to display the imagery layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#colormap)
    */
  var colormap: js.UndefOr[js.Array[js.Array[Double]]] = js.native
  
  /**
    * Raster data type controls how the data is rendered by default.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#dataType)
    */
  var dataType: js.UndefOr[
    generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`
  ] = js.native
  
  /**
    * The minimum and maximum X and Y coordinates of a bounding box containing all the raster data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.native
  
  /**
    * Raster height (row count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Raster histograms return basic name-value pairs for number of bins, min and max bounding values, counts of pixels in each bin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#histograms)
    */
  var histograms: js.UndefOr[js.Array[_]] = js.native
  
  /**
    * Raster key properties.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#keyProperties)
    */
  var keyProperties: js.UndefOr[js.Any] = js.native
  
  /**
    * The multidimensional information associated with the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.native
  
  /**
    * The pixel value representing no available information.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#noDataValue)
    */
  var noDataValue: js.UndefOr[Double | js.Array[Double]] = js.native
  
  /**
    * Raster pixel size.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelSize)
    */
  var pixelSize: js.UndefOr[RasterInfoPixelSize] = js.native
  
  /**
    * Pixel type for the raster data source.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#pixelType)
    */
  var pixelType: js.UndefOr[unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64] = js.native
  
  /**
    * The spatial reference of the raster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.native
  
  /**
    * Raster band statistics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#statistics)
    */
  var statistics: js.UndefOr[js.Array[RasterInfoStatistics]] = js.native
  
  /**
    * Raster width (column count) in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RasterInfo.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object RasterInfoProperties {
  
  @scala.inline
  def apply(): RasterInfoProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RasterInfoProperties]
  }
  
  @scala.inline
  implicit class RasterInfoPropertiesMutableBuilder[Self <: RasterInfoProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAttributeTable(value: FeatureSetProperties): Self = StObject.set(x, "attributeTable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAttributeTableUndefined: Self = StObject.set(x, "attributeTable", js.undefined)
    
    @scala.inline
    def setBandCount(value: Double): Self = StObject.set(x, "bandCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBandCountUndefined: Self = StObject.set(x, "bandCount", js.undefined)
    
    @scala.inline
    def setColormap(value: js.Array[js.Array[Double]]): Self = StObject.set(x, "colormap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColormapUndefined: Self = StObject.set(x, "colormap", js.undefined)
    
    @scala.inline
    def setColormapVarargs(value: js.Array[Double]*): Self = StObject.set(x, "colormap", js.Array(value :_*))
    
    @scala.inline
    def setDataType(value: generic | elevation | thematic | processed | scientific | `vector-uv` | `vector-magdir`): Self = StObject.set(x, "dataType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTypeUndefined: Self = StObject.set(x, "dataType", js.undefined)
    
    @scala.inline
    def setExtent(value: ExtentProperties): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHistograms(value: js.Array[_]): Self = StObject.set(x, "histograms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHistogramsUndefined: Self = StObject.set(x, "histograms", js.undefined)
    
    @scala.inline
    def setHistogramsVarargs(value: js.Any*): Self = StObject.set(x, "histograms", js.Array(value :_*))
    
    @scala.inline
    def setKeyProperties(value: js.Any): Self = StObject.set(x, "keyProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPropertiesUndefined: Self = StObject.set(x, "keyProperties", js.undefined)
    
    @scala.inline
    def setMultidimensionalInfo(value: js.Any): Self = StObject.set(x, "multidimensionalInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultidimensionalInfoUndefined: Self = StObject.set(x, "multidimensionalInfo", js.undefined)
    
    @scala.inline
    def setNoDataValue(value: Double | js.Array[Double]): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
    
    @scala.inline
    def setNoDataValueVarargs(value: Double*): Self = StObject.set(x, "noDataValue", js.Array(value :_*))
    
    @scala.inline
    def setPixelSize(value: RasterInfoPixelSize): Self = StObject.set(x, "pixelSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelSizeUndefined: Self = StObject.set(x, "pixelSize", js.undefined)
    
    @scala.inline
    def setPixelType(value: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64): Self = StObject.set(x, "pixelType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPixelTypeUndefined: Self = StObject.set(x, "pixelType", js.undefined)
    
    @scala.inline
    def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    @scala.inline
    def setStatistics(value: js.Array[RasterInfoStatistics]): Self = StObject.set(x, "statistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatisticsUndefined: Self = StObject.set(x, "statistics", js.undefined)
    
    @scala.inline
    def setStatisticsVarargs(value: RasterInfoStatistics*): Self = StObject.set(x, "statistics", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
