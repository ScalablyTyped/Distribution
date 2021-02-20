package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MapNotesLayer
import typings.arcgisJsApi.esri.MapNotesLayerConstructor
import typings.arcgisJsApi.esri.MapNotesLayerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mapNotesLayerMod extends Shortcut {
  
  @JSImport("esri/layers/MapNotesLayer", JSImport.Namespace)
  @js.native
  val ^ : MapNotesLayerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/layers/MapNotesLayer", JSImport.Namespace)
  @js.native
  /**
    * The MapNotesLayer is used to create layers based on Map Notes within a WebMap or PortalItem.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapNotesLayer.html)
    */
  class Class () extends MapNotesLayer {
    def this(properties: MapNotesLayerProperties) = this()
  }
  
  type _To = MapNotesLayerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `mapNotesLayerMod.foo` */
  override def _to: MapNotesLayerConstructor = ^
}
