package typings
package arcgisDashJsDashApiLib.esriLayersMixinsArcGISImageServiceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("esri/layers/mixins/ArcGISImageService", JSImport.Namespace)
@js.native
class namespacedCls ()
  extends arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ArcGISImageService {
  def this(properties: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ArcGISImageServiceProperties) = this()
  /**
    * The compression quality value. This controls how much loss the image will be subjected to. Only valid when using `jpg` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  /* CompleteClass */
  override var compressionQuality: scala.Double = js.native
  /**
    * The output image compression tolerance value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  /* CompleteClass */
  override var compressionTolerance: scala.Double = js.native
  /**
    * The copyright text as defined by the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  /* CompleteClass */
  override var copyright: java.lang.String = js.native
  /**
    * The SQL where clause used to filter rasters on the client. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  /* CompleteClass */
  override var definitionExpression: java.lang.String = js.native
  /**
    * An array of fields in the layer for which a [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) has been defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#domainFields)
    */
  /* CompleteClass */
  override var domainFields: js.Array[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Field] = js.native
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  /* CompleteClass */
  override var fields: js.Array[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Field] = js.native
  /**
    * The output image type. The default value is `lerc` if a [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is set on the layer.  **Possible Values:** png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    *
    * @default jpgpng
    */
  /* CompleteClass */
  override var format: java.lang.String = js.native
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fullExtent)
    */
  /* CompleteClass */
  override var fullExtent: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Extent = js.native
  /**
    * Indicates if the Image Service has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  /* CompleteClass */
  override var hasMultidimensions: scala.Boolean = js.native
  /**
    * Indicates if the Image Service has a [raster attribute table](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable). If `true`, the raster attribute table can be accessed with the [rasterAttributeTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable) property after the layer has [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasRasterAttributeTable)
    */
  /* CompleteClass */
  override var hasRasterAttributeTable: scala.Boolean = js.native
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  /* CompleteClass */
  override var imageMaxHeight: scala.Double = js.native
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  /* CompleteClass */
  override var imageMaxWidth: scala.Double = js.native
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  /* CompleteClass */
  override var mosaicRule: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.MosaicRule = js.native
  /**
    * The multidimensional information associated with the service. This will have a value if `serviceInfo` has `hasMultidimensionalInfo = true`.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  /* CompleteClass */
  override var multidimensionalInfo: js.Any = js.native
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  /* CompleteClass */
  override var pixelType: java.lang.String = js.native
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#popupTemplate)
    */
  /* CompleteClass */
  override var popupTemplate: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.PopupTemplate = js.native
  /**
    * The raster attribute table associated with the service. To access the raster attribute table, the layer must be [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable)
    */
  /* CompleteClass */
  override var rasterAttributeTable: js.Any = js.native
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    *
    * @default Raster.
    */
  /* CompleteClass */
  override var rasterAttributeTableFieldPrefix: java.lang.String = js.native
  /**
    * A complete list of fields that consists of fields from the layer, pixel value fields and the attribute table fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  /* CompleteClass */
  override var rasterFields: js.Array[arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Field] = js.native
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  /* CompleteClass */
  override var renderingRule: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.RasterFunction = js.native
  /**
    * The spatial reference of the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#spatialReference)
    */
  /* CompleteClass */
  override val spatialReference: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.SpatialReference = js.native
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  /* CompleteClass */
  override var url: java.lang.String = js.native
  /**
    * The version of ArcGIS Server in which the image service is published.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#version)
    */
  /* CompleteClass */
  override val version: scala.Double = js.native
  /**
    * Returns an image using the [export REST operation](https://developers.arcgis.com/rest/services-reference/export-image.htm) that displays data from an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fetchImage)
    *
    * @param extent The extent of the image to export.
    * @param width The width of the image in pixels.
    * @param height The height of the image in pixels.
    *
    */
  /* CompleteClass */
  override def fetchImage(
    extent: arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.Extent,
    width: scala.Double,
    height: scala.Double
  ): arcgisDashJsDashApiLib.IPromise[_] = js.native
}

