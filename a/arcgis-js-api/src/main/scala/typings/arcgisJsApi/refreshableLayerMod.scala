package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.RefreshableLayer
import typings.arcgisJsApi.esri.RefreshableLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object refreshableLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/RefreshableLayer", JSImport.Namespace)
  @js.native
  val ^ : RefreshableLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/RefreshableLayer", JSImport.Namespace)
  @js.native
  class Class () extends RefreshableLayer
  
  type _To = RefreshableLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `refreshableLayerMod.foo` */
  override def _to: RefreshableLayerConstructor = ^
}
