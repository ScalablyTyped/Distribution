package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Magnifier
  extends StObject
     with Accessor {
  
  /**
  		 * Controls the amount of magnification to display.
  		 *
  		 * @default 1.5
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#factor)
  		 */
  var factor: Double = js.native
  
  /**
  		 * Indicates whether the mask image is enabled.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#maskEnabled)
  		 */
  var maskEnabled: Boolean = js.native
  
  /**
  		 * The mask url points to an image that determines the visible area of the magnified image [(alpha channel)](https://developer.mozilla.org/en-US/docs/Glossary/Alpha).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#maskUrl)
  		 */
  var maskUrl: String = js.native
  
  /**
  		 * The offset of the magnifier in pixels.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#offset)
  		 */
  var offset: MagnifierScreenPoint = js.native
  
  /**
  		 * Indicates whether the overlay image is enabled.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#overlayEnabled)
  		 */
  var overlayEnabled: Boolean = js.native
  
  /**
  		 * The overlay url points to an image that is displayed on top of the magnified image.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#overlayUrl)
  		 */
  var overlayUrl: String = js.native
  
  /**
  		 * The position of the magnifier in pixels.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#position)
  		 */
  var position: MagnifierScreenPoint = js.native
  
  /**
  		 * The size of the magnifier in pixels.
  		 *
  		 * @default 120
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#size)
  		 */
  var size: Double = js.native
  
  /**
  		 * Indicates whether the magnifier is visible.
  		 *
  		 * @default true
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-Magnifier.html#visible)
  		 */
  var visible: Boolean = js.native
}
