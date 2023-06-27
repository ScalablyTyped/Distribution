package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.plane
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicePlane
  extends StObject
     with Accessor
     with JSONSupport {
  
  /**
  		 * The heading angle (in degrees) of the slice plane.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#heading)
  		 */
  var heading: Double = js.native
  
  /**
  		 * The height of the slice plane.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#height)
  		 */
  var height: Double = js.native
  
  /**
  		 * A point specifying the position of the center of the plane.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#position)
  		 */
  var position: Point = js.native
  
  /**
  		 * The tilt angle (in degrees) of the slice plane.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#tilt)
  		 */
  var tilt: Double = js.native
  
  /**
  		 * The string value representing the type of the slice shape.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#type)
  		 */
  val `type`: plane = js.native
  
  /**
  		 * The width of the slice plane.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#width)
  		 */
  var width: Double = js.native
}
