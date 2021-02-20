package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.SimpleMarkerSymbol
import typings.arcgisJsApi.esri.SimpleMarkerSymbolConstructor
import typings.arcgisJsApi.esri.SimpleMarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object simpleMarkerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : SimpleMarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/SimpleMarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * SimpleMarkerSymbol is used for rendering 2D [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) geometries with a simple shape and [color](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#color) in either a [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html) or a [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html)
    */
  class Class () extends SimpleMarkerSymbol {
    def this(properties: SimpleMarkerSymbolProperties) = this()
  }
  
  type _To = SimpleMarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `simpleMarkerSymbolMod.foo` */
  override def _to: SimpleMarkerSymbolConstructor = ^
}
