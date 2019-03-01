package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ImageParametersProperties extends js.Object {
  /**
    * Dots per inch setting for an module:esri/layersMapImageLayer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#dpi)
    *
    * @default 96
    */
  var dpi: js.UndefOr[scala.Double] = js.undefined
  /**
    * Extent of map to be exported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#extent)
    */
  var extent: js.UndefOr[ExtentProperties] = js.undefined
  /**
    * Map image format.  **Possible Values:** png | png8 | png24 | png32 | jpg | pdf | bmp | gif | svg
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#format)
    *
    * @default png8
    */
  var format: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Requested image height in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#height)
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Spatial reference of exported map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#imageSpatialReference)
    */
  var imageSpatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  /**
    * Array of layer definition expressions that allows you to filter the features of individual layers in the exported map image. Layer definitions with semicolons or colons are supported if using a map service published using ArcGIS Server 10 or later.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerDefinitions)
    */
  var layerDefinitions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * A list of layer IDs, that represent which layers to include in the exported map. Use in combination with [layerOption](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption) to specify how layer visibility is handled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerIds)
    */
  var layerIds: js.UndefOr[js.Array[scala.Double]] = js.undefined
  /**
    * The option for displaying or hiding the layer.  **Possible Values:** show | hide | include | exclude
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#layerOption)
    */
  var layerOption: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Indicates whether or not the background of the dynamic image is transparent.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#transparent)
    *
    * @default true
    */
  var transparent: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Requested image width in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageParameters.html#width)
    */
  var width: js.UndefOr[scala.Double] = js.undefined
}

object ImageParametersProperties {
  @scala.inline
  def apply(
    dpi: scala.Int | scala.Double = null,
    extent: ExtentProperties = null,
    format: java.lang.String = null,
    height: scala.Int | scala.Double = null,
    imageSpatialReference: SpatialReferenceProperties = null,
    layerDefinitions: js.Array[java.lang.String] = null,
    layerIds: js.Array[scala.Double] = null,
    layerOption: java.lang.String = null,
    transparent: js.UndefOr[scala.Boolean] = js.undefined,
    width: scala.Int | scala.Double = null
  ): ImageParametersProperties = {
    val __obj = js.Dynamic.literal()
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (extent != null) __obj.updateDynamic("extent")(extent)
    if (format != null) __obj.updateDynamic("format")(format)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (imageSpatialReference != null) __obj.updateDynamic("imageSpatialReference")(imageSpatialReference)
    if (layerDefinitions != null) __obj.updateDynamic("layerDefinitions")(layerDefinitions)
    if (layerIds != null) __obj.updateDynamic("layerIds")(layerIds)
    if (layerOption != null) __obj.updateDynamic("layerOption")(layerOption)
    if (!js.isUndefined(transparent)) __obj.updateDynamic("transparent")(transparent)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImageParametersProperties]
  }
}

