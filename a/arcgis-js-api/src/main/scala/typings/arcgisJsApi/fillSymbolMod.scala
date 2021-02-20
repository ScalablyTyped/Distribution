package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.FillSymbol
import typings.arcgisJsApi.esri.FillSymbolConstructor
import typings.arcgisJsApi.esri.FillSymbolProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fillSymbolMod extends Shortcut {
  
  @JSImport("esri/symbols/FillSymbol", JSImport.Namespace)
  @js.native
  val ^ : FillSymbolConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/FillSymbol", JSImport.Namespace)
  @js.native
  /**
    * Fill symbols are used to draw [Polygon](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polygon.html) graphics in a [GraphicsLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-GraphicsLayer.html) or a [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html) in a 2D [MapView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-MapView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html)
    */
  class Class () extends FillSymbol {
    def this(properties: FillSymbolProperties) = this()
  }
  
  type _To = FillSymbolConstructor
  
  /* This means you don't have to write `^`, but can instead just say `fillSymbolMod.foo` */
  override def _to: FillSymbolConstructor = ^
}
