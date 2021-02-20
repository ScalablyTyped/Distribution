package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MapView
import typings.arcgisJsApi.esri.MapViewConstructor
import typings.arcgisJsApi.esri.MapViewProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapViewMod extends Shortcut {
  
  @JSImport("esri/views/MapView", JSImport.Namespace)
  @js.native
  val ^ : MapViewConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/views/MapView", JSImport.Namespace)
  @js.native
  /**
    * A MapView displays a 2D view of a [Map](https://developers.arcgis.com/javascript/latest/api-reference/esri-Map.html) instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html)
    */
  class Class () extends MapView {
    def this(properties: MapViewProperties) = this()
  }
  
  type _To = MapViewConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapViewMod.foo` */
  override def _to: MapViewConstructor = ^
}
