package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`backward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.`diagonal-cross`
import typings.arcgisJsApi.arcgisJsApiStrings.`forward-diagonal`
import typings.arcgisJsApi.arcgisJsApiStrings.cross
import typings.arcgisJsApi.arcgisJsApiStrings.horizontal
import typings.arcgisJsApi.arcgisJsApiStrings.none_
import typings.arcgisJsApi.arcgisJsApiStrings.solid
import typings.arcgisJsApi.arcgisJsApiStrings.style
import typings.arcgisJsApi.arcgisJsApiStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StylePattern3D
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The fill style.
  		 *
  		 * @default solid
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html#style)
  		 */
  var style: `backward-diagonal` | cross | `diagonal-cross` | `forward-diagonal` | horizontal | none_ | solid | vertical = js.native
  
  /**
  		 * The pattern type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-patterns-StylePattern3D.html#type)
  		 */
  val `type`: style = js.native
}
