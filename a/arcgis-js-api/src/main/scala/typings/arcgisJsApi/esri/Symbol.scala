package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`label-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`line-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`mesh-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`picture-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.`point-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`polygon-3d`
import typings.arcgisJsApi.arcgisJsApiStrings.`shield-label-symbol`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-marker`
import typings.arcgisJsApi.arcgisJsApiStrings.`web-style`
import typings.arcgisJsApi.arcgisJsApiStrings.cim
import typings.arcgisJsApi.arcgisJsApiStrings.text
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The color of the symbol.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
  		 */
  var color: Color_ = js.native
  
  /**
  		 * The symbol type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#type)
  		 */
  val `type`: `simple-marker` | `picture-marker` | `simple-line` | `simple-fill` | `picture-fill` | text | `shield-label-symbol` | `point-3d` | `line-3d` | `polygon-3d` | `web-style` | `mesh-3d` | `label-3d` | cim = js.native
}
