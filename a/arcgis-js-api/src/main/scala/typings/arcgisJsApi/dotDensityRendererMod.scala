package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.DotDensityRenderer
import typings.arcgisJsApi.esri.DotDensityRendererConstructor
import typings.arcgisJsApi.esri.DotDensityRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dotDensityRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  val ^ : DotDensityRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/DotDensityRenderer", JSImport.Namespace)
  @js.native
  /**
    * DotDensityRenderer allows you to create dot density visualizations for polygon layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-DotDensityRenderer.html)
    */
  class Class () extends DotDensityRenderer {
    def this(properties: DotDensityRendererProperties) = this()
  }
  
  type _To = DotDensityRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `dotDensityRendererMod.foo` */
  override def _to: DotDensityRendererConstructor = ^
}
