package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`raster-colormap`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RasterColormapRenderer
  extends Accessor
     with JSONSupport {
  
  /**
    * A colormap info array containing mappings for pixel and RGB color values.
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
