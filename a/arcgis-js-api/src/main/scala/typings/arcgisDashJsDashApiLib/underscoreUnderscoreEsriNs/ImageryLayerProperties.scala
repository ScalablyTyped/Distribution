package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
  var legendEnabled: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: js.UndefOr[scala.Boolean] = js.undefined
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
    interpolation: java.lang.String = null,
    legendEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    listMode: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.show | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.hide | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.`hide-children` = null,
    maxScale: scala.Int | scala.Double = null,
    minScale: scala.Int | scala.Double = null,
    mosaicRule: MosaicRuleProperties = null,
    multidimensionalInfo: js.Any = null,
    noData: scala.Double | js.Array[scala.Double] = null,
    noDataInterpretation: java.lang.String = null,
    objectIdField: java.lang.String = null,
    opacity: scala.Int | scala.Double = null,
    pixelFilter: js.Function = null,
    pixelType: arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.s8 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.s16 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.s32 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.u8 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.u16 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.u32 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.f32 | arcgisDashJsDashApiLib.arcgisDashJsDashApiLibStrings.f64 = null,
    popupEnabled: js.UndefOr[scala.Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    rasterAttributeTable: js.Any = null,
    rasterAttributeTableFieldPrefix: java.lang.String = null,
    refreshInterval: scala.Int | scala.Double = null,
    renderer: RendererProperties = null,
    renderingRule: RasterFunctionProperties = null,
    timeInfo: TimeInfoProperties = null,
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

