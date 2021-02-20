package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BingMapsLayer
import typings.arcgisJsApi.esri.BingMapsLayerConstructor
import typings.arcgisJsApi.esri.BingMapsLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object bingMapsLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BingMapsLayer", JSImport.Namespace)
  @js.native
  val ^ : BingMapsLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BingMapsLayer", JSImport.Namespace)
  @js.native
  /**
    * This layer supports Microsoft's Bing tiled map content.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BingMapsLayer.html)
    */
  class Class () extends BingMapsLayer {
    def this(properties: BingMapsLayerProperties) = this()
  }
  
  type _To = BingMapsLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `bingMapsLayerMod.foo` */
  override def _to: BingMapsLayerConstructor = ^
}
