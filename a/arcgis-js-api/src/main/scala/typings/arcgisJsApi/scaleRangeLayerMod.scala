package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.ScaleRangeLayer
import typings.arcgisJsApi.esri.ScaleRangeLayerConstructor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scaleRangeLayerMod extends Shortcut {
  
  @JSImport("esri/layers/mixins/ScaleRangeLayer", JSImport.Namespace)
  @js.native
  val ^ : ScaleRangeLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/mixins/ScaleRangeLayer", JSImport.Namespace)
  @js.native
  class Class () extends ScaleRangeLayer
  
  type _To = ScaleRangeLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `scaleRangeLayerMod.foo` */
  override def _to: ScaleRangeLayerConstructor = ^
}
