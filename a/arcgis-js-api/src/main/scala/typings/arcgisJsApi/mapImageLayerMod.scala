package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MapImageLayer
import typings.arcgisJsApi.esri.MapImageLayerConstructor
import typings.arcgisJsApi.esri.MapImageLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapImageLayerMod extends Shortcut {
  
  @JSImport("esri/layers/MapImageLayer", JSImport.Namespace)
  @js.native
  val ^ : MapImageLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/MapImageLayer", JSImport.Namespace)
  @js.native
  /**
    * MapImageLayer allows you to display and analyze data from [sublayers](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html#sublayers) defined in a [map service](http://server.arcgis.com/en/server/latest/publish-services/windows/what-is-a-map-service.htm), exporting images instead of features.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html)
    */
  class Class () extends MapImageLayer {
    def this(properties: MapImageLayerProperties) = this()
  }
  
  type _To = MapImageLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapImageLayerMod.foo` */
  override def _to: MapImageLayerConstructor = ^
}
