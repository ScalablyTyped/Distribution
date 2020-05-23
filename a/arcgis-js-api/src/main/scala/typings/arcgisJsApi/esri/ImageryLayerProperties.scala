package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`hide-children`
import typings.arcgisJsApi.arcgisJsApiStrings.all
import typings.arcgisJsApi.arcgisJsApiStrings.any
import typings.arcgisJsApi.arcgisJsApiStrings.bilinear
import typings.arcgisJsApi.arcgisJsApiStrings.cubic
import typings.arcgisJsApi.arcgisJsApiStrings.f32
import typings.arcgisJsApi.arcgisJsApiStrings.f64
import typings.arcgisJsApi.arcgisJsApiStrings.hide
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.jpgpng
import typings.arcgisJsApi.arcgisJsApiStrings.lerc
import typings.arcgisJsApi.arcgisJsApiStrings.majority
import typings.arcgisJsApi.arcgisJsApiStrings.nearest
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.png24
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.png8
import typings.arcgisJsApi.arcgisJsApiStrings.s16
import typings.arcgisJsApi.arcgisJsApiStrings.s32
import typings.arcgisJsApi.arcgisJsApiStrings.s8
import typings.arcgisJsApi.arcgisJsApiStrings.show
import typings.arcgisJsApi.arcgisJsApiStrings.tiff
import typings.arcgisJsApi.arcgisJsApiStrings.u16
import typings.arcgisJsApi.arcgisJsApiStrings.u32
import typings.arcgisJsApi.arcgisJsApiStrings.u8
import typings.arcgisJsApi.arcgisJsApiStrings.unknown
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageryLayerProperties
  extends LayerProperties
     with ArcGISImageServiceProperties
     with PortalLayerProperties
     with RefreshableLayerProperties
     with ScaleRangeLayerProperties
     with TemporalLayerProperties {
  /**
    * Indicates whether the layer will be included in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * The popup template for the layer. When set on the layer, the popupTemplate allows users to access attributes and display their values using text and/or charts in the [view's popup](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-View.html#popup) when a pixel is clicked. See [this sample](https://developers.arcgis.com/javascript/latest/sample-code/layers-imagery-popup/index.html) for an example of how [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) interacts with an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html).  A default popup template is automatically used if no `popupTemplate` has been defined when [Popup.defaultPopupTemplateEnabled](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Popup.html#defaultPopupTemplateEnabled) is set to `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupTemplate)
    */
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
}

object ImageryLayerProperties {
  @scala.inline
  def apply(
    compressionQuality: js.UndefOr[Double] = js.undefined,
    compressionTolerance: js.UndefOr[Double] = js.undefined,
    copyright: String = null,
    definitionExpression: String = null,
    fields: js.Array[FieldProperties] = null,
    format: png | png8 | png24 | png32 | jpg | jpgpng | lerc | tiff = null,
    fullExtent: ExtentProperties = null,
    hasMultidimensions: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageMaxHeight: js.UndefOr[Double] = js.undefined,
    imageMaxWidth: js.UndefOr[Double] = js.undefined,
    interpolation: nearest | bilinear | cubic | majority = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    mosaicRule: MosaicRuleProperties = null,
    multidimensionalInfo: js.Any = null,
    noData: Double | js.Array[Double] = null,
    noDataInterpretation: any | all = null,
    objectIdField: String = null,
    opacity: js.UndefOr[Double] = js.undefined,
    pixelFilter: js.Function = null,
    pixelType: unknown | s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    rasterAttributeTableFieldPrefix: String = null,
    refreshInterval: js.UndefOr[Double] = js.undefined,
    renderer: RendererProperties = null,
    renderingRule: RasterFunctionProperties = null,
    sourceJSON: js.Any = null,
    timeExtent: TimeExtentProperties = null,
    timeInfo: TimeInfoProperties = null,
    timeOffset: TimeIntervalProperties = null,
    title: String = null,
    url: String = null,
    useViewTime: js.UndefOr[Boolean] = js.undefined,
    visible: js.UndefOr[Boolean] = js.undefined
  ): ImageryLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(compressionQuality)) __obj.updateDynamic("compressionQuality")(compressionQuality.get.asInstanceOf[js.Any])
    if (!js.isUndefined(compressionTolerance)) __obj.updateDynamic("compressionTolerance")(compressionTolerance.get.asInstanceOf[js.Any])
    if (copyright != null) __obj.updateDynamic("copyright")(copyright.asInstanceOf[js.Any])
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression.asInstanceOf[js.Any])
    if (fields != null) __obj.updateDynamic("fields")(fields.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (!js.isUndefined(hasMultidimensions)) __obj.updateDynamic("hasMultidimensions")(hasMultidimensions.get.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (!js.isUndefined(imageMaxHeight)) __obj.updateDynamic("imageMaxHeight")(imageMaxHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(imageMaxWidth)) __obj.updateDynamic("imageMaxWidth")(imageMaxWidth.get.asInstanceOf[js.Any])
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled.get.asInstanceOf[js.Any])
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule.asInstanceOf[js.Any])
    if (multidimensionalInfo != null) __obj.updateDynamic("multidimensionalInfo")(multidimensionalInfo.asInstanceOf[js.Any])
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (noDataInterpretation != null) __obj.updateDynamic("noDataInterpretation")(noDataInterpretation.asInstanceOf[js.Any])
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField.asInstanceOf[js.Any])
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    if (pixelFilter != null) __obj.updateDynamic("pixelFilter")(pixelFilter.asInstanceOf[js.Any])
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.get.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem.asInstanceOf[js.Any])
    if (rasterAttributeTableFieldPrefix != null) __obj.updateDynamic("rasterAttributeTableFieldPrefix")(rasterAttributeTableFieldPrefix.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshInterval)) __obj.updateDynamic("refreshInterval")(refreshInterval.get.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer.asInstanceOf[js.Any])
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule.asInstanceOf[js.Any])
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON.asInstanceOf[js.Any])
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent.asInstanceOf[js.Any])
    if (timeInfo != null) __obj.updateDynamic("timeInfo")(timeInfo.asInstanceOf[js.Any])
    if (timeOffset != null) __obj.updateDynamic("timeOffset")(timeOffset.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (!js.isUndefined(useViewTime)) __obj.updateDynamic("useViewTime")(useViewTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageryLayerProperties]
  }
}

