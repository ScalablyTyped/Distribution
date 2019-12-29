package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-marker`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.circle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cross
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.diamond
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.path
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.square
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.triangle
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.x
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.arcgisDashJsDashApi.__esri.Symbol2D3D because Already inherited
- typings.arcgisDashJsDashApi.__esri.symbols.Symbol2D3D because Already inherited */ @js.native
trait SimpleMarkerSymbol
  extends MarkerSymbol
     with typings.arcgisDashJsDashApi.__esri.symbols.MarkerSymbol
     with typings.arcgisDashJsDashApi.__esri.symbols.Symbol2D
     with Symbol2D
     with symbolsMarkerSymbol {
  /**
    * The outline of the marker symbol. The `color` property of this object directly modifies the overall color of marker symbols defined with the `cross` or `x` [style](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#outline)
    */
  var outline: SimpleLineSymbol = js.native
  /**
    * The SVG path of the icon.
    * > **Known Limitations**  This property works only in 2D. IE11 is not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#path)
    */
  var path: String = js.native
  /**
    * The size of the marker in points. This value may be autocast with a string expressing size in points or pixels (e.g. `12px`).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#size)
    *
    * @default 12
    */
  var size: Double = js.native
  /**
    * The marker style. Possible values are in the table below.
    *
    * Value | Description
    * ------|------------
    * circle | ![sms_circle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-circle.png)
    * cross | ![sms_cross](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-cross.png)
    * diamond | ![sms_diamond](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-diamond.png)
    * square | ![sms_square](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-square.png)
    * triangle | ![sms_triangle](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-triangle.png)
    * x | ![sms_x](https://developers.arcgis.com/javascript/assets/img/apiref/symbols/symbols-sms-x.png)
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#style)
    *
    * @default circle
    */
  var style: circle | square | cross | x | diamond | triangle | path = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-SimpleMarkerSymbol.html#type)
    */
  @JSName("type")
  val type_SimpleMarkerSymbol: `simple-marker` = js.native
}

@JSGlobal("__esri.SimpleMarkerSymbol")
@js.native
object SimpleMarkerSymbol extends TopLevel[SimpleMarkerSymbolConstructor]

