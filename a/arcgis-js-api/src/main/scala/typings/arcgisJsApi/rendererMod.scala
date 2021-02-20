package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.Renderer
import typings.arcgisJsApi.esri.RendererConstructor
import typings.arcgisJsApi.esri.RendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod extends Shortcut {
  
  @JSImport("esri/renderers/Renderer", JSImport.Namespace)
  @js.native
  val ^ : RendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/Renderer", JSImport.Namespace)
  @js.native
  /**
    * Renderers define how to visually represent each feature in one of the following layer types:.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-Renderer.html)
    */
  class Class () extends Renderer {
    def this(properties: RendererProperties) = this()
  }
  
  type _To = RendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `rendererMod.foo` */
  override def _to: RendererConstructor = ^
}
