package typings.arcgisJsApi

import org.scalablytyped.runtime.Shortcut
import typings.arcgisJsApi.esri.LineSymbolMarker
import typings.arcgisJsApi.esri.LineSymbolMarkerConstructor
import typings.arcgisJsApi.esri.LineSymbolMarkerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsLineSymbolMarkerMod extends Shortcut {
  
  @JSImport("esri/symbols/LineSymbolMarker", JSImport.Namespace)
  @js.native
  val ^ : js.Object & LineSymbolMarkerConstructor = js.native
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("esri/symbols/LineSymbolMarker", JSImport.Namespace)
  @js.native
  /**
    * LineSymbolMarker is used for rendering a simple marker graphic on a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html)
    */
  open class Class ()
    extends StObject
       with LineSymbolMarker {
    def this(properties: LineSymbolMarkerProperties) = this()
  }
  
  type _To = js.Object & LineSymbolMarkerConstructor
  
  /* This means you don't have to write `^`, but can instead just say `esriSymbolsLineSymbolMarkerMod.foo` */
  override def _to: js.Object & LineSymbolMarkerConstructor = ^
}
