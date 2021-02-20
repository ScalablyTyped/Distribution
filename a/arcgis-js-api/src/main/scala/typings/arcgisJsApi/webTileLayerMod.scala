package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.WebTileLayer
import typings.arcgisJsApi.esri.WebTileLayerConstructor
import typings.arcgisJsApi.esri.WebTileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object webTileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/WebTileLayer", JSImport.Namespace)
  @js.native
  val ^ : WebTileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/WebTileLayer", JSImport.Namespace)
  @js.native
  /**
    * WebTileLayer provides a simple way to add non-ArcGIS Server map tiles as a layer to a map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-WebTileLayer.html)
    */
  class Class () extends WebTileLayer {
    def this(properties: WebTileLayerProperties) = this()
  }
  
  type _To = WebTileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `webTileLayerMod.foo` */
  override def _to: WebTileLayerConstructor = ^
}
