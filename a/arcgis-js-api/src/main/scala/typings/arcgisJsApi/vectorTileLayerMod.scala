package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.VectorTileLayer
import typings.arcgisJsApi.esri.VectorTileLayerConstructor
import typings.arcgisJsApi.esri.VectorTileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vectorTileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/VectorTileLayer", JSImport.Namespace)
  @js.native
  val ^ : VectorTileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/VectorTileLayer", JSImport.Namespace)
  @js.native
  /**
    * VectorTileLayer accesses cached tiles of data and renders it in vector format.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-VectorTileLayer.html)
    */
  class Class () extends VectorTileLayer {
    def this(properties: VectorTileLayerProperties) = this()
  }
  
  type _To = VectorTileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `vectorTileLayerMod.foo` */
  override def _to: VectorTileLayerConstructor = ^
}
