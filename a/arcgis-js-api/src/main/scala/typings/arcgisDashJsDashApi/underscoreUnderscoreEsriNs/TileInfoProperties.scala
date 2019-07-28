package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

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
    * Image format of the cached tiles.  **Possible Values:** png | png24 | png32 | jpg | dib | tiff | emf | ps | pdf | gif | svg | svgz | mixed | lerc
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TileInfo.html#format)
    */
  var format: js.UndefOr[String] = js.undefined
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
    dpi: Int | Double = null,
    format: String = null,
    isWrappable: js.UndefOr[Boolean] = js.undefined,
    lods: js.Array[LODProperties] = null,
    origin: PointProperties = null,
    size: js.Array[Double] = null,
    spatialReference: SpatialReferenceProperties = null
  ): TileInfoProperties = {
    val __obj = js.Dynamic.literal()
    if (dpi != null) __obj.updateDynamic("dpi")(dpi.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format)
    if (!js.isUndefined(isWrappable)) __obj.updateDynamic("isWrappable")(isWrappable)
    if (lods != null) __obj.updateDynamic("lods")(lods)
    if (origin != null) __obj.updateDynamic("origin")(origin)
    if (size != null) __obj.updateDynamic("size")(size)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[TileInfoProperties]
  }
}

