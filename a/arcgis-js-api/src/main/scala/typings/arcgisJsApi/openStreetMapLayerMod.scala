package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.OpenStreetMapLayer
import typings.arcgisJsApi.esri.OpenStreetMapLayerConstructor
import typings.arcgisJsApi.esri.OpenStreetMapLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object openStreetMapLayerMod extends Shortcut {
  
  @JSImport("esri/layers/OpenStreetMapLayer", JSImport.Namespace)
  @js.native
  val ^ : OpenStreetMapLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/OpenStreetMapLayer", JSImport.Namespace)
  @js.native
  class Class () extends OpenStreetMapLayer {
    def this(properties: OpenStreetMapLayerProperties) = this()
  }
  
  type _To = OpenStreetMapLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `openStreetMapLayerMod.foo` */
  override def _to: OpenStreetMapLayerConstructor = ^
}
