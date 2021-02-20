package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VectorFieldRenderer
import typings.arcgisJsApi.esri.VectorFieldRendererConstructor
import typings.arcgisJsApi.esri.VectorFieldRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorFieldRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/VectorFieldRenderer", JSImport.Namespace)
  @js.native
  val ^ : VectorFieldRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/VectorFieldRenderer", JSImport.Namespace)
  @js.native
  /**
    * The VectorFieldRenderer allows you to display your raster data with vector symbols.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-VectorFieldRenderer.html)
    */
  class Class () extends VectorFieldRenderer {
    def this(properties: VectorFieldRendererProperties) = this()
  }
  
  type _To = VectorFieldRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vectorFieldRendererMod.foo` */
  override def _to: VectorFieldRendererConstructor = ^
}
