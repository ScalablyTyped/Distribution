package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.UnsupportedLayer
import typings.arcgisJsApi.esri.UnsupportedLayerConstructor
import typings.arcgisJsApi.esri.UnsupportedLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsupportedLayerMod extends Shortcut {
  
  @JSImport("esri/layers/UnsupportedLayer", JSImport.Namespace)
  @js.native
  val ^ : UnsupportedLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/UnsupportedLayer", JSImport.Namespace)
  @js.native
  class Class () extends UnsupportedLayer {
    def this(properties: UnsupportedLayerProperties) = this()
  }
  
  type _To = UnsupportedLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `unsupportedLayerMod.foo` */
  override def _to: UnsupportedLayerConstructor = ^
}
