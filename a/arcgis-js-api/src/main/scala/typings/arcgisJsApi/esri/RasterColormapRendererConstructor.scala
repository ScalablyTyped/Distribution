package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RasterColormapRendererConstructor
  extends /**
  * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data. For example, a forestry commission may want to quickly visualize areas above and below the treeline occurring at a known elevation on a raster containing elevation values. They could overlay a transparent colormap set to color those areas below the treeline elevation green, and those above white.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
  */
Instantiable0[RasterColormapRenderer]
     with Instantiable1[/* properties */ RasterColormapRendererProperties, RasterColormapRenderer] {
  /**
    * Creates a new instance [RasterColormapRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html) from an array of color maps where pixel values with its corresponding RGB color values specified.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html#createFromColormap)
    *
    * @param colormap RGB color representation of pixel values. Each item in the colormap array has an array of the pixel value and red, green, and blue values.
    *
    */
  def createFromColormap(colormap: js.Array[js.Array[Double]]): RasterColormapRenderer = js.native
  def fromJSON(json: js.Any): RasterColormapRenderer = js.native
}

