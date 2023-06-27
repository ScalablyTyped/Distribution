package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.corners
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CornersGeoreference
  extends StObject
     with Accessor {
  
  /**
  		 * The bottom left [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#bottomLeft)
  		 */
  var bottomLeft: Point = js.native
  
  /**
  		 * The bottom right [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#bottomRight)
  		 */
  var bottomRight: Point = js.native
  
  /**
  		 * The top left [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#topLeft)
  		 */
  var topLeft: Point = js.native
  
  /**
  		 * The top right [point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) of the bounding box representing the geographic location of the image or video element being added to the [MediaLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html).
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#topRight)
  		 */
  var topRight: Point = js.native
  
  /**
  		 * The georeference type.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CornersGeoreference.html#type)
  		 */
  val `type`: corners = js.native
}
