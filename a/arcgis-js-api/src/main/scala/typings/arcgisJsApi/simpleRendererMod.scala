package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SimpleRenderer
import typings.arcgisJsApi.esri.SimpleRendererConstructor
import typings.arcgisJsApi.esri.SimpleRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/SimpleRenderer", JSImport.Namespace)
  @js.native
  val ^ : SimpleRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/SimpleRenderer", JSImport.Namespace)
  @js.native
  /**
    * SimpleRenderer renders all features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) with one [Symbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-SimpleRenderer.html)
    */
  class Class () extends SimpleRenderer {
    def this(properties: SimpleRendererProperties) = this()
  }
  
  type _To = SimpleRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `simpleRendererMod.foo` */
  override def _to: SimpleRendererConstructor = ^
}
