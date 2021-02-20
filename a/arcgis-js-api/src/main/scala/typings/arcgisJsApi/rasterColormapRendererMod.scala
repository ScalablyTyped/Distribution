package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterColormapRenderer
import typings.arcgisJsApi.esri.RasterColormapRendererConstructor
import typings.arcgisJsApi.esri.RasterColormapRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterColormapRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterColormapRenderer", JSImport.Namespace)
  @js.native
  val ^ : RasterColormapRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterColormapRenderer", JSImport.Namespace)
  @js.native
  /**
    * The RasterColormapRenderer defines the symbology to display raster data based on specific colors, aiding in visual analysis of the data.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterColormapRenderer.html)
    */
  class Class () extends RasterColormapRenderer {
    def this(properties: RasterColormapRendererProperties) = this()
  }
  
  type _To = RasterColormapRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterColormapRendererMod.foo` */
  override def _to: RasterColormapRendererConstructor = ^
}
