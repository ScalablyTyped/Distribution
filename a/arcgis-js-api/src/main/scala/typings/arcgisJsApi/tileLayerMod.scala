package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.TileLayer
import typings.arcgisJsApi.esri.TileLayerConstructor
import typings.arcgisJsApi.esri.TileLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tileLayerMod extends Shortcut {
  
  @JSImport("esri/layers/TileLayer", JSImport.Namespace)
  @js.native
  val ^ : TileLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/TileLayer", JSImport.Namespace)
  @js.native
  /**
    * The TileLayer allows you work with a cached [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm) exposed by the ArcGIS Server REST API and add it to a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) as a tile layer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-TileLayer.html)
    */
  class Class () extends TileLayer {
    def this(properties: TileLayerProperties) = this()
  }
  
  type _To = TileLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `tileLayerMod.foo` */
  override def _to: TileLayerConstructor = ^
}
