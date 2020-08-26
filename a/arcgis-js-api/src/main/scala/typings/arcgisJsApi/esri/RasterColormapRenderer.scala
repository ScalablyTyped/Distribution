package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`raster-colormap`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterColormapRenderer
  extends Accessor
     with JSONSupport {
  /**
    * A colormap info array containing mappings for pixel and RGB color values. Colormaps contain a set of values that are associated with colors and pixel values, and are used to display a single-band raster consistently with the same colors.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#colormapInfos)
    */
  var colormapInfos: js.Array[ColormapInfo] = js.native
  /**
    * The type of Renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#type)
    */
  val `type`: `raster-colormap` = js.native
}

