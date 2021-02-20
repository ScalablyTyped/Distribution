package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.BaseTileLayer
import typings.arcgisJsApi.esri.BaseTileLayerConstructor
import typings.arcgisJsApi.esri.BaseTileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseTileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/BaseTileLayer", JSImport.Namespace)
  @js.native
  val ^ : BaseTileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/BaseTileLayer", JSImport.Namespace)
  @js.native
  /**
    * This class may be extended to create a custom [TileLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BaseTileLayer.html)
    */
  class Class () extends BaseTileLayer {
    def this(properties: BaseTileLayerProperties) = this()
  }
  
  type _To = BaseTileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `baseTileLayerMod.foo` */
  override def _to: BaseTileLayerConstructor = ^
}
