package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
    id: Int | Double = null,
    layer: WMSLayerProperties = null,
    legendEnabled: js.UndefOr[Boolean] = js.undefined,
    legendUrl: String = null,
    name: String = null,
    popupEnabled: js.UndefOr[Boolean] = js.undefined,
    queryable: js.UndefOr[Boolean] = js.undefined,
    spatialReferences: js.Array[Double] = null,
    sublayers: CollectionProperties[WMSSublayerProperties] = null,
    title: String = null,
    visible: js.UndefOr[Boolean] = js.undefined
  ): WMSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (!js.isUndefined(legendEnabled)) __obj.updateDynamic("legendEnabled")(legendEnabled)
    if (legendUrl != null) __obj.updateDynamic("legendUrl")(legendUrl)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(popupEnabled)) __obj.updateDynamic("popupEnabled")(popupEnabled)
    if (!js.isUndefined(queryable)) __obj.updateDynamic("queryable")(queryable)
    if (spatialReferences != null) __obj.updateDynamic("spatialReferences")(spatialReferences)
    if (sublayers != null) __obj.updateDynamic("sublayers")(sublayers.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible)
    __obj.asInstanceOf[WMSSublayerProperties]
  }
}

