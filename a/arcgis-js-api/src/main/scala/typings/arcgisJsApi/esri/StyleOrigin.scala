package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StyleOrigin
  extends StObject
     with Accessor {
  
  /**
  		 * Name of the symbol in the style referenced by styleName or styleUrl.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#name)
  		 */
  var name: String = js.native
  
  /**
  		 * The portal of the style origin.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#portal)
  		 */
  var portal: Portal = js.native
  
  /**
  		 * The well-known esri-provided style, such as `EsriThematicShapesStyle`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#styleName)
  		 */
  var styleName: String = js.native
  
  /**
  		 * A url to a style definition.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-StyleOrigin.html#styleUrl)
  		 */
  var styleUrl: String = js.native
}
