package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs.ArcGISImageServiceProperties because var conflicts: fullExtent. Inlined compressionQuality, compressionTolerance, copyright, definitionExpression, domainFields, fields, format, hasMultidimensions, hasRasterAttributeTable, imageMaxHeight, imageMaxWidth, mosaicRule, multidimensionalInfo, pixelType, popupTemplate, rasterAttributeTable, rasterAttributeTableFieldPrefix, rasterFields, renderingRule, url */ trait ImageryLayerProperties
  extends LayerProperties
     with ScaleRangeLayerProperties
     with RefreshableLayerProperties {
  /**
    * The compression quality value. This controls how much loss the image will be subjected to. Only valid when using `jpg` [image format](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionQuality)
    */
  var compressionQuality: js.UndefOr[scala.Double] = js.undefined
  /**
    * The output image compression tolerance value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#compressionTolerance)
    *
    * @default 0.01
    */
  var compressionTolerance: js.UndefOr[scala.Double] = js.undefined
  /**
    * The copyright text as defined by the image service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#copyright)
    */
  var copyright: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The SQL where clause used to filter rasters on the client. Only the rasters that satisfy the definition expression are displayed in the [View](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#definitionExpression)
    */
  var definitionExpression: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An array of fields in the layer for which a [Domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-Domain.html) has been defined.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#domainFields)
    */
  var domainFields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * An array of fields in the layer. Each field represents an attribute that may contain a value for each raster in the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#fields)
    */
  var fields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * The output image type. The default value is `lerc` if a [pixelFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelFilter) is set on the layer.  **Possible Values:** png | png8 | png24 | png32 | jpg | bmp | gif | jpgpng | lerc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#format)
    *
    * @default jpgpng
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates if the Image Service has [multidimensionalInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasMultidimensions)
    */
  var hasMultidimensions: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates if the Image Service has a [raster attribute table](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable). If `true`, the raster attribute table can be accessed with the [rasterAttributeTable](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable) property after the layer has [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#hasRasterAttributeTable)
    */
  var hasRasterAttributeTable: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates the maximum height of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxHeight)
    *
    * @default 4100
    */
  var imageMaxHeight: js.UndefOr[scala.Double] = js.undefined
  /**
    * Indicates the maximum width of the image exported by the service.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#imageMaxWidth)
    *
    * @default 15000
    */
  var imageMaxWidth: js.UndefOr[scala.Double] = js.undefined
  /**
    * Defines how overlapping images should be mosaicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  /**
    * The multidimensional information associated with the service. This will have a value if `serviceInfo` has `hasMultidimensionalInfo = true`.  If defined, multidimensional information contains various "dimensions" of data for a particular value, such as time, depth, altitude, etc. Defining slices of particular dimensions in the layer is handled with the [multidimensionalDefinition](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MosaicRule.html#multidimensionalDefinition) property of the [mosaicRule](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#mosaicRule).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#multidimensionalInfo)
    */
  var multidimensionalInfo: js.UndefOr[js.Any] = js.undefined
  /**
    * A function that processes [pixelData](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-ImageryLayerView.html#pixelData). The `pixelData` object contains a [pixelBlock](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html) property that gives you access to all of the pixels in the raster on the client.  Inside the `pixelFilter` you may loop through all the [pixels](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-PixelBlock.html#pixels) found in the `pixelBlock` property of the `pixelData` object and process them. This function may be used to hide some pixels from the view, alter their values, and change their color.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#pixelFilter)
    */
  var pixelFilter: js.UndefOr[js.Function] = js.undefined
  /**
    * The pixel type.  **Possible Values:** s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#pixelType)
    */
  var pixelType: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether to display popups when the layer is clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  /**
    * The portal item from which the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#portalItem)
    */
  var portalItem: js.UndefOr[PortalItemProperties] = js.undefined
  /**
    * The raster attribute table associated with the service. To access the raster attribute table, the layer must be [loaded](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#loaded).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTable)
    */
  var rasterAttributeTable: js.UndefOr[js.Any] = js.undefined
  /**
    * Prefix used to define the fields from the raster attribute table. It's primarily used for [popups](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html)
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterAttributeTableFieldPrefix)
    *
    * @default Raster.
    */
  var rasterAttributeTableFieldPrefix: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A complete list of fields that consists of fields from the layer, pixel value fields and the attribute table fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#rasterFields)
    */
  var rasterFields: js.UndefOr[js.Array[FieldProperties]] = js.undefined
  /**
    * Specifies the rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * The URL to the REST endpoint of the layer. The URL may either point to a resource on ArcGIS Enterprise or ArcGIS Online.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-mixins-ArcGISImageService.html#url)
    */
  var url: js.UndefOr[java.lang.String] = js.undefined
}

object ImageryLayerProperties {
  @scala.inline
  def apply(
    compressionQuality: scala.Int | scala.Double = null,
    compressionTolerance: scala.Int | scala.Double = null,
    copyright: java.lang.String = null,
    definitionExpression: java.lang.String = null,
    domainFields: js.Array[FieldProperties] = null,
    fields: js.Array[FieldProperties] = null,
    format: java.lang.String = null,
    fullExtent: ExtentProperties = null,
    hasMultidimensions: js.UndefOr[scala.Boolean] = js.undefined,
    hasRasterAttributeTable: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    imageMaxHeight: scala.Int | scala.Double = null,
    imageMaxWidth: scala.Int | scala.Double = null,
    listMode: java.lang.String = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    mosaicRule: MosaicRuleProperties = null,
    multidimensionalInfo: js.Any = null,
    opacity: scala.Int | scala.Double = null,
    pixelFilter: js.Function = null,
    pixelType: java.lang.String = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    rasterAttributeTable: js.Any = null,
    rasterAttributeTableFieldPrefix: java.lang.String = null,
    rasterFields: js.Array[FieldProperties] = null,
    refreshInterval: scala.Int | scala.Double = null,
    renderingRule: RasterFunctionProperties = null,
    title: java.lang.String = null,
    url: java.lang.String = null,
    visible: js.UndefOr[scala.Boolean] = js.undefined
  ): ImageryLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (compressionQuality != null) __obj.updateDynamic("compressionQuality")(compressionQuality.asInstanceOf[js.Any])
    if (compressionTolerance != null) __obj.updateDynamic("compressionTolerance")(compressionTolerance.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression)
    if (domainFields != null) __obj.updateDynamic("domainFields")(domainFields)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (format != null) __obj.updateDynamic("format")(format)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (!js.isUndefined(hasMultidimensions)) __obj.updateDynamic("hasMultidimensions")(hasMultidimensions)
    if (!js.isUndefined(hasRasterAttributeTable)) __obj.updateDynamic("hasRasterAttributeTable")(hasRasterAttributeTable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageMaxHeight != null) __obj.updateDynamic("imageMaxHeight")(imageMaxHeight.asInstanceOf[js.Any])
    if (imageMaxWidth != null) __obj.updateDynamic("imageMaxWidth")(imageMaxWidth.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode)
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule)
    if (multidimensionalInfo != null) __obj.updateDynamic("multidimensionalInfo")(multidimensionalInfo)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pixelFilter != null) __obj.updateDynamic("pixelFilter")(pixelFilter)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (rasterAttributeTable != null) __obj.updateDynamic("rasterAttributeTable")(rasterAttributeTable)
    if (rasterAttributeTableFieldPrefix != null) __obj.updateDynamic("rasterAttributeTableFieldPrefix")(rasterAttributeTableFieldPrefix)
    if (rasterFields != null) __obj.updateDynamic("rasterFields")(rasterFields)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ImageryLayerProperties]
  }
}

