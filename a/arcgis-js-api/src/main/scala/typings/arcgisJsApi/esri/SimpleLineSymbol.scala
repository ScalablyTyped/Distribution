package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`long-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dash`
import typings.arcgisJsApi.arcgisJsApiStrings.`short-dot`
import typings.arcgisJsApi.arcgisJsApiStrings.bevel
import typings.arcgisJsApi.arcgisJsApiStrings.butt
import typings.arcgisJsApi.arcgisJsApiStrings.dash
import typings.arcgisJsApi.arcgisJsApiStrings.dot
import typings.arcgisJsApi.arcgisJsApiStrings.miter
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.round
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.square
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.arcgisJsApi.esri.Symbol2D3D because Already inherited
- typings.arcgisJsApi.esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleLineSymbol
  extends Symbol2D
     with LineSymbol
     with typings.arcgisJsApi.esri.symbols.Symbol2D {
  
  /**
    * Specifies the cap style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#cap)
    */
  var cap: butt | round | square = js.native
  
  /**
    * Specifies the join style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#join)
    */
  var join: miter | round | bevel = js.native
  
  /**
    * Specifies the color, style, and placement of a symbol marker on the line.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#marker)
    */
  var marker: LineSymbolMarker = js.native
  
  /**
    * Maximum allowed ratio of the width of a miter join to the line width.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#miterLimit)
    */
  var miterLimit: Double = js.native
  
  /**
    * Specifies the line style.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleLineSymbol.html#style)
    */
  var style: dash | `dash-dot` | dot | `long-dash` | `long-dash-dot` | `long-dash-dot-dot` | none | `short-dash` | `short-dash-dot` | `short-dash-dot-dot` | `short-dot` | solid = js.native
}
