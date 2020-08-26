package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSSublayerProperties extends js.Object {
  /**
    * Description for the WMTS sublayer. This defaults to the value of the Abstract property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#fullExtent)
    */
  var fullExtent: js.UndefOr[ExtentProperties] = js.native
  /**
    * The unique ID assigned to the sublayer. If not set by the developer, it is automatically generated when the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id)
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The map image format (MIME type) to request. Defaults to the first item in [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats). Must be one of the supported [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormat)
    */
  var imageFormat: js.UndefOr[String] = js.native
  /**
    * Supported image formats as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats)
    */
  var imageFormats: js.UndefOr[js.Array[String]] = js.native
  /**
    * The [WMTSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#layer)
    */
  var layer: js.UndefOr[WMTSLayerProperties] = js.native
  /**
    * The [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html) to request. Defaults to the id of the first item in [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles). Should be one of the supported [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styleId)
    */
  var styleId: js.UndefOr[String] = js.native
  /**
    * A collection of supported [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)s as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles)
    */
  var styles: js.UndefOr[CollectionProperties[WMTSStyleProperties]] = js.native
  /**
    * The [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet)
    */
  var tileMatrixSet: js.UndefOr[TileMatrixSetProperties] = js.native
  /**
    * The id of the [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the id of the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSetId)
    */
  var tileMatrixSetId: js.UndefOr[String] = js.native
  /**
    * A collection of supported [TileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSets)
    */
  var tileMatrixSets: js.UndefOr[CollectionProperties[TileMatrixSetProperties]] = js.native
  /**
    * The title of the WMTS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This defaults to the value of the Title property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object WMTSSublayerProperties {
  @scala.inline
  def apply(): WMTSSublayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSSublayerProperties]
  }
  @scala.inline
  implicit class WMTSSublayerPropertiesOps[Self <: WMTSSublayerProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setFullExtent(value: ExtentProperties): Self = this.set("fullExtent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullExtent: Self = this.set("fullExtent", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setImageFormat(value: String): Self = this.set("imageFormat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageFormat: Self = this.set("imageFormat", js.undefined)
    @scala.inline
    def setImageFormatsVarargs(value: String*): Self = this.set("imageFormats", js.Array(value :_*))
    @scala.inline
    def setImageFormats(value: js.Array[String]): Self = this.set("imageFormats", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageFormats: Self = this.set("imageFormats", js.undefined)
    @scala.inline
    def setLayer(value: WMTSLayerProperties): Self = this.set("layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("layer", js.undefined)
    @scala.inline
    def setStyleId(value: String): Self = this.set("styleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyleId: Self = this.set("styleId", js.undefined)
    @scala.inline
    def setStylesVarargs(value: WMTSStyleProperties*): Self = this.set("styles", js.Array(value :_*))
    @scala.inline
    def setStyles(value: CollectionProperties[WMTSStyleProperties]): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
    @scala.inline
    def setTileMatrixSet(value: TileMatrixSetProperties): Self = this.set("tileMatrixSet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileMatrixSet: Self = this.set("tileMatrixSet", js.undefined)
    @scala.inline
    def setTileMatrixSetId(value: String): Self = this.set("tileMatrixSetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileMatrixSetId: Self = this.set("tileMatrixSetId", js.undefined)
    @scala.inline
    def setTileMatrixSetsVarargs(value: TileMatrixSetProperties*): Self = this.set("tileMatrixSets", js.Array(value :_*))
    @scala.inline
    def setTileMatrixSets(value: CollectionProperties[TileMatrixSetProperties]): Self = this.set("tileMatrixSets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTileMatrixSets: Self = this.set("tileMatrixSets", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

