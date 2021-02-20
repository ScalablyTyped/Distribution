package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ClassBreaksRenderer
import typings.arcgisJsApi.esri.ClassBreaksRendererConstructor
import typings.arcgisJsApi.esri.ClassBreaksRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object classBreaksRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/ClassBreaksRenderer", JSImport.Namespace)
  @js.native
  val ^ : ClassBreaksRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/ClassBreaksRenderer", JSImport.Namespace)
  @js.native
  /**
    * ClassBreaksRenderer defines the symbol of each feature in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on the value of a numeric attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-ClassBreaksRenderer.html)
    */
  class Class () extends ClassBreaksRenderer {
    def this(properties: ClassBreaksRendererProperties) = this()
  }
  
  type _To = ClassBreaksRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `classBreaksRendererMod.foo` */
  override def _to: ClassBreaksRendererConstructor = ^
}
