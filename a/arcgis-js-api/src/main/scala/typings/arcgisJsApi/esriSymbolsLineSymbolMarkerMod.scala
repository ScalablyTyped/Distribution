package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineSymbolMarker
import typings.arcgisJsApi.esri.LineSymbolMarkerProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsLineSymbolMarkerMod {
  
  @JSImport("esri/symbols/LineSymbolMarker", JSImport.Namespace)
  @js.native
  /**
    * LineSymbolMarker is used for rendering a simple marker graphic on a [SimpleLineSymbol](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbolMarker.html)
    */
  open class ^ ()
    extends StObject
       with LineSymbolMarker {
    def this(properties: LineSymbolMarkerProperties) = this()
  }
}
