package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMSSublayerProperties extends js.Object {
  /**
    * Description for the WMS sublayer. This defaults to the value of the Abstract property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The id for the WMS sublayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#id)
    */
  var id: js.UndefOr[Double] = js.undefined
  /**
    * The [WMSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#layer)
    */
  var layer: js.UndefOr[WMSLayerProperties] = js.undefined
  /**
    * Indicates whether the layer will be included in the legend. When `false`, the layer will be excluded from the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#legendEnabled)
    *
    * @default true
    */
  var legendEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * A string url pointing to a legend image for the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#legendUrl)
    */
  var legendUrl: js.UndefOr[String] = js.undefined
  /**
    * The maximum scale (most zoomed in) at which the layer is visible in the view. If the map is zoomed in beyond this scale, the layer will not be visible. A value of zero means the layer does not have a maximum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The minimum scale (most zoomed out) at which the layer is visible in the view. If the map is zoomed out beyond this scale, the layer will not be visible. A value of zero means the layer does not have a minimum scale.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * Name of the WMS sublayer. This defaults to the value of the Name property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#name)
    */
  var name: js.UndefOr[String] = js.undefined
  /**
    * Indicates whether to display popups when features in the layer are clicked.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#popupEnabled)
    *
    * @default false
    */
  var popupEnabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicates if the layer can be queried, i.e. the service supports GetFeatureInfo with either text/html or text/plain formats.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#queryable)
    *
    * @default false
    */
  var queryable: js.UndefOr[Boolean] = js.undefined
  /**
    * List of spatialReferences (WKID) derived from the CRS elements of the first layer in the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#spatialReferences)
    */
  var spatialReferences: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * A collection of [WMSSublayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html)s.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#sublayers)
    */
  var sublayers: js.UndefOr[CollectionProperties[WMSSublayerProperties]] = js.undefined
  /**
    * The title of the WMS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This defaults to the value of the Title property from the WMS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#title)
    */
  var title: js.UndefOr[String] = js.undefined
  /**
    * Indicates if the layer is visible in the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMSSublayer.html#visible)
    */
  var visible: js.UndefOr[Boolean] = js.undefined
}

object WMSSublayerProperties {
  @scala.inline
  def apply(
    description: String = null,
    fullExtent: ExtentProperties = null,
    id: js.UndefOr[Double] = js.undefined,
    layer: WMSLayerProperties = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    legendUrl: String = null,
    maxScale: js.UndefOr[Double] = js.undefined,
    minScale: js.UndefOr[Double] = js.undefined,
    name: String = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    queryable: js.UndefOr[Boolean] = js.undefined,
    spatialReferences: js.Array[Double] = null,
    sublayers: CollectionProperties[WMSSublayerProperties] = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WMSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent.asInstanceOf[js.Any])
    if (!js.isUndefined(id)) __obj.updateDynamic("id")(id.get.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer.asInstanceOf[js.Any])
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled.get.asInstanceOf[js.Any])
    if (legendUrl != null) __obj.updateDynamic("legendUrl")(legendUrl.asInstanceOf[js.Any])
    if (!js.isUndefined(maxScale)) __obj.updateDynamic("maxScale")(maxScale.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minScale)) __obj.updateDynamic("minScale")(minScale.get.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(queryable)) __obj.updateDynamic("queryable")(queryable.get.asInstanceOf[js.Any])
    if (spatialReferences != null) __obj.updateDynamic("spatialReferences")(spatialReferences.asInstanceOf[js.Any])
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[WMSSublayerProperties]
  }
}

