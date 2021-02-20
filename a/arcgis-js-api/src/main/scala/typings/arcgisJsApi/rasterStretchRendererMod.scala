package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterStretchRenderer
import typings.arcgisJsApi.esri.RasterStretchRendererConstructor
import typings.arcgisJsApi.esri.RasterStretchRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterStretchRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterStretchRenderer", JSImport.Namespace)
  @js.native
  val ^ : RasterStretchRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterStretchRenderer", JSImport.Namespace)
  @js.native
  /**
    * RasterStretchRenderer defines the symbology with a gradual ramp of colors for each pixel in a [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) based on the pixel value.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterStretchRenderer.html)
    */
  class Class () extends RasterStretchRenderer {
    def this(properties: RasterStretchRendererProperties) = this()
  }
  
  type _To = RasterStretchRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterStretchRendererMod.foo` */
  override def _to: RasterStretchRendererConstructor = ^
}
