package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BlendLayer
import typings.arcgisJsApi.esri.BlendLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object blendLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/BlendLayer", JSImport.Namespace)
  @js.native
  val ^ : BlendLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/BlendLayer", JSImport.Namespace)
  @js.native
  class Class () extends BlendLayer
  
  type _To = BlendLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `blendLayerMod.foo` */
  override def _to: BlendLayerConstructor = ^
}
