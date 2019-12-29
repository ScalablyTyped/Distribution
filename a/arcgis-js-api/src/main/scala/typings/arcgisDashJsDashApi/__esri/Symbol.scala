package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`label-3d`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`line-3d`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`mesh-3d`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-fill`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`picture-marker`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`point-3d`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`polygon-3d`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`shield-label-symbol`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-fill`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-line`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`simple-marker`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`web-style`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.cim
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Symbol
  extends Accessor
     with JSONSupport {
  /**
    * The color of the symbol. This can be autocast with an array of rgb(a) values, named string, hex string or an hsl(a) string, an object with `r`, `g`, `b`, and `a` properties, or a [Color](https://developers.arcgis.com/javascript/latest/api-reference/esri-Color.html) object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
    *
    * @default black
    */
  var color: Color = js.native
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
    */
  val `type`: `simple-marker` | `picture-marker` | `simple-line` | `simple-fill` | `picture-fill` | text | `shield-label-symbol` | `point-3d` | `line-3d` | `polygon-3d` | `web-style` | `mesh-3d` | `label-3d` | cim = js.native
}

@JSGlobal("__esri.Symbol")
@js.native
object Symbol extends SymbolConstructor

