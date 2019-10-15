package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageServiceIdentifyParametersProperties extends js.Object {
  /**
    * Input geometry that defines the location to be identified. The location can be a point or a polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#geometry)
    */
  var geometry: js.UndefOr[PointProperties | PolygonProperties] = js.undefined
  /**
    * Controls the maximum number of returned catalog items, set to 1 to return the top most raster only.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#maxItemCount)
    */
  var maxItemCount: js.UndefOr[Double] = js.undefined
  /**
    * Specifies the mosaic rules defining the image sorting order. When a mosaic rule is not specified, `center` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  /**
    * Specifies the pixel level being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[PointProperties] = js.undefined
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * An array the [rendering rules](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule) to retrieve multiple processed pixel values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRules)
    */
  var renderingRules: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * If `true`, returns both geometry and attributes of the catalog items. Set to `false` when catalog items are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    */
  var returnCatalogItems: js.UndefOr[Boolean] = js.undefined
  /**
    * When `true`, each feature in the catalog items includes the geometry. Set to `false` to not display the features on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[Boolean] = js.undefined
  /**
    * If `true`, the pixel values of all raster catalog items under the requested geometry. Set to `false` when catalog item values are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnPixelValues)
    */
  var returnPixelValues: js.UndefOr[Boolean] = js.undefined
  /**
    * A time extent for a temporal data against [time-aware imagery layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#timeInfo). For example, it can be used to discover land cover changes by decade.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#timeExtent)
    */
  var timeExtent: js.UndefOr[TimeExtentProperties] = js.undefined
}

object ImageServiceIdentifyParametersProperties {
  @scala.inline
  def apply(
    geometry: PointProperties | PolygonProperties = null,
    maxItemCount: Int | Double = null,
    mosaicRule: MosaicRuleProperties = null,
    pixelSize: PointProperties = null,
    renderingRule: RasterFunctionProperties = null,
    renderingRules: RasterFunctionProperties = null,
    returnCatalogItems: js.UndefOr[Boolean] = js.undefined,
    returnGeometry: js.UndefOr[Boolean] = js.undefined,
    returnPixelValues: js.UndefOr[Boolean] = js.undefined,
    timeExtent: TimeExtentProperties = null
  ): ImageServiceIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (maxItemCount != null) __obj.updateDynamic("maxItemCount")(maxItemCount.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule)
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize)
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule)
    if (renderingRules != null) __obj.updateDynamic("renderingRules")(renderingRules)
    if (!js.isUndefined(returnCatalogItems)) __obj.updateDynamic("returnCatalogItems")(returnCatalogItems)
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry)
    if (!js.isUndefined(returnPixelValues)) __obj.updateDynamic("returnPixelValues")(returnPixelValues)
    if (timeExtent != null) __obj.updateDynamic("timeExtent")(timeExtent)
    __obj.asInstanceOf[ImageServiceIdentifyParametersProperties]
  }
}

