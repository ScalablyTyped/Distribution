package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RasterShadedReliefRenderer
import typings.arcgisJsApi.esri.RasterShadedReliefRendererConstructor
import typings.arcgisJsApi.esri.RasterShadedReliefRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rasterShadedReliefRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/RasterShadedReliefRenderer", JSImport.Namespace)
  @js.native
  val ^ : RasterShadedReliefRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/RasterShadedReliefRenderer", JSImport.Namespace)
  @js.native
  /**
    * RasterShadedReliefRenderer produces a grayscale or colored 3D representation of the surface on an [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) or [ImageryTileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryTileLayer.html), with the sun's relative position taken into account for shading the image.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-RasterShadedReliefRenderer.html)
    */
  class Class () extends RasterShadedReliefRenderer {
    def this(properties: RasterShadedReliefRendererProperties) = this()
  }
  
  type _To = RasterShadedReliefRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rasterShadedReliefRendererMod.foo` */
  override def _to: RasterShadedReliefRendererConstructor = ^
}
