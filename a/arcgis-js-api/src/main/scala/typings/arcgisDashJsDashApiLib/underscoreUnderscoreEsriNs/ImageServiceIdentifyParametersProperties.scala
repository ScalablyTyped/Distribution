package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

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
    * Specifies the mosaic rules defining the image sorting order. When a mosaic rule is not specified, `center` is used.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#mosaicRule)
    */
  var mosaicRule: js.UndefOr[MosaicRuleProperties] = js.undefined
  /**
    * The pixel or RGB color value representing no information. It can be defined as a number `noData = 0` representing a pixel value or as a string `noData = "58,128,187"` representing an RGB color value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#noData)
    */
  var noData: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /**
    * Specifies the pixel level being identified on the x and y axis. Defaults to the base resolution of the dataset when not specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSize)
    */
  var pixelSize: js.UndefOr[SymbolProperties] = js.undefined
  /**
    * The pixel level being identified (or the resolution being looked at) on the x-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeX)
    */
  var pixelSizeX: js.UndefOr[scala.Double] = js.undefined
  /**
    * The pixel level being identified (or the resolution being looked at) on the y-axis. If not specified, it will default to the base resolution of the dataset.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#pixelSizeY)
    */
  var pixelSizeY: js.UndefOr[scala.Double] = js.undefined
  /**
    * Specifies the rendering rule for how the requested image should be rendered.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#renderingRule)
    */
  var renderingRule: js.UndefOr[RasterFunctionProperties] = js.undefined
  /**
    * If `true`, returns both geometry and attributes of the catalog items. Set to `false` when catalog items are not needed to significantly improve identify operation's performance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnCatalogItems)
    *
    * @default true
    */
  var returnCatalogItems: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * When `true`, each feature in the catalog items includes the geometry. Set to `false` to not display the features on the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-ImageServiceIdentifyParameters.html#returnGeometry)
    *
    * @default false
    */
  var returnGeometry: js.UndefOr[scala.Boolean] = js.undefined
}

object ImageServiceIdentifyParametersProperties {
  @scala.inline
  def apply(
    geometry: PointProperties | PolygonProperties = null,
    mosaicRule: MosaicRuleProperties = null,
    noData: java.lang.String | scala.Double = null,
    pixelSize: SymbolProperties = null,
    pixelSizeX: scala.Int | scala.Double = null,
    pixelSizeY: scala.Int | scala.Double = null,
    renderingRule: RasterFunctionProperties = null,
    returnCatalogItems: js.UndefOr[scala.Boolean] = js.undefined,
    returnGeometry: js.UndefOr[scala.Boolean] = js.undefined
  ): ImageServiceIdentifyParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (geometry != null) __obj.updateDynamic("geometry")(geometry.asInstanceOf[js.Any])
    if (mosaicRule != null) __obj.updateDynamic("mosaicRule")(mosaicRule)
    if (noData != null) __obj.updateDynamic("noData")(noData.asInstanceOf[js.Any])
    if (pixelSize != null) __obj.updateDynamic("pixelSize")(pixelSize)
    if (pixelSizeX != null) __obj.updateDynamic("pixelSizeX")(pixelSizeX.asInstanceOf[js.Any])
    if (pixelSizeY != null) __obj.updateDynamic("pixelSizeY")(pixelSizeY.asInstanceOf[js.Any])
    if (renderingRule != null) __obj.updateDynamic("renderingRule")(renderingRule)
    if (!js.isUndefined(returnCatalogItems)) __obj.updateDynamic("returnCatalogItems")(returnCatalogItems)
    if (!js.isUndefined(returnGeometry)) __obj.updateDynamic("returnGeometry")(returnGeometry)
    __obj.asInstanceOf[ImageServiceIdentifyParametersProperties]
  }
}

