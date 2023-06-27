package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Symbol3DVerticalOffset
  extends StObject
     with Accessor {
  
  /**
  		 * The maximum vertical symbol offset in world units.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#maxWorldLength)
  		 */
  var maxWorldLength: Double = js.native
  
  /**
  		 * The minimum vertical symbol offset in world units.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#minWorldLength)
  		 */
  var minWorldLength: Double = js.native
  
  /**
  		 * Vertical symbol offset in screen size.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-Symbol3DVerticalOffset.html#screenLength)
  		 */
  var screenLength: Double = js.native
}
