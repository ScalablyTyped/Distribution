package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UniqueValueRenderer
import typings.arcgisJsApi.esri.UniqueValueRendererConstructor
import typings.arcgisJsApi.esri.UniqueValueRendererProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object uniqueValueRendererMod extends Shortcut {
  
  @JSImport("esri/renderers/UniqueValueRenderer", JSImport.Namespace)
  @js.native
  val ^ : UniqueValueRendererConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/renderers/UniqueValueRenderer", JSImport.Namespace)
  @js.native
  /**
    * UniqueValueRenderer allows you to symbolize features in a [Layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html) based on one or more matching string attributes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html)
    */
  class Class () extends UniqueValueRenderer {
    def this(properties: UniqueValueRendererProperties) = this()
  }
  
  type _To = UniqueValueRendererConstructor
  
  /* This means you don't have to write `^`, but can instead just say `uniqueValueRendererMod.foo` */
  override def _to: UniqueValueRendererConstructor = ^
}
