package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WMTSSublayerProperties extends js.Object {
  /**
    * Description for the WMTS sublayer. This defaults to the value of the Abstract property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#description)
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * The unique ID assigned to the sublayer. If not set by the developer, it is automatically generated when the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id)
    */
  var id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The map image format (MIME type) to request. Defaults to the first item in [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats). Must be one of the supported [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Supported image formats as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats)
    */
  var imageFormats: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * The [WMTSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#layer)
    */
  var layer: js.UndefOr[WMTSLayerProperties] = js.undefined
  /**
    * The [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html) to request. Defaults to the id of the first item in [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles). Should be one of the supported [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styleId)
    */
  var styleId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of supported [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)s as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles)
    */
  var styles: js.UndefOr[CollectionProperties[WMTSStyleProperties]] = js.undefined
  /**
    * The [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet)
    */
  var tileMatrixSet: js.UndefOr[TileMatrixSetProperties] = js.undefined
  /**
    * The id of the [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the id of the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSetId)
    */
  var tileMatrixSetId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * A collection of supported [TileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSets)
    */
  var tileMatrixSets: js.UndefOr[CollectionProperties[TileMatrixSetProperties]] = js.undefined
  /**
    * The title of the WMTS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This defaults to the value of the Title property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#title)
    */
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object WMTSSublayerProperties {
  @scala.inline
  def apply(
    description: java.lang.String = null,
    fullExtent: ExtentProperties = null,
    id: java.lang.String = null,
    imageFormat: java.lang.String = null,
    imageFormats: js.Array[java.lang.String] = null,
    layer: WMTSLayerProperties = null,
    styleId: java.lang.String = null,
    styles: CollectionProperties[WMTSStyleProperties] = null,
    tileMatrixSet: TileMatrixSetProperties = null,
    tileMatrixSetId: java.lang.String = null,
    tileMatrixSets: CollectionProperties[TileMatrixSetProperties] = null,
    title: java.lang.String = null
  ): WMTSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (fullExtent != null) __obj.updateDynamic("fullExtent")(fullExtent)
    if (id != null) __obj.updateDynamic("id")(id)
    if (imageFormat != null) __obj.updateDynamic("imageFormat")(imageFormat)
    if (imageFormats != null) __obj.updateDynamic("imageFormats")(imageFormats)
    if (layer != null) __obj.updateDynamic("layer")(layer)
    if (styleId != null) __obj.updateDynamic("styleId")(styleId)
    if (styles != null) __obj.updateDynamic("styles")(styles.asInstanceOf[js.Any])
    if (tileMatrixSet != null) __obj.updateDynamic("tileMatrixSet")(tileMatrixSet)
    if (tileMatrixSetId != null) __obj.updateDynamic("tileMatrixSetId")(tileMatrixSetId)
    if (tileMatrixSets != null) __obj.updateDynamic("tileMatrixSets")(tileMatrixSets.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[WMTSSublayerProperties]
  }
}

