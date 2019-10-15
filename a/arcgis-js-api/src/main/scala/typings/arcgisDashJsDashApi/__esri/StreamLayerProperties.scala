package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`hide-children`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.hide
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.mesh
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipatch
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.multipoint
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.point
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polygon
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.polyline
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.show
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StreamLayerProperties extends FeatureLayerProperties {
  /**
    * An extent object used to filter features. Only features intersecting the extent are displayed in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#geometryDefinition)
    */
  var geometryDefinition: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Maximum number of features to show per [trackId](https://enterprise.arcgis.com/en/geoevent/latest/get-started/essential-geoevent-server-vocabulary.htm#ESRI_SECTION1_F45BBCE9ADFA4E57AF38DD225921EFCD). If `trackId` is not configured on the GeoEvent Service, the `maximumTrackPoints` property will have no effect and an error will be logged in the console.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#maximumTrackPoints)
    */
  var maximumTrackPoints: js.UndefOr[Double] = js.undefined
  /**
    * Options for purging stale features. Use these options to avoid overloading the browser with graphics.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-StreamLayer.html#purgeOptions)
    */
  var purgeOptions: js.UndefOr[StreamLayerPurgeOptions] = js.undefined
}

object StreamLayerProperties {
  @scala.inline
  def apply(
    copyright: String = null,
    definitionExpression: String = null,
    displayField: String = null,
    dynamicDataSource: DynamicMapLayer | DynamicDataLayer = null,
    elevationInfo: FeatureLayerElevationInfo = null,
    featureReduction: FeatureLayerFeatureReduction = null,
    fields: js.Array[FieldProperties] = null,
    fullExtent: ExtentProperties = null,
    geometryDefinition: ExtentProperties = null,
    geometryType: point | multipoint | polyline | polygon | multipatch | mesh = null,
    historicMoment: DateProperties = null,
    id: String = null,
    isTable: js.UndefOr[Boolean] = js.undefined,
    labelingInfo: js.Array[LabelClassProperties] = null,
    labelsVisible: js.UndefOr[Boolean] = js.undefined,
    layerId: Int | Double = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    listMode: show | hide | `hide-children` = null,
    maxScale: Int | Double = null,
    maximumTrackPoints: Int | Double = null,
    minScale: Int | Double = null,
    objectIdField: String = null,
    opacity: Int | Double = null,
    outFields: js.Array[String] = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    popupTemplate: PopupTemplateProperties = null,
    portalItem: PortalItemProperties = null,
    purgeOptions: StreamLayerPurgeOptions = null,
    refreshInterval: Int | Double = null,
    renderer: RendererProperties = null,
    returnM: js.UndefOr[Boolean] = js.undefined,
    returnZ: js.UndefOr[Boolean] = js.undefined,
    screenSizePerspectiveEnabled: js.UndefOr[Boolean] = js.undefined,
    source: CollectionProperties[GraphicProperties] = null,
    sourceJSON: js.Any = null,
    spatialReference: SpatialReferenceProperties = null,
    templates: js.Array[FeatureTemplateProperties] = null,
    timeInfo: TimeInfoProperties = null,
    title: String = null,
    typeIdField: String = null,
    types: js.Array[FeatureTypeProperties] = null,
    url: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): StreamLayerProperties = {
    val __obj = js.Dynamic.literal()
    if (copyright != null) __obj.updateDynamic("copyright")(copyright)
    if (definitionExpression != null) __obj.updateDynamic("definitionExpression")(definitionExpression)
    if (displayField != null) __obj.updateDynamic("displayField")(displayField)
    if (dynamicDataSource != null) __obj.updateDynamic("dynamicDataSource")(dynamicDataSource.asInstanceOf[js.Any])
    if (elevationInfo != null) __obj.updateDynamic("elevationInfo")(elevationInfo)
    if (featureReduction != null) __obj.updateDynamic("featureReduction")(featureReduction)
    if (fields != null) __obj.updateDynamic("fields")(fields)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (geometryDefinition != null) __obj.updateDynamic("geometryDefinition")(geometryDefinition)
    if (geometryType != null) __obj.updateDynamic("geometryType")(geometryType.asInstanceOf[js.Any])
    if (historicMoment != null) __obj.updateDynamic("historicMoment")(historicMoment.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id)
    if (!js.isUndefined(isTable)) __obj.updateDynamic("isTable")(isTable)
    if (labelingInfo != null) __obj.updateDynamic("labelingInfo")(labelingInfo)
    if (!js.isUndefined(labelsVisible)) __obj.updateDynamic("labelsVisible")(labelsVisible)
    if (layerId != null) __obj.updateDynamic("layerId")(layerId.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (listMode != null) __obj.updateDynamic("listMode")(listMode.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (maximumTrackPoints != null) __obj.updateDynamic("maximumTrackPoints")(maximumTrackPoints.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (objectIdField != null) __obj.updateDynamic("objectIdField")(objectIdField)
    if (opacity != null) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    if (outFields != null) __obj.updateDynamic("outFields")(outFields)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate)
    if (portalItem != null) __obj.updateDynamic("portalItem")(portalItem)
    if (purgeOptions != null) __obj.updateDynamic("purgeOptions")(purgeOptions)
    if (refreshInterval != null) __obj.updateDynamic("refreshInterval")(refreshInterval.asInstanceOf[js.Any])
    if (renderer != null) __obj.updateDynamic("renderer")(renderer)
    if (!js.isUndefined(returnM)) __obj.updateDynamic("returnM")(returnM)
    if (!js.isUndefined(returnZ)) __obj.updateDynamic("returnZ")(returnZ)
    if (!js.isUndefined(screenSizePerspectiveEnabled)) __obj.updateDynamic("screenSizePerspectiveEnabled")(screenSizePerspectiveEnabled)
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    if (sourceJSON != null) __obj.updateDynamic("sourceJSON")(sourceJSON)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    if (templates != null) __obj.updateDynamic("templates")(templates)
    if (timeInfo != null) __obj.updateDynamic("timeInfo")(timeInfo)
    if (title != null) __obj.updateDynamic("title")(title)
    if (typeIdField != null) __obj.updateDynamic("typeIdField")(typeIdField)
    if (types != null) __obj.updateDynamic("types")(types)
    if (url != null) __obj.updateDynamic("url")(url)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[StreamLayerProperties]
  }
}

