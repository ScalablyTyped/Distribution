package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LineStyleMarker3D
import typings.arcgisJsApi.esri.LineStyleMarker3DProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriSymbolsLineStyleMarker3DMod {
  
  @JSImport("esri/symbols/LineStyleMarker3D", JSImport.Namespace)
  @js.native
  /**
  		 * LineStyleMarker3D is used for rendering a simple marker graphic on a [LineSymbol3DLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol3DLayer.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineStyleMarker3D.html)
  		 */
  open class ^ ()
    extends StObject
       with LineStyleMarker3D {
    def this(properties: LineStyleMarker3DProperties) = this()
  }
}
