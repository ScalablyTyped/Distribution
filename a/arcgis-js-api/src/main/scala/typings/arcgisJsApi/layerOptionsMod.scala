package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LayerOptions
import typings.arcgisJsApi.esri.LayerOptionsConstructor
import typings.arcgisJsApi.esri.LayerOptionsProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object layerOptionsMod extends Shortcut {
  
  @JSImport("esri/popup/LayerOptions", JSImport.Namespace)
  @js.native
  val ^ : LayerOptionsConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/popup/LayerOptions", JSImport.Namespace)
  @js.native
  class Class () extends LayerOptions {
    def this(properties: LayerOptionsProperties) = this()
  }
  
  type _To = LayerOptionsConstructor
  
  /* This means you don't have to write `^`, but can instead just say `layerOptionsMod.foo` */
  override def _to: LayerOptionsConstructor = ^
}
