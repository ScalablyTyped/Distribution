package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.dib
import typings.arcgisJsApi.arcgisJsApiStrings.emf
import typings.arcgisJsApi.arcgisJsApiStrings.gif
import typings.arcgisJsApi.arcgisJsApiStrings.jpg
import typings.arcgisJsApi.arcgisJsApiStrings.lerc
import typings.arcgisJsApi.arcgisJsApiStrings.mixed
import typings.arcgisJsApi.arcgisJsApiStrings.pdf
import typings.arcgisJsApi.arcgisJsApiStrings.png
import typings.arcgisJsApi.arcgisJsApiStrings.png24
import typings.arcgisJsApi.arcgisJsApiStrings.png32
import typings.arcgisJsApi.arcgisJsApiStrings.ps
import typings.arcgisJsApi.arcgisJsApiStrings.svg
import typings.arcgisJsApi.arcgisJsApiStrings.svgz
import typings.arcgisJsApi.arcgisJsApiStrings.tiff
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TileInfoProperties extends js.Object {
  /**
    * The dots per inch (DPI) of the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#dpi)
    */
  var dpi: js.UndefOr[Double] = js.undefined
  /**
    * Image format of the cached tiles.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: js.UndefOr[
    png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc
  ] = js.undefined
  /**
    * Indicates if the tiling scheme supports wrap around.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#isWrappable)
    */
  var isWrappable: js.UndefOr[Boolean] = js.undefined
  /**
    * An array of levels of detail that define the tiling scheme.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#lods)
    */
  var lods: js.UndefOr[js.Array[LODProperties]] = js.undefined
  /**
    * The tiling scheme origin.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#origin)
    */
  var origin: js.UndefOr[PointProperties] = js.undefined
  /**
    * Size of tiles in pixels.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#size)
    */
  var size: js.UndefOr[js.Array[Double]] = js.undefined
  /**
    * The spatial reference of the tiling schema.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#spatialReference)
    */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
}

object TileInfoProperties {
  @scala.inline
  def apply(
    dpi: js.UndefOr[Double] = js.undefined,
    format: png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc = null,
    isWrappable: js.UndefOr[Boolean] = js.undefined,
    lods: js.Array[LODProperties] = null,
    origin: PointProperties = null,
    size: js.Array[Double] = null,
    spatialReference: SpatialReferenceProperties = null
  ): TileInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dpi)) __obj.updateDynamic("dpi")(dpi.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (!js.isUndefined(isWrappable)) __obj.updateDynamic("isWrappable")(isWrappable.get.asInstanceOf[js.Any])
    if (lods != null) __obj.updateDynamic("lods")(lods.asInstanceOf[js.Any])
    if (origin != null) __obj.updateDynamic("origin")(origin.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference.asInstanceOf[js.Any])
    __obj.asInstanceOf[TileInfoProperties]
  }
}

