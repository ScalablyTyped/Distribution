package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`extent-and-rotation`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ExtentAndRotationGeoreference
  extends StObject
     with Accessor {
  
  /**
  		 * An extent of the image or video element representing its geographic location when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#extent)
  		 */
  var extent: Extent = js.native
  
  /**
  		 * A rotation of the image or video element when added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#rotation)
  		 */
  var rotation: Double = js.native
  
  /**
  		 * The georeference type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ExtentAndRotationGeoreference.html#type)
  		 */
  val `type`: `extent-and-rotation` = js.native
}
