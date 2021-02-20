package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.MarkerSymbol
import typings.arcgisJsApi.esri.MarkerSymbolConstructor
import typings.arcgisJsApi.esri.MarkerSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markerSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/MarkerSymbol", JSImport.Namespace)
  @js.native
  val ^ : MarkerSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/MarkerSymbol", JSImport.Namespace)
  @js.native
  /**
    * Marker symbols are used to draw [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) graphics in a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) or individual [graphics](https://developers.arcgis.com/javascript/latest/api-reference/esri-Graphic.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-MarkerSymbol.html)
    */
  class Class () extends MarkerSymbol {
    def this(properties: MarkerSymbolProperties) = this()
  }
  
  type _To = MarkerSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `markerSymbolMod.foo` */
  override def _to: MarkerSymbolConstructor = ^
}
