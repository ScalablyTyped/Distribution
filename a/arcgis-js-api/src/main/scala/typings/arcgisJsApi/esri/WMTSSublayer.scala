package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WMTSSublayer
  extends Accessor
     with JSONSupport {
  /**
    * Description for the WMTS sublayer. This defaults to the value of the Abstract property from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#description)
    */
  var description: String = js.native
  /**
    * The full extent of the layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#fullExtent)
    */
  var fullExtent: Extent = js.native
  /**
    * The unique ID assigned to the sublayer. If not set by the developer, it is automatically generated when the layer is loaded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#id)
    */
  var id: String = js.native
  /**
    * The map image format (MIME type) to request. Defaults to the first item in [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats). Must be one of the supported [imageFormats](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormat)
    */
  var imageFormat: String = js.native
  /**
    * Supported image formats as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#imageFormats)
    */
  var imageFormats: js.Array[String] = js.native
  /**
    * The [WMTSLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WMTSLayer.html) to which the sublayer belongs.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#layer)
    */
  var layer: WMTSLayer = js.native
  /**
    * The [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html) to request. Defaults to the id of the first item in [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles). Should be one of the supported [styles](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styleId)
    */
  var styleId: String = js.native
  /**
    * A collection of supported [WMTSStyle](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html)s as retrieved from the GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#styles)
    */
  var styles: Collection[WMTSStyle] = js.native
  /**
    * The [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet)
    */
  var tileMatrixSet: TileMatrixSet = js.native
  /**
    * The id of the [TileMatrixSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html) to request. Defaults to the id of the first item in [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet) that matches the spatialReference of the view. Must be one of the supported [tileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSet).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSetId)
    */
  var tileMatrixSetId: String = js.native
  /**
    * A collection of supported [TileMatrixSets](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileMatrixSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#tileMatrixSets)
    */
  var tileMatrixSets: Collection[TileMatrixSet] = js.native
  /**
    * The title of the WMTS sublayer used to identify it in places such as the [LayerList](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LayerList.html) and [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widgets. This defaults to the value of the Title property from the WMTS GetCapabilities request.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSSublayer.html#title)
    */
  var title: String = js.native
}

