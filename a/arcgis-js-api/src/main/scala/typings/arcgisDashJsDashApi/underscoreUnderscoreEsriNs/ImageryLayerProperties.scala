package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.f64
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.s8
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u16
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u32
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.u8
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
    compressionQuality: Int | Double = null,
    compressionTolerance: Int | Double = null,
    copyright: String = null,
    definitionExpression: String = null,
    domainFields: js.Array[FieldProperties] = null,
    fields: js.Array[FieldProperties] = null,
    format: String = null,
    fullExtent: ExtentProperties = null,
    hasMultidimensions: js.UndefOr[Boolean] = js.undefined,
    hasRasterAttributeTable: js.UndefOr[Boolean] = js.undefined,
    id: String = null,
    imageMaxHeight: Int | Double = null,
    imageMaxWidth: Int | Double = null,
    interpolation: String = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    mosaicRule: MosaicRuleProperties = null,
    multidimensionalInfo: js.Any = null,
    noData: Double | js.Array[Double] = null,
    noDataInterpretation: String = null,
    objectIdField: String = null,
    opacity: Int | Double = null,
    pixelFilter: js.Function = null,
    pixelType: s8 | s16 | s32 | u8 | u16 | u32 | f32 | f64 = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    rasterAttributeTable: js.Any = null,
    rasterAttributeTableFieldPrefix: String = null,
    refreshInterval: Int | Double = null,
    renderer: RendererProperties = null,
    renderingRule: RasterFunctionProperties = null,
    timeInfo: TimeInfoProperties = null,
    title: String = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
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
    if (interpolation != null) __obj.updateDynamic("interpolation")(interpolation)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule)
    if (multidimensionalInfo != null) __obj.updateDynamic("multidimensionalInfo")(multidimensionalInfo)
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (noDataInterpretation != null) __obj.updateDynamic("noDataInterpretation")(noDataInterpretation)
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (pixelFilter != null) __obj.updateDynamic("pixelFilter")(pixelFilter)
    if (pixelType != null) __obj.updateDynamic("pixelType")(pixelType.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (rasterAttributeTable != null) __obj.updateDynamic("rasterAttributeTable")(rasterAttributeTable)
    if (rasterAttributeTableFieldPrefix != null) __obj.updateDynamic("rasterAttributeTableFieldPrefix")(rasterAttributeTableFieldPrefix)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule)
    if (timeInfo != null) __obj.updateDynamic("timeInfo")(timeInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[ImageryLayerProperties]
  }
}

